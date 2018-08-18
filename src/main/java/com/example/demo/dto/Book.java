package com.example.demo.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * description.
 *
 * @author Created by liaoliao.ma@hand-china.com
 * @version 1.0
 * @date Created on 2018/8/15
 */
@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;
}
