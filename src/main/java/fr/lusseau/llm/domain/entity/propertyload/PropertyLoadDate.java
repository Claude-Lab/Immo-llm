package fr.lusseau.llm.domain.entity.propertyload;

import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;

public class PropertyLoadDate {

    private final LocalDate value;

    public PropertyLoadDate(final LocalDate value) throws ModelValueException {
        asserDate(value);
        this.value = value;
    }

    private void asserDate(LocalDate date) throws ModelValueException {
        if (date == null) {
            throw new ModelValueException("Missing required date");
        }
    }

    public LocalDate get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PropertyLoadDate{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
