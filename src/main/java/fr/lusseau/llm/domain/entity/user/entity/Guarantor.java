package fr.lusseau.llm.domain.entity.user.entity;


import fr.llm.immo.domain.address.Address;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 1 Mars 2022
 */
public class Guarantor extends User {

    private final Address guarantorAddress;
    private final UserRole role;

    public Guarantor(Builder builder) {
        super(builder);
        this.guarantorAddress = builder.guarantorAddress;
        this.role = UserRole.ROLE_GUARANTOR;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends User.Builder<Builder> {

        private Address guarantorAddress;
        private UserRole role = UserRole.ROLE_GUARANTOR;

        @Override
        public Builder getThis() {
            return this;
        }

        public Builder withGuarantorAddress(Address guarantorAddress) {
            this.guarantorAddress = guarantorAddress;
            return this;
        }

        public Builder withRole(UserRole role) {
            this.role = UserRole.ROLE_GUARANTOR;
            return this;
        }

        public Guarantor build() {
            return new Guarantor(this);
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("\n");
        sb.append("GUARANTOR INFORMATION").append("\n");
        sb.append(super.toString());
        sb.append("role = ").append(role).append("\n\n");
        sb.append("GUARANTOR ADDRESS :").append("\n").append(guarantorAddress).append("\n");

        return sb.toString();
    }

    public Address getGuarantorAddress() {
        return guarantorAddress;
    }

    public UserRole getRole() {
        return role;
    }


}
