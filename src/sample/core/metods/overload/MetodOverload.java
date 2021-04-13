package sample.core.metods.overload;

class Parent {
	public double findSurfaceArea(double length) {
		return length * length;
	}
}

public class MetodOverload extends Parent {

	// not void!!!
	// public void findSurfaceArea(double length){
	// System.out.println(length*length);
	// }

	public double findSurfaceArea(int length) {
		return (length * length)-1;
	}

	public static void main(String[] args) {

		var mo = new MetodOverload();
		double i;
		i = mo.findSurfaceArea(5);
		System.out.println(i);

	}

}
