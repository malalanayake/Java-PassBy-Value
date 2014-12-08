package sample.passby.value;

/**
 * Demonstration of Java pass by value
 * 
 */
public class App {
	public static void main(String[] args) {
		int xOrginal = 0, yOriginal = 0;
		System.out.println("Original Coordinates:" + xOrginal + "," + yOriginal);
		App.getNextCoordinates(xOrginal, yOriginal);
		System.out.println("After modification of Coordinates:" + xOrginal
				+ "," + yOriginal);

		Point pOriginal = new Point(0, 0);
		System.out.println("Original Point:" + pOriginal.getX() + ","
				+ pOriginal.getY());
		App.getNextCoordinates(pOriginal);
		System.out.println("After modification of Point:" + pOriginal.getX()
				+ "," + pOriginal.getY());

	}

	public static void getNextCoordinates(int x, int y) {
		x = 12;
		y = 15;
	}

	public static void getNextCoordinates(Point point) {
		point.setX(12);
		point.setY(15);
	}
}
