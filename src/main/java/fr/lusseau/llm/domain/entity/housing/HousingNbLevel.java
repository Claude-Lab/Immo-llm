package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingNbLevel {

    private final Integer value;

    public HousingNbLevel(final Integer value) throws ModelValueException {
        assertNbLevel(value);
        this.value = value;
    }

    private void assertNbLevel(Integer nbLevel) throws ModelValueException {
        if (nbLevel == null) {
            throw new ModelValueException("Missing required number of level");
        }
    }

    public Integer get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingNbLevel{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
