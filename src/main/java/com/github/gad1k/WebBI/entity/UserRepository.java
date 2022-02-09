package com.github.gad1k.WebBI.entity;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<DatabaseUser, Long> {
}
