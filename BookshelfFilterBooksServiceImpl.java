package com.dz.hwyc.content.main.book.service.impl;

import com.dz.hwyc.content.main.book.entity.BookshelfFilterBooks;
import com.dz.hwyc.content.main.book.mapper.BookshelfFilterBooksMapper;
import com.dz.hwyc.content.main.book.service.IBookshelfFilterBooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 客户端书架模块的内置书籍过滤条件下的书籍列表 服务实现类
 * </p>
 *
 * @author sff
 * @since 2020-02-27
 */
@Service
public class BookshelfFilterBooksServiceImpl extends ServiceImpl<BookshelfFilterBooksMapper, BookshelfFilterBooks> implements IBookshelfFilterBooksService {


    @Override
    public List<BookshelfFilterBooks> findBooks(Long filterId) {
        List<BookshelfFilterBooks> books = baseMapper.findBooks(filterId);
        return books;
    }

}
