package java视频;

public class PolyTest2
{
     public static void main(String[] args)
     {
          Animal a = new Dog();
          Dog dog = (Dog)a;//向下的类型转换，实际上
          dog.sing();
          Animal b = new Cat();
          Dog d = (Dog)b;
          d.sing();
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
class Cat extends Animal
{
     public void sing()
     {
          System.out.println("cat is singing");
     }
}


