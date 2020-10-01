class ridingover
{
	void neha()
	{
		System.out.println("overriding done");
	}
}
class Neha extends ridingover
{
	void neha()
	{
		System.out.println("override");
	}
	public static void main(String args[])
	{
		ridingover r=new ridingover();
		r.neha();
		Neha n=new Neha();
		n.neha();
	}
	
}