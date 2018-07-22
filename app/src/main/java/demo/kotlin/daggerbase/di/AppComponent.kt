package demo.kotlin.daggerbase.di

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import demo.kotlin.daggerbase.App

/**
 * Created by Al Warren on 7/21/2018.
 */

@Component(modules = [(AndroidSupportInjectionModule::class), (AppModule::class), (ActivityBuilder::class)])
interface AppComponent : AndroidInjector<App> {
    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}