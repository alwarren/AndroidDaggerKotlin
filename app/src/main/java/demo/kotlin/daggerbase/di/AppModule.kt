package demo.kotlin.daggerbase.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by Al Warren on 7/21/2018.
 */

@Module
class AppModule {
    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context {
        return application
    }
}