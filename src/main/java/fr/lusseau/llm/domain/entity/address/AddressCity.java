package fr.lusseau.llm.domain.entity.address;


import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class AddressCity {

    private final String value;

    public AddressCity(final String value) throws ModelValueException {
        assertCity(value);
        this.value = value;
    }

    private void assertCity(String city) throws ModelValueException {
        if (city == null) {
            throw new ModelValueException("Missing required city");
        }
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressCity{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
