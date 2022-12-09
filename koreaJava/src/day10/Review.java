package day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Review {
	public static void main(String[] args) {
		ReviewTest rt = new ReviewTest();
		rt.go();
	}
}


class ReviewTest{
	Scanner sc = new Scanner(System.in);
	public void go() {
		// myTry();
		// date();
		random();
		sc.close();
	}
	
	public void myTry() {
		// 프로그램의 비정상 종료를 방지하기위해
		// 프로그램의 오류를 방지하기위해
		System.out.println("숫자를 입력하세요 : ");			
		int num = 0;
		try {
			 num = sc.nextInt();
			
		}catch(Exception e) {
			System.out.println("숫자를 입력하세요...");
		}
		System.out.println(num);
		
	}
	
	public void date() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();		// 현재 시간을 가져옴
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");		// 2022-11-27
		SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");		// 09:15:26
		String 년월일 = sdf1.format(date);		// 문자열로 변환
		String 시분초 = sdf2.format(date);		// 문자열로 변환
				
				System.out.println(년월일+" "+시분초);
				
		// 날짜시간에서는 Date, SimpleDateFormat을 필수로 기억할것.		
	}
	
	public void random() {
			// 1. Math.random();
			// 2. Random rand = new Random();
		
		// 0 ~ 0.999999
		int random1 = (int)(Math.random()*100) +1;
		
		Random rand = new Random();
		int random2 = rand.nextInt(100) +1;
		
		System.out.println(random1);
		System.out.println(random2);
	}
}