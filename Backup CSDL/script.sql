USE [master]
GO
/****** Object:  Database [QL_SHOP]    Script Date: 12/12/2018 9:08:01 AM ******/
CREATE DATABASE [QL_SHOP]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QL_SHOP', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SERVERTRUNGGIAN\MSSQL\DATA\QL_SHOP.mdf' , SIZE = 11264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QL_SHOP_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SERVERTRUNGGIAN\MSSQL\DATA\QL_SHOP_log.ldf' , SIZE = 43264KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [QL_SHOP] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QL_SHOP].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QL_SHOP] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QL_SHOP] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QL_SHOP] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QL_SHOP] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QL_SHOP] SET ARITHABORT OFF 
GO
ALTER DATABASE [QL_SHOP] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [QL_SHOP] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [QL_SHOP] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QL_SHOP] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QL_SHOP] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QL_SHOP] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QL_SHOP] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QL_SHOP] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QL_SHOP] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QL_SHOP] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QL_SHOP] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QL_SHOP] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QL_SHOP] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QL_SHOP] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QL_SHOP] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QL_SHOP] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QL_SHOP] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QL_SHOP] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QL_SHOP] SET RECOVERY FULL 
GO
ALTER DATABASE [QL_SHOP] SET  MULTI_USER 
GO
ALTER DATABASE [QL_SHOP] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QL_SHOP] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QL_SHOP] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QL_SHOP] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
EXEC sys.sp_db_vardecimal_storage_format N'QL_SHOP', N'ON'
GO
USE [QL_SHOP]
GO
/****** Object:  User [HTKN]    Script Date: 12/12/2018 9:08:01 AM ******/
CREATE USER [HTKN] FOR LOGIN [HTKN] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_owner] ADD MEMBER [HTKN]
GO
/****** Object:  Table [dbo].[chucvunhanvien]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[chucvunhanvien](
	[ma_chucvunhanvien] [nvarchar](50) NOT NULL,
	[ten_chucvunhanvien] [nvarchar](100) NULL,
	[luong] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_chucvunhanvien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[cuahang]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[cuahang](
	[ma_cuahang] [nvarchar](50) NOT NULL,
	[ten_cuahang] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_cuahang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[danhmucsanpham]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[danhmucsanpham](
	[ma_danhmucsanpham] [nvarchar](50) NOT NULL,
	[ten_danhmucsanpham] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_danhmucsanpham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[hoadon]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[hoadon](
	[ma_hoadon] [nvarchar](50) NOT NULL,
	[ma_sanpham] [nvarchar](50) NULL,
	[ma_khachhang] [nvarchar](50) NULL,
	[ma_cuahang] [nvarchar](50) NULL,
	[ma_nhanvien] [nvarchar](50) NULL,
	[thoigian] [nvarchar](100) NULL,
	[giamgia] [float] NULL,
	[tongtien] [float] NULL,
	[kieuthanhtoan] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_hoadon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[khachhang]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[khachhang](
	[ma_khachhang] [nvarchar](50) NOT NULL,
	[ma_cuahang] [nvarchar](50) NOT NULL,
	[ten_khachhang] [nvarchar](100) NULL,
	[ngaysinh] [nvarchar](100) NULL,
	[sdtkhachhang] [nvarchar](11) NULL,
	[email] [nvarchar](100) NULL,
	[diachi] [nvarchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_khachhang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[nhanvien]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[nhanvien](
	[ma_nhanvien] [nvarchar](50) NOT NULL,
	[ma_chucvunhanvien] [nvarchar](50) NULL,
	[ten_nhanvien] [nvarchar](100) NULL,
	[ngaysinh] [nvarchar](100) NULL,
	[diachi] [nvarchar](255) NULL,
	[sdt_nhanvien] [nvarchar](11) NULL,
	[email] [nvarchar](100) NULL,
	[gioitinh] [nvarchar](100) NULL,
	[cmnd] [nvarchar](100) NULL,
	[ngaybatdaulamviec] [nvarchar](100) NULL,
	[songaylamviec] [int] NULL,
	[ma_cuahang] [nvarchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_nhanvien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sanpham]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sanpham](
	[ma_sanpham] [nvarchar](50) NOT NULL,
	[ma_danhmucsanpham] [nvarchar](50) NULL,
	[ten_sanpham] [nvarchar](100) NULL,
	[chatlieu] [nvarchar](100) NULL,
	[size] [nvarchar](100) NULL,
	[mau] [nvarchar](100) NULL,
	[soluongnhap] [int] NULL,
	[gianhap] [float] NULL,
	[tennhasanxuat] [nvarchar](100) NULL,
	[diachinhasanxuat] [nvarchar](100) NULL,
	[sdtnhasanxuat] [nvarchar](11) NULL,
PRIMARY KEY CLUSTERED 
(
	[ma_sanpham] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sanphamban]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sanphamban](
	[id_sanphamban] [int] IDENTITY(1,1) NOT NULL,
	[ma_sanpham] [nvarchar](50) NULL,
	[ma_nhanvien] [nvarchar](50) NULL,
	[ma_khachhang] [nvarchar](50) NULL,
	[ma_cuahang] [nvarchar](50) NULL,
	[soluongban] [int] NULL,
	[tongtien] [float] NULL,
	[thoigianban] [nvarchar](100) NULL,
PRIMARY KEY CLUSTERED 
(
	[id_sanphamban] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[sanphamcuahang]    Script Date: 12/12/2018 9:08:01 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[sanphamcuahang](
	[id_sanphamcuahang] [int] IDENTITY(1,1) NOT NULL,
	[ma_sanpham] [nvarchar](50) NULL,
	[ma_cuahang] [nvarchar](50) NULL,
	[soluongcon] [int] NULL,
	[giaban] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[id_sanphamcuahang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
INSERT [dbo].[chucvunhanvien] ([ma_chucvunhanvien], [ten_chucvunhanvien], [luong]) VALUES (N'NVBH', N'NHÂN VIÊN BÁN HÀNG', 7000000)
INSERT [dbo].[chucvunhanvien] ([ma_chucvunhanvien], [ten_chucvunhanvien], [luong]) VALUES (N'QL', N'QUẢN LÝ', 15000000)
INSERT [dbo].[chucvunhanvien] ([ma_chucvunhanvien], [ten_chucvunhanvien], [luong]) VALUES (N'TK', N'THỦ KHO', 13000000)
INSERT [dbo].[cuahang] ([ma_cuahang], [ten_cuahang]) VALUES (N'DN', N'ĐÀ NẴNG')
INSERT [dbo].[cuahang] ([ma_cuahang], [ten_cuahang]) VALUES (N'QN', N'QUY NHƠN')
INSERT [dbo].[danhmucsanpham] ([ma_danhmucsanpham], [ten_danhmucsanpham]) VALUES (N'AO', N'Áo')
INSERT [dbo].[danhmucsanpham] ([ma_danhmucsanpham], [ten_danhmucsanpham]) VALUES (N'QUAN', N'Quần')
INSERT [dbo].[danhmucsanpham] ([ma_danhmucsanpham], [ten_danhmucsanpham]) VALUES (N'VAY', N'Váy')
INSERT [dbo].[hoadon] ([ma_hoadon], [ma_sanpham], [ma_khachhang], [ma_cuahang], [ma_nhanvien], [thoigian], [giamgia], [tongtien], [kieuthanhtoan]) VALUES (N'KSNAS', N'AO1', NULL, N'QN', N'NVBHQN', N'04-12-2018', 10, 220000, N'Tien mat')
INSERT [dbo].[hoadon] ([ma_hoadon], [ma_sanpham], [ma_khachhang], [ma_cuahang], [ma_nhanvien], [thoigian], [giamgia], [tongtien], [kieuthanhtoan]) VALUES (N'NHQN', N'AO1', NULL, N'QN', N'NVBHQN', N'04-12-2018', 10, 220000, N'Tien mat')
INSERT [dbo].[hoadon] ([ma_hoadon], [ma_sanpham], [ma_khachhang], [ma_cuahang], [ma_nhanvien], [thoigian], [giamgia], [tongtien], [kieuthanhtoan]) VALUES (N'NMASND', N'AO1', NULL, N'QN', N'NVBHQN', N'04-12-2018', 10, 220000, N'Tien mat')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN1', N'DN', N'NGUYỄN VĂN A', N'12/02/1999', N'091726422', N'ANGUYEN@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN10', N'DN', N'TRẦN VĂN CHIẾN', N'01/01/1986', N'0182828621', N'AKSJ@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN11', N'DN', N'ĐÀO VĂN LANG', N'03/09/1997', N'091328372', N'OKAS@GMIAL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN2', N'DN', N'LÊ VĂN C', N'23/03/1998', N'092726552', N'CLE@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN3', N'DN', N'CÙ TRỌNG XOAY', N'20/1/1976', N'9172614517', N'XOAYCU@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN4', N'DN', N'HOÀNG VĂN TÈO', N'04/03/1989', N'098122152', N'HOANGCU@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN5', N'DN', N'TRẦN VĂN V', N'09/09/1988', N'091282332', N'VANTRAN@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN6', N'DN', N'NGUYỄN THỊ T', N'09/01/1964', N'081232412', N'TTHI@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN7', N'DN', N'HOÀNG NGỌC LINH', N'05/05/1909', N'0129287321', N'CHUALINH@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN8', N'DN', N'CƯỜI VĂN VUI', N'09/01/1992', N'0166524212', N'CUOIVUI@GMIAL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHDN9', N'DN', N'NGUYỄN THỊ J', N'04/04/1987', N'091232486', N'CMN@GMAIL.COM', N'ĐÀ NẴNG')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN1', N'QN', N'NGUYỄN HOÀNG DUY', N'15/11/1998', N'0120874110', N'HOANGNGUYEN@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN10', N'QN', N'ĐÀO THỊ BIẾNG', N'09/05/1970', N'091823222', N'KIAS@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN11', N'QN', N'NGUYỄN VĂN LANH', N'09/12/1987', N'091726237', N'OIWQ@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN2', N'QN', N'NGUYỄN THỊ B', N'12/02/1998', N'0127364512', N'BNGUYEN@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN3', N'QN', N'BÙI THI D', N'20/2/1997', N'0128752342', N'DTHI@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN4', N'QN', N'NGUYỄN THỊ N', N'02/02/1990', N'091263252', N'THINGUYEN@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN5', N'QN', N'HOÀNG VĂN PHÚ', N'01/09/1997', N'091736141', N'VTRANG@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN6', N'QN', N'NGUYỄN VĂN M', N'09/09/1979', N'091823611', N'MVAN@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN7', N'QN', N'BUỒN THỊ KHÓC', N'02/09/1996', N'091283621', N'KHOCLE@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN8', N'QN', N'NGUYỄN THỊ Z', N'10/01/1994', N'091813615', N'CMMC@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[khachhang] ([ma_khachhang], [ma_cuahang], [ten_khachhang], [ngaysinh], [sdtkhachhang], [email], [diachi]) VALUES (N'KHQN9', N'QN', N'TRẦN THỊ THINH', N'08/08/1992', N'0122938646', N'DMJ@GMAIL.COM', N'QUY NHƠN')
INSERT [dbo].[nhanvien] ([ma_nhanvien], [ma_chucvunhanvien], [ten_nhanvien], [ngaysinh], [diachi], [sdt_nhanvien], [email], [gioitinh], [cmnd], [ngaybatdaulamviec], [songaylamviec], [ma_cuahang]) VALUES (N'NVBHDN', N'NVBH', N'NGUYỄN HOÀNG HOA', N'07/02/1992', N'ĐÀ NẴNG', N'098221231', N'HOAHOANGNGUYEN@GMAIL.COM', N'NỮ', N'215411092', N'15/10/2018', 30, N'DN')
INSERT [dbo].[nhanvien] ([ma_nhanvien], [ma_chucvunhanvien], [ten_nhanvien], [ngaysinh], [diachi], [sdt_nhanvien], [email], [gioitinh], [cmnd], [ngaybatdaulamviec], [songaylamviec], [ma_cuahang]) VALUES (N'NVBHQN', N'NVBH', N'HOÀN THỊ TUYẾT', N'06/06/1997', N'QUY NHƠN', N'016711021', N'TUYETHOANG@GMAIL.COM', N'NAM', N'251400100', N'10/10/2018', 30, N'QN')
INSERT [dbo].[nhanvien] ([ma_nhanvien], [ma_chucvunhanvien], [ten_nhanvien], [ngaysinh], [diachi], [sdt_nhanvien], [email], [gioitinh], [cmnd], [ngaybatdaulamviec], [songaylamviec], [ma_cuahang]) VALUES (N'QLDN', N'QL', N'NGUYỄN TẤN ĐƯỢC', N'20/07/1997', N'ĐÀ NẴNG', N'016850531', N'TANDUOC@GMAIL.COM', N'NAM', N'267110123', N'15/10/2018', 30, N'DN')
INSERT [dbo].[nhanvien] ([ma_nhanvien], [ma_chucvunhanvien], [ten_nhanvien], [ngaysinh], [diachi], [sdt_nhanvien], [email], [gioitinh], [cmnd], [ngaybatdaulamviec], [songaylamviec], [ma_cuahang]) VALUES (N'QLQN', N'QL', N'NGUYỄN VĂN LANH', N'26/05/1997', N'QUY NHƠN', N'09001009', N'HMVANLANH@GMAIL.COM', N'NAM', N'215723376', N'10/10/2018', 30, N'QN')
INSERT [dbo].[nhanvien] ([ma_nhanvien], [ma_chucvunhanvien], [ten_nhanvien], [ngaysinh], [diachi], [sdt_nhanvien], [email], [gioitinh], [cmnd], [ngaybatdaulamviec], [songaylamviec], [ma_cuahang]) VALUES (N'TKDN', N'TK', N'NGUYỄN VĂN XUÂN BẢO', N'12/2/1999', N'ĐÀ NẴNG ', N'0934883667', N'XUANBAOPRO@GMAIL.COM', N'NỮ', N'224567635', N'27/11/2018', 30, N'DN')
INSERT [dbo].[nhanvien] ([ma_nhanvien], [ma_chucvunhanvien], [ten_nhanvien], [ngaysinh], [diachi], [sdt_nhanvien], [email], [gioitinh], [cmnd], [ngaybatdaulamviec], [songaylamviec], [ma_cuahang]) VALUES (N'TKQN', N'TK', N'NGUYỄN VĂN A', N'12/2/1997', N'QUY NHƠN', N'0934888765', N'ANGUYEN1@GMAIL.COM', N'NAM', N'237645289', N'27/11/2018', 30, N'QN')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AO1', N'AO', N'ÁO THUN XANH', N'VẢI', N'XL', N'XANH', 300, 180000, N'ĐỒNG NAI', N'ĐỒNG NAI', N'09001009')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AO2', N'AO', N'ÁO SƠ MI TRẮNG', N'VẢI', N'XL', N'TRẮNG', 400, 220000, N'LÂM ĐỒNG', N'LÂM ĐỒNG', N'012299111')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AO3', N'AO', N'ÁO SƠ MI ĐEN', N'VẢI ', N'XL', N'ĐEN', 500, 200000, N'LÂM ĐỒNG', N'LÂM ĐỒNG', N'090011902')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AO4', N'AO', N'ÁO KHOÁC HELLO KITTY', N'VẢI', N'XL', N'ĐEN', 500, 250000, N'ĐỒNG NAI', N'ĐỒNG NAI', N'016911002')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AO5', N'AO', N'ÁO MODEN', N'VẢI', N'M', N'TÍM', 500, 100000, N'CTTNHH 1', N'GIA LAI', N'0987736352')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AO6', N'AO', N'ÁO DẠ', N'VẢI', N'XL', N'TRẮNG HỒNG', 500, 290000, N'TNHH MÙA ĐÔNG', N'BÌNH ĐỊNH', N'0186243272')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AO7', N'AO', N'ÁO ĐEN', N'VẢI', N'XL', N'ĐEN', 20, 200000, N'CTY TNHH NGU NGUOI LANH', N'HẢI PHÒNG', N'091752755')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AOTEST', N'AO', N'AO TEST', N'VẢI', N'XL', N'ĐỎ', 500, 20000, N'ĐỒNG NAI', N'ĐỒNG NAI', N'090011002')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'AOTRANG', N'AO', N'ÁO SƠ MI', N'VẢI', N'XL', N'TRẮNG', 500, 800000, N'TNHH MÙA ĐÔNG', N'BÌNH ĐỊNH', N'0186243272')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'QUAN1', N'QUAN', N'QUẦN TÂY ĐEN', N'VẢI', N'XL', N'ĐEN', 500, 200000, N'CÔNG TY HÒA', N'LÂM ĐỒNG', N'019110098')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'QUAN2', N'QUAN', N'QUẦN DÀI', N'VẢI', N'L', N'HỒNG NHẠT', 500, 290000, N'TT QN', N'QUY NHƠN', N'092634242')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'QUAN3', N'QUAN', N'QUẦN NGẮN ', N'VẢI', N'XXL', N'XANH DƯƠNG', 500, 2000000, N'TT DN', N'DÀ NẴNG', N'0926344232')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'QUAN4', N'QUAN', N'QUẦN KAKI', N'VẢI', N'L', N'ĐEN', 500, 820000, N'TNHH CC', N'CÀ MAU', N'0918635123')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'QUAN5', N'QUAN', N'QUẦN BÓNG', N'VẢI', N'L', N'CAM', 500, 90000, N'TNHH CC', N'CÀ MAU', N'0918635123')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'QUANFS ', N'QUAN', N'QUẦN FS', N'VẢI', N'L', N'NÂU', 500, 1000000, N'TTV MÙA HẠ', N'BÌNH ĐỊNH', N'0183642563')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAY1', N'VAY', N'VÁY XÒE', N'VẢI ', N'L', N'HỒNG', 500, 300000, N'CÔNG TY MAY MẶC MIỀN TRUNG', N'QUY NHƠN', N'09110051')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAY2', N'VAY', N'VAY XANH', N'VAI', N'XL', N'DEN', 500, 200000, N'CTY MAY', N'MY', N'090010021')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAY3', N'VAY', N'VAY CA RÔ', N'VẢI', N'XL', N'ĐEN, TRẮNG', 500, 200000, N'CTY MAY', N'MY', N'090010021')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAY4', N'VAY', N'VAY CA RÔ', N'VẢI', N'XL', N'ĐEN, TRẮNG', 500, 200000, N'CTY MAY', N'MY', N'090010021')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAY6', N'VAY', N'VÁY CA RÔ CHẤM BI', N'VẢI', N'XL', N'ĐỎ, TRẮNG', 500, 150000, N'NIKE', N'MỸ', N'0988800112')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAY7', N'VAY', N'VÁY BÓNG', N'VẢI', N'L', N'CAM ĐẬM', 500, 900000, N'TNHH DC', N'CÀ MAU', N'0389276252')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAY8', N'VAY', N'VÁY NGỦ', N'VẢI', N'L', N'VÀNG', 500, 110000, N'TNHH DC PAGODA', N'HÀ NỘI', N'03887126121')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAYD', N'VAY', N'VÁY ÔM', N'VẢI', N'XXL', N'XANH DƯƠNG', 500, 2000000, N'TTV MÙA HẠ', N'BÌNH ĐỊNH', N'0183642563')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAYH', N'VAY', N'VÁY XÒE', N'VẢI', N'XL', N'HỒNG NHẸ', 500, 139000, N'CTTNHH THANH VIEN', N'ĐĂK LĂK', N'0987727542')
INSERT [dbo].[sanpham] ([ma_sanpham], [ma_danhmucsanpham], [ten_sanpham], [chatlieu], [size], [mau], [soluongnhap], [gianhap], [tennhasanxuat], [diachinhasanxuat], [sdtnhasanxuat]) VALUES (N'VAYX', N'VAY', N'VÁY XÒE', N'VẢI', N'XLL', N'HỒNG', 500, 120000, N'CTTNHH THANH VIEN', N'ĐĂK LĂK', N'0987727542')
SET IDENTITY_INSERT [dbo].[sanphamban] ON 

INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (1, N'AO1', N'NVBHQN', N'KHQN1', N'QN', 2, 400000, N'11/11/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (2, N'AO2', N'NVBHQN', N'KHQN1', N'QN', 1, 240000, N'27/11/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (6, N'AO3', N'NVBHQN', N'KHQN2', N'QN', 1, 220000, N'28/11/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (7, N'AO4', N'NVBHDN', N'KHDN2', N'DN', 1, 300000, N'30/2/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (8, N'QUAN1', N'NVBHDN', N'KHDN3', N'DN', 1, 230000, N'22/04/2016')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (9, N'QUAN2', N'NVBHQN', N'KHQN3', N'QN', 1, 310000, N'24/09/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (10, N'QUAN3', N'NVBHDN', N'KHDN4', N'DN', 1, 2300000, N'21/12/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (11, N'QUAN4', N'NVBHQN', N'KHQN4', N'QN', 1, 840000, N'04/12/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (12, N'QUAN5', N'NVBHDN', N'KHDN5', N'DN', 1, 93000, N'09/08/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (13, N'QUANFS', N'NVBHQN', N'KHQN5', N'QN', 1, 1200000, N'10/12/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (14, N'AO5', N'NVBHDN', N'KHDN6', N'DN', 1, 130000, N'13/13/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (15, N'AO6', N'NVBHQN', N'KHQN6', N'QN', 1, 310000, N'07/11/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (16, N'VAY1', N'NVBHDN', N'KHDN7', N'DN', 1, 330000, N'02/02/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (17, N'VAY2', N'NVBHQN', N'KHQN7', N'QN', 1, 22000, N'09/09/2019')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (18, N'VAY3', N'NVBHDN', N'KHDN8', N'DN', 1, NULL, N'07/09/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (31, N'VAY4', N'NVBHQN', N'KHQN8', N'QN', 1, 220000, N'15/11/2017')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (33, N'VAY6', N'NVBHDN', N'KHDN9', N'DN', 1, 180000, N'12/12/2016')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (34, N'VAY7', N'NVBHQN', N'KHQN9', N'QN', 1, 920000, N'08/07/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (35, N'VAY8', N'NVBHDN', N'KHDN10', N'DN', 1, 130000, N'05/05/2017')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (36, N'VAYD', N'NVBHQN', N'KHQN10', N'QN', 1, 2200000, N'19/10/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (37, N'VAYH', N'NVBHDN', N'KHDN11', N'DN', 1, 169000, N'27/02/2018')
INSERT [dbo].[sanphamban] ([id_sanphamban], [ma_sanpham], [ma_nhanvien], [ma_khachhang], [ma_cuahang], [soluongban], [tongtien], [thoigianban]) VALUES (39, N'VAYX', N'NVBHQN', N'KHQN11', N'QN', 1, 140000, N'02/03/2018')
SET IDENTITY_INSERT [dbo].[sanphamban] OFF
SET IDENTITY_INSERT [dbo].[sanphamcuahang] ON 

INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (113, N'AO1', N'DN', 30, 230000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (114, N'AO2', N'DN', 0, 270000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (115, N'AO3', N'DN', 0, 250000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (116, N'AO4', N'DN', 0, 300000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (117, N'AO5', N'DN', 0, 150000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (118, N'AO6', N'DN', 0, 340000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (119, N'AOTEST', N'DN', 0, 70000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (120, N'AOTRANG', N'DN', 0, 850000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (121, N'QUAN1', N'DN', 0, 250000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (122, N'QUAN2', N'DN', 0, 340000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (123, N'QUAN3', N'DN', 0, 2050000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (124, N'QUAN4', N'DN', 0, 870000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (125, N'QUAN5', N'DN', 0, 140000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (126, N'QUANFS ', N'DN', 0, 1050000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (127, N'VAY1', N'DN', 0, 350000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (128, N'VAY2', N'DN', 0, 250000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (129, N'VAY3', N'DN', 0, 250000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (130, N'VAY4', N'DN', 0, 250000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (131, N'VAY6', N'DN', 0, 200000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (132, N'VAY7', N'DN', 0, 950000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (133, N'VAY8', N'DN', 0, 160000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (134, N'VAYD', N'DN', 0, 2050000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (135, N'VAYH', N'DN', 0, 189000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (136, N'VAYX', N'DN', 0, 170000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (137, N'AO1', N'QN', 200, 220000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (138, N'AO2', N'QN', 100, 260000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (139, N'AO3', N'QN', 0, 240000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (140, N'AO4', N'QN', 0, 290000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (141, N'AO5', N'QN', 0, 140000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (142, N'AO6', N'QN', 0, 330000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (143, N'AOTEST', N'QN', 0, 60000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (144, N'AOTRANG', N'QN', 0, 840000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (145, N'QUAN1', N'QN', 0, 240000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (146, N'QUAN2', N'QN', 0, 330000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (147, N'QUAN3', N'QN', 0, 2040000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (148, N'QUAN4', N'QN', 0, 860000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (149, N'QUAN5', N'QN', 0, 130000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (150, N'QUANFS ', N'QN', 0, 1040000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (151, N'VAY1', N'QN', 0, 340000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (152, N'VAY2', N'QN', 0, 240000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (153, N'VAY3', N'QN', 0, 240000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (154, N'VAY4', N'QN', 0, 240000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (155, N'VAY6', N'QN', 0, 190000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (156, N'VAY7', N'QN', 0, 940000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (157, N'VAY8', N'QN', 0, 150000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (158, N'VAYD', N'QN', 0, 2040000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (159, N'VAYH', N'QN', 0, 179000)
INSERT [dbo].[sanphamcuahang] ([id_sanphamcuahang], [ma_sanpham], [ma_cuahang], [soluongcon], [giaban]) VALUES (160, N'VAYX', N'QN', 0, 160000)
SET IDENTITY_INSERT [dbo].[sanphamcuahang] OFF
ALTER TABLE [dbo].[khachhang]  WITH CHECK ADD  CONSTRAINT [FK_khachhang_cuahang] FOREIGN KEY([ma_cuahang])
REFERENCES [dbo].[cuahang] ([ma_cuahang])
GO
ALTER TABLE [dbo].[khachhang] CHECK CONSTRAINT [FK_khachhang_cuahang]
GO
ALTER TABLE [dbo].[nhanvien]  WITH CHECK ADD  CONSTRAINT [FK_nhanvien_chucvunhanvien] FOREIGN KEY([ma_chucvunhanvien])
REFERENCES [dbo].[chucvunhanvien] ([ma_chucvunhanvien])
GO
ALTER TABLE [dbo].[nhanvien] CHECK CONSTRAINT [FK_nhanvien_chucvunhanvien]
GO
ALTER TABLE [dbo].[sanpham]  WITH CHECK ADD  CONSTRAINT [FK_sanpham_danhmucsanpham] FOREIGN KEY([ma_danhmucsanpham])
REFERENCES [dbo].[danhmucsanpham] ([ma_danhmucsanpham])
GO
ALTER TABLE [dbo].[sanpham] CHECK CONSTRAINT [FK_sanpham_danhmucsanpham]
GO
ALTER TABLE [dbo].[sanphamban]  WITH CHECK ADD  CONSTRAINT [FK_sanphamban_khachhang] FOREIGN KEY([ma_khachhang])
REFERENCES [dbo].[khachhang] ([ma_khachhang])
GO
ALTER TABLE [dbo].[sanphamban] CHECK CONSTRAINT [FK_sanphamban_khachhang]
GO
ALTER TABLE [dbo].[sanphamban]  WITH CHECK ADD  CONSTRAINT [FK_sanphamban_nhanvien] FOREIGN KEY([ma_nhanvien])
REFERENCES [dbo].[nhanvien] ([ma_nhanvien])
GO
ALTER TABLE [dbo].[sanphamban] CHECK CONSTRAINT [FK_sanphamban_nhanvien]
GO
ALTER TABLE [dbo].[sanphamban]  WITH CHECK ADD  CONSTRAINT [FK_sanphamban_sanpham] FOREIGN KEY([ma_sanpham])
REFERENCES [dbo].[sanpham] ([ma_sanpham])
GO
ALTER TABLE [dbo].[sanphamban] CHECK CONSTRAINT [FK_sanphamban_sanpham]
GO
ALTER TABLE [dbo].[sanphamban]  WITH CHECK ADD  CONSTRAINT [FK_sanphamban_sanpham1] FOREIGN KEY([ma_sanpham])
REFERENCES [dbo].[sanpham] ([ma_sanpham])
GO
ALTER TABLE [dbo].[sanphamban] CHECK CONSTRAINT [FK_sanphamban_sanpham1]
GO
ALTER TABLE [dbo].[sanphamcuahang]  WITH CHECK ADD  CONSTRAINT [FK_sanphamcuahang_cuahang] FOREIGN KEY([ma_cuahang])
REFERENCES [dbo].[cuahang] ([ma_cuahang])
GO
ALTER TABLE [dbo].[sanphamcuahang] CHECK CONSTRAINT [FK_sanphamcuahang_cuahang]
GO
ALTER TABLE [dbo].[sanphamcuahang]  WITH CHECK ADD  CONSTRAINT [FK_sanphamcuahang_sanpham] FOREIGN KEY([ma_sanpham])
REFERENCES [dbo].[sanpham] ([ma_sanpham])
GO
ALTER TABLE [dbo].[sanphamcuahang] CHECK CONSTRAINT [FK_sanphamcuahang_sanpham]
GO
USE [master]
GO
ALTER DATABASE [QL_SHOP] SET  READ_WRITE 
GO
