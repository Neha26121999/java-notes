class Ai
{
  void m1()
  {
	  System.out.println("i m programmer");
  }
 }
class B extends Ai
{
      void m1()
	  {
	    System.out.println("coding is my love");
	  }
	  void show()
	  {
		m1();
	    super.m1(); 
	  }
	  public static void main(String args[])
	  {
	     B ob=new B();
         ob.show();		 
	  }
}