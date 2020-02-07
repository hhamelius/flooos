package se.hamelius.repositories;

import org.springframework.data.repository.CrudRepository;
import se.hamelius.entities.Pet;

import java.util.List;

public interface PetRepository extends CrudRepository<Pet, Long> {

    public List<Pet> findByName(String name);

    public void deleteById(Long id);

}
