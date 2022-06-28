/**
 * @Project immo-llm 1.0 Alpha
 * @author Claude Lusseau
 * 2021
 */
package fr.lusseau.llm.domain.entity.equipment;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0 Alpha
 * @Date 27 sept. 2021
 */
public class Equipment {

    private final EquipmentId id;
    private final EquipmentName name;
    private final EquipmentDescription description;
    private final EquipmentBrandt brandt;
    private final EquipmentSN serialNumber;

    public Equipment(EquipmentBuilder builder) throws ModelValueException {
        this.id = new EquipmentId(builder.id);
        this.name = new EquipmentName(builder.name);
        this.description = new EquipmentDescription(builder.description);
        this.brandt = new EquipmentBrandt(builder.brandt);
        this.serialNumber = new EquipmentSN(builder.serialNumber);
    }

    public static EquipmentBuilder builder() {
        return new EquipmentBuilder();
    }

    public static class EquipmentBuilder {
        private Long id;
        private String name;
        private String description;
        private String brandt;
        private String serialNumber;

        public EquipmentBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public EquipmentBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EquipmentBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public EquipmentBuilder withBrandt(String brandt) {
            this.brandt = brandt;
            return this;
        }

        public EquipmentBuilder withSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public Equipment build() throws ModelValueException {
            return new Equipment(this);
        }
    }

    public EquipmentId getId() {
        return id;
    }

    public EquipmentName getName() {
        return name;
    }

    public EquipmentDescription getDescription() {
        return description;
    }

    public EquipmentBrandt getBrandt() {
        return brandt;
    }

    public EquipmentSN getSerialNumber() {
        return serialNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Equipment{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", brandt=").append(brandt);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append('}');
        return sb.toString();
    }
}
