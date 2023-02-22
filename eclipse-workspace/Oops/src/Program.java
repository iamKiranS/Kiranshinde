interface A{
	int num1=10;                 //interface field is mandtory to initialize
                             //bcoz it is bydefualt public static final
 
	
//	static void A() {
//}
//	
// 
//	
////	A{
////                                 //interface can not contain ctor
////	}
//}	
//class B implements A{
//    
}
interface B{
	int num2=20;
}

interface C extends A,B{     //use extends keyword for access interface to interface
	int num3=30;
}

public class Program {
	
	public static void main(String[] args) {
		
		System.out.println("num1        :     " +A.num1);
		System.out.println("num1        :     " +C.num1);

		System.out.println("num2        :     " +B.num2);
		System.out.println("num2        :     " +C.num2);

		System.out.println("num3        :     " +C.num3);
		System.out.println("num3        :     " +C.num3);

		
	}
	
	public static void main1(String[] args) {
		
		System.out.println("number       :     " +A.num1);
		//A a = new A();          //we cannot create instance of interface 
		  A a = null;             //but we create refernce of interface  
	}

}
