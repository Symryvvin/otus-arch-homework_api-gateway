package ru.aizen.account.management.domain.user;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface UserRepository extends Repository<User, Long> {

	void save(User user) throws UserRepositoryException;

	void update(User user) throws UserRepositoryException;

	Optional<User> findById(long userId) throws UserRepositoryException;

	Optional<User> findByUsername(String username) throws UserRepositoryException;

	boolean userAlreadyExists(String username, String email) throws UserRepositoryException;

}
