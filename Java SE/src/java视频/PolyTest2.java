package java��Ƶ;

public class PolyTest2
{
     public static void main(String[] args)
     {
          Animal a = new Dog();
          Dog dog = (Dog)a;//���µ�����ת����ʵ����
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


