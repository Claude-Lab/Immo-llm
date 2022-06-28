package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserFirstname {

    private final String firstName;

    public UserFirstname(String fisrtName) throws ModelValueException {
        assertFirstname(fisrtName);
        this.firstName = fisrtName;
    }

    private static void assertFirstname(String fisrtName) throws ModelValueException {
        if (fisrtName == null) {
            throw new ModelValueException("Missing required firstname");
        }
    }

    public String get() {
        return firstName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserFirstname{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
