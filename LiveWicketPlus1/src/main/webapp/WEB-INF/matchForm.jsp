<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add New Match</title>
</head>
<body>

<h2>Add New Match</h2>
<form action="MatchServlet" method="post">
    <label for="teamA">Team A:</label><br>
    <input type="text" id="teamA" name="teamA" required><br><br>
    <label for="teamB">Team B:</label><br>
    <input type="text" id="teamB" name="teamB" required><br><br>
    <label for="scoreTeamA">Score Team A:</label><br>
    <input type="number" id="scoreTeamA" name="scoreTeamA" required><br><br>
    <label for="scoreTeamB">Score Team B:</label><br>
    <input type="number" id="scoreTeamB" name="scoreTeamB" required><br><br>
    <input type="submit" value="Add Match">
</form>

</body>
</html>
