package oca.chapter2.cristina_nan.encapsulation;

public class StudentGoodEncapsulation {

	private String name;
	private Integer age = 12;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
