package com.company.GUI;

import com.company.BLL.NguyenLieuBLL;
import com.company.DAL.NguyenLieuDAL;
import com.company.Enities.NguyenLieu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuNguyenLieu {
    public static void Menu() {
        System.out.println("_________________________________________________________");
        System.out.println("|                1.Nhập nguyên liệu                     |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                2.Hiện nguyên liệu                     |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                3.Sửa nguyên liệu                      |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                4.Xóa nguyên liệu                      |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                5.Tìm kiếm                             |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                6.Thoát                                |");
        System.out.println("---------------------------------------------------------");
    }

    public static void Chon(ArrayList<NguyenLieu> list) throws Exception {
        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());

            if (chon == 6) break;
            switch (chon) {
                case 1:
                    NguyenLieuBLL.themNguyenLieu(list);
                    NguyenLieuDAL.ghiNguyenLieu(list);
                    break;
                case 2:
                    NguyenLieuBLL.hienAllNguyenLieu(list);
                    break;
                case 3:
                    NguyenLieuBLL.suaNguyenLieu(list);
                    NguyenLieuDAL.ghiNguyenLieu(list);
                    break;
                case 4:
                    NguyenLieuBLL.xoaNguyenLieu(list);
                    NguyenLieuDAL.ghiNguyenLieu(list);
                case 5:
                    NguyenLieuBLL.timNguyenLieu(list);
                    break;
                default:
                    break;
            }

        }
    }
}

