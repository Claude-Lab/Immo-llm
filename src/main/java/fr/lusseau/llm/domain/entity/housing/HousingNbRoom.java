package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingNbRoom {

    private final Integer value;

    public HousingNbRoom(final Integer value) throws ModelValueException {
        assertNbRoom(value);
        this.value = value;
    }

    private void assertNbRoom(Integer nbRoom) throws ModelValueException {
        if (nbRoom == null) {
            throw new ModelValueException("Missing required number of room");
        }
    }

    public Integer get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingNbRoom{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
