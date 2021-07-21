package org.member.service;

import java.util.List;

import org.member.domain.BoardVO;
import org.member.domain.Criteria;

//계층별 구현 중 비지니스 계층 (고객의 요구사항이 반영)
//controller와 dao 를 연결
public interface BoardService {
	public void regist(BoardVO board) throws Exception; 
	public BoardVO read(Integer bno) throws Exception; 
	public void modify(BoardVO board) throws Exception; 
	public void remove(Integer bno) throws Exception; 
	public List<BoardVO> listAll() throws Exception;
	public List<BoardVO> listCriteria(Criteria cri) throws Exception;
	public int listCountCriteria(Criteria cri) throws Exception;
}
