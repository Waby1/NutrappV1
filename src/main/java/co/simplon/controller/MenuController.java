package co.simplon.controller;

import co.simplon.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class MenuController {

    @Autowired
    MenuRepository menuRepository;

    @GetMapping("/aliments.html")
    public ModelAndView alimentList() {
        ModelAndView modelAndView = new ModelAndView("menus");
        modelAndView.addObject("menus", menuRepository.findAll());
        return modelAndView;

    }
}
