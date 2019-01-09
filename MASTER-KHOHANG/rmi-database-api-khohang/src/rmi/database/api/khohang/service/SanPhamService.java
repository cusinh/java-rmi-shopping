/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.api.khohang.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import javax.sql.rowset.WebRowSet;
import javax.swing.table.AbstractTableModel;
import rmi.database.api.khohang.entity.SanPham;

/**
 *
 * @author Sinh
 */
public interface SanPhamService extends Remote{
    SanPham insertSanPham(SanPham sanpham) throws RemoteException;

    void updateSanPham(SanPham sanpham) throws RemoteException;

    void deleteSanPham(String maSanPham) throws RemoteException;

    SanPham getSanPhamById(String maSanPham) throws RemoteException;

    List<SanPham> getAllSanPham() throws RemoteException;
    
    public WebRowSet SanPham_GetByAll() throws RemoteException;
}
