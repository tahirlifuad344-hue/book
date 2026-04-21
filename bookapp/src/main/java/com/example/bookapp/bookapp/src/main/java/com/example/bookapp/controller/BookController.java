package com.example.bookapp.controller;

import com.example.bookapp.entitiy.Book;
import com.example.bookapp.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

@PostMapping("/save")
public Book saveBook(@RequestBody Book book){
    return bookService.saveBook(book);
}
   @GetMapping("/all")
    public Iterable<com.example.bookapp.entitiy.Book> getAllBooks(){
       return bookService.getAllBooks();
   }
   @GetMapping("/{id}")
    public  Book getBookById(@PathVariable Long id){
       return bookService.getBookById(id);
   }
   @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id){
    bookService.deleteBook(id);
   }
   @DeleteMapping("/delete-multiple")
    public void deleteMultipleBooks(@RequestBody List<Long> ids) {bookService.deleteMultipleBooks(ids);
}


}
