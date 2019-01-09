/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi.database.api.quanly.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.sql.rowset.WebRowSet;

/**
 *
 * @author Sinh
 */
public interface KhachHangService extends Remote{
    public WebRowSet KhachHang_GetByAllQN() throws RemoteException;
    public WebRowSet KhachHang_GetByAllDN() throws RemoteException;
}
