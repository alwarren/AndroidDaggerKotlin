package demo.kotlin.daggerbase.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import demo.kotlin.daggerbase.ui.main.MainActivity
import demo.kotlin.daggerbase.ui.main.MainActivityModule

/**
 * Created by Al Warren on 7/21/2018.
 */

@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    internal abstract fun bindMainActivity2(): MainActivity
}