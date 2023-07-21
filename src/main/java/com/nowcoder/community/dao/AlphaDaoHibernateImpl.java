package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

/**
 * ClassName: AlphaDaoHibernateImpl
 * Package: com.nowcoder.community.controller.dao
 * Description:
 *
 * @Author: Muki
 * @Create 2023/7/20 10:21
 * Version 1.0
 */
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao {

    @Override
    public String select() {
        return "Hibernate";
    }
}
