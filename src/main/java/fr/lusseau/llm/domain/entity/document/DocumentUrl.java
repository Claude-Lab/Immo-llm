package fr.lusseau.llm.domain.entity.document;

import fr.llm.immo.exception.ModelValueException;

public class DocumentUrl {

    private final String url;

    public DocumentUrl(final String url) throws ModelValueException {
        assertUrl(url);
        this.url = url;
    }

    private void assertUrl(String url) throws ModelValueException {
        if (url == null) {
            throw new ModelValueException("Missing required url");
        }
    }

    public String get() {
        return url;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DocumentUrl{");
        sb.append("url='").append(url).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
