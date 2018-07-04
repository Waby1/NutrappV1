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

    @Column(name = "totalChargeGly")
    private int chargeGly;

    @ManyToMany(mappedBy = "menuList")
    private List<AlimentModel> menuComposition = new ArrayList<AlimentModel>();

    public MenuModel() {

    }


    public MenuModel(Long id, String name, int chargeGly, List<AlimentModel> menuComposition) {
        this.id = id;
        this.name = name;
        this.chargeGly = chargeGly;
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
        return chargeGly;
    }

    public void setChargeGly(int chargeGly) {
        this.chargeGly = chargeGly;
    }
}



