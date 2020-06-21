<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Cab Booking List</title>
 <link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
 <script src="../webjars/jquery/3.0.0/js/jquery.min.js" ></script>
</head>
<body>
 <div class="container">
  <h2>Cab Booking List</h2>
  <table class="table table-striped">
   <thead>
    <tr>
     <th scope="row">Booking Id</th>
     <th scope="row">Name</th>
     <th scope="row">From Location</th>
     <th scope="row">To Location</th>
     <th scope="row">Mobile Number</th>
     <th scope="row">Date</th>
     <th scope="row">Optional Message</th>
    </tr>
   </thead>
   <tbody>
    <c:forEach items="${cabBookingList}" var="bookingList" >
     <tr>
      <td>${bookingList.bookingId}</td>
      <td>${bookingList.name}</td>
      <td>${bookingList.from}</td>
      <td>${bookingList.to}</td>
      <td>${bookingList.mobile}</td>
      <td>${bookingList.date}</td>
      <td>${bookingList.optionalMessage}</td>
      <td>
       <spring:url value="/bookCab/update/${bookingList.bookingId}" var="updateURL" />
       <a class="btn btn-primary" href="${updateURL}" role="button">Update</a>
      </td>
      <td>
       <spring:url value="/bookCab/delete/${bookingList.bookingId }" var="deleteURL" />
       <a class="btn btn-primary" href="${deleteURL}" role="button">Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
  <spring:url value="/bookCab/add" var="addURL" />
  <a class="btn btn-primary" href="${addURL}" role="button">New Booking</a>
 </div>
</body>
</html>