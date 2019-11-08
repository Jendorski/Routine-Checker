package com.kudi.test.routinechecks.data.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.WorkManager;
import com.kudi.test.routinechecks.data.Converters;
import com.kudi.test.routinechecks.data.dao.RoutineDao;
import com.kudi.test.routinechecks.data.model.Routine;
import com.kudi.test.routinechecks.worker.SeedDatabaseWorker;

/**
 * The Room database for this app
 */
@androidx.room.TypeConverters(value = {com.kudi.test.routinechecks.data.Converters.class})
@androidx.room.Database(entities = {com.kudi.test.routinechecks.data.model.Routine.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/kudi/test/routinechecks/data/database/RoutineCheckDatabase;", "Landroidx/room/RoomDatabase;", "()V", "routineDao", "Lcom/kudi/test/routinechecks/data/dao/RoutineDao;", "Companion", "app_debug"})
public abstract class RoutineCheckDatabase extends androidx.room.RoomDatabase {
    private static volatile com.kudi.test.routinechecks.data.database.RoutineCheckDatabase instance;
    public static final com.kudi.test.routinechecks.data.database.RoutineCheckDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kudi.test.routinechecks.data.dao.RoutineDao routineDao();
    
    public RoutineCheckDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kudi/test/routinechecks/data/database/RoutineCheckDatabase$Companion;", "", "()V", "instance", "Lcom/kudi/test/routinechecks/data/database/RoutineCheckDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.kudi.test.routinechecks.data.database.RoutineCheckDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.kudi.test.routinechecks.data.database.RoutineCheckDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}