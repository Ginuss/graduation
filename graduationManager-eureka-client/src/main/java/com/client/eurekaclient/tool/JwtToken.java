package com.client.eurekaclient.tool;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
/**
 * jwt加密解密工具
 */

public class JwtToken {


    /**
     * 公共密钥
     */
    public static final String SECRET = "michong";


    /**
     * 创建token
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String createToken(String parame) throws UnsupportedEncodingException {

        //签发时间
        Date date = new Date();

        //过期时间- 1分钟过期
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE,30);
        Date expiresDate = nowTime.getTime();

        Map<String,Object> map = new HashMap<>();
        map.put("alg","HS256");
        map.put("typ","JWT");
        String token = JWT.create()

                .withClaim("content", parame)

                //设置过期时间
                .withExpiresAt(expiresDate)
                //设置签发时间
                .withIssuedAt(date)
                .sign(Algorithm.HMAC256(SECRET));

        return token;
    }


    /**
     * 解密
     * @param token
     * @return
     * @throws UnsupportedEncodingException
     */
    public static Object verifyToken(String token) throws UnsupportedEncodingException {

        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET))
                .build();

        DecodedJWT jwt = null;

        try{

            //解密
            jwt = verifier.verify(token);

        }catch (Exception e){
            return "not bind";
        }
        return jwt.getClaims();

    }

}
