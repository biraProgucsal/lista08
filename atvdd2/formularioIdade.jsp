<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calcular Idade</title>
</head>
<body>
    <h2>Informe seu Ano de Nascimento</h2>
    <form action="CalculaIdadeServlet" method="get">
        <label for="anoNascimento">Ano de Nascimento:</label>
        <input type="number" name="anoNascimento" id="anoNascimento" required><br><br>

        <label for="fezAniversario">Já fez aniversário este ano?</label>
        <select name="fezAniversario" id="fezAniversario">
            <option value="true">Sim</option>
            <option value="false">Não</option>
        </select><br><br>

        <input type="submit" value="Calcular Idade">
    </form>
</body>
</html>
