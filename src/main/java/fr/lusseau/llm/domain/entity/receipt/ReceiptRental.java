package fr.lusseau.llm.domain.entity.receipt;

import fr.llm.immo.exception.ModelValueException;

public class ReceiptRental {

    private final Float value;

    public ReceiptRental(final Float value) throws ModelValueException {
        assertRate(value);
        this.value = value;
    }

    private void assertRate(Float rental) throws ModelValueException {
        if (rental == null) {
            throw new ModelValueException("Missing required rental");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReceiptRental{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
