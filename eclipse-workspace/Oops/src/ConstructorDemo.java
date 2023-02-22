
public class ConstructorDemo {
	
	String studentName;
	String village;
	int rollNumber;
	long mobileNo;
	String langauge;
	
	public ConstructorDemo() {
		this("Kiran","Palasmandal",42,9966576545l,"Java");      //ctor chainning
	}
	 
	public ConstructorDemo(String studentName,String village,int rollNumber,long mobileNo,String langauge) {

		this.studentName=studentName;
		this.village=village;
		this.rollNumber=rollNumber;
		this.mobileNo=mobileNo;
		this.langauge=langauge;
	}
	
	public void display_record() {
		System.out.println("studentName        >>    "+studentName);
		System.out.println("village            >>    "+village);
		System.out.println("rollNumber         >>    "+rollNumber);
		System.out.println("mobileNo           >>    "+mobileNo);
		System.out.println("langauge           >>    "+langauge);
	}

	public static void main(String[] args) {
		ConstructorDemo cd=null;              //null reference variable 
		//if(cd != null)
		cd = new ConstructorDemo();          //instantiation
		cd.display_record();                 //called to method
	}
	public static void main1(String[] args) {
		
		//ConstructorDemo cd = new ConstructorDemo("Kiran",42,"java");
		ConstructorDemo cd = new ConstructorDemo();   //prameterless ctor get called
		cd.display_record();

	}
}
