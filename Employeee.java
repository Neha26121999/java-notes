class Employeee
{
   int empid;
   String name;
   static String company="dbit";
   Employeee(int empid,String name)
   {
   this.empid=empid;
   this.name=name;
   }
   void display()
   {
     System.out.println(empid+""+name+""+company);
   }
   public static void main(String args[])
   {
      Employeee e1=new Employeee(101,"neha");
	  e1.display();
   }
}