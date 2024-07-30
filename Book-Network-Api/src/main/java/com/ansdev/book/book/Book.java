package com.ansdev.book.book;

import com.ansdev.book.feedback.Feedback;
import com.ansdev.book.history.BookTransactionHistory;
import com.ansdev.book.user.User;
import com.ansdev.book.common.BaseEntity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import lombok.experimental.SuperBuilder;

import java.util.List;

@FieldDefaults(level = lombok.AccessLevel.PRIVATE)
@Entity
@Getter
@Setter
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity {

    String title;

    String authorName;

    String isbn;

    String synopsis;

    String bookCover;

    boolean archived;

    boolean shareable;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    User owner;

    @OneToMany(mappedBy = "book")
    List<Feedback> feedbacks;

    @OneToMany(mappedBy = "book")
    List<BookTransactionHistory> transactionHistories;

    @Transient
    public double getRate() {
        if (feedbacks == null || feedbacks.isEmpty()) {
            return 0.0;
        }
        var rate = feedbacks.stream().mapToDouble(Feedback::getNote).average().orElse(0.0);
        return Math.round(rate * 10.0) / 10.0;
    }



}
