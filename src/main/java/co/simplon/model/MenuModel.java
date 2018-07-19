package co.simplon.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "MenuModel")
public class MenuModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ChargeGlyMeals")
    private long chargeGlyMeals;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "menu_composition", joinColumns = {@JoinColumn(name = "FK_ALIMENT", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "FK_MENU", referencedColumnName = "id")}
    )
    private List<AlimentModel> menuComposition = new ArrayList<AlimentModel>();

    public MenuModel() {

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

    public long getChargeGlyMeals() {
        return this.chargeGlyMeals;
    }

    public void setChargeGlyMeals(long chargeGly) {
        this.chargeGlyMeals = chargeGly;
    }
    
    public String toString() {
    	return ("name : " + this.name);
    }

    public List<AlimentModel> getMenuComposition() {
        return menuComposition;
    }

    public void setMenuComposition(List<AlimentModel> menuComposition) {
        this.menuComposition = menuComposition;
    }
}



