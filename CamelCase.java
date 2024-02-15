package org.example;

public class CamelCase {
    static String toCamelCase(String s){
        String camelCase;
        StringBuilder sb = new StringBuilder(s);

        camelCase = sb.toString().replaceAll("[-_]","");

        return camelCase;
    }
}
