package fr.lusseau.llm.domain.entity.sort;

import fr.llm.immo.exception.ModelValueException;

public class SortId {

    private final Long value;

    public SortId(final Long value) {
        this.value = value;
    }

    private void assertId(Long value) throws ModelValueException {
        if (value == null) {
            throw new ModelValueException("Missing required id");
        }
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SortId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
