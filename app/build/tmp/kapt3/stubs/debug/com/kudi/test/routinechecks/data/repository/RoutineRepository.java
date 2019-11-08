package com.kudi.test.routinechecks.data.repository;

import androidx.lifecycle.LiveData;
import com.kudi.test.routinechecks.data.dao.RoutineDao;
import com.kudi.test.routinechecks.data.model.Routine;
import io.reactivex.Observable;
import timber.log.Timber;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Repository to handle data operations
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000bJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/kudi/test/routinechecks/data/repository/RoutineRepository;", "", "dao", "Lcom/kudi/test/routinechecks/data/dao/RoutineDao;", "(Lcom/kudi/test/routinechecks/data/dao/RoutineDao;)V", "getARoutine", "Landroidx/lifecycle/LiveData;", "Lcom/kudi/test/routinechecks/data/model/Routine;", "title", "", "getRoutines", "Lio/reactivex/Observable;", "", "insertARoutine", "", "routine", "(Lcom/kudi/test/routinechecks/data/model/Routine;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
@javax.inject.Singleton()
public final class RoutineRepository {
    private final com.kudi.test.routinechecks.data.dao.RoutineDao dao = null;
    private static volatile com.kudi.test.routinechecks.data.repository.RoutineRepository instance;
    public static final com.kudi.test.routinechecks.data.repository.RoutineRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.kudi.test.routinechecks.data.model.Routine>> getRoutines() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.kudi.test.routinechecks.data.model.Routine> getARoutine(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertARoutine(@org.jetbrains.annotations.NotNull()
    com.kudi.test.routinechecks.data.model.Routine routine, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public RoutineRepository(@org.jetbrains.annotations.NotNull()
    com.kudi.test.routinechecks.data.dao.RoutineDao dao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/kudi/test/routinechecks/data/repository/RoutineRepository$Companion;", "", "()V", "instance", "Lcom/kudi/test/routinechecks/data/repository/RoutineRepository;", "getInstance", "dao", "Lcom/kudi/test/routinechecks/data/dao/RoutineDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kudi.test.routinechecks.data.repository.RoutineRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.kudi.test.routinechecks.data.dao.RoutineDao dao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}