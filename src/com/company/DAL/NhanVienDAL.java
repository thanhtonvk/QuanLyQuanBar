package com.company.DAL;



import com.company.Enities.NhanVien;

import java.io.*;
import java.util.ArrayList;
//String ten, String manv, int songaynghi, int luong, int thuong
public class NhanVienDAL {
    //tạo file
    static File file = new File("nhanvien.txt");
    public static void doc(ArrayList<NhanVien> list) throws IOException {
        //sử dụng file reader để đọc file
        FileReader fileReader = new FileReader(file);
        //sử dụng phương thức này để đọc từng dòng
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            //tách chuỗi
            String ten = line.split("#")[0];
            String manv = line.split("#")[1];
            int songaynghi = Integer.parseInt(line.split("#")[2]);
            int luong = Integer.parseInt(line.split("#")[3]);
            int thuong = Integer.parseInt(line.split("#")[4]);
            list.add(new NhanVien(ten,manv,songaynghi,luong,thuong));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghi(ArrayList<NhanVien>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (NhanVien nhanVien:list
        ) {
            //ghi file
            fileWriter.write(nhanVien.toString()+"\n");
        }
        fileWriter.close();
    }
}
