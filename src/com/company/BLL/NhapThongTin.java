package com.company.BLL;

import java.util.Scanner;

public class NhapThongTin {
    static Scanner scanner = new Scanner(System.in);
    //hàm nhập văn bản
    public static String inputString(){
        String string;
        while(true){
            string = scanner.nextLine();
            if(string!="") break;
        }
        return string;
    }
    //hàm nhập số
    public static int inputInt(){
        int n;
        while(true){
            n = Integer.parseInt(scanner.nextLine());
            if(n>0) break;
        }
        return n;
    }
}
