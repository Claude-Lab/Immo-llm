package fr.lusseau.llm.domain.entity.document;

public class DocumentId {

    private final Long id;

    public DocumentId(final Long id) {
        this.id = id;
    }

    public static DocumentId of(final Long id) {
        return new DocumentId(id);
    }

    public Long get() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentId{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
