package be.brahms.models.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor @AllArgsConstructor
@MappedSuperclass
public abstract class BaseRelationEnt<T extends Serializable> {

    @EmbeddedId
    @Getter
    private T id;
}
