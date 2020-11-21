package com.company;

import com.company.BLL.NguyenLieuBLL;
import com.company.DAL.NguyenLieuDAL;
import com.company.DAL.NhanVienDAL;
import com.company.DAL.SanPhamDAL;
import com.company.DAL.TaiChinhDAL;
import com.company.Enities.NguyenLieu;
import com.company.Enities.NhanVien;
import com.company.Enities.SanPham;
import com.company.Enities.TaiChinh;
import com.company.GUI.MenuNguyenLieu;
import com.company.GUI.MenuNhanVien;
import com.company.GUI.MenuSanPham;
import com.company.GUI.MenuTaiChinh;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Menu(){
        System.out.println("_________________________________________________________");
        System.out.println("|                1.Quản lí nguyên liệu                  |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                2.Quản lí nhân viên                    |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                3.Quản lí sản phầm                     |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                4.Quản lí tài chính                    |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                5.Thoát                                |");
        System.out.println("---------------------------------------------------------");
    }
    public static void main(String[] args) throws Exception {
	// write your code here
        ArrayList<NguyenLieu>nguyenLieus = new ArrayList<>();
        ArrayList<NhanVien>nhanViens = new ArrayList<>();
        ArrayList<SanPham>sanPhams = new ArrayList<>();
        ArrayList<TaiChinh>taiChinhs = new ArrayList<>();
        NhanVienDAL.doc(nhanViens);
        SanPhamDAL.doc(sanPhams);
        TaiChinhDAL.doc(taiChinhs);
        NguyenLieuDAL.docNguyenLieu(nguyenLieus);
        int chon;
        Scanner scanner = new Scanner(System.in);
        while(true){
            Menu();
            chon = Integer.parseInt(scanner.nextLine());
            if(chon ==5) break;
            switch (chon){
                case 1:
                    MenuNguyenLieu.Chon(nguyenLieus);
                    break;
                case 2:
                    MenuNhanVien.Chon(nhanViens);
                    break;
                case 3:
                    MenuSanPham.Chon(sanPhams);
                    break;
                case 4:
                    MenuTaiChinh.Chon(taiChinhs);
                    break;
                default:break;
            }

        }
    }
}
