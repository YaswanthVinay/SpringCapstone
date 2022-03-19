
import java.util.Scanner;

public class Rectangle {
	private int Length;
	private int Breadth;
	private int area;
	private int perimeter;

	public Rectangle() {
		Length = 0;
		Breadth = 0;

	}
	

	public void information() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length: ");
		Length = sc.nextInt();
		System.out.println("Enter the Breadth: ");
		Breadth = sc.nextInt();

	}

	public void area() {
		area = Length * Breadth;
		System.out.println("Result is:");
		System.out.println(" The area of the rectangle is " + area);
	}

	public void perimeter() {
		perimeter = 2 * (Length + Breadth);
		System.out.println(" The Perimeter of the rectangle is " + perimeter);
		System.out.println("Enter the Another Values which u Want to Measure");
	}

	public class TestRectangle {
		public static void main(String[] args) {

			Rectangle rectangle1 = new Rectangle();
			rectangle1.information();
			rectangle1.area();
			rectangle1.perimeter();
			Rectangle rectangle2 = new Rectangle();
			rectangle1.information();
			rectangle1.area();
			rectangle1.perimeter();
			Rectangle rectangle3 = new Rectangle();
			rectangle1.information();
			rectangle1.area();
			rectangle1.perimeter();
			Rectangle rectangle4 = new Rectangle();
			rectangle1.information();
			rectangle1.area();
			rectangle1.perimeter();
			Rectangle rectangle5 = new Rectangle();
			rectangle1.information();
			rectangle1.area();
			rectangle1.perimeter();

		}
	}
}
