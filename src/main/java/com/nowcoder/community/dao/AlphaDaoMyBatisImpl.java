package com.nowcoder.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * ClassName: AlphaDaoMyBatisImpl
 * Package: com.nowcoder.community.controller.dao
 * Description:
 *
 * @Author: Muki
 * @Create 2023/7/20 10:24
 * Version 1.0
 */
@Repository
@Primary
public class AlphaDaoMyBatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "MyBatis";
    }
}
