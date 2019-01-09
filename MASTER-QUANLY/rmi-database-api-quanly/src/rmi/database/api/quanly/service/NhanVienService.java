/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.api.quanly.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import javax.sql.rowset.WebRowSet;
import rmi.database.api.quanly.entity.NhanVien;

/**
 *
 * @author Sinh
 */
public interface NhanVienService extends Remote{
    NhanVien insertNhanVien(NhanVien nhanvien) throws RemoteException;

    void updateNhanVien(NhanVien nhanvien) throws RemoteException;

    void deleteNhanVien(String maNhanVien) throws RemoteException;

    NhanVien getNhanVienById(String maNhanVien) throws RemoteException;

    List<NhanVien> getAllNhanVien() throws RemoteException;
    
    public WebRowSet NhanVien_GetByAll() throws RemoteException;
}
