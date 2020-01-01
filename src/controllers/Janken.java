package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Janken
 */
@WebServlet("/Janken")
public class Janken extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Janken() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/GameStart.jsp");
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer[] cpuhands = { 0, 1, 2 };
        int c = cpuhands[(int) (Math.random() * 3)];
        //request.setAttribute("c", c);

        switch (c) {
        case 2:
            request.setAttribute("c", "パー");
            break;
        case 1:
            request.setAttribute("c", "チョキ");
            break;
        case 0:
            request.setAttribute("c", "グー");
            break;

        }

        //CPUHand cpuHands = new CPUHand();
        //cpuHands.setCpuhand(Integer.parseInt("cpuhand"));
        //request.setAttribute("cpuHands", cpuHands);

        Integer h = Integer.parseInt(request.getParameter("hand"));
        //request.setAttribute("h", h);
        switch (h) {
        case 2:
            request.setAttribute("h", "パー");
            break;
        case 1:
            request.setAttribute("h", "チョキ");
            break;
        case 0:
            request.setAttribute("h", "グー");
            break;

        }

        Integer resultNumber = ((h - c) + 3) % 3;
        switch (resultNumber) {
        case 2:
            request.setAttribute("result", "あなたの勝ちです！");
            break;
        case 1:
            request.setAttribute("result", "あなたの負けです…");
            break;
        case 0:
            request.setAttribute("result", "あいこです…!!");
            break;

        }

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/GameResult.jsp");
        rd.forward(request, response);
    }

}
