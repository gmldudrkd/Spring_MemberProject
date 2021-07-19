package org.member.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.member.domain.BoardVO;
import org.member.domain.Criteria;
import org.springframework.stereotype.Repository;


@Repository //DAO 를 스프링에 인식시키기위해 주로사용
public class BoardDAOImpl  implements BoardDAO{
	@Inject
	private SqlSession session;
	private static String namespace = "org.member.mapper.BoardMapper";
	
	@Override
	public void create(BoardVO vo) throws Exception{
		session.insert(namespace+".create", vo);
	}
	
	@Override
	public BoardVO read(Integer bno) throws Exception{
		return session.selectOne(namespace+".read", bno);
	}
	
	@Override
	public void update(BoardVO vo) throws Exception{
		session.update(namespace+".update", vo);
	}
	
	@Override
	public void delete(Integer bno) throws Exception{
		session.delete(namespace+".delete", bno);
	}
	
	@Override
	public List<BoardVO> listAll() throws Exception{
		return session.selectList(namespace+".listAll");
	}
	
	@Override
	public List<BoardVO> listPage(int page) throws Exception{
		if(page<=0) {
			page=1;
		}
		page = (page-1) *10;
		return session.selectList(namespace+".listPage",page);
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception{
		return session.selectList(namespace+".listCriteria", cri);
	}
	
}
