package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingFloor {

    private final Integer value;

    public HousingFloor(final Integer value) throws ModelValueException {
        assertFloor(value);
        this.value = value;
    }

    private void assertFloor(Integer floor) throws ModelValueException {
        if (floor == null) {
            throw new ModelValueException("Missing required floor");
        }
    }

    public Integer get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingFloor{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
