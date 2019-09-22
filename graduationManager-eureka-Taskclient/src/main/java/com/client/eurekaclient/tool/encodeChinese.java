package com.client.eurekaclient.tool;

public class encodeChinese {
   public String encode(String code){
       try{
           code = java.net.URLEncoder.encode(code,"UTF-8");
       }catch(Exception ex){
           ex.printStackTrace();
       }
       return code;
   }
}
