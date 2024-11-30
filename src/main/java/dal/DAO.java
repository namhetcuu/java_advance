package dal;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.*;
public class DAO {
	public List<Phim> getPhim(){
		List<Phim> list = new ArrayList<>();
        try {
            // Ensure the connection is initialized
            if (DBContext.connection == null) {
                DBContext.ketnoi(); // Call the method to establish the connection
            }

            String sql = "SELECT * FROM rap_chieu_phim.phim;";

            PreparedStatement ps = DBContext.connection.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Phim p = new Phim();
				p.setMaphim(rs.getInt("maphim"));
				p.setTenphim(rs.getString("tenphim"));
				p.setTheloai(rs.getString("theloai"));
				p.setNgaybatdau(rs.getString("ngaybatdau"));
				p.setNgayketthuc(rs.getString("ngayketthuc"));
				p.setThoiluong(rs.getString("thoiluong"));
				list.add(p);
			}

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
	}
	public List<RapChieu> getRapChieuPhim(){
		List<RapChieu> list = new ArrayList<>();
        try {
            // Ensure the connection is initialized
            if (DBContext.connection == null) {
                DBContext.ketnoi(); // Call the method to establish the connection
            }

            String sql = "SELECT * FROM rap_chieu_phim.rapchieu;";

            PreparedStatement ps = DBContext.connection.prepareStatement(sql);
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				RapChieu rap = new RapChieu();
				rap.setMarapchieu(rs.getInt("marapchieu"));
				rap.setDiachi(rs.getString("diachi"));
				rap.setSodienthoai(rs.getString("sodienthoai"));
				rap.setTennguoiphutrach(rs.getString("tennguoiphutrach"));
				list.add(rap);
			}

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
		
		
	
	}
	public void insert(int cccd,int marapchieu,int maphim,String ngayxem,String suatchieu,int sove,
			int vitrighe,int thanhtien,String hoten,String sdt,String email) {
		
        try {
            // Ensure the connection is initialized
            if (DBContext.connection == null) {
                DBContext.ketnoi(); // Call the method to establish the connection
            }

            String sql = "INSERT INTO `rap_chieu_phim`.`chitietdatve`\r\n"
            		+ "(`cccd`,\r\n"
            		+ "`marapchieu`,\r\n"
            		+ "`maphim`,\r\n"
            		+ "`ngayxem`,\r\n"
            		+ "`suatchieu`,\r\n"
            		+ "`sove`,\r\n"
            		+ "`vitrighe`,\r\n"
            		+ "`thanhtien`)\r\n"
            		+ "VALUES\r\n"
            		+ "(?,?,?,?,?,?,?,?);";
            

            PreparedStatement ps = DBContext.connection.prepareStatement(sql);
            ps.setInt(1, cccd);
            ps.setInt(2, marapchieu);
            ps.setInt(3, maphim);
            ps.setString(4, ngayxem);
            ps.setString(5, suatchieu);
            ps.setInt(6, sove);
            ps.setInt(7, vitrighe);
            ps.setInt(8, thanhtien);
			ps.executeUpdate();
			String sql1 = "INSERT INTO `rap_chieu_phim`.`khachhang`\r\n"
            		+"(`cccd`,\r\n"
            		+"`hoten`,\r\n"
            		+"`sdt`,\r\n"
            		+"`email`)\r\n"
            		+"VALUES\r\n"
            		+"(?,?,?,?);";
			PreparedStatement ps1 = DBContext.connection.prepareStatement(sql1);
			ps1.setInt(1, cccd);
			ps1.setString(2, hoten);
	        ps1.setString(3, sdt);
	        ps1.setString(4, email);
	        ps1.executeUpdate();
	            
			
			

        } catch (Exception e) {
            e.printStackTrace();
        }
        
	}
	public RapChieu getRapchieubyId(int id) {
		RapChieu rap = new RapChieu();
        try {
            // Ensure the connection is initialized
            if (DBContext.connection == null) {
                DBContext.ketnoi(); // Call the method to establish the connection
            }

            String sql = "SELECT * FROM rap_chieu_phim.rapchieu where marapchieu = ?";

            PreparedStatement ps = DBContext.connection.prepareStatement(sql);
            ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				RapChieu rap1 = new RapChieu();
				rap1.setMarapchieu(rs.getInt("marapchieu"));
				rap1.setDiachi(rs.getString("diachi"));
				rap1.setSodienthoai(rs.getString("sodienthoai"));
				rap1.setTennguoiphutrach(rs.getString("tennguoiphutrach"));
				return rap1;
			}

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
	}
	public Phim getPhimbyId(int id) {
		Phim rap = new Phim();
        try {
            // Ensure the connection is initialized
            if (DBContext.connection == null) {
                DBContext.ketnoi(); // Call the method to establish the connection
            }

            String sql = "SELECT * FROM rap_chieu_phim.phim where maphim = ?";

            PreparedStatement ps = DBContext.connection.prepareStatement(sql);
            ps.setInt(1, id);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				Phim phim1 = new Phim();
				phim1.setMaphim(rs.getInt("maphim"));
				phim1.setTenphim(rs.getString("tenphim"));
				phim1.setTheloai(rs.getString("theloai"));
				phim1.setNgaybatdau(rs.getString("ngaybatdau"));
				phim1.setNgayketthuc(rs.getString("ngayketthuc"));
				phim1.setThoiluong(rs.getString("thoiluong"));
				return phim1;
			}

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
        
	}
	public KhachHang searchKhachHang(int cccd) {
		KhachHang kh = new KhachHang();
		
        try {
            // Ensure the connection is initialized
            if (DBContext.connection == null) {
                DBContext.ketnoi(); // Call the method to establish the connection
            }

            String sql = "SELECT * FROM rap_chieu_phim.khachhang where cccd = ?";

            PreparedStatement ps = DBContext.connection.prepareStatement(sql);
            ps.setInt(1,cccd);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				KhachHang kh1 = new KhachHang();
				kh1.setCccd(rs.getInt("cccd"));
				kh1.setHoten(rs.getString("hoten"));
				kh1.setSdt(rs.getString("sdt"));
				kh1.setEmail(rs.getString("email"));
				
				return kh1;
			}

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
	}
}
