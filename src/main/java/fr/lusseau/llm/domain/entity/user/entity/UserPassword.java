package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserPassword {

    private final String password;

    public UserPassword(final String password) throws ModelValueException {
        assertPassword(password);
        this.password = password;
    }

    public static UserPassword of(final String password) throws ModelValueException {
        return new UserPassword(password);
    }

    private void assertPassword(String password) throws ModelValueException {
        if (password == null) {
            throw new ModelValueException("Missing required password");
        }
    }

    public String get() {
        return password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserPassword{");
        sb.append("password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
