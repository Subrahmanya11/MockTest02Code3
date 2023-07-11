package in.ineuron.com;

class Person {
	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

public class MockTest02Code3 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Agastya");
		String name = p.getName();
		System.out.println("Name of a person is : " + name);
		p.setAge(27);
		int age = p.getAge();
		System.out.println("Age of a person is : " + age);
		p.setAddress("Bangalore");
		String address = p.getAddress();
		System.out.println("Address of a person is : " + address);

	}

}
