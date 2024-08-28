<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Match Details</title>
</head>
<body>

<h1>Match Details</h1>
<c:if test="${not empty match}">
    <p>Match ID: ${match.matchId}</p>
    <p>Team A: ${match.teamA}</p>
    <p>Team B: ${match.teamB}</p>
    <p>Score Team A: ${match.scoreTeamA}</p>
    <p>Score Team B: ${match.scoreTeamB}</p>
</c:if>
<c:if test="${empty match}">
    <p>No match found with the provided ID.</p>
</c:if>

<a href="index.jsp">Back to Index</a>

</body>
</html>
