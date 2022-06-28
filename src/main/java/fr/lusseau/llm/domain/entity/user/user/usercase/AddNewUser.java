package fr.lusseau.llm.domain.entity.user.user.usercase;

/**
 * @author Claude LUSSEAU
 * @project Immo-LLM
 * @date 05 02, 2022 | 20:57
 */
public interface AddNewUser<T> {

    T addNewUser(T user);

    T updateUserInfos(T user);
}
