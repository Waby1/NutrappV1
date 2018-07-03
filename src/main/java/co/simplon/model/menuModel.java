package co.simplon.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "menuModel")
public class menuModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "totalChargeGly")
    private int chargeGly;

    @ManyToMany(mappedBy = "menuList")
    private List<alimentModel> menuComposition = new ArrayList<alimentModel>();

    public menuModel() {

    }

    public menuModel(long id, String name, int chargeGly, ArrayList<alimentModel> menuComposition) {
        this.id = id;
        this.name = name;
        this.chargeGly = chargeGly;
        this.menuComposition = menuComposition;

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

    public int getChargeGly() {
        return chargeGly;
    }

    public void setChargeGly(int chargeGly) {
        this.chargeGly = chargeGly;
    }
}



