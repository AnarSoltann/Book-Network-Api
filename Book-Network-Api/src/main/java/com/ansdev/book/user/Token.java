package com.ansdev.book.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Token {

    @Id
    @GeneratedValue
    private Integer id;
    private String token;
    private LocalDateTime createAt;
    private LocalDateTime expireAt;
    private LocalDateTime validateAt;

    @ManyToOne
    @JoinColumn(name = "userId",nullable = false)
    private User user;


}
