package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.KhachHang;

import java.io.IOException;

import dal.DAO;

/**
 * Servlet implementation class ListVeXemPhim
 */
@WebServlet("/list")
public class ListVeXemPhim extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListVeXemPhim() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DAO d = new DAO();
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String param1 = request.getParameter("cccd");
		String param2 = request.getParameter("marap");
		String param3 = request.getParameter("tenphim");
		String param4 = request.getParameter("ngayxem");
		DAO d = new DAO();
		int param1_con = Integer.parseInt(param1);
		if(param1!=null) {
			KhachHang kh = d.searchKhachHang(param1_con);
			request.setAttribute("kh", kh);
			request.getRequestDispatcher("list.jsp").forward(request, response);
		}
	}

}
