package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Phim;
import model.RapChieu;

import java.io.IOException;

import dal.DAO;

/**
 * Servlet implementation class AddPhim
 */
@WebServlet("/add")
public class AddPhim extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddPhim() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String cccd = request.getParameter("cccd");
		String hoten = request.getParameter("hoten");
		String sdt = request.getParameter("sdt");
		String email = request.getParameter("email");
		String ngayxem = request.getParameter("ngayxem");
		String marapchieu = request.getParameter("marapchieu");
		String tenphim = request.getParameter("tenphim");
		String suatchieu = request.getParameter("suatchieu");
		String sove = request.getParameter("sove");
		String vitrighe = request.getParameter("vitrighe");
		
		DAO d = new DAO();
		int sove_convert = Integer.parseInt(sove);
		int thanhtien = sove_convert*10000;
		int marapchieu_convert = Integer.parseInt(marapchieu);
		int maphim_convert = Integer.parseInt(tenphim);
		int cccd_con = Integer.parseInt(cccd);
		int sove_con = Integer.parseInt(sove);
		int vitrighe_con = Integer.parseInt(vitrighe);
		RapChieu rap = d.getRapchieubyId(marapchieu_convert);
		Phim phim = d.getPhimbyId(maphim_convert);
		int ngaybatdaucuaphim = Integer.parseInt(phim.getNgaybatdau());
		int ngayketthuccuaphim = Integer.parseInt(phim.getNgayketthuc());
		int ngayxem_con = Integer.parseInt(ngayxem);
		if(ngayxem_con>=ngaybatdaucuaphim&&ngayxem_con<ngayketthuccuaphim) {
			d.insert(cccd_con,rap.getMarapchieu(), phim.getMaphim(), ngayxem, suatchieu, sove_con, vitrighe_con, thanhtien,hoten,sdt,email);
			response.sendRedirect(request.getContextPath()+"/nhapvexemphim");
		}else {
			request.setAttribute("error","ngay xem khong hop le!");
            request.getRequestDispatcher("nhap.jsp").forward(request, response);
		}
		
	}

}
