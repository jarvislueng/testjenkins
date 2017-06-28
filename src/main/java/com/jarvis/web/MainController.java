package com.jarvis.web;

import com.jarvis.aop.TestAOP;
import com.jarvis.dao.BookDao;
import com.jarvis.dao.TUser;
import com.jarvis.entity.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by jarvis on 2017/6/19.
 */
@Controller
public class MainController {
    private static final Logger logger = LoggerFactory.getLogger(MainController.class);
    @Autowired
    BookDao bookDao;
    @Resource
    private TUser user;
    @RequestMapping("/123")
    @ResponseBody
    public String i(){
        long bookId =1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book.getName());
        return book.getName();
    }
    @RequestMapping("/456")
    @ResponseBody
    public String q(){
        String s = user.username();
        logger.info(s);
        return s;
    }
}
