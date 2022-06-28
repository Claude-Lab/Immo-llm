package fr.lusseau.llm.domain.entity.tax;

import fr.llm.immo.exception.ModelValueException;

public class TaxId {

    private final Long value;

    public TaxId(final Long value) throws ModelValueException {
        assertId(value);
        this.value = value;
    }

    private void assertId(Long value) throws ModelValueException {
        if (value == null) {
            throw new ModelValueException("Missing required id");
        }
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaxId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
