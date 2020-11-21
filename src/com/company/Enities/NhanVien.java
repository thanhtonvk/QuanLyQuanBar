package com.company.Enities;

public class NhanVien {
    private String ten;
    private String manv;
    private int songaynghi;
    private int luong;
    private int thuong;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public int getSongaynghi() {
        return songaynghi;
    }

    public void setSongaynghi(int songaynghi) {
        this.songaynghi = songaynghi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }

    public NhanVien(String ten, String manv, int songaynghi, int luong, int thuong) {
        this.ten = ten;
        this.manv = manv;
        this.songaynghi = songaynghi;
        this.luong = luong;
        this.thuong = thuong;
    }
    @Override
    public  String toString(){
        return ten+"#"+manv+"#"+songaynghi+"#"+luong+"#"+thuong;
    }
}
