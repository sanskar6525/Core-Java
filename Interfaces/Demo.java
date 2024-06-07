package Interfaces;

interface Demo
{
	 void print();
	 default void print2()
	 {
		 System.out.println("Default method of Demo Interface\n");
	 }
}
