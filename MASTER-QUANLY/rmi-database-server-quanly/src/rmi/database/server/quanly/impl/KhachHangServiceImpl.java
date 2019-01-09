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
import javax.sql.rowset.WebRowSet;
import rmi.database.api.quanly.service.KhachHangService;
import rmi.database.server.quanly.SQLConnect;

/**
 *
 * @author Sinh
 */
public class KhachHangServiceImpl implements KhachHangService{
  
    @Override
    public WebRowSet KhachHang_GetByAllQN() throws RemoteException {
        String sql = "select * from khachhang where ma_cuahang='QN'";
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
    public WebRowSet KhachHang_GetByAllDN() throws RemoteException {
        String sql = "select * from khachhang where ma_cuahang='DN'";
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
