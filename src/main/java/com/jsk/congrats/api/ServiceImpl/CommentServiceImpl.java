package com.jsk.congrats.api.ServiceImpl;

import com.jsk.congrats.api.Dao.CommentDao;
import com.jsk.congrats.api.Service.CommentService;
import com.jsk.congrats.api.vo.CommentDelVo;
import com.jsk.congrats.api.vo.CommentRegVo;
import com.jsk.congrats.api.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao dao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<CommentVo> getCommentList() {
        return dao.getCommentList();
    }

    @Override
    public Integer regComment(CommentRegVo commentRegVo) {
        // 암호화
        String encodePassword = passwordEncoder.encode(commentRegVo.getPwd());
        commentRegVo.setPwd(encodePassword);

        return dao.regComment(commentRegVo);
    }

    @Override
    public Integer delComment(CommentDelVo commentDelVo) {

        // 비밀번호 확인
        String pwd = dao.getCommentPwd(commentDelVo.getcNum());
        if (!passwordEncoder.matches(commentDelVo.getPwd(), pwd)) {
            return 0;
        } else {
            return dao.delComment(commentDelVo);
        }

    }

}