package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.domain.address.Address;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 1 Mars 2022
 */
public class Owner extends User {

    private final Address ownerAddress;
    private final UserRole role;


    public Owner(Builder builder) {
        super(builder);
        this.ownerAddress = builder.ownerAddress;
        this.role = UserRole.ROLE_OWNER;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends User.Builder<Builder> {

        private Address ownerAddress;
        private UserRole role;

        @Override
        public Builder getThis() {
            return this;
        }

        public Builder withOwnerAddress(Address ownerAddress) {
            this.ownerAddress = ownerAddress;
            return this;
        }

        public Builder withRole(UserRole role) {
            this.role = UserRole.ROLE_OWNER;
            return this;
        }

        public Owner build() {
            return new Owner(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("ownerAddress=").append(ownerAddress);
        sb.append('}');
        return sb.toString();
    }

    public Address getOwnerAddress() {
        return ownerAddress;
    }

    public UserRole getRole() {
        return role;
    }
}
