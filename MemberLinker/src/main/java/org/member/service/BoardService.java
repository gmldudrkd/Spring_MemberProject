package org.member.service;

import java.util.List;

import org.member.domain.BoardVO;

//계층별 구현 중 비지니스 계층 (고객의 요구사항이 반영)
public interface BoardService {
	public void regist(BoardVO board) throws Exception; 
	public BoardVO read(Integer bno) throws Exception; 
	public void modify(BoardVO board) throws Exception; 
	public void remove(Integer bno) throws Exception; 
	public List<BoardVO> listAll() throws Exception;
}
