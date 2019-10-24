package com.journaldev.bootifulmongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.journaldev.bootifulmongodb.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	// public List<User> findAllByName(String lastName);
	List<User> findByName(String name);
	// @Query("{'name : ?0'}")
	// User findUserByName(String Name);
	List<User> findByNameIn(List<String> name);
}
