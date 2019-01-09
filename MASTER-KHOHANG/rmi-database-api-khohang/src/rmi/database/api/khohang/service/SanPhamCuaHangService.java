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
import rmi.database.api.khohang.entity.SanPham;
import rmi.database.api.khohang.entity.SanPhamCuaHang;

/**
 *
 * @author Sinh
 */
public interface SanPhamCuaHangService extends Remote {

    SanPhamCuaHang insertSanPhamCuaHang(SanPhamCuaHang sanphamcuahang) throws RemoteException;

    void updateSanPhamCuaHang(SanPhamCuaHang sanphamcuahang) throws RemoteException;

    void deleteSanPhamCuaHang(String maSanPham) throws RemoteException;

    SanPhamCuaHang getSanPhamCuaHangById(String maSanPham) throws RemoteException;

    public WebRowSet SanPhamCuaHang_GetByAllQN() throws RemoteException;

    public WebRowSet SanPhamCuaHang_GetByAllDN() throws RemoteException;

    public WebRowSet SanPhamCuaHangHet_GetByAll() throws RemoteException;
}
