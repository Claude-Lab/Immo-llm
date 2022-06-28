package fr.lusseau.llm.domain.entity.receipt;

import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;

public class ReceiptDate {

    private final LocalDate value;

    public ReceiptDate(final LocalDate value) throws ModelValueException {
        asserttDate(value);
        this.value = value;
    }

    private void asserttDate(LocalDate date) throws ModelValueException {
        if (date == null) {
            throw new ModelValueException("Missing required date");
        }
    }

    public LocalDate get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReceiptDate{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
