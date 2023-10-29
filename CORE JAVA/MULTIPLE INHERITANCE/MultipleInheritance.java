class GrandFather
{
	public void house()
	{
		System.out.println("3BHK house");
		
	}
	
}
class Father extends GrandFather
{
	public void land()
	{
		System.out.println("6 Arcs land");
		
	}
	
}
class Son extends Father{
	public void car()
	{
		System.out.println("own BMW car");
	}
}
public class MultipleInheritance {

	public static void main(String[] args) {
		Son s=new Son();
		s.house();
		s.land();
		s.car();

	}

}
