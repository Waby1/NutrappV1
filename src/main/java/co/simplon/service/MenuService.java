package co.simplon.service;

import co.simplon.model.AlimentModel;
import co.simplon.model.MenuModel;
import co.simplon.repository.AlimentRepository;
import co.simplon.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service // nous allons utiliser le menuService dans le controller
@Transactional // tout ou rien, rollback auto en cas de plantage
public class MenuService {

    // on utilise l'annotation AutoWired pour que Spring mette à dispo le repository de notre interface
    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private AlimentRepository alimentRepository;

    // même anotation que le autowired mais pour le entity manager
    @PersistenceContext
    private EntityManager entityManager;


    public MenuModel createMenu(@RequestBody MenuModel menu) {
        System.out.println("json recu :");
        System.out.println(menu);

        List<AlimentModel> persistentObject = menu.getMenuComposition()
                .stream()
                .map(alimentModel -> alimentRepository.findById(alimentModel.getId()).get())
                .collect(Collectors.toList());

        List<AlimentModel> persistentAlimentModels = new ArrayList<>();
        for (AlimentModel alimentModel : menu.getMenuComposition()) {
            AlimentModel persistentAlimentModel = alimentRepository.findById(alimentModel.getId()).get();
            persistentAlimentModels.add(persistentAlimentModel);
        }

        menu.setMenuComposition(persistentObject);

        menuRepository.save(menu);


        return menu;

    }
}