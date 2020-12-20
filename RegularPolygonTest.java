package vtoroPaketche;

public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon (35, 5);
		RegularPolygon p2 = new RegularPolygon (41, 98);
		
		System.out.println(p1.getPerimeter());
		System.out.println(p1.getArea());
		System.out.println(p2.getPerimeter());
		System.out.println(p2.getArea());

	}

}
