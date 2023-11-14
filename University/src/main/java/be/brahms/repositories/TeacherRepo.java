package be.brahms.repositories;

import be.brahms.models.entities.persons.TeacherEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface TeacherRepo extends JpaRepository<TeacherEnt, String> {

    boolean existsById(String id);
}
