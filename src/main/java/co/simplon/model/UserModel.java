package co.simplon.model;

import javax.persistence.*;

@Entity
@Table(name = "UserModel")


public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@Column (name = "ID")
	private long id;

	@Column (name = "name")
	private String name;
	
	@Column (name = "age")
	private int age;


	public UserModel(long id, String name, int age) {
		
		this.id = id;
		
		this.name = name;
		
		this.age = age;
		
		
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


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
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
