package fr.lusseau.llm.domain.entity.user.entity;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserUpdatedAt {

    private LocalDateTime value;

    public UserUpdatedAt(final LocalDateTime value) {
        this.value = value;
    }

    public static Optional<UserUpdatedAt> of(final LocalDateTime date) {
        return Optional.empty();
    }

    public LocalDateTime get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserUpdatedAt{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
