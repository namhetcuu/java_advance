package model;

import java.util.Date;

public class Phim {
	private int maphim;
	private String tenphim;
	private String theloai;
	private String ngaybatdau;
	private String ngayketthuc;
	private String thoiluong;
	public Phim() {
		// TODO Auto-generated constructor stub
	}
	public Phim(int maphim, String tenphim, String theloai, String ngaybatdau, String ngayketthuc, String thoiluong) {
		super();
		this.maphim = maphim;
		this.tenphim = tenphim;
		this.theloai = theloai;
		this.ngaybatdau = ngaybatdau;
		this.ngayketthuc = ngayketthuc;
		this.thoiluong = thoiluong;
	}
	public int getMaphim() {
		return maphim;
	}
	public void setMaphim(int maphim) {
		this.maphim = maphim;
	}
	public String getTenphim() {
		return tenphim;
	}
	public void setTenphim(String tenphim) {
		this.tenphim = tenphim;
	}
	public String getTheloai() {
		return theloai;
	}
	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}
	public String getNgaybatdau() {
		return ngaybatdau;
	}
	public void setNgaybatdau(String ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}
	public String getNgayketthuc() {
		return ngayketthuc;
	}
	public void setNgayketthuc(String ngayketthuc) {
		this.ngayketthuc = ngayketthuc;
	}
	public String getThoiluong() {
		return thoiluong;
	}
	public void setThoiluong(String thoiluong) {
		this.thoiluong = thoiluong;
	}
	
	
}
