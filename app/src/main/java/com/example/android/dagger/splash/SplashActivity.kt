package com.example.android.dagger.splash

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android.dagger.MyApplication
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.main.MainActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class SplashActivity: AppCompatActivity() {

    @Inject
    lateinit var splashViewModel: SplashViewModel

    lateinit var userManager: UserManager

    override fun onCreate(savedInstanceState: Bundle?) {
        (application as MyApplication).appComponent.inject(this)
        userManager = (application as MyApplication).appComponent.userManager()
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        handleShowScreen()
    }


    private fun handleShowScreen() {
        if (!userManager.isUserLoggedIn()) {
            if (!userManager.isUserRegistered()) {
                startActivity(Intent(this, RegistrationActivity::class.java))
                finish()
            } else {
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        } else {
           startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
