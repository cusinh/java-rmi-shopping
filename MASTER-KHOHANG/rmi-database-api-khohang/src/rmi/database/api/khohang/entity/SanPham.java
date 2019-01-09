/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.api.khohang.entity;

import java.io.Serializable;

/**
 *
 * @author Sinh
 */
public class SanPham implements Serializable{
   
    private String maSanPham;
    private String maDanhMucSanpham;
    private String tenSanPham;
    private String chatLieu;
    private String size;
    private String mau;
    private int soLuongNhap;
    private float giaNhap;
    private String tenNhaSanXuat;
    private String diaChiNhaSanXuat;
    private String soDienThoaiNhaSanXuat;

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaDanhMucSanpham() {
        return maDanhMucSanpham;
    }

    public void setMaDanhMucSanpham(String maDanhMucSanpham) {
        this.maDanhMucSanpham = maDanhMucSanpham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getSoLuongNhap() {
        return soLuongNhap;
    }

    public void setSoLuongNhap(int soLuongNhap) {
        this.soLuongNhap = soLuongNhap;
    }

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public String getDiaChiNhaSanXuat() {
        return diaChiNhaSanXuat;
    }

    public void setDiaChiNhaSanXuat(String diaChiNhaSanXuat) {
        this.diaChiNhaSanXuat = diaChiNhaSanXuat;
    }

    public String getSoDienThoaiNhaSanXuat() {
        return soDienThoaiNhaSanXuat;
    }

    public void setSoDienThoaiNhaSanXuat(String soDienThoaiNhaSanXuat) {
        this.soDienThoaiNhaSanXuat = soDienThoaiNhaSanXuat;
    }
}
