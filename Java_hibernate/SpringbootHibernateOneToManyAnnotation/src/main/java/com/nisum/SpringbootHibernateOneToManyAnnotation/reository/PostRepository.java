package com.nisum.SpringbootHibernateOneToManyAnnotation.reository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.SpringbootHibernateOneToManyAnnotation.entity.Post;
@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
