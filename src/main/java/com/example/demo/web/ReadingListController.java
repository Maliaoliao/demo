package com.example.demo.web;

import com.example.demo.dto.Book;
import com.example.demo.dto.User;
import com.example.demo.service.IUserService;
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
    @Autowired
    public IUserService iUserService;
    private ReadingListRepository readingListRepository;
    @Autowired
    public ReadingListController(
            ReadingListRepository readingListRepository) {
        this.readingListRepository = readingListRepository;
    }
    @RequestMapping(value="/{reader}", method=RequestMethod.GET) public String readersBooks(
            @PathVariable("reader") String reader,
            Model model) throws Exception {
        System.out.println("55555");
        List<User> list = iUserService.selectAllUser();
        if(list.isEmpty()) {
            throw new Exception("没有用户");
        }
        list.forEach(e->{
            System.out.println(e.toString());
        });
        return "login";
    }
    @RequestMapping(value="/{login}", method=RequestMethod.POST) public String addToReadingList(
            @PathVariable("login") String reader, Book book) {
        System.out.println("55555");
        return "index";
    }

}
