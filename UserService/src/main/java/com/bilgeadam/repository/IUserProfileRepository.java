package com.bilgeadam.repository;

import com.bilgeadam.repository.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserProfileRepository extends JpaRepository<UserProfile,Long> {
    Optional<UserProfile> findOptionalByAuthId(Long authId);
    Optional<UserProfile> findOptionalByUsernameIgnoreCase(String username);
}
