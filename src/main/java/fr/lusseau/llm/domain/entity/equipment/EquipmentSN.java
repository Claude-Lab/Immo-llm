package fr.lusseau.llm.domain.entity.equipment;

import java.util.Optional;

public class EquipmentSN {

    private final String value;

    public EquipmentSN(final String value) {
        this.value = value;
    }

    public static Optional<EquipmentSN> of(final String sn) {
        return Optional.empty();
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EquipmentSN{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
