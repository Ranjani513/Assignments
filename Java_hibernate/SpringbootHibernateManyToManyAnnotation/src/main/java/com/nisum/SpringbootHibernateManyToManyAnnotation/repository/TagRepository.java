package com.nisum.SpringbootHibernateManyToManyAnnotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.stereotype.Repository;

import com.nisum.SpringbootHibernateManyToManyAnnotation.entity.Post;
import com.nisum.SpringbootHibernateManyToManyAnnotation.entity.Tag;
@Repository
public interface TagRepository extends JpaRepository<Tag, Long>  {

}
