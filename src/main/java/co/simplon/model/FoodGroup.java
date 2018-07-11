package co.simplon.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "FoodGroup")
public class FoodGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String categoryName;

    @OneToMany(mappedBy = "foodGroup")
    private List<AlimentModel> listAliment = new ArrayList<AlimentModel>();


    public FoodGroup() {
    }

    public FoodGroup(Long id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<AlimentModel> getListAliment() {
        return listAliment;
    }

    public void setListAliment(List<AlimentModel> listAliment) {
        this.listAliment = listAliment;
    }
}


