package com.example.android.dagger.di

import com.example.android.dagger.storage.FakeStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Component
import dagger.Module
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        TestStorageModule::class,
        AppSubComponents::class
    ]
)
interface TestAppComponent : AppComponent
