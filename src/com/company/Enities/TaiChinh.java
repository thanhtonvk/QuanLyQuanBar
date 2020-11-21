package com.company.Enities;

public class TaiChinh {
    private int gianhap;
    private int giaban;

    public int getGianhap() {
        return gianhap;
    }

    public void setGianhap(int gianhap) {
        this.gianhap = gianhap;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public TaiChinh(int gianhap, int giaban) {
        this.gianhap = gianhap;
        this.giaban = giaban;
    }
    @Override
    public String toString(){
        return gianhap+"#"+giaban;
    }
}
