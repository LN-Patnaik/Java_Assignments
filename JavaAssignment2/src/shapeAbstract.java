abstract class shapes
{
	abstract void draw();
}
class Line extends shapes
{
	void draw()
	{
		System.out.println("Draw Line");
	}
}
class Rectangle extends shapes
{
	void draw()
	{
		System.out.println("Draw Rectangle");
	}
}
class Cube extends shapes
{
	void draw()
	{
		System.out.println("Draw Cube");
	}
}

public class shapeAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Line l=new Line();
		Rectangle r=new Rectangle();
		Cube c=new Cube();
		l.draw();
		r.draw();
		c.draw();
	}

}
