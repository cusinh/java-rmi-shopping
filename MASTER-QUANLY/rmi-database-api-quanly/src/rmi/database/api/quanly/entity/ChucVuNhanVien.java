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
public class ChucVuNhanVien implements Serializable{
    private String maChucVuNhanVien;
    private String tenChucVuNhanVien;
    private float luong;

    public String getMaChucVuNhanVien() {
        return maChucVuNhanVien;
    }

    public void setMaChucVuNhanVien(String maChucVuNhanVien) {
        this.maChucVuNhanVien = maChucVuNhanVien;
    }

    public String getTenChucVuNhanVien() {
        return tenChucVuNhanVien;
    }

    public void setTenChucVuNhanVien(String tenChucVuNhanVien) {
        this.tenChucVuNhanVien = tenChucVuNhanVien;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
    
    
}
