package org.member.domain;

//mybatis sqlmapper는 #으로 호출 시 getter가 존재해야함
// 파라미터 여러개일때 관리어려움 > 클래스로 선언
public class Criteria {
	//page와 pagenum의 속성
	private int page;
	private int perPageNum;
	
	public Criteria() {
		this.page = 1;
		this.perPageNum = 10;
	}
	
	public void setPage(int page) {
		if(page<=0) {
			this.page=1;
			return;
		}
		this.page = page;
	}
	
	public int getPage() {
		return page;
	}
	
	//XML Mapper 의 getter
	//method for MyBatis SQL Mapper
	
	//limit 시작 num
	public int getPageStart() {
		return (this.page-1)*perPageNum;
	}
	//limit 종료 num
	public int getPerPageNum() {
		return this.perPageNum;
	}
	
	@Override
	public String toString() {
		return "Ctiteria [page="+page+" , perPageNum="+perPageNum+"]";
	}
	
}
