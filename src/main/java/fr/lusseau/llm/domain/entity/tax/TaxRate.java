package fr.lusseau.llm.domain.entity.tax;

import fr.llm.immo.exception.ModelValueException;

public class TaxRate {

    private final Float value;

    public TaxRate(final Float value) throws ModelValueException {
        assertRate(value);
        this.value = value;
    }

    private void assertRate(Float rate) throws ModelValueException {
        if (rate == null) {
            throw new ModelValueException("Missing required rate");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaxRate{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
