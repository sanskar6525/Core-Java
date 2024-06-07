package NestedClass;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.Comparator;
import java.util.function.Predicate;
import java.lang.Iterable;
import java.time.chrono.IsoChronology;


public class TestCase {

    interface CheckPerson {
        boolean test(Person p);
    }
    
    
    
    public static void printPersonsOlderThan(List<Person> roster, int age) /* Approach 1: Create Methods that Search for Persons 
    that Match One Characteristic*/
    {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
    
    
    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) /*Approach 2: Create More Generalized Search Methods*/
    
    {
            for (Person p : roster) {
                if (low <= p.getAge() && p.getAge() < high) {
                    p.printPerson();
                }
            }
    }
    
    public static void printPersons(List<Person> roster, CheckPerson tester)
    {
    	
            for (Person p : roster) {
                if (tester.test(p)) {
                    p.printPerson();
                }
            }
        }
    
    
    public static void main(String[] args)
    {
    	 List<Person> roster = Person.createRoster();

    	 for (Person p : roster) {
             p.printPerson();
         }
    	 
    	 
    	//Approach 1: Create Methods that Search for Persons that Match One Characteristic
         System.out.println("\nPersons older than 20:");
         printPersonsOlderThan(roster, 20);
         System.out.println();
         
       //Approach 2: Create More Generalized Search Methods
         System.out.println("Persons between the ages of 14 and 30:");
         printPersonsWithinAgeRange(roster, 14, 30);
         System.out.println();
         
         
         // Approach 3: Specify Search Criteria Code in a Local Class
         System.out.println("Persons who are eligible for Selective Service:");
         class CheckPersonEligibleForSelectiveService implements CheckPerson {
             public boolean test(Person p) {
                 return p.gender == Person.Gender.MALE &&
                     p.getAge() >= 18 &&
                     p.getAge() <= 25;
             }
         }
         printPersons(roster, new CheckPersonEligibleForSelectiveService());
         System.out.println();
         
         
         
         // Approach 4: Specify Search Criteria Code in an Anonymous Class
         System.out.println("Persons who are eligible for Selective Service " +"(anonymous class):");
         printPersons(roster,new CheckPerson() {
        	 public boolean test(Person p) {
                     return p.getGender() == Person.Gender.MALE
                         && p.getAge() >= 18
                         && p.getAge() <= 25;
                 }
             }
         );
         System.out.println();

    }
    
    
}
