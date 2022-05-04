<?php

//conection to db
$conn = new mysqli("localhost", "root", "", "baseapps");
  
if ($conn->connect_error) {
  echo $conn->connect_error;
  echo 'ERROR: Unable to connect: .<br>';  
} 
else{
  echo 'Connected to the database.<br>';
}


//Usuario desde kotlin
$passwordToUse ='Apps24';
$UserToUse ='Juanxito123';
//'Contrasena99' para juanxito
//'Pizza78' para Pepito23
//'Apps24' para David45


//base de datos seleccionar al usuario que se llame $UserToUse y comparar su contrasena 
 

//Hashear la contrasena para compararla con la que obtuve de la base de datos

$myObj->User = $UserToUse;
$hashed_password = password_hash($passwordToUse, PASSWORD_DEFAULT);
$myObj->Password = $hashed_password;

$dbpwd = $hashed_password;
$myJSON = json_encode($myObj);

//check hashed
echo $dbpwd . '<br>';

if(password_verify(trim($passwordToUse), $dbpwd))
{
    echo 'Bien puto<br>';
    echo 'Aqui hariamos el select de los datos del usuario <br>';
}
else
{
    echo 'Mal puto<br> ';
    echo 'Aqui le ponemos que mal password o username<br> ';
}


echo $myJSON;


/*
$result = $conn->query("SELECT name FROM employee");

echo "Number of rows: $result->num_rows";

$result->close();

$conn->close();
*/
//conection to db
exit();

?>