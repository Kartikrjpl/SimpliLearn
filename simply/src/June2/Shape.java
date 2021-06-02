package June2;



public class Shape {
	double area_sq,area_cir,area_rec;
	
	public Shape() {
		
	}
	public Shape(double a) {
		area_sq = a*a;
	}
	public Shape(double a,double b) {
		area_rec = a*b;
	}
	public Shape(double r,boolean c) {
		area_cir = Math.PI*r*r;
	}
	public void disp_area_square() {
		System.out.println(area_sq);
	}
	public void disp_area_circle() {
		System.out.println(area_cir);
		}
	public void disp_area_rectangle() {
		System.out.println(area_rec);
	}
	
	// assuming it to be right angle triangle
	public static void cal_area(double height, double base ) {
		
		double area_tri = height*base*0.5;
		System.out.println("Area of triangle is "+area_tri);
	}
	public static void cal_area(double d1, double d2, boolean a ) {
		
		double area_rom = d2*d1*0.5;
		System.out.println("Area of Rhombus is "+area_rom);
	}
	
	public static void main(String[] args) {
		Shape circle = new Shape(1.3,true);
		Shape sqaure = new Shape(4);
		Shape rec = new Shape(2,3);
		circle.disp_area_circle();
		sqaure.disp_area_square();
		rec.disp_area_rectangle();
		
		cal_area(2.4,3.4); // static is used so that i dont have to create the object
		cal_area(2.444,3.22,true);
		
	}
	
	
	

}
