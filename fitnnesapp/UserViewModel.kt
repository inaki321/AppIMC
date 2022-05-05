package mx.edu.up.fitnnesapp


import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.ResponseBody
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.*
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import java.util.stream.DoubleStream.builder

val retrofit: Retrofit = Retrofit.Builder().baseUrl("http://192.168.1.199:80")
    .addConverterFactory(GsonConverterFactory.create())
    .build()
class UserDataCollectionItem(val User: String, val Password: String)


val service= retrofit.create<UserService>(UserService::class.java)

fun fetchA() {
    service.listUsers().enqueue(object: Callback<List<UserDataCollectionItem>> {
        override fun onResponse(
            call: Call<List<UserDataCollectionItem>>?,
            response: Response<List<UserDataCollectionItem>>?
        ) {
            val us = response?.body()
            Log.i("fitnnesapp", Gson().toJson(us))
        }

        override fun onFailure(call: Call<List<UserDataCollectionItem>>?, t: Throwable?) {
            t?.printStackTrace()
        }
    })
}




class UserViewModel:ViewModel() {




    var userReg by mutableStateOf("")
    var pwd by mutableStateOf("")
    var nameReg by mutableStateOf("")
    var apellidoReg by mutableStateOf("")
    var edadReg by mutableStateOf("")
    var generoReg by mutableStateOf("")
    var pesoReg by mutableStateOf("")
    var estatura by mutableStateOf("")
    var pesoD by mutableStateOf("")
    var ejercita by mutableStateOf(false)
    var klCalorias by mutableStateOf(0)


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
    fun setPeso(newPeso:String){
        pesoReg = newPeso
    }
    fun setAltura(newAltura:String){
        estatura = newAltura
    }
    fun setEjericio(newEjercicio:Boolean){
        ejercita = newEjercicio
    }
    fun setpesoD(newPesoD:String){
        pesoD = newPesoD
    }
    fun setCalorias(newCaloria:Int){
        klCalorias += newCaloria
    }
    fun resetCalorias(reset:Int){
        klCalorias = 0
    }
}