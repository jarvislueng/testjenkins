package com.jarvis.dao;

import com.jarvis.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jarvis on 2017/6/19.
 */
public interface BookDao {
    /**
     * 通过ID查询单本图书
     *
     * @param id
     * @return
     */
//    @Select("select book_id, name, number FROM book WHERE book_id = 1000")
    Book queryById(long id);

    /**
     * 查询所有图书
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);

    /**
     * 减少馆藏数量
     *
     * @param bookId
     * @return 如果影响行数等于>1，表示更新的记录行数
     */
    int reduceNumber(long bookId);
}
