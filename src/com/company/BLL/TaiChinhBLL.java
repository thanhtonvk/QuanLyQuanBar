package com.company.BLL;

import com.company.Enities.TaiChinh;

import java.util.ArrayList;

public class TaiChinhBLL {
//    int gianhap, int giaban
    public static void nhapTaiChinh(ArrayList<TaiChinh>list){
        System.out.println("Nhập giá nhập sản phẩm: ");
        int gianhap = NhapThongTin.inputInt();
        System.out.println("Nhập giá bán sản phẩm: ");
        int giaban = NhapThongTin.inputInt();
        list.add(new TaiChinh(gianhap,giaban));
    }
    public static void tinhLai(ArrayList<TaiChinh>list){
        int tong=0;
        for (TaiChinh taichinh:list
             ) {
            tong+=(taichinh.getGiaban()-taichinh.getGianhap());
        }
        System.out.println("Tiền lãi là "+tong);
    }
}

