<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Player Details</title>
</head>
<body>

<h1>Player Details</h1>
<c:if test="${not empty player}">
    <p>Name: ${player.name}</p>
    <p>Age: ${player.age}</p>
    <p>Nationality: ${player.nationality}</p>
    <p>Team: ${player.team}</p>
    <p>Role: ${player.role}</p>
    <p>Batting Style: ${player.battingStyle}</p>
    <p>Bowling Style: ${player.bowlingStyle}</p>
    <p>Current Match Status: ${player.currentMatchStatus}</p>
</c:if>
<a href="playerList.jsp">Back to Player List</a>

</body>
</html>
