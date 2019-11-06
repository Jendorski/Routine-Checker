package com.kudi.test.routinechecks.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0019\u001a\u00020\u0014H\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001a"}, d2 = {"Lcom/kudi/test/routinechecks/viewModel/RoutineViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/kudi/test/routinechecks/data/repository/RoutineRepository;", "ioCoroutineScropeIO", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/kudi/test/routinechecks/data/repository/RoutineRepository;Lkotlinx/coroutines/CoroutineScope;)V", "connectivityAvailable", "", "getConnectivityAvailable", "()Z", "setConnectivityAvailable", "(Z)V", "done", "getDone", "setDone", "missed", "getMissed", "setMissed", "routines", "", "getRoutines", "()Lkotlin/Unit;", "routines$delegate", "Lkotlin/Lazy;", "onCleared", "app_debug"})
public final class RoutineViewModel extends androidx.lifecycle.ViewModel {
    private boolean connectivityAvailable;
    private boolean missed;
    private boolean done;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy routines$delegate = null;
    private final com.kudi.test.routinechecks.data.repository.RoutineRepository repository = null;
    private final kotlinx.coroutines.CoroutineScope ioCoroutineScropeIO = null;
    
    public final boolean getConnectivityAvailable() {
        return false;
    }
    
    public final void setConnectivityAvailable(boolean p0) {
    }
    
    public final boolean getMissed() {
        return false;
    }
    
    public final void setMissed(boolean p0) {
    }
    
    public final boolean getDone() {
        return false;
    }
    
    public final void setDone(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Unit getRoutines() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public RoutineViewModel(@org.jetbrains.annotations.NotNull()
    com.kudi.test.routinechecks.data.repository.RoutineRepository repository, @org.jetbrains.annotations.NotNull()
    @com.elifox.legocatalog.di.CoroutineScropeIO()
    kotlinx.coroutines.CoroutineScope ioCoroutineScropeIO) {
        super();
    }
}