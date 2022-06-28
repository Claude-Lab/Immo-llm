package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingSurface {

    private final Float value;

    public HousingSurface(final Float value) throws ModelValueException {
        assertSurface(value);
        this.value = value;
    }

    private void assertSurface(Float surface) throws ModelValueException {
        if (surface == null) {
            throw new ModelValueException("Missing required surface");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingSurface{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
