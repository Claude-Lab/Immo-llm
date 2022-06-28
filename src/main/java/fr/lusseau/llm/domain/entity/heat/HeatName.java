package fr.lusseau.llm.domain.entity.heat;

import fr.llm.immo.exception.ModelValueException;

public class HeatName {

    private final String value;

    public HeatName(final String value) throws ModelValueException {
        assertName(value);
        this.value = value;
    }

    private void assertName(String name) throws ModelValueException {
        if (name == null) {
            throw new ModelValueException("Missing required name");
        }
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HeatName{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
