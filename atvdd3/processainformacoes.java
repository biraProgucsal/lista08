import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/ProcessaInformacoes")
public class ProcessaInformacoes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try {
            String nome = request.getParameter("nome");
            String estadoCivil = request.getParameter("estadoCivil");
            String faixaEtaria = request.getParameter("faixaEtaria");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Resultado do Formulário</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Informações Recebidas:</h1>");
            out.println("<p>Nome: " + nome + "</p>");
            out.println("<p>Estado Civil: " + estadoCivil + "</p>");
            out.println("<p>Faixa Etária: " + faixaEtaria + "</p>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
