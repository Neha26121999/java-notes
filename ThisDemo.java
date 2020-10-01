class ThisDemo
{
   void Demo()
   {
     System.out.println("programmers love programming");
   }
   void display()
   {
      Demo();
   }
   public static void main(String args[])
   {
       ThisDemo t=new ThisDemo();
	   t.display()	;
   }
}