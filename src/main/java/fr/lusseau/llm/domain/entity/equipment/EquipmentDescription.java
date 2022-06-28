package fr.lusseau.llm.domain.entity.equipment;

import java.util.Optional;

public class EquipmentDescription {

    private final String value;

    public EquipmentDescription(final String value) {
        this.value = value;
    }

    public static Optional<EquipmentDescription> of(final String description) {
        return Optional.empty();
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EquipmentDescription{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
