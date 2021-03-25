package web;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import web.controllers.UserController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {
    private ConfigurableApplicationContext springContext;
    private UserController userController;

    @Override
    public void init() {
        springContext = new ClassPathXmlApplicationContext("spring/spring.xml");
        userController = springContext.getBean(UserController.class);
    }

    @Override
    public void destroy() {
        springContext.close();
        super.destroy();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //req.setAttribute("users", userController.);
        //req.getRequestDispatcher("/userForm.jsp").forward(request, response);
       // resp.sendRedirect("/index.jsp");
       PrintWriter printWriter = resp.getWriter();
       printWriter.write("Ну привет");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
