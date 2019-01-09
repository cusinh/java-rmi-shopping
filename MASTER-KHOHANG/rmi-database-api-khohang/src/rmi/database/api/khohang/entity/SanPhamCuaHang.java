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
public class SanPhamCuaHang implements Serializable{
    private int idSanPhamCuaHang;
    private String maSanPham;
    private String maCuaHang;
    private int soLuongCon;
    private float giaBan;

    public int getIdSanPhamCuaHang() {
        return idSanPhamCuaHang;
    }

    public void setIdSanPhamCuaHang(int idSanPhamCuaHang) {
        this.idSanPhamCuaHang = idSanPhamCuaHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getMaCuaHang() {
        return maCuaHang;
    }

    public void setMaCuaHang(String maCuaHang) {
        this.maCuaHang = maCuaHang;
    }

    public int getSoLuongCon() {
        return soLuongCon;
    }

    public void setSoLuongCon(int soLuongCon) {
        this.soLuongCon = soLuongCon;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }
}
