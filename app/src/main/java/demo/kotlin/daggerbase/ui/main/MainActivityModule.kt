package demo.kotlin.daggerbase.ui.main

import dagger.Module
import dagger.Provides
import demo.kotlin.daggerbase.domain.Hello

/**
 * Created by Al Warren on 7/21/2018.
 */

@Module
class MainActivityModule {
    @Provides
    internal fun provideHello(): Hello = Hello("Hello Dagger!")
}