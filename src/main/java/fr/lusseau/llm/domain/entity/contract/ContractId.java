package fr.lusseau.llm.domain.entity.contract;


public class ContractId {

    private final Long value;

    public ContractId(final Long value) {
        this.value = value;
    }

    public static ContractId of(final Long id) {
        return new ContractId(id);
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
