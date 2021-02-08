package com.nisum.onetoone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.onetoone.entity.UserProfile;
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {

}
