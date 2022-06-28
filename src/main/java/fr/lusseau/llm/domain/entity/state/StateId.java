package fr.lusseau.llm.domain.entity.state;

import fr.llm.immo.exception.ModelValueException;

public class StateId {

    private final Long value;

    public StateId(final Long value) throws ModelValueException {
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
        final StringBuilder sb = new StringBuilder("StateId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
