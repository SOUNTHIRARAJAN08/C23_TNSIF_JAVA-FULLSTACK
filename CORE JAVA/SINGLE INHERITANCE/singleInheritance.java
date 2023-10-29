class Father{
	public void home()
	{
	
		System.out.println("i have a own house");
		
	}
}
class Son extends Father
{
  public void car()
  {
	  System.out.println("i have own Audi car");
	  
  }
}



public class singleInheritance {
	public static void main(String args[])
	{
		Son s =new Son();
		s.home();
		s.car();
		
	}

}
