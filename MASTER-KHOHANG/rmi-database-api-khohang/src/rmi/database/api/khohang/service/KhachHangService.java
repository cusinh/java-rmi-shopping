/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.api.khohang.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import rmi.database.api.khohang.entity.KhachHang;
import rmi.database.api.khohang.entity.SanPhamCuaHang;

/**
 *
 * @author Sinh
 */
public interface KhachHangService extends Remote{
    KhachHang insertKhachHang(KhachHang khachhang) throws RemoteException;

    void updateKhachHang(KhachHang khachhang) throws RemoteException;

    void deleteKhachHang(String maKhachHang) throws RemoteException;
}
