package P1;

public class Derived extends Protection {
	Derived()
	{
		System.out.println("derived constructor");
		System.out.println("n= " +n);
		System.out.println("n_pri = "4 + n_pri); // only in same class 
		System.out.println("n_pro = " +n_pro);
		System.out.println("n_pub =" +n_pub);
	}

}
class Demo {
public static void main(String args[]) {
Protection ob1 = new Protection();
Derived ob2 = new Derived();
SamePackage ob3 = new SamePackage();
}
}