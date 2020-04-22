package com.hyperskill;

import java.util.Scanner;

public class ParseURL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url = sc.next();

        String params = url.substring(30, url.length());
        String[] paramsArray = params.split("&");

        String notFound = "not found";

        String pass = "";
        String port = "";
        String cookie = "";
        String host = "";
        String name = "";

        String password = "";

        for (int i = 0; i < paramsArray.length; i++) {
            if (paramsArray[i].contains("pass=")) {
                pass += paramsArray[i].substring(5);
            }

            if (paramsArray[i].contains("port=")) {
                port += paramsArray[i].substring(5);
            }

            if (paramsArray[i].contains("name=")) {
                name += paramsArray[i].substring(5);
            }

            if (paramsArray[i].contains("cookie=")) {
                cookie += paramsArray[i].substring(7);
            }

            if (paramsArray[i].contains("host=")) {
                host += paramsArray[i].substring(5);
            }

        }

        if (!params.contains("pass=") && params.contains("name=")) {
            System.out.println("port : " + port);
            System.out.println("name : " + name);
            if (cookie.equals("")) {
                cookie += notFound;
            }
            System.out.println("cookie : " + cookie);
            System.out.println("host : " + host);
        }
        else if(!params.contains("pass=")) {
            System.out.println("port : " + port);
            if (cookie.equals("")) {
                cookie += notFound;
            }
            System.out.println("cookie : " + cookie);
            System.out.println("host : " + host);
        }
        else if(params.contains("pass=") && params.contains("name=")) {
            System.out.println("port : " + port);
            System.out.println("name : " + name);
            if (cookie.equals("")) {
                cookie += notFound;
            }
            System.out.println("cookie : " + cookie);
            System.out.println("host : " + host);
            if(pass.equals("")){
                pass+=notFound;
            }
            System.out.println("pass : " + pass);
        }
        else {
            System.out.println("pass : " + pass);
            if(pass.equals("")){
                pass+=notFound;
            }
            System.out.println("port : " + port);
            if (cookie.equals("")) {
                cookie += notFound;
            }
            System.out.println("cookie : " + cookie);
            System.out.println("host : " + host);
        }

        for (int j = 0; j < paramsArray.length; j++) {
            if(paramsArray[j].contains("pass=") && !pass.contains(notFound)) {
                password+=pass;
                System.out.println("password : " + password);
                break;
            }
        }


    }
}
