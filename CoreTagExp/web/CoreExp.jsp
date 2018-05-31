<%-- 
    Document   : CoreExp
    Created on : 20 May, 2018, 2:11:11 PM
    Author     : student
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-color: gray;
            }
        </style>
    </head>
    <body>
        <h1>
            <%--            <c:out value="${4*5}"/>
                        <c:import 
                            url="http://www.truenorthguitars.com/Clients/Richman/index.htm" />
                         
            <c:out value="${a}"/>
            <c:remove var="a"/>
            <c:out value="${a}"/>
                        
            --%>
            <c:set var="a" value="${param.age}" scope="application"/>
            <c:out value="${a}"/>

<%--            <c:if test="${a>=18}">
                <h1>You Can Vote!!
            </c:if>
--%>
<c:choose>
    <c:when test="${a>0 && a<35}">
        <c:out value="Fail"/>
    </c:when>
    <c:when test="${a>35 && a<50}">
        <c:out value="Pass Class"/>
    </c:when>
    <c:when test="${a>=50 && a< 60}">
        <c:out value="Second Class"/>
    </c:when>
    <c:when test="${a>=60 && a<75}">
        <c:out value="First Class"/>
    </c:when>
    <c:when test="${a>=75 && a<=100}">
        <c:out value="Distingtion Class"/>
    </c:when>
    <c:otherwise>
        <c:out value="Invalid Input"/>
    </c:otherwise>
</c:choose>
        </h1>
    </body>
</html>
