<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style>
        label {
            display: inline-block;
            width: 100px;
        }

        .error {
            color: red;
        }
    </style>
</head>
<body>
<h1>Annotation driven Validators</h1>
<form:form modelAttribute="userDto">
    <div>
        <form:label path="login">Login: </form:label>
        <form:input path="login"/>
        <form:errors path="login" cssClass="error"/>
    </div>
    <div>
        <form:label path="password">Password: </form:label>
        <form:input path="password"/>
        <form:errors path="password" cssClass="error"/>
    </div>
    <div>
        <form:label path="age">Age: </form:label>
        <form:input path="age" type="number"/>
        <form:errors path="age" cssClass="error"/>
    </div>
    <div>
        <form:label path="email">Email: </form:label>
        <form:input path="email"/>
        <form:errors path="email" cssClass="error"/>
    </div>
    <div>
        <form:label path="phone">Phone: </form:label>
        <form:input path="phone" type="tel"/>
        <form:errors path="phone" cssClass="error"/>
    </div>
    <input type="submit">
</form:form>

<%--<ul>--%>
<%--    <li><a href="http://localhost:8080/h2console"></a></li>--%>
<%--</ul>--%>

</body>
</html>