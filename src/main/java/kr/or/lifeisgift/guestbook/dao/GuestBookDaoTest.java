package kr.or.lifeisgift.guestbook.dao;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.lifeisgift.guestbook.config.ApplicationConfig;
import kr.or.lifeisgift.guestbook.dto.GuestBook;

public class GuestBookDaoTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		GuestBookDao guestbookDao = ac.getBean(GuestBookDao.class);
		
		GuestBook guestbook = new GuestBook();
		guestbook.setName("강경미");
		guestbook.setContent("반갑습니다. 여러분.");
		guestbook.setRegdate(new Date());
		Long id = (long) guestbookDao.insert(guestbook);
		System.out.println("id : " + id);
		
	}
}
