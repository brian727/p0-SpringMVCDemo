 <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <html>
 <head>
     <title>TO DO LIST</title>
 </head>
 <body>
     <div align="center">
        <table border="1" cellpadding="5">

            <caption><h2>TO DO LIST</h2></caption>
            <tr>
                <th>Title</th>
                <th>Deadline</th>
            </tr>
            <c:forEach var="item" items="${toDoData.items}">
                <tr>
                    <td><c:out value="${item.title}"/></td>
                    <td><c:out value="${item.deadline}"/></td>
                </tr>
            </c:forEach>
        </table>
     </div>
 </body>
 </html>