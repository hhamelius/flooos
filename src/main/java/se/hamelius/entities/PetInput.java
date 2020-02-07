package se.hamelius.entities;

import lombok.Data;
import se.hamelius.enums.Animal;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
public class PetInput {
    private String name;

    @Enumerated(EnumType.STRING)
    private Animal type;

    private int age;

    public static Pet convert(PetInput ip) {
        Pet newPet = new Pet();
        newPet.setName(ip.name);
        newPet.setType(ip.type);
        newPet.setAge(ip.age);
        return newPet;
    }
}
