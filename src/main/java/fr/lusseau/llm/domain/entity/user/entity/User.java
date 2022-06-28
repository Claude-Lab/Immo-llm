package fr.lusseau.llm.domain.entity.user.entity;


import java.util.Objects;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 1 Mars 2022
 */
public class User {

    private final UserId id;
    private final UserMail email;
    private final UserPassword password;
    private final UserFirstname firstname;
    private final UserLastname lastname;
    private final UserPhone phone;
    private final UserAvatar avatar;
    private final UserCreatedAt createdAt;
    private final UserUpdatedAt updatedAt;
    private final boolean validated;

    protected User(Builder<?> builder) {
        this.id         = builder.id;
        this.email      = builder.email;
        this.password   = builder.password;
        this.firstname  = builder.firstname;
        this.lastname   = builder.lastname;
        this.phone      = builder.phone;
        this.avatar     = builder.avatar;
        this.createdAt  = builder.createdAt;
        this.updatedAt  = builder.updatedAt;
        this.validated  = builder.validated;
    }

    public static Builder builder() {
        return new Builder() {
            @Override
            public Builder getThis() {
                return this;
            }
        };
    }

    public abstract static class Builder<T extends Builder<T>> {

        private UserId id;
        private UserMail email;
        private UserPassword password;
        private UserFirstname firstname;
        private UserLastname lastname;
        private UserPhone phone;
        private UserAvatar avatar;
        private UserCreatedAt createdAt;
        private UserUpdatedAt updatedAt;
        private boolean validated;

        public abstract T getThis();

        public T withId(UserId id) {
            this.id = id;
            return this.getThis();
        }

        public T withEmail(UserMail email) {
            this.email = email;
            return this.getThis();
        }

        public T withPassword(UserPassword password) {
            this.password = password;
            return this.getThis();
        }

        public T withFirstname(UserFirstname firstname) {
            this.firstname = firstname;
            return this.getThis();
        }

        public T withLastname(UserLastname lastname) {
            this.lastname = lastname;
            return this.getThis();
        }

        public T withPhone(UserPhone phone) {
            this.phone = phone;
            return this.getThis();
        }

        public T withAvatar(UserAvatar avatar) {
            this.avatar = avatar;
            return this.getThis();
        }

        public T withCreatedAt(UserCreatedAt createdAt) {
            this.createdAt = createdAt;
            return this.getThis();
        }

        public T withUpdatedAt(UserUpdatedAt updatedAt) {
            this.updatedAt = updatedAt;
            return this.getThis();
        }


        public T withValidated(boolean validated) {
            this.validated = validated;
            return this.getThis();
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return validated == user.validated && Objects.equals(id, user.id) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(firstname, user.firstname) && Objects.equals(lastname, user.lastname) && Objects.equals(phone, user.phone) && Objects.equals(avatar, user.avatar) && Objects.equals(createdAt, user.createdAt) && Objects.equals(updatedAt, user.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email, password, firstname, lastname, phone, avatar, createdAt, updatedAt, validated);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("id =").append(id).append("\n");
        sb.append("email =").append(email).append("\n");
        sb.append("password =").append(password).append("\n");
        sb.append("firstname =").append(firstname).append("\n");
        sb.append("lastname =").append(lastname).append("\n");
        sb.append("phone =").append(phone).append("\n");
        sb.append("avatar =").append(avatar).append("\n");
        sb.append("createdAt =").append(createdAt).append("\n");
        sb.append("updatedAt =").append(updatedAt).append("\n");
        sb.append("validated =").append(validated).append("\n");
        return sb.toString();
    }
}
