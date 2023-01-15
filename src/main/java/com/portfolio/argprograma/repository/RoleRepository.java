package com.portfolio.argprograma.repository;

import com.portfolio.argprograma.entity.ERole;
import com.portfolio.argprograma.entity.Role;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(ERole name);
}

