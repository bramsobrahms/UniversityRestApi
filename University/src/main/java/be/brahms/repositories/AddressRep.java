package be.brahms.repositories;

import be.brahms.models.entities.embedded.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRep extends JpaRepository<Address, String> {
}
