package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingElevator {

    private final Boolean value;

    public HousingElevator(final Boolean value) throws ModelValueException {
        assertElevator(value);
        this.value = value;
    }

    private void assertElevator(Boolean elevator) throws ModelValueException {
        if (elevator == null) {
            throw new ModelValueException("Missing required elevator");
        }
    }

    public Boolean get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingElevator{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
