package fr.lusseau.llm.domain.entity.user.entity;


/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 1 Mars 2022
 */
public class Admin extends User {

    private final UserRole role;

    public Admin(Builder builder) {
        super(builder);
        this.role = UserRole.ROLE_ADMIN;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends User.Builder<Builder> {

        private UserRole role = UserRole.ROLE_ADMIN;

        @Override
        public Builder getThis() {
            return this;
        }


        public Builder withRole(UserRole role) {
            this.role = UserRole.ROLE_ADMIN;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }

    public UserRole getRole() {
        return role;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Admin{");
        sb.append("role=").append(role);
        sb.append('}');
        return sb.toString();
    }
}
