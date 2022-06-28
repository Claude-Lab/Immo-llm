package fr.lusseau.llm.domain.entity.receipt;

import fr.llm.immo.exception.ModelValueException;

public class ReceiptRentalLoad {

    private final Float value;

    public ReceiptRentalLoad(final Float value) throws ModelValueException {
        assertRate(value);
        this.value = value;
    }

    private void assertRate(Float load) throws ModelValueException {
        if (load == null) {
            throw new ModelValueException("Missing required load");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReceiptRentalLoad{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
