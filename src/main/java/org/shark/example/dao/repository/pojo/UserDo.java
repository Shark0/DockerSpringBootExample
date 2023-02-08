package org.shark.example.dao.repository.pojo;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class UserDo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "account")
    private String account;

    @Column(name = "password")
    private String password;
}
