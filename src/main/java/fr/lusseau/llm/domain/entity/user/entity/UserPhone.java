package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserPhone {

    private final String value;

    public UserPhone(final String value) throws ModelValueException {
        assertPhone(value);
        this.value = value;
    }

    private static void assertPhone(String value) throws ModelValueException {
        if (value == null) {
            throw new ModelValueException("Missing required phone");
        }
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPhone{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
