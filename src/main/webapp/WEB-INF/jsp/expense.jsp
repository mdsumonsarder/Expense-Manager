<%@ taglib prefix = "c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>


<c:set var="contexRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
    <title>Add Expense</title>
</head>
<body>

<form:form action="${contexRoot}/expense" method="post" modelAttribute="expense">

   <form:input path="expensename" placeholder="Enter Expense Name"/>
    <form:input path="amount" placeholder="Enter Expense Amount"/>
    <form:input path="note" placeholder="Enter Expense Note (Optional)"/>

    <button type="submit">Add Expense</button>

</form:form>


</body>
</html>