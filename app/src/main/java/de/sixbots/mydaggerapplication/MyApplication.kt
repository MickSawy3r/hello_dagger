package de.sixbots.mydaggerapplication

import android.app.Application
import de.sixbots.mydaggerapplication.di.AppComponent
import de.sixbots.mydaggerapplication.di.DaggerAppComponent

open class MyApplication : Application() {
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent
            .factory()
            .create(applicationContext)
    }
}