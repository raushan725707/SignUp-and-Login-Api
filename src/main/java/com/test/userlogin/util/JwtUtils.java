package com.test.userlogin.util;


import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwsHeader;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;


	
	import java.util.concurrent.TimeUnit;
@Component
	public class JwtUtils {

	    private static String secret= "secret";
	    
	    
//	public void  validatetoken(String authorization)  throws Exception {
//		try { Jwts.parser().setSigningKey(secret)
//				.parseClaimsJws(authorization);}
//		catch(Exception e) {
//			throw new Exception();
//		}
//	}


	public Jwt<JwsHeader,Claims>  validatetoken(String authorization) {
		return Jwts.parser().setSigningKey(secret)
				.parseClaimsJws(authorization);
		
	}
  
	        
	    	
	    	public String generateToken(String subject) {
	    		
	    		return Jwts.builder()
	    				.setSubject(subject).setIssuer("raushan kumar")
	    				.setIssuedAt(new Date(System.currentTimeMillis()))
	    				.setExpiration(new Date(System.currentTimeMillis()
	    				+ TimeUnit.MINUTES.toMillis(15))).signWith(SignatureAlgorithm.HS512,secret)
	    .compact();
	    	
	    	
	    	
	    	
	    	
	    	
	        
	    }


	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	 


