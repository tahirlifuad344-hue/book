package com.example.bookapp.controller;

import com.example.bookapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
@PostMapping("/save")
public com.example.bookapp.entitiy.Book saveBook(com.example.bookapp.entitiy.Book book){
    return bookService.saveBook(book);
}
   @GetMapping("/all")
    public Iterable<com.example.bookapp.entitiy.Book> getAllBooks(){
       return bookService.getAllBooks();
   }
   @GetMapping("/{id}")
    public  com.example.bookapp.entitiy.Book getBookById(Long id){
       return bookService.getBookById(id);
   }
   @DeleteMapping("/{id}")
    public void deleteBook(Long id){
    bookService.deleteBook(id);
   }



}
