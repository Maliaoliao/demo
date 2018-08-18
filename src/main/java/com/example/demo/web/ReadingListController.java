package com.example.demo.web;

import com.example.demo.dto.Book;
import com.example.demo.service.ReadingListRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * description.
 *
 * @author Created by liaoliao.ma@hand-china.com
 * @version 1.0
 * @date Created on 2018/8/15
 */
@Controller
@RequestMapping("/")
public class ReadingListController {

    private ReadingListRepository readingListRepository;
    @Autowired
    public ReadingListController(
            ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }
    @RequestMapping(value="/{reader}", method=RequestMethod.GET) public String readersBooks(
            @PathVariable("reader") String reader,
            Model model) {
        System.out.println("55555");
        return "login";
    }
    @RequestMapping(value="/{login}", method=RequestMethod.POST) public String addToReadingList(
            @PathVariable("login") String reader, Book book) {
        /*System.out.println("123123123");
        book.setReader(reader);
        readingListRepository.save(book);*/
        System.out.println("55555");
        return "index";
    }

}
