package fr.lusseau.llm.domain.entity.contract;

import fr.llm.immo.exception.ModelValueException;

public class ContractRent {

    private final Float value;

    public ContractRent(final Float value) throws ModelValueException {
        assertRent(value);
        this.value = value;
    }

    private void assertRent(Float rent) throws ModelValueException {
        if (rent == null) {
            throw new ModelValueException("Missing required rent");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractRent{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
