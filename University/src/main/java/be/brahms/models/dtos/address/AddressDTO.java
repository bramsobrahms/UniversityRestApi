package be.brahms.models.dtos.address;

import be.brahms.models.entities.embedded.Address;

public record AddressDTO (
        String street,
        String number,
        String zipcode,
        String city,
        String country
){
    public AddressDTO fromEntity(Address address){
        return new AddressDTO(address.getStreet(), address.getNumber(), address.getZipcode(), address.getCity(), address.getCountry() );
    }
}
