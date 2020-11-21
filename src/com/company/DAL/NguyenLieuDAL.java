package com.company.DAL;

import com.company.Enities.NguyenLieu;

import java.io.*;
import java.util.ArrayList;

public class NguyenLieuDAL {
    //tạo file
    static File file = new File("nguyenlieu.txt");
    public static void docNguyenLieu(ArrayList<NguyenLieu>list) throws IOException {
        //sử dụng file reader để đọc file
        FileReader fileReader = new FileReader(file);
        //sử dụng phương thức này để đọc từng dòng
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
//        String manguyenlieu, String tennguyenlieu, int soluong, String nhacungcap
        while((line = bufferedReader.readLine())!=null){
            //tách chuỗi
            String manguyenlieu = line.split("#")[0];
            String tennguyenlieu = line.split("#")[1];
            int soluong = Integer.parseInt(line.split("#")[2]);
            String nhacungcap = line.split("#")[3];
            list.add(new NguyenLieu(manguyenlieu,tennguyenlieu,soluong,nhacungcap));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghiNguyenLieu(ArrayList<NguyenLieu>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (NguyenLieu nguyenLieu:list
             ) {
            //ghi file
            fileWriter.write(nguyenLieu.toString());
        }
        fileWriter.close();
    }
}
