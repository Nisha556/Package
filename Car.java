package P1;

abstract class Car {  
	  abstract void run();  
	}  
	class Honda4 extends Car {  
	void run() 
	{
		System.out.println("running safely");
		}  
	
	public static void main(String args[]){  
	 Car obj = new Honda4();  
	 obj.run(); 

}
	}