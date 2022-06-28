package fr.lusseau.llm.domain.entity.propertyload;

import fr.llm.immo.domain.housing.Housing;
import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDate;

public class PropertyLoad {

    private final PropertyLoadId id;
    private final PropertyLoadName name;
    private final PropertyLoadQuarter quarter;
    private final PropertyLoadRate rate;
    private final PropertyLoadDate date;

    private Housing housingLoads;

    public PropertyLoad(PropertyLoadBuilder builder) throws ModelValueException {
        this.id = new PropertyLoadId(builder.id);
        this.name = new PropertyLoadName(builder.name);
        this.quarter = new PropertyLoadQuarter(builder.quarter);
        this.rate = new PropertyLoadRate(builder.rate);
        this.date = new PropertyLoadDate(builder.date);
    }

    public static PropertyLoadBuilder builder() {
        return new PropertyLoadBuilder();
    }

    public static class PropertyLoadBuilder {
        private Long id;
        private String name;
        private Integer quarter;
        private Float rate;
        private LocalDate date;

        public PropertyLoadBuilder withId(Long id) {
            this.id = id;
            return this;
        }

        public PropertyLoadBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public PropertyLoadBuilder withQuarter(Integer quarter) {
            this.quarter = quarter;
            return this;
        }

        public PropertyLoadBuilder withRate(Float rate) {
            this.rate = rate;
            return this;
        }

        public PropertyLoadBuilder withDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public PropertyLoad build() throws ModelValueException {
            return new PropertyLoad(this);
        }
    }

    public PropertyLoadId getId() {
        return id;
    }

    public PropertyLoadName getName() {
        return name;
    }

    public PropertyLoadQuarter getQuarter() {
        return quarter;
    }

    public PropertyLoadRate getRate() {
        return rate;
    }

    public PropertyLoadDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PropertyLoad{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", quarter=").append(quarter);
        sb.append(", rate=").append(rate);
        sb.append(", date=").append(date);
        sb.append(", housingLoads=").append(housingLoads);
        sb.append('}');
        return sb.toString();
    }
}
