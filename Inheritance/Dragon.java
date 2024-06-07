package Inheritance;


public class Dragon implements A,EggLayer,FireBreather {
    public static void main (String... args) {
        Dragon myApp = new Dragon();
        System.out.println(myApp.identifyMyself());
    }
}