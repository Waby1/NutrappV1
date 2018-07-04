package co.simplon.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "AlimentModel")
public class AlimentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	
	@Column (name = "ID")
    private Long id;

	@Column (name = "name")
	private String name;
	
	@Column (name = "calorie")
	private int calorie;
	
	@Column (name = "chargeGly")
	private int chargeGly;



	//on crée une fonction vide pour pouvoir compiler la fonction


	@ManyToMany
    @JoinTable(name = "menu_composition", joinColumns = {@JoinColumn(name = "FK_ALIMENT", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "FK_MENU", referencedColumnName = "id")}
	)

    private List<MenuModel> menuList = new ArrayList<MenuModel>();

    public AlimentModel() {
		
	}

    public AlimentModel(Long id, String name, int calorie, int chargeGly) {

		this.id = id;

		this.name = name;

		this.calorie = calorie;

		this.chargeGly = chargeGly;

	}

    public void saveAlimentIntoMenu(MenuModel e) {
        menuList.add(e);

    }

    public Long getId() {
		return id;
	}

    public void setId(Long id) {
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
