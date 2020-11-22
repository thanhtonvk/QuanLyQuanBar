package com.company.DAL;



import com.company.Enities.SanPham;

import java.io.*;
import java.util.ArrayList;
//String tensp, String masp, int gia
public class SanPhamDAL {
    //tạo file
    static File file = new File("sanpham.txt");
    public static void doc(ArrayList<SanPham> list) throws IOException {
        //sử dụng file reader để đọc file
        FileReader fileReader = new FileReader(file);
        //sử dụng phương thức này để đọc từng dòng
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while((line = bufferedReader.readLine())!=null){
            //tách chuỗi
            String tensp = line.split("#")[0];
            String masp = line.split("#")[1];
            int gia = Integer.parseInt(line.split("#")[2]);

            list.add(new SanPham(tensp,masp,gia));
        }
        bufferedReader.close();
        fileReader.close();
    }
    public static void ghi(ArrayList<SanPham>list) throws IOException {
        FileWriter fileWriter = new FileWriter(file);
        for (SanPham sanPham:list
        ) {
            //ghi file
            fileWriter.write(sanPham.toString()+"\n");
        }
        fileWriter.close();
    }
}
