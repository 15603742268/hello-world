package com.dz.hwyc.content.main.book.service.impl;

import com.dz.hwyc.content.api.book.model.vo.BookPublishRuleVo;
import com.dz.hwyc.content.main.book.entity.BookPublishRule;
import com.dz.hwyc.content.main.book.mapper.BookPublishRuleMapper;
import com.dz.hwyc.content.main.book.service.IBookPublishRuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sff
 * @since 2020-07-20
 */
@Service
public class BookPublishRuleServiceImpl extends ServiceImpl<BookPublishRuleMapper, BookPublishRule> implements IBookPublishRuleService {

    @Override
    public BookPublishRuleVo findByBookId(String bookId) {
        BookPublishRule bookPublishRule = getBaseMapper().findByBookId(bookId);
        BookPublishRuleVo publishRuleVo = new BookPublishRuleVo();
        if (bookPublishRule != null) {
            BeanUtils.copyProperties(bookPublishRule, publishRuleVo);
            return publishRuleVo;
        }
        return null;
    }
}
