package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingAttic {

    private final Boolean value;

    public HousingAttic(final Boolean value) throws ModelValueException {
        assertAttic(value);
        this.value = value;
    }

    private void assertAttic(Boolean attic) throws ModelValueException {
        if (attic == null) {
            throw new ModelValueException("Missing required number of attic");
        }
    }

    public Boolean get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingAttic{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
