/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.server.khohang.impl;

import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import rmi.database.api.khohang.entity.HoaDon;
import rmi.database.api.khohang.service.HoaDonService;
import rmi.database.server.khohang.SQLConnect;

/**
 *
 * @author Sinh
 */
public class HoaDonServiceImpl implements HoaDonService{

    @Override
    public HoaDon insertHoaDon(HoaDon hoadon) throws RemoteException {
        PreparedStatement statement = null;

        String sql = "insert into hoadon(ma_hoadon,ma_sanpham,ma_khachhang,ma_cuahang,ma_nhanvien,thoigian,giamgia,tongtien,kieuthanhtoan) values (?,?,?,?,?,?,?,?,'Tien mat')";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            statement.setString(1, hoadon.getMaHoaDon());
            statement.setString(2, hoadon.getMaSanPham());
            statement.setString(3, hoadon.getMaKhachHang());
            statement.setString(4, hoadon.getMaCuaHang());
            statement.setString(5, hoadon.getMaNhanVien());
            statement.setString(6, hoadon.getThoiGian());
            statement.setFloat(7, hoadon.getGiamGia());
            statement.setFloat(8, hoadon.getTongTien());

            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                hoadon.setMaHoaDon(result.getString(1));
            }
            result.close();
            return hoadon;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void updateHoaDon(HoaDon hoadon) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "UPDATE hoadon SET ma_sanpham = ?, ma_khachhang = ?, ma_cuahang = ?, ma_nhanvien = ?, thoigian = ?, giamgia = ?, tongtien = ? WHERE ma_hoadon = ?";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
 
            statement.setString(1, hoadon.getMaSanPham());
            statement.setString(2, hoadon.getMaKhachHang());
            statement.setString(3, hoadon.getMaCuaHang());
            statement.setString(4, hoadon.getMaNhanVien());
            statement.setString(5, hoadon.getThoiGian());
            statement.setFloat(6, hoadon.getGiamGia());
            statement.setFloat(7, hoadon.getTongTien());
            statement.setString(8, hoadon.getMaHoaDon());

            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }

    @Override
    public void deleteHoaDon(String maHoaDon) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "DELETE FROM hoadon WHERE ma_hoadon = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            statement.setString(1, maHoaDon);
            statement.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    
}
