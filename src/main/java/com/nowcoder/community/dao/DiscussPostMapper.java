package com.nowcoder.community.dao;

import com.nowcoder.community.controller.DiscussPostController;
import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

/**
 * ClassName: DiscussPostMapper
 * Package: com.nowcoder.community.dao
 * Description:
 *
 * @Author: Muki
 * @Create 2023/7/21 16:41
 * Version 1.0
 */
@Mapper
public interface DiscussPostMapper {
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);
    // @Param注解用于给参数取别名,
    // 如果只有一个参数,并且在<if>里使用(就是这个参数不一定有),则必须加别名.

    int selectDiscussPostRows(@Param("userId") int userId);

    int insertDiscussPost(DiscussPost discussPost);

    DiscussPost selectDiscussPostById(int id);

    int updateCommentCount(int id, int commentCount);
}
