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
@Table(name = "alimentModel")
@NamedQueries({
	@NamedQuery(name = "alimentModel.findAll", query = " SELECT f FROM alimentModel f ORDER BY f.name "),
	@NamedQuery(name = "alimentModel.deleteById", query = " DELETE FROM alimentModel f WHERE f.id = :id") })
public class alimentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column (name = "ID")
	private long id;

	@Column (name = "name")
	private String name;
	
	@Column (name = "calorie")
	private int calorie;
	
	@Column (name = "chargeGly")
	private int chargeGly;

	
	
	
	
	
	public alimentModel (long id, String name, int calorie, int chargeGly) {

		this.id = id;

		this.name = name;

		this.calorie = calorie;

		this.chargeGly = chargeGly;

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

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}

	public int getChargeGly() {
		return chargeGly;
	}

	public void setChargeGly(int chargeGly) {
		this.chargeGly = chargeGly;
	}

}
