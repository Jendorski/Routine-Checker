package com.kudi.test.routinechecks.data.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kudi.test.routinechecks.data.model.Routine;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RoutineDao_Impl implements RoutineDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Routine> __insertionAdapterOfRoutine;

  private final EntityInsertionAdapter<Routine> __insertionAdapterOfRoutine_1;

  public RoutineDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRoutine = new EntityInsertionAdapter<Routine>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Routine` (`time`,`description`,`title`,`done`,`missed`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Routine value) {
        if (value.getTime() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTime());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        final int _tmp;
        _tmp = value.getDone() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getMissed() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
      }
    };
    this.__insertionAdapterOfRoutine_1 = new EntityInsertionAdapter<Routine>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `Routine` (`time`,`description`,`title`,`done`,`missed`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Routine value) {
        if (value.getTime() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTime());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getTitle());
        }
        final int _tmp;
        _tmp = value.getDone() ? 1 : 0;
        stmt.bindLong(4, _tmp);
        final int _tmp_1;
        _tmp_1 = value.getMissed() ? 1 : 0;
        stmt.bindLong(5, _tmp_1);
      }
    };
  }

  @Override
  public Object insertAll(final List<Routine> routines, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRoutine.insert(routines);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public void insert(final Routine routine) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRoutine_1.insert(routine);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<Routine> getRoutines() {
    final String _sql = "SELECT * FROM routine ORDER BY title DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "done");
      final int _cursorIndexOfMissed = CursorUtil.getColumnIndexOrThrow(_cursor, "missed");
      final List<Routine> _result = new ArrayList<Routine>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Routine _item;
        final String _tmpTime;
        _tmpTime = _cursor.getString(_cursorIndexOfTime);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final boolean _tmpDone;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfDone);
        _tmpDone = _tmp != 0;
        final boolean _tmpMissed;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfMissed);
        _tmpMissed = _tmp_1 != 0;
        _item = new Routine(_tmpTime,_tmpDescription,_tmpTitle,_tmpDone,_tmpMissed);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<Routine> getARoutine(final String title) {
    final String _sql = "SELECT * FROM routine WHERE :title";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (title == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, title);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"routine"}, false, new Callable<Routine>() {
      @Override
      public Routine call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false);
        try {
          final int _cursorIndexOfTime = CursorUtil.getColumnIndexOrThrow(_cursor, "time");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDone = CursorUtil.getColumnIndexOrThrow(_cursor, "done");
          final int _cursorIndexOfMissed = CursorUtil.getColumnIndexOrThrow(_cursor, "missed");
          final Routine _result;
          if(_cursor.moveToFirst()) {
            final String _tmpTime;
            _tmpTime = _cursor.getString(_cursorIndexOfTime);
            final String _tmpDescription;
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final boolean _tmpDone;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfDone);
            _tmpDone = _tmp != 0;
            final boolean _tmpMissed;
            final int _tmp_1;
            _tmp_1 = _cursor.getInt(_cursorIndexOfMissed);
            _tmpMissed = _tmp_1 != 0;
            _result = new Routine(_tmpTime,_tmpDescription,_tmpTitle,_tmpDone,_tmpMissed);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
