package demo.kotlin.daggerbase

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import demo.kotlin.daggerbase.di.DaggerAppComponent

/**
 * Created by Al Warren on 7/21/2018.
 */

class App : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out App> {
        return DaggerAppComponent.builder().create(this)
    }
}