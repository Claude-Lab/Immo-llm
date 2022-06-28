package fr.lusseau.llm.domain.entity.heat;

public class HeatId {

    private final Long value;

    public HeatId(final Long value) {
        this.value = value;
    }

    public static HeatId of(final Long id) {
        return new HeatId(id);
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HeatId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
