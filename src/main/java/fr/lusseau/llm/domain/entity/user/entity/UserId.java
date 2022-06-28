package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.exception.ModelValueException;

public class UserId {

    private final Long id;

    public UserId(final Long id) throws ModelValueException {
        assertId(id);
        this.id = id;
    }

    private void assertId(Long id) throws ModelValueException {
        if (id == null) {
            throw new ModelValueException("Missing required ID");
        }
    }

    public Long get() {
        return id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserId{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }
}
