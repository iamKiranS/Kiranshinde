
public class Method1 {
	
     //without return and without argument
	
	int a=10;
	int b=10;
	
//accessspecifier returntype methodname
	public void add() {
 	
	int c=a+b;
	
	System.out.println("addition of a and b        :   " +c );
	}
	
	public void sub() {
		
	int d=a-b;
		
	System.out.println("substraction of a and b    :   " +d );
	}
	
	public void multiply() {
		
	int e=a*b;
		
	System.out.println("multiplication of a and b  :   " +e );
	}
	public void divide() {
		
	int f=a/b;
	
	System.out.println("division of a and b        :   " +f );
	}
	
	public static void main(String[] args) {
 
		 Method1 method = new Method1();
		 
		 method.add();
		 method.sub();
		 method.multiply();
		 method.divide();

	}

}
