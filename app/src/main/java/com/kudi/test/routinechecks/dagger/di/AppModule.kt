package com.kudi.test.routinechecks.dagger.di

import android.app.Application
import com.kudi.test.routinechecks.data.database.RoutineCheckDatabase
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

@Module(includes = [ViewModelModule::class, CoreDataModule::class])
class AppModule {

    @Singleton
    @Provides
    fun provideDb(app: Application) = RoutineCheckDatabase.getInstance(app)

    @Singleton
    @Provides
    fun provideRoutineDao(db: RoutineCheckDatabase) = db.routineDao()

    @CoroutineScropeIO
    @Provides
    fun provideCoroutineScopeIO() = CoroutineScope(Dispatchers.IO)

}
