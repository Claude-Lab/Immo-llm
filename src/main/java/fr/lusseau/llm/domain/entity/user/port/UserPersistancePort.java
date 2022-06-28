package fr.lusseau.llm.domain.entity.user.port;

import fr.llm.immo.exception.DoesNotExistException;

import java.util.List;
import java.util.Optional;

/**
 * @author Claude LUSSEAU
 * @project Immo-LLM
 * @date 04 30, 2022 | 19:58
 */
public interface UserPersistancePort<T> {

    Optional<T> getUserById(Long id);

    T addNewUser(T user);

    T updateUserInfos(T user);

    boolean deleteUser(T user) throws DoesNotExistException;

    List<T> getAllUsers();
}
