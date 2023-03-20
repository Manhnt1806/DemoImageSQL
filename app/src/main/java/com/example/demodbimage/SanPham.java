package com.example.demodbimage;

public class SanPham {
    int id;
    String tensp;
    private Integer gia;
    byte[] hinhanh;

    public SanPham() {
    }

    public SanPham(int id, String tensp, Integer gia, byte[] hinhanh) {
        this.id = id;
        this.tensp = tensp;
        this.gia = gia;
        this.hinhanh = hinhanh;
    }

    public SanPham(String tensp, Integer gia, byte[] hinhanh) {
        this.tensp = tensp;
        this.gia = gia;
        this.hinhanh = hinhanh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }

    public byte[] getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(byte[] hinhanh) {
        this.hinhanh = hinhanh;
    }
}
