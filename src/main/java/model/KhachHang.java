package model;

public class KhachHang {
	private int cccd;
	private String hoten;
	private String sdt;
	private String email;
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	public KhachHang(int cccd, String hoten, String sdt, String email) {
		super();
		this.cccd = cccd;
		this.hoten = hoten;
		this.sdt = sdt;
		this.email = email;
	}
	public int getCccd() {
		return cccd;
	}
	public void setCccd(int cccd) {
		this.cccd = cccd;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
