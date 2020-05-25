<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
    <title>  Login Page</title>
</head>

<body>

<form:form action="loginPage" method="POST" modelAttribute="userDetails">

     name: <form:input path="userName" />

    <br><br>

     dob: <form:input path="userDob" />

    <br><br>

    <input type="submit" />

</form:form>


</body>

</html>












