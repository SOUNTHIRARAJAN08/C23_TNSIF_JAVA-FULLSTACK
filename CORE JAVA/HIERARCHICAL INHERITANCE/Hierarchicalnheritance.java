class Shape
{
	float length,width,radius;
}
class Rect extends Shape{
	public Rect(float l,float w)
	{
		length=l;
		width=w;
	}
	float Rect_area()
	{
		return length*width;
	}
}
class Circle extends Shape{
	public Circle(float r)
	{
		radius=r;
	}
	float Circle_Area()
	{
		return 3.14f*(radius*radius);	}
}

class Square extends Shape{
	public Square(float l)
	{
		length=l;
	}
	float Sqre_area()
	{
		return length*length;
}
}
	
public class Hierarchicalnheritance {
	public static void main(String args[]) {
		Rect rec = new Rect(5,5);
		System.out.println("Area of Rectangle is:"+rec.Rect_area());
		
		Circle cir = new Circle(5);
		System.out.println("Area of Circle is:"+cir.Circle_Area());
		
		Square sqr = new Square(5);
		System.out.println("Area of Square is:"+sqr.Sqre_area());
		
	}
	
	

}
