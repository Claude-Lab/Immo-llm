package fr.lusseau.llm.domain.entity.tax;

import fr.llm.immo.domain.housing.Housing;
import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;

public class Tax {

    private final TaxId id;
    private final TaxName name;
    private final TaxRate rate;
    private final TaxDate date;
    private Housing housingTaxes;

    public Tax(TaxBuilder builder) throws ModelValueException {
        this.id = new TaxId(builder.id);
        this.name = new TaxName(builder.name);
        this.rate = new TaxRate(builder.rate);
        this.date = new TaxDate(builder.date);
    }

    public static TaxBuilder builder() {
        return new TaxBuilder();
    }

    public static class TaxBuilder {
        private Long id;
        private String name;
        private float rate;
        private LocalDate date;

        public TaxBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public TaxBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public TaxBuilder withRate(float rate) {
            this.rate = rate;
            return this;
        }

        public TaxBuilder withDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Tax build() throws ModelValueException {
            return new Tax(this);
        }
    }

    public TaxId getId() {
        return id;
    }

    public TaxName getName() {
        return name;
    }

    public TaxRate getRate() {
        return rate;
    }

    public TaxDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tax{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", rate=").append(rate);
        sb.append(", date=").append(date);
        sb.append(", housingTaxes=").append(housingTaxes);
        sb.append('}');
        return sb.toString();
    }
}
