package tut06;

import java.util.ArrayList;
import java.util.List;

class Users{ //객체 구성 요소 - 필드 생성자 getter setter 메소드 : 생략가능 ->시험 출
	//필드 : 공유 변수정도로 생각..
	String userid;
	String passwd;
	int age;
	
	//생성자 : 객체 초기화
	public Users() {}
	
	public Users(String userid, String passwd, int age) {
		this.userid = userid;
		this.passwd = passwd;
		this.age = age;
	}

	//getter, setter
	//캡슐화(데이터보호) 처리 : 저장하기 set, 가져오기 get
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//메소드
	@Override
	public String toString() { //표준화
		return "Users [userid=" + userid + ", passwd=" + passwd + ", age=" + age + "]";
	}
	
}

public class UsersEx {

	public static void main(String[] args) {
		//3명의 회원(Users)을 생성자로 저장 후 출력
		
		Users[] user = new Users[3];
//		//3명 -> 초기화 3번
//		user[0] = new Users("a","b",10);
//		user[1] = new Users("c","d",20);
//		user[2] = new Users("e","f",30);
		
		for(int i = 0; i < user.length; ++i) {
			user[i] = new Users("아이디"+(i+1),"비번"+(i+1),0);
			System.out.println(user[i].toString());
		}
		System.out.println("----------------------------");
		
		for(int i = 0; i < user.length; ++i) {
			user[i]=new Users();
			user[i].setUserid("Busan"+i);
			user[i].setPasswd("1234"+i);
			user[i].setAge(10+i);
			
			System.out.println(user[i].toString());
		}
		
	}

}
