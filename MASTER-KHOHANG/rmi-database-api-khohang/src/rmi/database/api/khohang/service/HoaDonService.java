/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.api.khohang.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import rmi.database.api.khohang.entity.HoaDon;

/**
 *
 * @author Sinh
 */
public interface HoaDonService extends Remote{
    HoaDon insertHoaDon(HoaDon hoadon) throws RemoteException;

    void updateHoaDon(HoaDon hoadon) throws RemoteException;

    void deleteHoaDon(String maHoaDon) throws RemoteException;
}
