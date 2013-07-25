<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<a href="?form">New</a><br/>

<c:out value="${thanks}" />
<hr/>

<c:forEach items="${bookList}" var="book">
<li><c:out value="${book.title}" /> by <c:out value="${book.author}" /></li>
</c:forEach>