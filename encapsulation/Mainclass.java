package encapsulation;

public class Mainclass {
    private String name;
    private int id;
    private int age;
	
	public void setAge(int age) {
		if(age<100)
			this.age=age;
		else 
			System.out.println("age is invalid");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
}
