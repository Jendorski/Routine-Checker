package com.elifox.legocatalog.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/elifox/legocatalog/di/AppModule;", "", "()V", "provideCoroutineScopeIO", "Lkotlinx/coroutines/CoroutineScope;", "provideDb", "Lcom/kudi/test/routinechecks/data/database/RoutineCheckDatabase;", "app", "Landroid/app/Application;", "provideRoutineDao", "Lcom/kudi/test/routinechecks/data/dao/RoutineDao;", "db", "app_debug"})
@dagger.Module(includes = {com.elifox.legocatalog.di.ViewModelModule.class, com.elifox.legocatalog.di.CoreDataModule.class})
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.kudi.test.routinechecks.data.database.RoutineCheckDatabase provideDb(@org.jetbrains.annotations.NotNull()
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.kudi.test.routinechecks.data.dao.RoutineDao provideRoutineDao(@org.jetbrains.annotations.NotNull()
    com.kudi.test.routinechecks.data.database.RoutineCheckDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @CoroutineScropeIO()
    @dagger.Provides()
    public final kotlinx.coroutines.CoroutineScope provideCoroutineScopeIO() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}