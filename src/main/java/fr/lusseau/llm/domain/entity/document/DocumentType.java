package fr.lusseau.llm.domain.entity.document;

import fr.llm.immo.exception.ModelValueException;

public class DocumentType {

    private final String type;

    public DocumentType(final String type) throws ModelValueException {
        assertType(type);
        this.type = type;
    }

    private void assertType(String type) throws ModelValueException {
        if (type == null) {
            throw new ModelValueException("Missing required type");
        }
    }

    public String get() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentType{");
        sb.append("type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
