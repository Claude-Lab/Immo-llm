package fr.lusseau.llm.domain.entity.document;

import fr.llm.immo.exception.ModelValueException;

public class DocumentName {

    private final String name;

    public DocumentName(final String name) throws ModelValueException {
        assertName(name);
        this.name = name;
    }

    private void assertName(String name) throws ModelValueException {
        if (name == null) {
            throw new ModelValueException("Missing required name");
        }
    }


    public String get() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentName{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
