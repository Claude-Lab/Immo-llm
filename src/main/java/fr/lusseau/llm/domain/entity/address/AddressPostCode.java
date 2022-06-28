package fr.lusseau.llm.domain.entity.address;


import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class AddressPostCode {

    private final String value;

    public AddressPostCode(final String value) throws ModelValueException {
        assertEmail(value);
        this.value = value;
    }

    private static void assertEmail(String value) throws ModelValueException {
        if (value == null) {
            throw new ModelValueException("Missing required postcode");
        }
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressPostCode{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
