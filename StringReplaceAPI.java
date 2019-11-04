package ScienceProject2019;

// Code From https://www.javatpoint.com/java-string-replace
import java.*;
import java.util.*;
import java.lang.*;
import java.lang.String;
import java.io.*;

public class StringReplaceAPI {
     public String replace(char oldChar, char newChar) {  
            if (oldChar != newChar) {  
                int len = value.length;  
                int i = -1;  
                char[] val = value; /* avoid getfield opcode */  

                while (++i < len) {  
                    if (val[i] == oldChar) {  
                        break;  
                    }  
                }  
                if (i < len) {  
                    char buf[] = new char[len];  
                    for (int j = 0; j < i; j++) {  
                        buf[j] = val[j];  
                    }  
                    while (i < len) {  
                        char c = val[i];  
                        buf[i] = (c == oldChar) ? newChar : c;  
                        i++;  
                    }  
                    return new String(buf, true);  
                }  
            }  
            return this;  
        }

     public String replaceAll(String regex, String replacement) {
          return Pattern.complie(regex).matter(this).replaceAll(replacement);
     }
}