package com.example.springbootthymeleafform.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@NoArgsConstructor
public class User extends Object{
    private String name;
    private String email;
    private String password;
    private String gender;
    private String note;
    private String profession;

    private boolean married;
    private Date birthday;

}
