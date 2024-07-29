package com.ansdev.book.book;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
public class BookResponse {
    Integer id;
    String title;
    String authorName;
    String isbn;
    String synopsis;
    String owner;
    byte[] cover;
    double rate;
    boolean shareable;
    boolean archived;

}
