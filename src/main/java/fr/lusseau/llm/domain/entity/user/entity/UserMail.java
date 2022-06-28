package fr.lusseau.llm.domain.entity.user.entity;

import fr.llm.immo.exception.ModelValueException;

/**
 * @author Claude LUSSEAU
 * @Project immo-llm 1.0
 * @Date 2 Mars 2022
 */
public class UserMail {

    private final String eMail;

    public UserMail(final String eMail) throws ModelValueException {
        assertEmail(eMail);
        this.eMail = eMail;
    }

    private static void assertEmail(String eMail) throws ModelValueException {
        if (eMail == null) {
            throw new ModelValueException("Missing required mail");
        }
    }

    public String get() {
        return eMail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserMail{");
        sb.append("eMail='").append(eMail).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
