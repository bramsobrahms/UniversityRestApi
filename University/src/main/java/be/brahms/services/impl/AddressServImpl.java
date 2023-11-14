package be.brahms.services.impl;

import be.brahms.models.entities.embedded.Address;
import be.brahms.repositories.AddressRep;
import be.brahms.services.AddressServ;
import org.springframework.stereotype.Service;

@Service
public class AddressServImpl implements AddressServ {

    private final AddressRep addressRep;

    public AddressServImpl(AddressRep addressRep) {
        this.addressRep = addressRep;
    }

    @Override
    public Address create(Address address) {
        return addressRep.save(address);
    }
}
