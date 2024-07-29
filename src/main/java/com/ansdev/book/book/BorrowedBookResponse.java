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
public class BorrowedBookResponse {
    Integer id;
    String title;
    String authorName;
    String isbn;
    double rate;
    boolean returned;
    boolean returnApproved;
}
