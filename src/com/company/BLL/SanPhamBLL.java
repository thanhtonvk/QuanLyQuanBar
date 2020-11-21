package com.company.BLL;

import com.company.Enities.SanPham;

import java.util.ArrayList;

public class SanPhamBLL {
    public static void themSanPham(ArrayList<SanPham>list){
//        String tensp, String masp, int gia
        System.out.println("Nhập tên sản phẩm");
        String tensp = NhapThongTin.inputString();
        System.out.println("Nhập mã sản phầm");
        String masp = NhapThongTin.inputString();
        System.out.println("Nhập giá sản phẩm");
        int gia = NhapThongTin.inputInt();
        list.add(new SanPham(tensp,masp,gia));
    }
    public static void hienSanPham(SanPham sanPham){

        System.out.printf("|%-20s|%-20s|%-20s|\n",sanPham.getTensp(),sanPham.getMasp(),sanPham.getGia());
    }
    public static void hienAllSanPham(ArrayList<SanPham>list){
        System.out.printf("|%-20s|%-20s|%-20s|\n","Tên sản phẩm","Mã sản phầm","Giá sản phẩm");
        for (SanPham sanpham:list
             ) {
            hienSanPham(sanpham);
        }
    }
    public static SanPham timSanPham(ArrayList<SanPham>list) throws Exception {
        System.out.println("Nhập sản phẩm cần tìm");
        String tk = NhapThongTin.inputString();
        boolean kt= false;
        SanPham kq= null;
        for (SanPham sanpham:list
             ) {
            if(tk.equalsIgnoreCase(sanpham.getTensp())||tk.equalsIgnoreCase(sanpham.getMasp())){
                kt = true;
                kq = sanpham;
            }
        }
        if(kt == false) throw new Exception("Không tìm thầy sản phẩm");
        else return kq;
    }
    public static void suaSanPham(ArrayList<SanPham>list) throws Exception {
        System.out.println("Nhập tên sản phẩm");
        String tensp = NhapThongTin.inputString();
        System.out.println("Nhập mã sản phầm");
        String masp = NhapThongTin.inputString();
        System.out.println("Nhập giá sản phẩm");
        int gia = NhapThongTin.inputInt();
        list.set(list.indexOf(timSanPham(list)),new SanPham(tensp,masp,gia));
    }
    public static void xoaSanPham(ArrayList<SanPham>list) throws Exception {
        list.remove(timSanPham(list));
    }

}
