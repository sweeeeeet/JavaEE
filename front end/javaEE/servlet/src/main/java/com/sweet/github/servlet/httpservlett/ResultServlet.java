package com.sweet.github.servlet.httpservlett;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Author:sweet
 * Created:2019/5/19
 */
@WebServlet("/resultServlet")
public class ResultServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer =  resp.getWriter();

        // 1,获取请求参数
        String result_username = (String) req.getSession().getAttribute("key_username");
        String result_password = (String) req.getSession().getAttribute("key_password");
        writer.append("<html>")
                .append("<head><title></title></head>")
                .append("<body>")
                .append("<table border='1' width='50'>")
                .append("<tr>")
                .append("<td>username</td>")
                .append("<td>'"+result_username+"'</td>")
                .append("</tr>")
                .append("<td>password</td>")
                .append("<td>'"+result_password+"'</td>")
                .append("<tr>")
                .append("</tr>")
                .append("</table>")
                .append("</body>")
                .append("</html>");


    }
}

