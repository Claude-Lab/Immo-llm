package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.domain.address.Address;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 1 Mars 2022
 */
public class Tenant extends User {

    private final Address tenantBeforeAddress;
    private final Address tenantAfterAddress;
    private final UserRole role;

    public Tenant(Builder builder) {
        super(builder);
        this.tenantBeforeAddress = builder.tenantBeforeAddress;
        this.tenantAfterAddress = builder.tenantAfterAddress;
        this.role = UserRole.ROLE_TENANT;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends User.Builder<Builder> {

        private Address tenantBeforeAddress;
        private Address tenantAfterAddress;
        private UserRole role = UserRole.ROLE_TENANT;

        @Override
        public Builder getThis() {
            return this;
        }

        public Builder withTenantBeforeAddress(Address tenantBeforeAddress) {
            this.tenantBeforeAddress = tenantBeforeAddress;
            return this;
        }

        public Builder withTenantAfterAddress(Address tenantAfterAddress) {
            this.tenantAfterAddress = tenantAfterAddress;
            return this;
        }

        public Builder withRole(UserRole role) {
            this.role = UserRole.ROLE_TENANT;
            return this;
        }

        public Tenant build() {
            return new Tenant(this);
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tenant{");
        sb.append("tenantBeforeAddress=").append(tenantBeforeAddress);
        sb.append(", tenantAfterAddress=").append(tenantAfterAddress);
        sb.append('}');
        return sb.toString();
    }

    public Address getTenantBeforeAddress() {
        return tenantBeforeAddress;
    }

    public Address getTenantAfterAddress() {
        return tenantAfterAddress;
    }

    public UserRole getRole() {
        return role;
    }
}
