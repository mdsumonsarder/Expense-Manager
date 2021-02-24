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


<c:forEach var="expenses" items="${expenses}">
    <div>
        <h3>${expenses.expensename}</h3>
        <p>&#8377;${expenses.amount}</p>

    </div>
</c:forEach>

</body>

</html>