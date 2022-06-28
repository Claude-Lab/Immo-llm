package fr.lusseau.llm.domain.entity.equipment;

public class EquipmentId {

    private final Long value;

    public EquipmentId(final Long value) {
        this.value = value;
    }

    public static EquipmentId of(final Long id) {
        return new EquipmentId(id);
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EquipmentId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
