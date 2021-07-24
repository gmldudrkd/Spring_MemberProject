package org.member.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

//페이징 처리가 필요한 화면에서 같이 사용하기 위해 클래스처리
public class PageMaker {
	private int totalCount;
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;
	
	private int displayPageNum=10; //화면상에 보여지는 페이지번호의 갯수
	private Criteria cri;
	
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	public Criteria getCri() {
		return cri;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;	
		calcData();
	}
	
	private void calcData() {
		endPage = (int) ( Math.ceil( cri.getPage() / (double)displayPageNum ) * displayPageNum );
		startPage = ( endPage - displayPageNum ) +1; //단순계산
		int tmpEndPage = (int) ( Math.ceil( totalCount / (double)cri.getPerPageNum() ) ); //화면에 노출되는 갯수가 변경될 경우
		
		if ( endPage > tmpEndPage ) {
			//더 작은 값으로 지정 >> 노출되는 갯수가 많아질 수록 endpage가 적어짐
			endPage = tmpEndPage;
		}
		
		//이전, 이후의 유무
		prev = startPage == 1 ? false : true;
		next = endPage * cri.getPerPageNum() >= totalCount ? false : true;
	}
	
	public boolean getprev() {
		return prev;
	}
	public PageMaker setprev(boolean prev) {
		this.prev = prev;
		return this;
	}
	
	public boolean getnext() {
		return next;
	}
	public PageMaker setnext(boolean next) {
		this.next = next;
		return this;
	}
	
	public int gettotalCount() {
		return totalCount;
	}
	public PageMaker settotalCount(int totalCount) {
		this.totalCount = totalCount;
		return this;
	}
	public int getstartPage() {
		return startPage;
	}
	public PageMaker setstartPage(int startPage) {
		this.startPage = startPage;
		return this;
	}
	public int getendPage() {
		return endPage;
	}
	public PageMaker setendPage(int endPage) {
		this.endPage = endPage;
		return this;
	}
	
	public String makeQuery(int page) {
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("page", page)
				.queryParam("perPageNum",cri.getPerPageNum())
				.build();
		return uriComponents.toUriString();
	}

}
