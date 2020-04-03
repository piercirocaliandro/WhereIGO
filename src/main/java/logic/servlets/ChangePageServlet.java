package logic.servlets;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ChangePageServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void forwardPage(RequestDispatcher disp, HttpServletRequest req, HttpServletResponse resp) {
		try {
			disp.forward(req, resp);
		}catch(ServletException e) {
			Logger.getLogger("WIG").log(Level.SEVERE, "ServletException on login");
		} catch (IOException e) {
			Logger.getLogger("WIG").log(Level.SEVERE, "IOException on login");
		}
	}
}
