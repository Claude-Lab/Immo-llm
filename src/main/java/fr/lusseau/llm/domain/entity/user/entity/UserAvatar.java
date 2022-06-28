package fr.lusseau.llm.domain.entity.user.entity;

import java.util.Optional;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserAvatar {

    private final String value;

    public UserAvatar(final String value) {
        this.value = value;
    }

    public static Optional<UserAvatar> of(final String avatar) {
        return Optional.empty();
    }

    public String get() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserAvatar{");
        sb.append("value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
