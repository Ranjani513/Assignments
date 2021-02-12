package com.nisum.SpringbootHibernateOneToManyAnnotation.reository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nisum.SpringbootHibernateOneToManyAnnotation.entity.Comment;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
