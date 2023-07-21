package com.nowcoder.community.dao;


import com.nowcoder.community.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.stereotype.Repository;

/**
 * ClassName: UserMapper
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author: Muki
 * @Create 2023/7/21 11:25
 * Version 1.0
 */
@Mapper
public interface UserMapper {
    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    //返回修改的条目数

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);
}
