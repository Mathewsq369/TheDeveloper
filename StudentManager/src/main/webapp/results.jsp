<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Results Management - Chinese Language Course</title>
    <link rel="icon" href="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" type="image/png">
    <link rel="stylesheet" type="text/css" href="results.css">
</head>
<body>
    <div class="sidebar">
        <div>
            <div class="logo">
                <img src="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" alt="Logo">
                <h2>Course Manager</h2>
            </div>
            <a href="home.jsp" class="nav-item"><i class="fas fa-tachometer-alt"></i> Home</a>
            <a href="attendance.jsp" class="nav-item"><i class="fas fa-calendar-check"></i> Attendance Management</a>
            <a href="#" class="nav-item active"><i class="fas fa-chart-bar"></i> Results Management</a>
        </div>
        <div class="settings">
            <a href="settings.jsp" class="nav-item"><i class="fas fa-cog"></i> Settings</a>
        </div>
    </div>
    <div class="content">
        <h1>Results Management</h1>
        <div class="card">
            <h3>Add  student Results</h3>
            <p> <b>Enter and update exam scores for students</B>.</p>
            <form  class="card" action="addresults" method="post">
 <label for=" student id">Student ID: </label> 
 <input type="text" name="id"  placeholder=" Enter StudentID"required><br> </br>
 <label for="student name" >Student name: </label>
 <input type="Text" name="name"  placeholder="Enter name"required><br></Br>                 
 <label for="student score">score: </label>
 <input type="number" name="score" placeholder="Enter score"> <br></br>
 <input type="submit">
  </form>
   <%
     String message = (String) request.getAttribute("message"); 
            if(message!=null)
            {
            %>
            <p> <%=message%></p>
            <%
            }
    %>
        </div>
            <div class="card">
            <h3>Results Overview</h3>
            <p>View student performance and generate reports.</p>
        </div>
    </div>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</body>
</html>

