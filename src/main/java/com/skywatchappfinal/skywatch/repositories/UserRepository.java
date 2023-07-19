package com.skywatchappfinal.skywatch.repositories;

import com.skywatchappfinal.skywatch.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
