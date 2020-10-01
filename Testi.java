interface I1
{
    void show();
}
class Testi implements I1
{
       public void show()
	   {
		   System.out.println("1");
	   }
	   public static void main(String args[])
	   {
		   Testi t=new Testi();
		   t.show();
	   }
}
	   