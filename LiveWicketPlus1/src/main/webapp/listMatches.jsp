<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Matches</title>
</head>
<body>

<h2>Existing Matches</h2>
<table border="1">
    <thead>
        <tr>
            <th>Match ID</th>
            <th>Team A</th>
            <th>Team B</th>
            <th>Score Team A</th>
            <th>Score Team B</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="match" items="${matches}">
            <tr>
                <td>${match.matchId}</td>
                <td>${match.teamA}</td>
                <td>${match.teamB}</td>
                <td>${match.scoreTeamA}</td>
                <td>${match.scoreTeamB}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="index.jsp">Back to Index</a>

</body>
</html>
