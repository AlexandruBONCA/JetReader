package com.allmycode.jetreader

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.allmycode.jetreader.navigation.ReaderNavigation
import com.allmycode.jetreader.ui.theme.JetReaderTheme
import com.google.firebase.firestore.FirebaseFirestore
import dagger.hilt.android.AndroidEntryPoint
import java.io.Reader

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetReaderTheme {
//                val db = FirebaseFirestore.getInstance()
//                val user: MutableMap<String, Any> = HashMap()
//                user["firstname"] = "Ion"
//                user["lastname"] = "Popescu"


//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    db.collection("users")
//                        .add(user)
//                        .addOnSuccessListener {
//                            Log.d("FB", "onCreate: ${it.id}")
//                        }
//                        .addOnFailureListener {
//                            Log.d("FB", "onFailure: $it")
//                        }
                    ReaderApp()
            }
        }
    }
}


@Composable
fun ReaderApp() {
    Surface(modifier = Modifier.fillMaxSize()) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            ReaderNavigation()
        }
    }
}