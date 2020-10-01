class Animal
{
   void eat()
   {
      System.out.println("eating is my love");
   }
   
}
class Dog extends Animal
{
    public static void main(String args[])
	{
	Dog d=new Dog();
	d.eat();
	}
}