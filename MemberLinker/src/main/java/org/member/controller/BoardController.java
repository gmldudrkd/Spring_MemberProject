package org.member.controller;

import javax.inject.Inject;

import org.member.domain.BoardVO;
import org.member.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/board/*") //Board의 모든경로를 /board/~ 로인식
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/register", method=RequestMethod.GET) //전송방식 별
	public void registerGET(BoardVO board, Model model) throws Exception{
		logger.info("register get.....");
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registPOST(BoardVO board, Model model) throws Exception{
		logger.info("regist post.....");
		logger.info(board.toString());
		
		service.regist(board);
		model.addAttribute("result", "success");
		
		return "/board/Success"; //전달할 뷰
	}

}
