package io.antinolabs.library.chitchat.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import io.antinolabs.library.chitchat.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginButtonClicked(view: View) {

    }

    fun registerBtnClicked(view: View) {
        val intent = Intent(this,
            CreateUserActivity::class.java)
        startActivity(intent)
    }
}
