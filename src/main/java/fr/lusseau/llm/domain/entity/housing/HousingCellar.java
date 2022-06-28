package fr.lusseau.llm.domain.entity.housing;

import fr.llm.immo.exception.ModelValueException;

public class HousingCellar {

    private final Boolean value;

    public HousingCellar(final Boolean value) throws ModelValueException {
        assertCellar(value);
        this.value = value;
    }

    private void assertCellar(Boolean cellar) throws ModelValueException {
        if (cellar == null) {
            throw new ModelValueException("Missing required cellar");
        }
    }

    public Boolean get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HousingCellar{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
