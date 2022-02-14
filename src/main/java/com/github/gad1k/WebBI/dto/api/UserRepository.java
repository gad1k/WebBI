package com.github.gad1k.WebBI.dto.api;

import com.github.gad1k.WebBI.dto.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
