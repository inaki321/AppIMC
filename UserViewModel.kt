package mx.edu.up.fitnnesapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UserViewModel:ViewModel() {
    var userReg by mutableStateOf("")
    var pwd by mutableStateOf("")
    var nameReg by mutableStateOf("")
    var apellidoReg by mutableStateOf("")
    var edadReg by mutableStateOf("")
    var generoReg by mutableStateOf("")



    fun setUser(newUser: String){
        userReg = newUser
    }

    fun setPassword(newPwd: String){
        pwd = newPwd
    }

    fun setNombre(newName:String){
        nameReg = newName
    }
    fun setApellido(newApellido:String){
        apellidoReg = newApellido
    }
    fun setEdad(newAge:String){
        edadReg = newAge
    }
    fun setGenero(newGen:String){
        generoReg = newGen
    }
}