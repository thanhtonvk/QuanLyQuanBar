package com.company.BLL;

import com.company.Enities.NguyenLieu;

import java.util.ArrayList;

public class NguyenLieuBLL {
//    String manguyenlieu, String tennguyenlieu, int soluong, String nhacungcap
    public static void themNguyenLieu(ArrayList<NguyenLieu>list){
        System.out.println("Nhập mã nguyên liệu:");
        String manguyenlieu= NhapThongTin.inputString();
        System.out.println("Nhập tên nguyên liệu:");
        String tennguyenlieu = NhapThongTin.inputString();
        System.out.println("Nhập số lượng:");
        int soluong = NhapThongTin.inputInt();
        System.out.println("Nhập nhà cung cấp");
        String nhacungcap = NhapThongTin.inputString();
        list.add(new NguyenLieu(manguyenlieu,tennguyenlieu,soluong,nhacungcap));
    }
    public static void hienThongTinNguyenLieu(NguyenLieu nguyenLieu){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n",nguyenLieu.getManguyenlieu(),nguyenLieu.getTennguyenlieu(),nguyenLieu.getSoluong(),nguyenLieu.getNhacungcap());
    }
    public static void hienAllNguyenLieu(ArrayList<NguyenLieu> list){
        System.out.printf("|%-20s|%-20s|%-20s|%-20s|\n","Mã nguyên liệu","Tên nguyên liệu","Số lượng","Nhà cung cấp");
        for (NguyenLieu nguyenLieu:list
             ) {
            hienThongTinNguyenLieu(nguyenLieu);
        }
    }
    public static NguyenLieu timNguyenLieu(ArrayList<NguyenLieu>list) throws Exception {
        System.out.println("Nhập nguyên liệu cần tìm: ");
        String tk = NhapThongTin.inputString();
        NguyenLieu kq = null;
        boolean kt = false;
        for (NguyenLieu nguyenLieu:list
             ) {
            if(nguyenLieu.getTennguyenlieu().equalsIgnoreCase(tk)||nguyenLieu.getManguyenlieu().equalsIgnoreCase(tk)){
                kq = nguyenLieu;
                kt = true;
            }
        }
        if(kt == false) throw new Exception("Không tìm thấy");
        else return kq;
    }
    public static void suaNguyenLieu(ArrayList<NguyenLieu>list) throws Exception {
        System.out.println("Nhập mã nguyên liệu:");
        String manguyenlieu= NhapThongTin.inputString();
        System.out.println("Nhập tên nguyên liệu:");
        String tennguyenlieu = NhapThongTin.inputString();
        System.out.println("Nhập số lượng:");
        int soluong = NhapThongTin.inputInt();
        System.out.println("Nhập nhà cung cấp");
        String nhacungcap = NhapThongTin.inputString();
        list.set(list.indexOf(timNguyenLieu(list)),new NguyenLieu(manguyenlieu,tennguyenlieu,soluong,nhacungcap));
    }
    public static void xoaNguyenLieu(ArrayList<NguyenLieu>list) throws Exception {
        list.remove(timNguyenLieu(list));
    }
}
