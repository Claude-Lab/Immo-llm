package fr.lusseau.llm.domain.entity.user.user.usercase;

import java.util.List;
import java.util.Optional;

/**
 * @author Claude LUSSEAU
 * @project Immo-LLM
 * @date 05 02, 2022 | 22:19
 */
public interface GetUsers<T> {

    List<T> getAllUsers();

    Optional<T> getUserById(Long id);

}
