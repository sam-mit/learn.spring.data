package com.springdata.data.entities;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

@Entity
@Table(name = "BOOK")
@Data
public class Book {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long bookId;
  private String title;
  private Date publishDate;
  private int pageCount;
  private BigDecimal price;


}
