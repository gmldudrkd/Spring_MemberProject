package org.member.domain;

import java.util.Date;

public class BoardVO {
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	public int getbno() {
		return bno;
	}
	public BoardVO setbno(int bno) {
		this.bno = bno;
		return this;
	}
	
	public String gettitle() {
		return title;
	}
	public BoardVO settitle(String title) {
		this.title = title;
		return this;
	}
	
	public String getcontent() {
		return content;
	}
	public BoardVO setcontent(String content) {
		this.content = content;
		return this;
	}
	
	public String getwriter() {
		return writer;
	}
	public BoardVO setwriter(String writer) {
		this.writer = writer;
		return this;
	}
	
	public Date getregdate() {
		return regdate;
	}
	public BoardVO setregdate(Date regdate) {
		this.regdate = regdate;
		return this;
	}
	
	public int getviewcnt() {
		return viewcnt;
	}
	public BoardVO setviewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
		return this;
	}

}
