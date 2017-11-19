package p;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "maxim1")
public class HttpServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int unu, doi;
        unu = Integer.parseInt(request.getParameter("unu"));
        doi = Integer.parseInt(request.getParameter("doi"));
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML><HEAD><TITLE>Maxim</TITLE></HEAD>");
        out.println("<BODY><H3>Maxim{" + unu + "," + doi + ") = ");
        out.println(((unu > doi) ? unu : doi) + "</h3></BODY></HTML>");
        out.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int unu, doi;
        unu = Integer.parseInt(req.getParameter("unu"));
        doi = Integer.parseInt(req.getParameter("doi"));
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<HTML><HEAD><TITLE>Maxim</TITLE></HEAD>");
        out.println("<BODY><H3>Maxim{" + unu + "," + doi + ") = ");
        out.println(((unu > doi) ? unu : doi) + "</h3></BODY></HTML>");
        out.close();
    }
}
