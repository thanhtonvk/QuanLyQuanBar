package com.company.DAL;


import com.company.Enities.TaiChinh;

import java.io.*;
import java.util.ArrayList;
//int gianhap, int giaban
public class TaiChinhDAL {
    static File file = new File("taichinh.txt");
    public static void doc(ArrayList<TaiChinh> list) throws IOException {
        //sử dụng file reader để đọc file
        FileReader fileReader = new FileReader(file);
        //sử dụng phương thức này để đọc từng dòng
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            //tách chuỗi
            int gianhap = Integer.parseInt(line.split("#")[0]);
            int giaban = Integer.parseInt(line.split("#")[0]);
            list.add(new TaiChinh(gianhap,giaban));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghi(ArrayList<TaiChinh>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (TaiChinh taiChinh:list
        ) {
            //ghi file
            fileWriter.write(taiChinh.toString()+"\n");
        }
        fileWriter.close();
    }
}
