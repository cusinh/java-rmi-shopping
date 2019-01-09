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
import rmi.database.api.khohang.entity.KhachHang;
import rmi.database.api.khohang.service.KhachHangService;
import rmi.database.server.khohang.SQLConnect;

/**
 *
 * @author Sinh
 */
public class KhachHangServiceImpl implements KhachHangService{

    @Override
    public KhachHang insertKhachHang(KhachHang khachhang) throws RemoteException {
        PreparedStatement statement = null;

        String sql = "insert into khachhang(ma_khachhang,ma_cuahang,ten_khachhang,ngaysinh,sdtkhachhang,email,diachi) values (?,?,?,?,?,?,?)";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            statement.setString(1, khachhang.getMaKhachHang());
            statement.setString(2, khachhang.getMaCuaHang());
            statement.setString(3, khachhang.getTenKhachHang());
            statement.setString(4, khachhang.getNgaySinh());
            statement.setString(5, khachhang.getSdtKhachHang());
            statement.setString(6, khachhang.getEmail());
            statement.setString(7, khachhang.getDiaChi());


            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                khachhang.setMaKhachHang(result.getString(1));
            }
            result.close();
            return khachhang;
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
    public void updateKhachHang(KhachHang khachhang) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "UPDATE khachhang SET ma_cuahang = ?, ten_khachhang = ?, ngaysinh = ?, sdtkhachhang = ?, email = ?, diachi = ? WHERE ma_khachhang = ?";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
 
            statement.setString(1, khachhang.getMaCuaHang());
            statement.setString(2, khachhang.getTenKhachHang());
            statement.setString(3, khachhang.getNgaySinh());
            statement.setString(4, khachhang.getSdtKhachHang());
            statement.setString(5, khachhang.getEmail());
            statement.setString(6, khachhang.getDiaChi());
            statement.setString(7, khachhang.getMaKhachHang());
            
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
    public void deleteKhachHang(String maKhachHang) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "DELETE FROM khachhang WHERE ma_khachhang = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            statement.setString(1, maKhachHang);
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
