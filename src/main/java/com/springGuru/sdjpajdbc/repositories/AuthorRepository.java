package com.springGuru.sdjpajdbc.repositories;

import com.springGuru.sdjpajdbc.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Long> {

}
