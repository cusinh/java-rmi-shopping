/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.server.khohang.impl;

import com.sun.rowset.WebRowSetImpl;
import java.rmi.RemoteException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.WebRowSet;
import rmi.database.api.khohang.entity.SanPham;
import rmi.database.api.khohang.entity.SanPhamCuaHang;
import rmi.database.api.khohang.service.SanPhamCuaHangService;
import rmi.database.server.khohang.SQLConnect;

/**
 *
 * @author Sinh
 */
public class SanPhamCuaHangServiceImpl implements SanPhamCuaHangService {

    @Override
    public SanPhamCuaHang insertSanPhamCuaHang(SanPhamCuaHang sanphamcuahang) throws RemoteException {
        PreparedStatement statement = null;

        String sql = "insert into sanphamcuahang(ma_sanpham,ma_cuahang,soluongcon,giaban) values (?,?,?,?)";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            statement.setString(1, sanphamcuahang.getMaSanPham());
            statement.setString(2, sanphamcuahang.getMaCuaHang());
            statement.setInt(3, sanphamcuahang.getSoLuongCon());
            statement.setFloat(4, sanphamcuahang.getGiaBan());

            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                sanphamcuahang.setMaSanPham(result.getString(1));
            }
            result.close();
            return sanphamcuahang;
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
    public void updateSanPhamCuaHang(SanPhamCuaHang sanphamcuahang) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "UPDATE sanphamcuahang SET soluongcon = soluongcon + ?, giaban = ? WHERE id_sanphamcuahang = ?";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            statement.setInt(1, sanphamcuahang.getSoLuongCon());
            statement.setFloat(2, sanphamcuahang.getGiaBan());
            statement.setInt(3, sanphamcuahang.getIdSanPhamCuaHang());

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
    public void deleteSanPhamCuaHang(String idSanPhamCuaHang) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "DELETE FROM sanphamcuahang WHERE id_sanphamcuahang = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            statement.setString(1, idSanPhamCuaHang);
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
    public WebRowSet SanPhamCuaHang_GetByAllQN() throws RemoteException {
        String sql = "select * from sanphamcuahang where ma_cuahang = 'QN'";
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

    @Override
    public WebRowSet SanPhamCuaHangHet_GetByAll() throws RemoteException {
        String sql = "select * from sanphamcuahang where soluongcon = 0";
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

    @Override
    public WebRowSet SanPhamCuaHang_GetByAllDN() throws RemoteException {
        String sql = "select * from sanphamcuahang where ma_cuahang = 'DN'";
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

    @Override
    public SanPhamCuaHang getSanPhamCuaHangById(String maSanPham) throws RemoteException {
       PreparedStatement statement = null;
        String sql = "select * from sanphamcuahang where ma_sanpham = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(SanPhamCuaHangServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement.setString(1, maSanPham);

            ResultSet result = statement.executeQuery();
            SanPhamCuaHang sanphamcuahang = null;
            if (result.next()) {
                sanphamcuahang.setMaSanPham(result.getString("ma_sanpham"));
                sanphamcuahang.setMaCuaHang(result.getString("ma_cuahang"));
                sanphamcuahang.setSoLuongCon(result.getInt("soluongcon"));
                sanphamcuahang.setGiaBan(result.getFloat("giaban"));  
            }
            result.close();
            return sanphamcuahang;
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

}
