package com.jsk.congrats.api.Dao;

import com.jsk.congrats.api.vo.CommentDelVo;
import com.jsk.congrats.api.vo.CommentRegVo;
import com.jsk.congrats.api.vo.CommentVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public class CommentDao extends BaseDao {

    public List<CommentVo> getCommentList(String main) {
        return (List<CommentVo>) this.list("getCommentList", main);
    }

    public String getCommentPwd(String cNum) {
        return (String) this.select("getCommentPwd", cNum);
    }

    public Integer regComment(CommentRegVo commentRegVo) {
        return this.update("regComment", commentRegVo);
    }

    public Integer delComment(CommentDelVo commentDelVo) {
        return this.update("delComment", commentDelVo);
    }

}