package P1;

public  abstract class Person {
	private String name;
	private String  gender;
	public Person(String nm, String  gen)
	{
		this.name = nm;
		this.gender = gen;
		
				
	}
	public abstract void Studying();
	public String toString()
	{
		return "name" + this.name + "gender" +this.gender;
		
	}

}
