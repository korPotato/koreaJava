package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class URL3 {
	public static void main(String[] args) {
		MyEx me = new MyEx();
		me.go("https://www.fifa.com/fifa-world-ranking");
	}
}

class MyEx{
	InputStream is = null;			// 내 프로그램이 데이터를 가져올 때는 InputStream
	// 반대로 내 보낼때는 outputStream
	InputStreamReader isr = null;	// 문자열 형식이 안맞을 수 있어서 UTF-8로 변환
	BufferedReader br = null;		// 문자열로 바꾸기 위해 버퍼단위로 읽음				
	URL url = null;		// HTTP 통신
	String myWord = null;
	ArrayList<String> parseArray = new ArrayList<>();
	
	public void go(String address) {
		
		try {
			url = new URL(address);
			is = url.openStream();
			isr = new InputStreamReader(is, "UTF-8");
			br = new BufferedReader(isr);
			
			// 버퍼리더를 문자열로 변경 ( 한줄씩 줄바꾸면서)
			while((myWord = br.readLine()) != null) {		// br.readLine(): 한줄씩읽기 str = br.readLine(); str != null;
				//System.out.println(str);
				// 내가 원하는 문자열을 찾는다
				if(myWord.contains("")&& !(myWord.contains(""))) {
					String parse = myWord.substring(myWord.indexOf("")+0, myWord.indexOf("")+0);
														// title="(총7개)이 부분의 " 부터 시작 해서 /> 부분까지 자른다
					parseArray.add(parse);		// 파싱한 문자열을 ArrayList에 저장
					//System.out.println(str);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				is.close();
				isr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// ArrayList에 저장된 데이터를 모두 출력
		for(int i=0;i<parseArray.size();i++) {
			System.out.println(parseArray.get(i));
		}
	}
}