<%@ taglib prefix = "c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<c:set var="contexRoot" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>home</title>
</head>

<body>
      <h1>Expense Tracker</h1>
      <p>${message}</p>

      <a href="${contexRoot}/expense">Add Expense</a>


<c:forEach var="expense" items="${expense}">
    <div>

        <h3>${expense.expensename}</h3>
        <p>&#8377;${expense.amount}</p>
        <a href="${contexRoot}/expense/${expense.id}">Edit</a>
    </div>
</c:forEach>

</body>

</html>