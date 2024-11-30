package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Phim;
import model.RapChieu;

import java.io.IOException;
import java.util.List;

import dal.DAO;

/**
 * Servlet implementation class NhapVeXemPhim
 */
@WebServlet("/nhapvexemphim")
public class NhapVeXemPhim extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NhapVeXemPhim() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO d = new DAO();
		List<Phim> phims = d.getPhim();
		List<RapChieu> rapchieuphims = d.getRapChieuPhim();
		request.setAttribute("phims", phims);
		request.setAttribute("rapchieuphims", rapchieuphims);
		request.getRequestDispatcher("nhap.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
