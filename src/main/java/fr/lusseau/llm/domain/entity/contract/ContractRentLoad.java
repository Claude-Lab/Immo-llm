package fr.lusseau.llm.domain.entity.contract;

import fr.llm.immo.exception.ModelValueException;

public class ContractRentLoad {

    private final Float value;

    public ContractRentLoad(final Float value) throws ModelValueException {
        assertRentLoad(value);
        this.value = value;
    }

    private void assertRentLoad(Float rentLoad) throws ModelValueException {
        if (rentLoad == null) {
            throw new ModelValueException("Missing required rentLoad");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractRentLoad{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
