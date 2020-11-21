package com.company.Enities;

public class NguyenLieu {
    private String manguyenlieu;
    private String tennguyenlieu;
    private int soluong;
    private String nhacungcap;

    @Override
    public String toString(){
        return manguyenlieu+"#"+tennguyenlieu+"#"+soluong+"#"+nhacungcap;
    }
    public String getManguyenlieu() {
        return manguyenlieu;
    }

    public void setManguyenlieu(String manguyenlieu) {
        this.manguyenlieu = manguyenlieu;
    }

    public String getTennguyenlieu() {
        return tennguyenlieu;
    }

    public void setTennguyenlieu(String tennguyenlieu) {
        this.tennguyenlieu = tennguyenlieu;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getNhacungcap() {
        return nhacungcap;
    }

    public void setNhacungcap(String nhacungcap) {
        this.nhacungcap = nhacungcap;
    }

    public NguyenLieu(String manguyenlieu, String tennguyenlieu, int soluong, String nhacungcap) {
        this.manguyenlieu = manguyenlieu;
        this.tennguyenlieu = tennguyenlieu;
        this.soluong = soluong;
        this.nhacungcap = nhacungcap;
    }
}
