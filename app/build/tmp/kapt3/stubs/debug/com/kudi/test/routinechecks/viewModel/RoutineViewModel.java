package com.kudi.test.routinechecks.viewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.kudi.test.routinechecks.dagger.di.CoroutineScropeIO;
import com.kudi.test.routinechecks.data.model.Routine;
import com.kudi.test.routinechecks.data.repository.RoutineRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001c\u001a\u00020\u001aH\u0014J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u001dR\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011\u00a8\u0006\u001e"}, d2 = {"Lcom/kudi/test/routinechecks/viewModel/RoutineViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/kudi/test/routinechecks/data/repository/RoutineRepository;", "ioCoroutineScropeIO", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/kudi/test/routinechecks/data/repository/RoutineRepository;Lkotlinx/coroutines/CoroutineScope;)V", "disposableObserver", "Lio/reactivex/observers/DisposableObserver;", "", "Lcom/kudi/test/routinechecks/data/model/Routine;", "routineError", "Landroidx/lifecycle/MutableLiveData;", "", "getRoutineError", "()Landroidx/lifecycle/MutableLiveData;", "setRoutineError", "(Landroidx/lifecycle/MutableLiveData;)V", "routineLoader", "", "getRoutineLoader", "setRoutineLoader", "routineResult", "getRoutineResult", "setRoutineResult", "disposeElements", "", "loadRoutine", "onCleared", "Landroidx/lifecycle/LiveData;", "app_debug"})
public final class RoutineViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<com.kudi.test.routinechecks.data.model.Routine>> routineResult;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> routineError;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> routineLoader;
    private io.reactivex.observers.DisposableObserver<java.util.List<com.kudi.test.routinechecks.data.model.Routine>> disposableObserver;
    private final com.kudi.test.routinechecks.data.repository.RoutineRepository repository = null;
    private final kotlinx.coroutines.CoroutineScope ioCoroutineScropeIO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kudi.test.routinechecks.data.model.Routine>> getRoutineResult() {
        return null;
    }
    
    public final void setRoutineResult(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.kudi.test.routinechecks.data.model.Routine>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getRoutineError() {
        return null;
    }
    
    public final void setRoutineError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getRoutineLoader() {
        return null;
    }
    
    public final void setRoutineLoader(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.kudi.test.routinechecks.data.model.Routine>> routineResult() {
        return null;
    }
    
    public final void loadRoutine() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void disposeElements() {
    }
    
    @javax.inject.Inject()
    public RoutineViewModel(@org.jetbrains.annotations.NotNull()
    com.kudi.test.routinechecks.data.repository.RoutineRepository repository, @org.jetbrains.annotations.NotNull()
    @com.kudi.test.routinechecks.dagger.di.CoroutineScropeIO()
    kotlinx.coroutines.CoroutineScope ioCoroutineScropeIO) {
        super();
    }
}