package com.tistory.irerin07.miniwebshop.repository;

import com.tistory.irerin07.miniwebshop.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<User, Long> {
}
