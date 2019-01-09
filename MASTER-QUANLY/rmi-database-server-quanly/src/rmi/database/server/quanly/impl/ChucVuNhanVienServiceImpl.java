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
import rmi.database.api.quanly.service.ChucVuNhanVienService;
import rmi.database.server.quanly.SQLConnect;

/**
 *
 * @author Sinh
 */
public class ChucVuNhanVienServiceImpl implements ChucVuNhanVienService{
    @Override
    public WebRowSet ChucVuNhanVien_GetByAll() throws RemoteException {
        String sql = "select * from chucvunhanvien";
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
