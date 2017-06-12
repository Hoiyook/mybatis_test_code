<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
  用户登记<br/>
  <form action="${pageContext.request.contextPath}/register.mvc" method="post">

       学生名:<input name="sname" type="text"><br/>
       性别:<input name="sex" type="text"><br/>
       年龄:<input name="age" type="text"><br/>
       生日:<input name="birthday" type="text"><br/>
    <input type="submit" value="登记">
  </form>
  

  
<a href="${pageContext.request.contextPath }/excel.mvc">导出学生数据 </a>

</body>
</html>