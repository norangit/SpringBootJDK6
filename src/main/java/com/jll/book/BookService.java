package com.jll.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Transactional
    public Book findById(){
        Book book = new Book();
        book.setName("aaaaaa");

        this.bookRepository.save(book);
        System.out.println(this.bookRepository);
        return book;
    }
}
