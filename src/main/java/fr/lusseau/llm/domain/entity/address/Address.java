package fr.lusseau.llm.domain.entity.address;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class Address {

    private final AddressId id;
    private final AddressNumber number;
    private final AddressStreet street;
    private final AddressPostCode postCode;
    private final AddressCity city;
    private final AddressCountry country;

    public Address(AddressBuilder builder) throws ModelValueException {
        id = new AddressId(builder.id);
        number = new AddressNumber(builder.number);
        street = new AddressStreet(builder.street);
        postCode = new AddressPostCode(builder.postCode);
        city = new AddressCity(builder.city);
        country = new AddressCountry(builder.country);
    }

    public static AddressBuilder builder() {
        return new AddressBuilder();
    }

    public static class AddressBuilder {
        private Long id;
        private String number;
        private String street;
        private String postCode;
        private String city;
        private String country;

        public AddressBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public AddressBuilder withNumber(String number) {
            this.number = number;
            return this;
        }

        public AddressBuilder withStreet(String street) {
            this.street = street;
            return this;
        }

        public AddressBuilder withPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public AddressBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public AddressBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public Address build() throws ModelValueException {
            return new Address(this);
        }
    }

    public AddressId getId() {
        return id;
    }

    public AddressNumber getNumber() {
        return number;
    }

    public AddressStreet getStreet() {
        return street;
    }

    public AddressPostCode getPostCode() {
        return postCode;
    }

    public AddressCity getCity() {
        return city;
    }

    public AddressCountry getCountry() {
        return country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(id).append("\n");
        sb.append(number).append("\n");
        sb.append(street).append("\n");
        sb.append(postCode).append("\n");
        sb.append(city).append("\n");
        sb.append(country).append("\n");
        return sb.toString();
    }
}
