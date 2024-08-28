<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Player List</title>
</head>
<body>

<h1>Player List</h1>
<table border="1">
    <thead>
        <tr>
            <th>Player ID</th>
            <th>Name</th>
            <th>Age</th>
            <th>Nationality</th>
            <th>Team</th>
            <th>Role</th>
            <th>Batting Style</th>
            <th>Bowling Style</th>
            <th>Current Match Status</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="player" items="${players}">
            <tr>
                <td>${player.playerDetailsId}</td>
                <td>${player.name}</td>
                <td>${player.age}</td>
                <td>${player.nationality}</td>
                <td>${player.team}</td>
                <td>${player.role}</td>
                <td>${player.battingStyle}</td>
                <td>${player.bowlingStyle}</td>
                <td>${player.currentMatchStatus}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="index.jsp">Back to Index</a>

</body>
</html>
