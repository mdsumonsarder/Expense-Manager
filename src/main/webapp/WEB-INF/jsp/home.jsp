<%@ taglib prefix = "c"  uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>home</title>
</head>

<body>
      <h1>Expense Tracker</h1>
      <p>${message}</p>

<c:forEach var="expenses" items="${expenses}">

    <div>
        <h3>${expenses.expensename}</h3>
        <p>${expenses.amount}</p>
    </div>

</c:forEach>

</body>

</html>