package rmi.database.server.quanly;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import rmi.database.server.quanly.impl.ChucVuNhanVienServiceImpl;
import rmi.database.server.quanly.impl.KhachHangServiceImpl;

import rmi.database.server.quanly.impl.NhanVienServiceImpl;
import rmi.database.server.quanly.impl.SanPhamCuaHangServiceImpl;

public class ServerImpl {

    private static Context ctx = null;
    private static NhanVienServiceImpl nvsv = null;
    private static ChucVuNhanVienServiceImpl cvnv = null;
    private static KhachHangServiceImpl khsv = null;
    private static SanPhamCuaHangServiceImpl spch = null;

    public ServerImpl() throws NamingException {
    }

    public static void KetNoiQuanLy(String host, int port) throws RemoteException, NamingException {
        ctx = new InitialContext();
        nvsv = new NhanVienServiceImpl();
        cvnv = new ChucVuNhanVienServiceImpl();
        khsv = new KhachHangServiceImpl();
        spch = new SanPhamCuaHangServiceImpl();

        UnicastRemoteObject.exportObject((Remote) nvsv, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/NhanVienService", nvsv);
        
        UnicastRemoteObject.exportObject((Remote) cvnv, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/ChucVuNhanVienService", cvnv);
        
        UnicastRemoteObject.exportObject((Remote) khsv, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/KhachHangService", khsv);
        
        UnicastRemoteObject.exportObject((Remote) spch, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/SanPhamCuaHangService", spch);

    }

    public static void DongKetNoiQuanLy(String host, int port) throws NamingException {
        ctx.unbind("rmi://" + host + ":" + port + "/NhanVienService");
        ctx.unbind("rmi://" + host + ":" + port + "/ChucVuNhanVienService");
        ctx.unbind("rmi://" + host + ":" + port + "/KhachHangService");
        ctx.unbind("rmi://" + host + ":" + port + "/SanPhamCuaHangService");
        ctx = null;
    }
}
