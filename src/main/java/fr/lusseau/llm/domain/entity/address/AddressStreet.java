package fr.lusseau.llm.domain.entity.address;

import java.util.Optional;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class AddressStreet {

    private final String value;

    public AddressStreet(final String value) {
        this.value = value;
    }

    public static Optional<AddressStreet> of(final String street) {
        return Optional.empty();
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressStreet{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
