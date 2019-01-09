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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.WebRowSet;
import rmi.database.api.khohang.entity.SanPham;
import rmi.database.api.khohang.service.SanPhamService;
import rmi.database.server.khohang.SQLConnect;


/**
 *
 * @author Shine
 */
public class SanPhamServiceImpl implements SanPhamService {

    @Override
    public SanPham insertSanPham(SanPham sanpham) throws RemoteException {
        PreparedStatement statement = null;

        String sql = "INSERT INTO SANPHAM(ma_sanpham,ma_danhmucsanpham,ten_sanpham,chatlieu,size,mau,soluongnhap,gianhap,tennhasanxuat,diachinhasanxuat,sdtnhasanxuat) \n" +
"values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            } catch (Exception ex) {
                Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            statement.setString(1, sanpham.getMaSanPham());
            statement.setString(2, sanpham.getMaDanhMucSanpham());
            statement.setString(3, sanpham.getTenSanPham());
            statement.setString(4, sanpham.getChatLieu());
            statement.setString(5, sanpham.getSize());
            statement.setString(6, sanpham.getMau());
            statement.setInt(7, sanpham.getSoLuongNhap());
            statement.setFloat(8, sanpham.getGiaNhap());
            statement.setString(9, sanpham.getTenNhaSanXuat());
            statement.setString(10, sanpham.getDiaChiNhaSanXuat());
            statement.setString(11, sanpham.getSoDienThoaiNhaSanXuat());

            statement.executeUpdate();

            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                sanpham.setMaSanPham(result.getString(1));
            }
            result.close();
            return sanpham;
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
    public void updateSanPham(SanPham sanpham) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "UPDATE sanpham SET ma_danhmucsanpham= ?,ten_sanpham= ?,chatlieu= ?,size= ?,mau= ?,soluongnhap= ?,gianhap= ?,tennhasanxuat= ?,diachinhasanxuat= ?,sdtnhasanxuat= ? WHERE ma_sanpham = ?";
        try {
            try {
                //thực hiện câu lệnh truy vấn
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement.setString(1, sanpham.getMaDanhMucSanpham());
            statement.setString(2, sanpham.getTenSanPham());
            statement.setString(3, sanpham.getChatLieu());
            statement.setString(4, sanpham.getSize());
            statement.setString(5, sanpham.getMau());
            statement.setInt(6, sanpham.getSoLuongNhap());
            statement.setDouble(7, sanpham.getGiaNhap());
            statement.setString(8, sanpham.getTenNhaSanXuat());
            statement.setString(9, sanpham.getDiaChiNhaSanXuat());
            statement.setString(10, sanpham.getSoDienThoaiNhaSanXuat());
            statement.setString(11, sanpham.getMaSanPham());

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
    public void deleteSanPham(String maSanPham) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "DELETE FROM sanpham WHERE ma_sanpham = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            statement.setString(1, maSanPham);
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
    public SanPham getSanPhamById(String maSanPham) throws RemoteException {
        PreparedStatement statement = null;
        String sql = "select * from sanpham where ma_sanpham = ?";

        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
            statement.setString(1, maSanPham);

            ResultSet result = statement.executeQuery();
            SanPham sanpham = null;
            if (result.next()) {
                sanpham.setMaSanPham(result.getString("ma_sanpham"));
                sanpham.setMaDanhMucSanpham(result.getString("ma_danhmucsanpham"));
                sanpham.setTenSanPham(result.getString("ten_sanpham"));
                sanpham.setChatLieu(result.getString("chatlieu"));
                sanpham.setSize(result.getString("size"));
                sanpham.setMau(result.getString("mau"));
                sanpham.setSoLuongNhap(result.getInt("soluongnhap"));
                sanpham.setGiaNhap(result.getFloat("gianhap"));
                sanpham.setTenNhaSanXuat(result.getString("tennhasanxuat"));
                sanpham.setDiaChiNhaSanXuat(result.getString("diachinhasanxuat"));
                sanpham.setSoDienThoaiNhaSanXuat(result.getString("sdtnhasanxuat"));
            }
            result.close();
            return sanpham;
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
    public List<SanPham> getAllSanPham() throws RemoteException {
        PreparedStatement statement = null;
        String sql = "select * from sanpham";
        try {
            try {
                statement = SQLConnect.GetConnection().prepareStatement(sql);
            } catch (Exception ex) {
                Logger.getLogger(SanPhamServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }

            ResultSet result = statement.executeQuery(sql);

            List<SanPham> list = new ArrayList<SanPham>();

            while (result.next()) {
                SanPham sanpham = new SanPham();
                sanpham.setMaSanPham(result.getString("ma_sanpham"));
                sanpham.setMaDanhMucSanpham(result.getString("ma_danhmucsanpham"));
                sanpham.setTenSanPham(result.getString("ten_sanpham"));
                sanpham.setChatLieu(result.getString("chatlieu"));
                sanpham.setSize(result.getString("size"));
                sanpham.setMau(result.getString("mau"));
                sanpham.setSoLuongNhap(result.getInt("soluongnhap"));
                sanpham.setGiaNhap(result.getFloat("gianhap"));
                sanpham.setTenNhaSanXuat(result.getString("tennhasanxuat"));
                sanpham.setDiaChiNhaSanXuat(result.getString("diachinhasanxuat"));
                sanpham.setSoDienThoaiNhaSanXuat(result.getString("sdtnhasanxuat"));

                list.add(sanpham);
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

    public WebRowSet SanPham_GetByAll() throws RemoteException {
            String sql = "select * from sanpham";
        try{
            PreparedStatement statement = SQLConnect.GetConnection().prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            WebRowSet wrs = new WebRowSetImpl();
            wrs.populate(rs);
            return wrs;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return null;
    }

}
