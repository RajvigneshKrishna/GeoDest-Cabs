<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %> 
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %> 
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Book Cab</title>
 <link href="../webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" />
 <script src="../webjars/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
 <script src="../webjars/jquery/3.0.0/js/jquery.min.js" ></script>
</head>
<body>
 <div class="container">
  <spring:url value="/bookCab/save" var="saveURL" />
  <h2>Book Cab</h2>
  <form:form modelAttribute="cabBookingForm" method="post" action="${saveURL}" cssClass="form">
   <form:hidden path="bookingId"/>
   <div class="form-group">
    <label for="name">Passenger Name</label>
    <form:input path="name" cssClass="form-control" id="name" />
   </div>
   <div class="form-group">
    <label for="from">From Location</label>
    <form:input path="from" cssClass="form-control" id="from" />
   </div>
   <div class="form-group">
    <label for="to">To Location</label>
    <form:input path="to" cssClass="form-control" id="to" />
   </div>
   <div class="form-group">
    <label for="mobile">Mobile Number</label>
    <form:input path="mobile" cssClass="form-control" id="mobile" />
   </div>
   <div class="form-group">
    <label for="date">Date</label>
    <form:input path="date" cssClass="form-control" id="date" />
   </div>
   <div class="form-group">
    <label for="optionalMessage">Optional Message</label>
    <form:input path="optionalMessage" cssClass="form-control" id="optionalMessage" />
   </div>
   <button type="submit" class="btn btn-primary">Book Now</button>
  </form:form>
 </div>
</body>
</html>