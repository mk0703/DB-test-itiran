package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class sample1_servlet
 */
@WebServlet("/sample1_servlet")
public class sample1_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public sample1_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sql = "SELECT * FROM bihin";

		Connection con = null;
		Statement smt = null;

		try {
			con = DBManager.getConnection();
			smt = con.createStatement();
			ResultSet rs = smt.executeQuery(sql);

			List<sample1_beans> list = new ArrayList<sample1_beans>();

			while(rs.next()) {
				sample1_beans beans = new sample1_beans();
				beans.setId(rs.getInt("ID"));
				beans.setName(rs.getString("NAME"));
				beans.setStatus(rs.getInt("STATUS"));

				list.add(beans);
			}

			request.setAttribute("list", list);

		}

		catch(SQLException e) {
			throw new ServletException(e);
		}

		finally {
			if(smt != null) {
				try {
					smt.close();
				}
				catch (SQLException ignore){}
			}

			if(con != null) {
				try {
					con.close();
				}
				catch (SQLException ignore) {}
			}
		}

		request.getRequestDispatcher("sample1_jsp.jsp").forward(request,response);
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
