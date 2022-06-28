package fr.lusseau.llm.domain.entity.user.user;

import fr.llm.immo.domain.user.port.UserPersistancePort;
import fr.llm.immo.domain.user.user.usercase.AddNewUser;
import fr.llm.immo.domain.user.user.usercase.GetUsers;

import java.util.List;
import java.util.Optional;

/**
 * @author Claude LUSSEAU
 * @project Immo-LLM
 * @date 05 02, 2022 | 20:14
 */
public class UserFacade implements AddNewUser, GetUsers {

    private final UserPersistancePort userPersistencePort;

    public UserFacade(final UserPersistancePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public Object addNewUser(Object user) {
        return userPersistencePort.addNewUser(user);
    }

    @Override
    public Object updateUserInfos(Object user) {
        return null;
    }

    @Override
    public List<Object> getAllUsers() {
        return userPersistencePort.getAllUsers();
    }

    @Override
    public Optional<Object> getUserById(Long id) {
        return (Optional<Object>) userPersistencePort.getUserById(id);
    }
}
