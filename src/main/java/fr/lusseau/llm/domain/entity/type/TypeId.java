package fr.lusseau.llm.domain.entity.type;

import fr.llm.immo.exception.ModelValueException;

public class TypeId {

    private final Long value;

    public TypeId(final Long value) throws ModelValueException {
        assertId(value);
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
        final StringBuilder sb = new StringBuilder("TypeId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
