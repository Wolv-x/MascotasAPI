package epn.edu.ec.examen.api.controller;

import epn.edu.ec.examen.api.model.Pet;
import epn.edu.ec.examen.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PetController {

    private PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping("/pet")
    public Pet getPet(@RequestParam Integer id) {
        Optional pet = petService.getPet(id);
        if (pet.isPresent()){
        return (Pet) pet.get();
        }
        return null;
    }
}
