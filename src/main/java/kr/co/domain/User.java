package kr.co.domain;

import kr.co.model.RoleType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder // 빌더 패턴!!
public class User {
	
	private int id; // 시퀀스, auto_increment
	 
	private String username; // 아이디
	
	private String password;
	
	private String email; // myEmail, my_email

	private RoleType role; // Enum을 쓰는게 좋다. // ADMIN, USER
	
	private String oauth; // kakao, google
	
	private String createDate;
}
