<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Operações Matemáticas</title>
</head>
<body>
    <h2>Insira Dois Números</h2>
    <form action="CalculadoraServlet" method="post">
        <label for="numero1">Número 1:</label>
        <input type="number" name="numero1" id="numero1" required><br><br>

        <label for="numero2">Número 2:</label>
        <input type="number" name="numero2" id="numero2" required><br><br>

        <input type="submit" value="Calcular">
    </form>
</body>
</html>
