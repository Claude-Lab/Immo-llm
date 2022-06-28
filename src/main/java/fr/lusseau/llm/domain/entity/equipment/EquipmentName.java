package fr.lusseau.llm.domain.entity.equipment;

import fr.llm.immo.exception.ModelValueException;

public class EquipmentName {

    private final String value;

    public EquipmentName(final String value) throws ModelValueException {
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
        final StringBuilder sb = new StringBuilder("EquipmentName{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
