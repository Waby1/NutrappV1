package co.simplon.model;

import javax.persistence.*;

@Entity
@Table(name = "AlimentModel")
public class AlimentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Column (name = "name")
	private String name;

	
	@Column (name = "chargeGly")
	private long chargeGly;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FK_FOODGROUP")
    private FoodGroup foodGroup;

    public AlimentModel() {
		
	}

	public AlimentModel(Long id, String name, long chargeGly, FoodGroup foodGroup) {

		this.id = id;
		this.name = name;
		this.chargeGly = chargeGly;
        this.foodGroup = foodGroup;


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

	public long getChargeGly() {
		return chargeGly;
	}

	public void setChargeGly(long chargeGly) {
		this.chargeGly = chargeGly;
	}

    public FoodGroup getFoodGroup() {
        return foodGroup;
    }

    public void setFoodGroup(FoodGroup foodGroup) {
        this.foodGroup = foodGroup;
    }

}
