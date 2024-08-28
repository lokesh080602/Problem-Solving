<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Match and Player Management</title>
</head>
<body>
    <h1>Match and Player Management System</h1>
    
    <h2>Manage Matches</h2>
    <ul>
        <li><a href="addMatch.jsp">Add New Match</a></li>
        <li><a href="listMatches.jsp">View All Matches</a></li>
    </ul>

    <h2>Manage Players</h2>
    <ul>
        <li><a href="addPlayer.jsp">Add New Player</a></li>
        <li><a href="listPlayers.jsp">View All Players</a></li>
    </ul>
    
    <!-- Links to pages that show individual match or player details -->
    <h2>View Details</h2>
    <form action="viewMatchDetails.jsp" method="get">
        <label for="matchId">Match ID:</label>
        <input type="text" id="matchId" name="matchId" required>
        <input type="submit" value="View Match Details">
    </form>

    <form action="viewPlayerDetails.jsp" method="get">
        <label for="playerId">Player ID:</label>
        <input type="text" id="playerId" name="playerId" required>
        <input type="submit" value="View Player Details">
    </form>
</body>
</html>
