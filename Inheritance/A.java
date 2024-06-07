package Inheritance;

public interface A {
    default public String identifyMyself() {
        return "I am an animal.";
    }
}
interface EggLayer extends A {
    default public String identifyMyself() {
        return "I am able to lay eggs.";
    }
}
 interface FireBreather extends EggLayer  {
	 default public String identifyMyself() {
	        return "I have feathers.";
	    }
	
 }