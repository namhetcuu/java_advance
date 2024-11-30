package model;

public class RapChieu {
	private int marapchieu;
	private String diachi;
	private String sodienthoai;
	private String tennguoiphutrach;
	public RapChieu() {
		// TODO Auto-generated constructor stub
	}
	public RapChieu(int marapchieu, String diachi, String sodienthoai, String tennguoiphutrach) {
		super();
		this.marapchieu = marapchieu;
		this.diachi = diachi;
		this.sodienthoai = sodienthoai;
		this.tennguoiphutrach = tennguoiphutrach;
	}
	public int getMarapchieu() {
		return marapchieu;
	}
	public void setMarapchieu(int marapchieu) {
		this.marapchieu = marapchieu;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getTennguoiphutrach() {
		return tennguoiphutrach;
	}
	public void setTennguoiphutrach(String tennguoiphutrach) {
		this.tennguoiphutrach = tennguoiphutrach;
	}
	
}
