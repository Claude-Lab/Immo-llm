package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserLastname {

    private final String lastName;

    public UserLastname(final String lastName) throws ModelValueException {
        assertLastname(lastName);
        this.lastName = lastName;
    }

    private void assertLastname(String lastName) throws ModelValueException {
        if (lastName == null) {
            throw new ModelValueException("Missing required lastname");
        }
    }

    public String get() {
        return lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserLastname{");
        sb.append("lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
