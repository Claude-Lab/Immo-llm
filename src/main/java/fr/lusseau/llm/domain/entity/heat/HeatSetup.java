package fr.lusseau.llm.domain.entity.heat;

import fr.llm.immo.exception.ModelValueException;

public class HeatSetup {

    private final String value;

    public HeatSetup(final String value) throws ModelValueException {
        assertName(value);
        this.value = value;
    }

    private void assertName(String setup) throws ModelValueException {
        if (setup == null) {
            throw new ModelValueException("Missing required setup");
        }
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HeatSetup{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
