package be.brahms.models.entities;

import be.brahms.models.entities.embedded.Address;
import jakarta.persistence.*;
import lombok.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NoArgsConstructor @AllArgsConstructor
@ToString @EqualsAndHashCode(callSuper = false)
@Entity(name = "person")
public abstract class PersonEnt extends BaseEnt<String>{

    @Getter @Setter
    @Column(length = 50, nullable = false)
    private String firstname;

    @Getter @Setter
    @Column(length = 50, nullable = false)
    private String lastname;

    @Getter @Setter
    @Embedded
    private Address address;
}
