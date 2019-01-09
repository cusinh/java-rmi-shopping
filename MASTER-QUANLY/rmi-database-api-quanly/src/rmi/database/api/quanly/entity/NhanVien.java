/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.api.quanly.entity;

import java.io.Serializable;

/**
 *
 * @author Sinh
 */
public class NhanVien implements Serializable{
    private String maNhanVien;
    private String maChucVuNhanVien;
    private String tenNhanVien;
    private String ngaySinh;
    private String diaChi;
    private String soDienThoaiNhanVien;
    private String email;
    private String gioiTinh;
    private String cmnd;
    private String ngayBatDauLamViec;
    private int soNgayLamViec;
    private String maCuaHang;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getMaChucVuNhanVien() {
        return maChucVuNhanVien;
    }

    public void setMaChucVuNhanVien(String maChucVuNhanVien) {
        this.maChucVuNhanVien = maChucVuNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoaiNhanVien() {
        return soDienThoaiNhanVien;
    }

    public void setSoDienThoaiNhanVien(String soDienThoaiNhanVien) {
        this.soDienThoaiNhanVien = soDienThoaiNhanVien;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getNgayBatDauLamViec() {
        return ngayBatDauLamViec;
    }

    public void setNgayBatDauLamViec(String ngayBatDauLamViec) {
        this.ngayBatDauLamViec = ngayBatDauLamViec;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(String maCuaHang) {
        this.maCuaHang = maCuaHang;
    }
    
}
