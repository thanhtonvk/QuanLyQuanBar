package com.company.GUI;

import com.company.BLL.NguyenLieuBLL;
import com.company.BLL.NhanVienBLL;
import com.company.DAL.NguyenLieuDAL;
import com.company.DAL.NhanVienDAL;
import com.company.Enities.NguyenLieu;
import com.company.Enities.NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuNhanVien {
    public static void Menu() {
        System.out.println("_________________________________________________________");
        System.out.println("|                1.Nhập nhân viên                       |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                2.Hiện nhân viên                       |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                3.Sửa thông tin nhân viên              |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                4.Xóa nhân viên                        |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                5.Tìm kiếm                             |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                6.Thoát                                |");
        System.out.println("---------------------------------------------------------");
    }

    public static void Chon(ArrayList<NhanVien> list) throws Exception {
        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
        Menu();
        chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    NhanVienBLL.themNhanVien(list);
                    NhanVienDAL.ghi(list);
                    break;
                case 2:
                    NhanVienBLL.hienAllNhanVien(list);
                    break;
                case 3:
                    NhanVienBLL.suaNhanVien(list);
                    NhanVienDAL.ghi(list);
                    break;
                case 4:
                    NhanVienBLL.xoaNhanVien(list);
                    NhanVienDAL.ghi(list);
                case 5:
                    NhanVienBLL.timKiemNhanVien(list);
                    break;
                default:
                    break;
            }
            if (chon == 6) break;
        }
    }
}

