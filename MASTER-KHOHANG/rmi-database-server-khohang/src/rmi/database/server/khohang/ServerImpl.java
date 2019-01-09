package rmi.database.server.khohang;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import rmi.database.api.khohang.service.HoaDonService;
import rmi.database.api.khohang.service.KhachHangService;
import rmi.database.server.khohang.impl.HoaDonServiceImpl;
import rmi.database.server.khohang.impl.KhachHangServiceImpl;
import rmi.database.server.khohang.impl.SanPhamCuaHangServiceImpl;
import rmi.database.server.khohang.impl.SanPhamServiceImpl;

public class ServerImpl {

    private static Context ctx = null;
    private static SanPhamServiceImpl spsv = null;
    private static SanPhamCuaHangServiceImpl spch = null;
    private static KhachHangServiceImpl khsv = null;
    private static HoaDonServiceImpl hdsv = null;

    public ServerImpl() throws NamingException {
    }

    public static void KetNoiKhoHang(String host, int port) throws RemoteException, NamingException {
        ctx = new InitialContext();
        spsv = new SanPhamServiceImpl();
        spch = new SanPhamCuaHangServiceImpl();
        khsv = new KhachHangServiceImpl();
        hdsv = new HoaDonServiceImpl();

        UnicastRemoteObject.exportObject(spsv, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/SanPhamService", spsv);
        
        UnicastRemoteObject.exportObject(spch, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/SanPhamCuaHangService", spch);
        
        UnicastRemoteObject.exportObject(khsv, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/KhachHangService", khsv);
        
        UnicastRemoteObject.exportObject(hdsv, 0);
        ctx.rebind("rmi://" + host + ":" + port + "/HoaDonService", hdsv);
    }

    public static void DongKetNoiKhoHang(String host, int port) throws NamingException {
        ctx.unbind("rmi://" + host + ":" + port + "/SanPhamService");
        ctx.unbind("rmi://" + host + ":" + port + "/SanPhamCuaHangService");
        ctx.unbind("rmi://" + host + ":" + port + "/KhachHangService");
        ctx.unbind("rmi://" + host + ":" + port + "/HoaDonService");
        ctx = null;
    }
}
