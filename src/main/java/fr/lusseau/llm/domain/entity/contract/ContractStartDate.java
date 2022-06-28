package fr.lusseau.llm.domain.entity.contract;

import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;

public class ContractStartDate {

    private final LocalDate value;

    public ContractStartDate(final LocalDate value) throws ModelValueException {
        assertStartDate(value);
        this.value = value;
    }

    private void assertStartDate(LocalDate startDate) throws ModelValueException {
        if (startDate == null) {
            throw new ModelValueException("Missing required startDate");

        }
    }

    public LocalDate get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractStartDate{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
