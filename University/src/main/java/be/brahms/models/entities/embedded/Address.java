package be.brahms.models.entities.embedded;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Getter @Setter
@ToString @EqualsAndHashCode
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class Address {

    @Column(length = 50, nullable = false)
    private String street;

    @Column(length = 10, nullable = false)
    private String number;

    @Column(length = 6, nullable = false)
    private String zipcode;

    @Column(length = 100, nullable = false)
    private String city;

    @Column(length = 50, nullable = false)
    private String country;

}
