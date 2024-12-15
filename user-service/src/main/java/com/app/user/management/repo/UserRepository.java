package com.app.user.management.repo;

import com.app.user.management.entity.BusinessUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<BusinessUser, Long> {
    boolean existsByFirstNameAndLastName(String firstName, String lastName);
    Optional<BusinessUser> findByBusinessUserId(UUID businessUserId);
}
