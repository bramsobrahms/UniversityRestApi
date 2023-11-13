package be.brahms.repositories;

import be.brahms.models.entities.CourseEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<CourseEnt, String> {

//    @Query("SELECT CASE WHEN count(c) >0 from Course c WHERE c.name like :name")
    boolean existsByName(@Param("name") String name);
}
