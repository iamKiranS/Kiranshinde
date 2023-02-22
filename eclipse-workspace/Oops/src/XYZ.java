
public class XYZ extends ABC{

	public void m1() {
		System.out.println("XYZ class method ");
	}
	public static void main(String[] args) {
		
		ABC a = new XYZ();
		a.m1();
	}
}
