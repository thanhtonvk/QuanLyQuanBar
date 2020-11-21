package com.company.GUI;

import com.company.BLL.NguyenLieuBLL;
import com.company.BLL.SanPhamBLL;
import com.company.DAL.NguyenLieuDAL;
import com.company.DAL.SanPhamDAL;
import com.company.Enities.NguyenLieu;
import com.company.Enities.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSanPham {
    public static void Menu() {
        System.out.println("_________________________________________________________");
        System.out.println("|                1.Nhập sản phẩm                        |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                2.Hiện sản phẩm                        |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                3.Sửa sản phẩm                         |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                4.Xóa sản phẩm                         |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                5.Tìm kiếm                             |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                6.Thoát                                |");
        System.out.println("---------------------------------------------------------");
    }

    public static void Chon(ArrayList<SanPham> list) throws Exception {
        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    SanPhamBLL.themSanPham(list);
                    SanPhamDAL.ghi(list);
                    break;
                case 2:
                    SanPhamBLL.hienAllSanPham(list);
                    break;
                case 3:
                    SanPhamBLL.suaSanPham(list);
                    SanPhamDAL.ghi(list);
                    break;
                case 4:
                    SanPhamBLL.xoaSanPham(list);
                    SanPhamDAL.ghi(list);
                case 5:
                    SanPhamBLL.timSanPham(list);
                    break;
                default:
                    break;
            }
            if (chon == 6) break;
        }
    }
}

