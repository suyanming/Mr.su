package java ”∆µ;

public class PolyTest2
{
     public static void main(String[] args)
     {
    	 /*
         Animal animal = new Cat();
         Animal animal2 = new Animal();
         animal2 = animal;
         animal2.sing();
         */
         /*
         Animal animal = new Cat();
         Animal animal2 = new Animal();
         animal = animal2;
         animal.sing();
         */
         /*
    	 Cat cat = new Cat();
         Animal animal = cat;
         animal.sing();
		 */
    	 Animal animal = new Animal();
    	 Cat cat = (Cat)animal;
    			 

     }
}
class Animal
{
     public void sing()
     {
          System.out.println("animal is singing");
     }
}
class Dog extends Animal
{
     public void sing()
     {
          System.out.println("dog is singing");
     }
}
class Cat extends Dog
{
     public void sing()
     {
          System.out.println("cat is singing");
     }
}



