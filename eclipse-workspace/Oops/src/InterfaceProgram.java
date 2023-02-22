interface P{
	void f1();
 }

interface Q{
	void f2();
}

abstract class M1 {
	abstract void f3();
}

class R extends M1 implements P,Q{
 	@Override
    public void f1() {
    	System.out.println("R.P.f1");
    }
     @Override
    public void f2() {
    	System.out.println("R.Q.f2");
    }
     @Override
    void f3() {
    System.out.println("R.M1.f3");	
    }
	 
	}
	

public class InterfaceProgram {
	
	public static void main(String[] args) {
		
		P p = new R();
		p.f1();
		
		Q q = new R();
		q.f2();
		
		M1 m = new R();
		m.f3();
		
	}
	
	public static void main1(String[] args) {
		
		R r = new R();
		r.f1();
		r.f2();
		r.f3();

	}

}
