package se.hamelius.entities;

import lombok.Data;
import se.hamelius.enums.Animal;

import javax.persistence.*;

@Data
@Entity
@Table(name="pets")
public class Pet {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private Animal type;

    private int age;
}
