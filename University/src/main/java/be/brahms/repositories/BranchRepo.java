package be.brahms.repositories;

import be.brahms.models.entities.BranchEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchRepo extends JpaRepository<BranchEnt, String> {

    boolean existsByName(String name);
}
