<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>

<sf:form commandName="book">

    <sf:errors path="*">
    </sf:errors>
    <br/><br/>

    <sf:label path="title">Title</sf:label> <sf:input path="title"/><br/>
    <sf:label path="author">Author</sf:label> <sf:input path="author"/><br/>

    <input type="submit" />

</sf:form>