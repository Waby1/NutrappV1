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
    private int chargeGlyMeals;

    @ManyToMany(mappedBy = "menuList")
    private List<AlimentModel> menuComposition = new ArrayList<AlimentModel>();

    public MenuModel() {

    }


    public MenuModel(Long id, String name, int chargeGlyMeals, List<AlimentModel> menuComposition) {
        this.id = id;
        this.name = name;
        this.chargeGlyMeals = chargeGlyMeals;
        this.menuComposition = menuComposition;
        for (AlimentModel a : menuComposition) {
            a.saveAlimentIntoMenu(this);
        }

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

    public int getChargeGly() {
        return this.chargeGlyMeals;
    }

    public void setChargeGly(int chargeGly) {
        this.chargeGlyMeals = chargeGly;
    }
}



