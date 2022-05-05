<?php



//Usuario desde kotlin
$passwordToUse ='Apps24';
$UserToUse ='Juanxito123';
//'Contrasena99' para juanxito
//'Pizza78' para Pepito23
//'Apps24' para David45


//base de datos seleccionar al usuario que se llame $UserToUse y comparar su contrasena 

//Hashear la contrasena para compararla con la que obtuve de la base de datos
$myObj = new stdClass();


$myObj->User = $UserToUse;
$hashed_password = password_hash($passwordToUse, PASSWORD_DEFAULT);
$myObj->Password = $hashed_password;
$cars = array( $myObj, $myObj);


//header("Content-Type: application/json");
$myJSON = json_encode($cars);

echo $myJSON;


exit();

?>
