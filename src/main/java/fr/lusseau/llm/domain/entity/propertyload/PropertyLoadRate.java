package fr.lusseau.llm.domain.entity.propertyload;

import fr.llm.immo.exception.ModelValueException;

public class PropertyLoadRate {

    private final Float value;

    public PropertyLoadRate(final Float value) throws ModelValueException {
        assertRame(value);
        this.value = value;
    }

    private void assertRame(Float rate) throws ModelValueException {
        if (rate == null) {
            throw new ModelValueException("Missing required rate");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PropertyLoadRate{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
