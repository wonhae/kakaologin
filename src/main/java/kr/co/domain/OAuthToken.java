package kr.co.domain;

import lombok.Data;

@Data  //lombok 겟셋 만들어줌
public class OAuthToken {
	private String access_token;
	private String token_type;
	private String refresh_token;
	private int expires_in;
	private String scope;
	private int refresh_token_expires_in;
	
	
}
