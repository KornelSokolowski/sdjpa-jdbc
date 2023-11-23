package com.springGuru.sdjpajdbc.repositories;

import com.springGuru.sdjpajdbc.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
