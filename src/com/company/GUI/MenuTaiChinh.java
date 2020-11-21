package com.company.GUI;

import com.company.BLL.NguyenLieuBLL;
import com.company.BLL.TaiChinhBLL;
import com.company.DAL.NguyenLieuDAL;
import com.company.DAL.TaiChinhDAL;
import com.company.Enities.NguyenLieu;
import com.company.Enities.TaiChinh;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuTaiChinh {
    public static void Menu() {
        System.out.println("_________________________________________________________");
        System.out.println("|                1.Nhập tài chính                       |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                2.Hiện tài chính                       |");
        System.out.println("---------------------------------------------------------");
        System.out.println("|                3.Thoát                                |");
        System.out.println("---------------------------------------------------------");
    }

    public static void Chon(ArrayList<TaiChinh> list) throws Exception {
        int chon;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Menu();
            chon = Integer.parseInt(scanner.nextLine());

            switch (chon) {
                case 1:
                    TaiChinhBLL.nhapTaiChinh(list);
                    TaiChinhDAL.ghi(list);
                    break;
                case 2:
                    TaiChinhBLL.tinhLai(list);
                    break;
                default:
                    break;
            }
            if (chon == 3) break;
        }
    }
}

