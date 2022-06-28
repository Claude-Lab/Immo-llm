package fr.lusseau.llm.domain.entity.propertyload;

import fr.llm.immo.exception.ModelValueException;

public class PropertyLoadQuarter {

    private final Integer value;

    public PropertyLoadQuarter(final Integer value) throws ModelValueException {
        assertName(value);
        this.value = value;
    }

    private void assertName(Integer quarter) throws ModelValueException {
        if (quarter == null) {
            throw new ModelValueException("Missing required quarter");
        }
    }

    public Integer get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PropertyLoadQuarter{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
