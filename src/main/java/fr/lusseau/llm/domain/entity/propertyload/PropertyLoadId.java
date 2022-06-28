package fr.lusseau.llm.domain.entity.propertyload;

public class PropertyLoadId {

    private final Long value;

    public PropertyLoadId(final Long value) {
        this.value = value;
    }

    public static PropertyLoadId of(final Long id) {
        return new PropertyLoadId(id);
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PropertyLoadId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
