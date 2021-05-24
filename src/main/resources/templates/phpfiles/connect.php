<?php

// php code to Insert data into mysql database from input text
if(isset($_POST['submit']))
{
    $hostname = "mysql8021.c6gbh3idan6b.us-east-2.rds.amazonaws.com";
    $username = "admin";
    $password = "mysqlpass";
    $databaseName = "MySQL8_0_21";

    // Henter data fra 'formen'.

    $project_name = $_POST['project_name'];
    $project_description = $_POST['project_description'];
    $project_numberof_tasks = $_POST['number_of_project_tasks'];

    // connect til Mysql.

    $connect = mysqli_connect($hostname, $username, $password, $databaseName);

    // Mysql Query.

    $query = "INSERT INTO `project`(`project_name`, `project_number_of_tasks`, `project_description`) VALUES ('$project_name','$project_description','$project_numberof_tasks')";

    $result = mysqli_query($connect,$query);

    // check if mysql query successful

    if($result)
    {
        echo 'Query Lykkedes..';
    }

    else{
        echo 'Query Lykkedes IKKE!';
    }

    mysqli_free_result($result);
    mysqli_close($connect);
}

?>
<!--
<!DOCTYPE html>

<html>

<head>

    <title> PHP INSERT DATA </title>

    <meta charset="UTF-8">

    <meta name="viewport" content="width=device-width, initial-scale=1.0">

</head>

<body>
<form action="connect.php" method="post">

    <input type="text" name="fname" required placeholder="First Name"><br><br>

    <input type="text" name="lname" required placeholder="Last Name"><br><br>

    <input type="number" name="age" required placeholder="Age" min="10" max="100"><br><br>

    <input type="submit" name="insert" value="Add Data To Database">

</form>

</body>

</html>