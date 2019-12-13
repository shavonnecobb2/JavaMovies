
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Star Wars Movies</title>
    <link rel="stylesheet" type="text/css" href="CSS/test.css" />
</head>
<body>
<div class="shae-container">
<div class="image"></div>
<h1>Star Wars: The Saga &hearts;</h1>
    <table class="center">
        <thead>
            <tr>
                <th>Film Title</th>
                <th>Film Release Date</th>
                <th>Film Director</th>
                <th>Film Producer</th>
                <th>Rotten Tomato Rating</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${movies}" var="movie">
                <tr>
                    <td>${movie.title}</td>
                    <td>${movie.releaseDate}</td>
                    <td>${movie.director}</td>
                    <td>${movie.producer}</td>
                    <td>${movie.tomatoRating}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>
</body>
</html>