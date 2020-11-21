package com.company.BLL;

import com.company.Enities.NhanVien;

import java.util.ArrayList;

public class NhanVienBLL {
    public static void themNhanVien(ArrayList<NhanVien>list){
//        String ten, String manv, int songaynghi, int luong, int thuong
        System.out.println("Nhập tên:");
        String ten = NhapThongTin.inputString();
        System.out.println("Nhập mã nhân viên:");
        String manv = NhapThongTin.inputString();
        System.out.println("Nhập số ngày nghỉ:");
        int songaynghi = NhapThongTin.inputInt();
        System.out.println("Nhập lương:");
        int luong = NhapThongTin.inputInt();
        System.out.println("Nhập thưởng:");
        int thuong = NhapThongTin.inputInt();
        list.add(new NhanVien(ten,manv,songaynghi,luong,thuong));
    }
    public static void hienThongTinNhanVien(NhanVien nhanVien){
        System.out.printf("|%-20s|%-10s|%-10s|%-10s|%-10s|\n",nhanVien.getTen(),nhanVien.getManv(),nhanVien.getSongaynghi(),nhanVien.getLuong(),nhanVien.getThuong());
    }
    public static void hienAllNhanVien(ArrayList<NhanVien>list){
        System.out.printf("|%-20s|%-10s|%-10s|%-10s|%-10s|\n","Tên","Mã NV","Ngày nghỉ","Lương","Thưởng");
        for (NhanVien nhanvien:list
             ) {
            hienThongTinNhanVien(nhanvien);
        }
    }
    public static NhanVien timNhanVien(ArrayList<NhanVien>list) throws Exception {
        System.out.println("Nhập nhân viên cần tìm: ");
        String str = NhapThongTin.inputString();
        NhanVien kq = null;
        boolean kt = false;
        for (NhanVien nhanvien:list
             ) {
            if(nhanvien.getTen().equalsIgnoreCase(str)||nhanvien.getManv().equalsIgnoreCase(str)){
                kq = nhanvien;
                kt = true;
            }
        }
        if(kt == false){
            throw new Exception("Không tìm thấy nhân viên");
        }
        else return kq;
    }
    public static void suaNhanVien(ArrayList<NhanVien>list) throws Exception {
        NhanVien nhanVien = timNhanVien(list);
        System.out.println("Nhập tên:");
        String ten = NhapThongTin.inputString();
        System.out.println("Nhập mã nhân viên:");
        String manv = NhapThongTin.inputString();
        System.out.println("Nhập số ngày nghỉ:");
        int songaynghi = NhapThongTin.inputInt();
        System.out.println("Nhập lương:");
        int luong = NhapThongTin.inputInt();
        System.out.println("Nhập thưởng:");
        int thuong = NhapThongTin.inputInt();
        list.set(list.indexOf(nhanVien),new NhanVien(ten,manv,songaynghi,luong,thuong));
    }
    public static void xoaNhanVien(ArrayList<NhanVien>list) throws Exception {
        NhanVien nhanVien = timNhanVien(list);
        list.remove(nhanVien);
    }
    public static void timKiemNhanVien(ArrayList<NhanVien>list) throws Exception {
        System.out.printf("|%-20s|%-10s|%-10s|%-10s|%-10s|","Tên","Mã NV","Ngày nghỉ","Lương","Thưởng");
        hienThongTinNhanVien(timNhanVien(list));
    }
}
