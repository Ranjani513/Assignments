package com.nisum.SpringbootHibernateManyToManyAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.SpringbootHibernateManyToManyAnnotation.entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
