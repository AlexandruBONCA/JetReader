package com.allmycode.jetreader.screens.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class LoginScreenViewModel: ViewModel() {
    private val _loadingState = MutableStateFlow(LoadingState.IDLE)
    private val auth: FirebaseAuth = Firebase.auth
//    private val _loading = MutableLiveData(false)
//    val loading: LiveData<Boolean>
    val loadingState = _loadingState.asStateFlow()

    fun createUserWithEmailAndPassword(email: String, password: String) {

    }

    fun signInWithEmailAndPassword(email: String, password: String, home: () -> Unit)
       = viewModelScope.launch {
           try {
               auth.signInWithEmailAndPassword(email, password)
                   .addOnCompleteListener { task ->
                       if (task.isSuccessful) {
                           Log.d("FB", "signInWithEmailAndPassword: log in successful! ${task.result.toString()}")
                           home()
                       } else {
                           Log.d("FB", "signInWithEmailAndPassword: ${task.result.toString()}")

                       }

                   }
           } catch (e: Exception) {
               Log.d("FB", "signInWithEmailAndPassword $e")
           }
       }
}
