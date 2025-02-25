<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard - Chinese Language Course</title>
    <link rel="icon" href="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" type="image/png">
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f6f9;
            display: flex;
            height: 100vh;
            margin: 0;
        }
        .sidebar {
            width: 250px;
            background-color: #007bff;
            color: white;
            padding: 20px;
            box-sizing: border-box;
            display: flex;
            flex-direction: column;
            justify-content: space-between;
            position: fixed;
            top: 0;
            bottom: 0;
            left: 0;
        }
        .main-content {
            margin-left: 250px;
            flex: 1;
            display: flex;
            flex-direction: column;
        }
        .logo {
            display: flex;
            align-items: center;
            margin-bottom: 20px;
        }
        .logo img {
            width: 40px;
            height: 40px;
            margin-right: 10px;
        }
        .logo h2 {
            margin: 0;
            font-size: 20px;
        }
        .nav-item {
            display: flex;
            align-items: center;
            color: white;
            text-decoration: none;
            padding: 10px 0;
            margin: 10px 0;
            border-bottom: 1px solid rgba(255, 255, 255, 0.2);
        }
        .nav-item i {
            margin-right: 10px;
            font-size: 18px;
        }
        .nav-item.active {
            background-color: #0056b3;
            font-weight: bold;
        }
        .nav-item:hover {
            background-color: #004494;
        }
        .topbar {
            display: flex;
            justify-content: flex-end;
            align-items: center;
            padding: 10px 20px;
            background: white;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .profile-pic {
            width: 40px;
            height: 40px;
            border-radius: 50%;
            overflow: hidden;
        }
        .profile-pic img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }
        .content {
            flex: 1;
            padding: 20px;
        }
        .card {
            background: white;
            padding: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
            margin-bottom: 20px;
        }
        .timetable {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        .timetable th, .timetable td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: left;
        }
        .timetable th {
            background-color: #007bff;
            color: white;
        }
    </style>
</head>
<body>
    <div class="sidebar">
        <div>
            <div class="logo">
                <img src="https://cdn-icons-png.flaticon.com/512/2921/2921222.png" alt="Logo">
                <h2>Course Manager</h2>
            </div>
            <a href="#" class="nav-item active"><i class="fas fa-tachometer-alt"></i> Dashboard</a>
            <a href="attendance.jsp" class="nav-item"><i class="fas fa-calendar-check"></i> Attendance Management</a>
            <a href="results.jsp" class="nav-item"><i class="fas fa-chart-bar"></i> Results Management</a>
            <a href="settings.jsp" class="nav-item"><i class="fas fa-cog"></i> Settings</a>
        </div>
    </div>
    <div class="main-content">
        <div class="topbar">
            <div class="profile-pic">
                <img src="https://cdn-icons-png.flaticon.com/512/847/847969.png" alt="User Profile">
            </div>
        </div>
        <div class="content">
            <h1>Dashboard</h1>
            <div class="card">
                <h3>Today's Class Timetable</h3>
                <table class="timetable">
                    <thead>
                        <tr>
                            <th>Time</th>
                            <th>Class</th>
                            <th>Venue</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>08:00 AM - 09:30 AM</td>
                            <td>Chinese Grammar 101</td>
                            <td>Room A1</td>
                        </tr>
                        <tr>
                            <td>10:00 AM - 11:30 AM</td>
                            <td>Pronunciation Practice</td>
                            <td>Room B2</td>
                        </tr>
                        <tr>
                            <td>01:00 PM - 02:30 PM</td>
                            <td>Listening and Speaking</td>
                            <td>Room C3</td>
                        </tr>
                        <tr>
                            <td>03:00 PM - 04:30 PM</td>
                            <td>Chinese Culture and History</td>
                            <td>Room D4</td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="card">
                <h3>Upcoming Events</h3>
                <p>No events scheduled for today.</p>
            </div>
            <div class="card">
                <h3>Notifications</h3>
                <ul>
                    <li>New student enrolled in Chinese Grammar 101.</li>
                    <li>Classroom B2 maintenance scheduled for tomorrow.</li>
                    <li>Reminder: Submit monthly attendance report.</li>
                </ul>
            </div>
        </div>
    </div>
    <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
</body>
</html>

