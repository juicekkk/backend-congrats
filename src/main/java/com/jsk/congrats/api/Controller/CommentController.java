package com.jsk.congrats.api.Controller;

import com.jsk.congrats.api.Service.CommentService;
import com.jsk.congrats.api.vo.CommentDelVo;
import com.jsk.congrats.api.vo.CommentRegVo;
import com.jsk.congrats.api.vo.CommentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * Handles requests for the application home page.
 */
@RestController
public class CommentController {
	
	@Autowired
	private CommentService commentService;

	@RequestMapping(value = "comment", method = RequestMethod.GET)
	@ResponseBody
	public List<CommentVo> select() {
		List<CommentVo> comment = commentService.getCommentList();
		return comment;
	}

	@RequestMapping(value = "comment", method = RequestMethod.POST)
	@ResponseBody
	public HashMap<String, Integer> insert(@RequestBody CommentRegVo commentRegVo) {
		HashMap<String, Integer> rs = new HashMap<String, Integer>();

		Integer result = commentService.regComment(commentRegVo);
		rs.put("result", result);

		return rs;
	}

	@RequestMapping(value = "comment", method = RequestMethod.DELETE)
	@ResponseBody
	public HashMap<String, Integer> delete(@RequestBody CommentDelVo commentDelVo) {
		HashMap<String, Integer> rs = new HashMap<String, Integer>();

		Integer result = commentService.delComment(commentDelVo);
		rs.put("result", result);

		return rs;
	}

}
