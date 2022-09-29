package com.jsk.congrats.api.Service;

import com.jsk.congrats.api.vo.CommentDelVo;
import com.jsk.congrats.api.vo.CommentRegVo;
import com.jsk.congrats.api.vo.CommentVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    public List<CommentVo> getCommentList();

    public Integer regComment(CommentRegVo commentRegVo);

    public Integer delComment(CommentDelVo commentDelVo);

}