import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            int numero1 = Integer.parseInt(request.getParameter("numero1"));
            int numero2 = Integer.parseInt(request.getParameter("numero2"));
            
            int soma = numero1 + numero2;
            int subtracao = numero1 - numero2;
            int multiplicacao = numero1 * numero2;
            int divisao = numero1 / numero2;
            int resto = numero1 % numero2;

            out.println("<html><body>");
            out.println("<h2>Resultados das Operações</h2>");
            out.println("Número 1: " + numero1 + "<br>");
            out.println("Número 2: " + numero2 + "<br>");
            out.println("Soma: " + soma + "<br>");
            out.println("Subtração: " + subtracao + "<br>");
            out.println("Multiplicação: " + multiplicacao + "<br>");
            out.println("Divisão: " + divisao + "<br>");
            out.println("Resto da Divisão: " + resto + "<br>");
            out.println("</body></html>");
        } finally {
            out.close();
        }
    }
}
