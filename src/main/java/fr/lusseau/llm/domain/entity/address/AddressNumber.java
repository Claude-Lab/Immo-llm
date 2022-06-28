package fr.lusseau.llm.domain.entity.address;


import java.util.Optional;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class AddressNumber {

    private final String number;

    public AddressNumber(final String number) {
        this.number = number;
    }

    public static Optional<AddressNumber> of(final String number) {
        return Optional.empty();
    }

    public String get() {
        return number;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressNumber{");
        sb.append("number='").append(number).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
