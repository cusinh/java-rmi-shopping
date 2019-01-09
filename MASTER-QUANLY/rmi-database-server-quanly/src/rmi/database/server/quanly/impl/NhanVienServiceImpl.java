/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.server.quanly.impl;

import com.sun.rowset.WebRowSetImpl;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.WebRowSet;
import rmi.database.api.quanly.entity.NhanVien;
import rmi.database.api.quanly.service.NhanVienService;
import rmi.database.server.quanly.SQLConnect;

/**
 *
 * @author Sinh
 */
public class NhanVienServiceImpl implements NhanVienService{

    @Override
    public NhanVien insertNhanVien(NhanVien nhanvien) throws RemoteException {
        PreparedStatement statement = null;

        String sql = "INSERT INTO nhanvien values (?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            } catch (Exception ex) {
                Logger.getLogger(NhanVienService.class.getName()).log(Level.SEVERE, null, ex);
            }

            statement.setString(1, nhanvien.getMaNhanVien());
            statement.setString(2, nhanvien.getMaChucVuNhanVien());
            statement.setString(3, nhanvien.getTenNhanVien());
            statement.setString(4, nhanvien.getNgaySinh());
            statement.setString(5, nhanvien.getDiaChi());
            statement.setString(6, nhanvien.getSoDienThoaiNhanVien());
            statement.setString(7, nhanvien.getEmail());
            statement.setString(8, nhanvien.getGioiTinh());
            statement.setString(9, nhanvien.getCmnd());
            statement.setString(10, nhanvien.getNgayBatDauLamViec());
            statement.setInt(11, nhanvien.getSoNgayLamViec());
            statement.setString(12, nhanvien.getMaCuaHang());
            

            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                nhanvien.setMaNhanVien(result.getString(1));
            }
            result.close();
            return nhanvien;
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
    public void updateNhanVien(NhanVien nhanvien) throws RemoteException {
                PreparedStatement statement = null;
        String sql = "UPDATE nhanvien SET ma_chucvunhanvien= ?,ten_nhanvien= ?,ngaysinh= ?,diachi= ?,sdt_nhanvien= ?,email= ?,gioitinh= ?,cmnd= ?,ngaybatdaulamviec= ?,songaylamviec= ?, ma_cuahang = ? WHERE ma_nhanvien = ?";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            statement.setString(1, nhanvien.getMaChucVuNhanVien());
            statement.setString(2, nhanvien.getTenNhanVien());
            statement.setString(3, nhanvien.getNgaySinh());
            statement.setString(4, nhanvien.getDiaChi());
            statement.setString(5, nhanvien.getSoDienThoaiNhanVien());
            statement.setString(6, nhanvien.getEmail());
            statement.setString(7, nhanvien.getGioiTinh());
            statement.setString(8, nhanvien.getCmnd());
            statement.setString(9, nhanvien.getNgayBatDauLamViec());
            statement.setInt(10, nhanvien.getSoNgayLamViec());
            statement.setString(11, nhanvien.getMaCuaHang());
            
            statement.setString(12, nhanvien.getMaNhanVien());

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
    public void deleteNhanVien(String maNhanVien) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "DELETE FROM nhanvien WHERE ma_nhanvien = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            statement.setString(1, maNhanVien);
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
    public NhanVien getNhanVienById(String maNhanVien) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "select * from sanpham where ma_sanpham = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement.setString(1, maNhanVien);

            ResultSet result = statement.executeQuery();
            NhanVien nhanvien = null;
            if (result.next()) {
                nhanvien.setMaNhanVien(result.getString("ma_nhanvien"));
                nhanvien.setMaChucVuNhanVien(result.getString("ma_chucvunhanvien"));
                nhanvien.setTenNhanVien(result.getString("ten_nhanvien"));
                nhanvien.setNgaySinh(result.getString("ngaysinh"));
                nhanvien.setDiaChi(result.getString("diachi"));
                nhanvien.setSoDienThoaiNhanVien(result.getString("sdt_nhanvien"));
                nhanvien.setEmail(result.getString("email"));
                nhanvien.setGioiTinh(result.getString("gioitinh"));
                nhanvien.setCmnd(result.getString("cmnd"));
                nhanvien.setNgayBatDauLamViec(result.getString("ngaybatdaulamviec"));
                nhanvien.setSoNgayLamViec(result.getInt("songaylamviec"));
                nhanvien.setMaCuaHang(result.getString("ma_cuahang"));
            }
            result.close();
            return nhanvien;
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
    public List<NhanVien> getAllNhanVien() throws RemoteException {
        PreparedStatement statement = null;
        String sql = "select * from sanpham";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(NhanVienServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            ResultSet result = statement.executeQuery(sql);

            List<NhanVien> list = new ArrayList<NhanVien>();

            while (result.next()) {
                NhanVien nhanvien = new NhanVien();
                nhanvien.setMaNhanVien(result.getString("ma_nhanvien"));
                nhanvien.setMaChucVuNhanVien(result.getString("ma_chucvunhanvien"));
                nhanvien.setTenNhanVien(result.getString("ten_nhanvien"));
                nhanvien.setNgaySinh(result.getString("ngaysinh"));
                nhanvien.setDiaChi(result.getString("diachi"));
                nhanvien.setSoDienThoaiNhanVien(result.getString("sdt_nhanvien"));
                nhanvien.setEmail(result.getString("email"));
                nhanvien.setGioiTinh(result.getString("gioitinh"));
                nhanvien.setCmnd(result.getString("cmnd"));
                nhanvien.setNgayBatDauLamViec(result.getString("ngaybatdaulamviec"));
                nhanvien.setSoNgayLamViec(result.getInt("songaylamviec"));
                nhanvien.setMaCuaHang(result.getString("ma_cuahang"));

                list.add(nhanvien);
            }
            result.close();
            return list;
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
    public WebRowSet NhanVien_GetByAll() throws RemoteException {
        String sql = "select * from nhanvien";
        try {
            PreparedStatement statement = SQLConnect.GetConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            WebRowSet wrs = new WebRowSetImpl();
            wrs.populate(rs);
            return wrs;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
       
}
