package com.nowcoder.community.service;

import com.nowcoder.community.dao.CommentMapper;
import com.nowcoder.community.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: CommentService
 * Package: com.nowcoder.community.service
 * Description:
 *
 * @Author: Muki
 * @Create 2023/7/25 13:55
 * Version 1.0
 */
@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> findCommentByEntity(int entityType, int entityId, int offset, int limit) {
        return commentMapper.selectCommentsByEntity(entityType, entityId, offset, limit);
    }

    public int findCommentCount(int entityType, int entityId) {
        return commentMapper.selectCountByEntity(entityType, entityId);
    }
}
