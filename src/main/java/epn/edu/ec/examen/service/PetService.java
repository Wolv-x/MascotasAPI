package epn.edu.ec.examen.service;

import epn.edu.ec.examen.api.model.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class PetService {

    private List<Pet> petList;

    private PetService() {
        petList = new ArrayList<>();
        //int id, String name, String age, String type
        Pet pet1 = new Pet(1, "Pelusa", "7", "Perro");
        Pet pet2 = new Pet(2, "Canela", "2", "Gato");
        Pet pet3 = new Pet(3, "Max", "3", "Conejo");
        Pet pet4 = new Pet(4, "Thor", "1", "Pájaro");
        Pet pet5 = new Pet(5, "Nala", "5", "Hámster");
        petList.addAll(Arrays.asList(pet1, pet2, pet3, pet4, pet5));
    }

    public Optional<Pet> getPet(Integer id) {
        Optional optional = Optional.empty();
        for (Pet pet : petList) {
            if (id == pet.getId()) {
                optional = Optional.of(pet);
                return optional;
            }
        }
        return optional;
    }

}
