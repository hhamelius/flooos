package se.hamelius.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import se.hamelius.entities.Pet;
import se.hamelius.repositories.PetRepository;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class PetQuery implements GraphQLQueryResolver {

    private final PetRepository petRepository;

    public Iterable<Pet> pets() {
        return petRepository.findAll();
    }

    public Optional<Pet> petById(long id) {
        return petRepository.findById(id);
    }

    public List<Pet> petsByName(String name) {
        return petRepository.findByName(name);
    }
 }