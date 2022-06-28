package fr.lusseau.llm.domain.entity.contract;

import java.time.LocalDate;
import java.util.Optional;

public class ContractEndDate {

    private final LocalDate value;

    public ContractEndDate(final LocalDate value) {
        this.value = value;
    }

    public static Optional<ContractEndDate> of(final LocalDate date) {
        return Optional.empty();
    }

    public LocalDate get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractEndDate{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
