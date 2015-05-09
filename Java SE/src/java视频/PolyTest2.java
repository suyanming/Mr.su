package java ”∆µ;

public class PolyTest2
{
     public static void main(String[] args)
     {
          Animal a = new Dog();
          Dog dog = (Dog)a;
          dog.sing();
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

