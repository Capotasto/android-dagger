package com.example.android.dagger.splash

import android.content.Intent
import com.example.android.dagger.R
import com.example.android.dagger.login.LoginActivity
import com.example.android.dagger.registration.RegistrationActivity
import com.example.android.dagger.user.UserManager
import javax.inject.Inject

class SplashViewModel @Inject constructor(
    private val userManager: UserManager
) {

    fun handleShowScreen() {

    }

}
