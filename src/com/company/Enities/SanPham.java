package com.company.Enities;

public class SanPham {
    private String tensp;
    private String masp;
    private int gia;

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public SanPham(String tensp, String masp, int gia) {
        this.tensp = tensp;
        this.masp = masp;
        this.gia = gia;
    }
    @Override
    public String toString(){
        return tensp+"#"+masp+"#"+gia;
    }
}
