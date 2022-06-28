package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingPool {

    private final Boolean value;

    public HousingPool(final Boolean value) throws ModelValueException {
        assertPool(value);
        this.value = value;
    }

    private void assertPool(Boolean pool) throws ModelValueException {
        if (pool == null) {
            throw new ModelValueException("Missing required pool");
        }
    }

    public Boolean get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingPool{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
