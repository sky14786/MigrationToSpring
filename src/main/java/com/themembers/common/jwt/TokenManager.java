package com.themembers.common.jwt;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class TokenManager {

	private static Log log = LogFactory.getLog(TokenManager.class);
	private static final String key = "pilatestofcenterthe";
	public static String createToken() {
		

		Map<String, Object> headers = new HashMap<>();
		headers.put("typ", "JWT");
		headers.put("alg", "HS256");

		Map<String, Object> payloads = new HashMap<>();
		Long expiredTime = 1000 * 60l;
		Date now = new Date();
		now.setTime(now.getTime() + expiredTime);
		payloads.put("exp", now);
		payloads.put("data", "hello world");

		String jwt = Jwts.builder().setHeader(headers).setClaims(payloads)
				.signWith(SignatureAlgorithm.HS256, key.getBytes()).compact();

		return jwt;
	}

	public static void getTokenFromJwtString(String jwtTokenString) throws InterruptedException {
		{
			Claims claims = Jwts.parser().setSigningKey("A".getBytes()).parseClaimsJws(jwtTokenString).getBody();

			Date expiration = claims.get("exp", Date.class);
			log.info(expiration);
			String data = claims.get("data", String.class);
			log.info(data);
		}
	}
}
