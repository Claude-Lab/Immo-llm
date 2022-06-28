package fr.lusseau.llm.domain.entity.equipment;

import fr.llm.immo.exception.ModelValueException;

public class EquipmentBrandt {

    private final String value;

    public EquipmentBrandt(final String value) throws ModelValueException {
        assertBrandt(value);
        this.value = value;
    }

    private void assertBrandt(String brandt) throws ModelValueException {
        if (brandt == null) {
            throw new ModelValueException("Missing required brandt");
        }
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EquipmentBrandt{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
