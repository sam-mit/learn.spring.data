package com.springdata.data;

import com.springdata.data.entities.Book;
import java.util.Date;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataApplication {

  public static void main(String[] args) {
    ApplicationContext context = SpringApplication.run(DataApplication.class, args);
    BookRepository repository = context.getBean(BookRepository.class);
    Book book = new Book();
    book.setTitle("A test book");
    book.setPageCount(200);
    book.setPublishDate(new Date());
    repository.save(book);
  }

}
