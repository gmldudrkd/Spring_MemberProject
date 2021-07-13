package org.member.controller;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
//위의 @는 스프링이 로딩되도록,,
public class DataSourceTest {
	@Inject
	private DataSource ds; //Inject는 스프링이 생성해서 주입해줌, 객체생성 필요없음
	@Test
	public void testConnection() throws Exception{
		try (Connection con = ds.getConnection()){
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
