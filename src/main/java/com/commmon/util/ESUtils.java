package com.commmon.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class ESUtils {
   private static ObjectMapper objectMapper = new ObjectMapper();
   public static String toJson(Object o){  
       try {  
           return objectMapper.writeValueAsString(o);  
       } catch (JsonProcessingException e) {
           e.printStackTrace();  
       }  
       return "";  
   }  
}  