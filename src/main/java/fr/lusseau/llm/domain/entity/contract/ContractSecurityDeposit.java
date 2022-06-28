package fr.lusseau.llm.domain.entity.contract;

import fr.llm.immo.exception.ModelValueException;

public class ContractSecurityDeposit {

    private final Float value;

    public ContractSecurityDeposit(final Float value) throws ModelValueException {
        assertSecurityDeposit(value);
        this.value = value;
    }

    private void assertSecurityDeposit(Float securityDeposit) throws ModelValueException {
        if (securityDeposit == null) {
            throw new ModelValueException("Missing required securityDeposit");
        }
    }

    public Float get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractSecurityDeposit{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
