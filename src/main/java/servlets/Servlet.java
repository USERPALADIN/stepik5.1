package servlets;

import accountServer.AccountServer;
import accountServer.AccountServerI;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Servlet  extends HttpServlet {
    public static final  String PAGE_URL = "/admin";
    AccountServerI accountServer;

    public Servlet(AccountServerI accountServer) {
        this.accountServer = accountServer;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        accountServer.addNewUser();
         resp.getWriter().println(accountServer.getUsersLimit());
    }
}
