package org.example.controller;

import org.example.classes.Materiel;
import org.example.repository.MaterielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import services.MaterielService;

import java.util.List;

@Controller
public class MaterielController {
    @Autowired
    private MaterielService materielService;

    @GetMapping("/materiel")
    public String materiel() {
        return "materiel";
    }

    @PostMapping("/add-materiel")
    public String addMateriel(@ModelAttribute Materiel materiel) {
        materielService.insertMateriel(materiel);
        return "redirect:/materiels";
    }



    @GetMapping("/materiels")
    public String materiels(Model model) {
       List<Materiel> materiels =  materielService.getAllMateriel();
       model.addAttribute("materiels", materiels);
       return "materiels";
    }

}
