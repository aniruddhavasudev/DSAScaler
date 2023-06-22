package AdvanceDSA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetGramdata {
    public static void main(String[] args) {
    	
    	String text = "";
    	
    	
    	
    	Pattern pattern = Pattern.compile("href=\"(.*?)\"");
        Matcher matcher = pattern.matcher(text);
        
        for(int i =0;i < 1000 ; i++) {
        if (matcher.find()) {
        	 
            String href = matcher.group(1);
            String newPath = href.replaceAll("/", "");
            System.out.println(newPath);
        }
        }
    }
}
