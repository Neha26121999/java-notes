class Metthod
{
  public static void main(String args[])
  {
    try
	{
	  int a=100,b=0,c;
	  c=a/b;
	  System.out.println(c);
	}
	catch(Exception ae)
	{
	  //ae.printStackTrace(); 
	  System.out.println(ae);
	  System.out.println(ae.toString());
	  System.out.println(ae.getMessage());
	}
  }
   
}