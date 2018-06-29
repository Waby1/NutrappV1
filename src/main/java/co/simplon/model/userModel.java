package co.simplon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "userModel")
@NamedQueries({
	@NamedQuery(name = "userModel.findAll", query = " SELECT f FROM userModel f ORDER BY f.name "),
	@NamedQuery(name = "userModel.deleteById", query = " DELETE FROM userModel f WHERE f.id = :id") })


public class userModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	@Column (name = "ID")
	private long id;

	@Column (name = "name")
	private String name;
	
	@Column (name = "age")
	private int age;
	
	
	public userModel ( long id, String name, int age) {
		
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
