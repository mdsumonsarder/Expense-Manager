<!DOCTYPE html>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Expense</title>
</head>
<body>

<form:form action="/expense" method="post" modelAttribute="expense">

   <form:input path="expensename" placeholder="Enter Expense Name"/>
    <form:input path="amount" placeholder="Enter Expense Amount"/>
    <form:input path="note" placeholder="Enter Expense Note (Optional)"/>

    <button type="submit">Add Expense</button>

</form:form>


</body>
</html>