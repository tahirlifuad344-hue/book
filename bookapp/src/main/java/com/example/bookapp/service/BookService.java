package com.example.bookapp.service;

import com.example.bookapp.entitiy.Book;
import com.example.bookapp.repository.BookRepository;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    public Book updateBook(Book book){
        return bookRepository.save(book);
    }
    public Book getBookByTitle(String title){
        return bookRepository.findByTitle(title).orElse(null);
    }
    public List<Book> getBookByAuthor(String author){
        return bookRepository.findByAuthor(author);
    }
   public void deleteAllBooks(){
        bookRepository.deleteAll();
    }
    public Long countBooks(){
        return bookRepository.count();
    }

    public List<Book> getAllBooks(){
    return bookRepository.findAll();
    }
    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }
    }

