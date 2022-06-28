package fr.lusseau.llm.domain.entity.tax;

import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;

public class TaxDate {

    private final LocalDate value;

    public TaxDate(final LocalDate value) throws ModelValueException {
        assertDate(value);
        this.value = value;
    }

    private void assertDate(LocalDate date) throws ModelValueException {
        if (date == null) {
            throw new ModelValueException("Missing required date");
        }
    }

    public LocalDate get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TaxDate{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
