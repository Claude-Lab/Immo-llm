package fr.lusseau.llm.domain.entity.receipt;

public class ReceiptId {

    private final Long value;

    public ReceiptId(final Long value) {
        this.value = value;
    }

    public static ReceiptId of(final Long id) {
        return new ReceiptId(id);
    }

    public Long get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ReceiptId{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
