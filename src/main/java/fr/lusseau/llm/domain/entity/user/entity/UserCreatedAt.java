package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.exception.ModelValueException;

import java.time.LocalDateTime;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserCreatedAt {

    private final LocalDateTime value;

    public UserCreatedAt(final LocalDateTime value) throws ModelValueException {
        assertCreatedAt(value);
        this.value = value;
    }

    private static void assertCreatedAt(LocalDateTime value) throws ModelValueException {
        if (value == null) {
            throw new ModelValueException("Missing required created date");
        }
    }

    public LocalDateTime get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserCreatedAt{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
