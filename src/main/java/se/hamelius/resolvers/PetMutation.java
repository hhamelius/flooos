package se.hamelius.resolvers;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import se.hamelius.entities.Pet;
import se.hamelius.entities.PetInput;
import se.hamelius.repositories.PetRepository;

@Component
@RequiredArgsConstructor
public class PetMutation implements GraphQLMutationResolver {

    private final PetRepository petRepository;

    public Pet addPet(final PetInput pet) {
        return petRepository.save(PetInput.convert(pet));
    }

    public long deletePetById(final long id) {
        petRepository.findById(id).ifPresent(petRepository::delete);
        return id;
    }
}
