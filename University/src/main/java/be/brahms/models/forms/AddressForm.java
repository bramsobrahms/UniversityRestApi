package be.brahms.models.forms;

import be.brahms.models.entities.embedded.Address;

public class AddressForm {

    private String street;
    private String number;
    private String zipcode;
    private String city;
    private String country;

    public Address toEntity(){
        return new Address(this.street, this.number, this.zipcode, this.city, this.country);
    }
}
