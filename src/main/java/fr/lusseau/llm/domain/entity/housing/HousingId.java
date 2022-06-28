package fr.lusseau.llm.domain.entity.housing;

public class HousingId {

    private final Long value;

    public HousingId(final Long value) {
        this.value = value;
    }

    public static HousingId of(final Long id) {
        return new HousingId(id);
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
