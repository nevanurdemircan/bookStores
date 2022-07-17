package com.example.bookstores.repository;

import com.example.bookstores.entities.BookStore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStoreRepository extends JpaRepository<BookStore,Long> {
}
