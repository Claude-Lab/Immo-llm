package fr.lusseau.llm.domain.entity.address;


import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class AddressCountry {

    private final String value;

    public AddressCountry(final String value) throws ModelValueException {
        assertCountry(value);
        this.value = value;
    }

    private void assertCountry(String country) throws ModelValueException {
        if (country == null) {
            throw new ModelValueException("Missing required country");
        }
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressCountry{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
