package be.brahms.models.entities;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor @AllArgsConstructor
@MappedSuperclass
public abstract class BaseEnt<T extends Serializable> {

    @Id
    @Getter @Setter
    private T id;
}
