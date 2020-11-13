package com.example.test.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.test.database.Converters;
import com.example.test.model.GameBacklog;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GameBacklogDao_Impl implements GameBacklogDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GameBacklog> __insertionAdapterOfGameBacklog;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfDeleteBacklog;

  public GameBacklogDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGameBacklog = new EntityInsertionAdapter<GameBacklog>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `backlogTable` (`title`,`platform`,`day`,`month`,`year`,`id`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GameBacklog value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getPlatform() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPlatform());
        }
        final Long _tmp;
        _tmp = __converters.dateToTimestamp(value.getDay());
        if (_tmp == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, _tmp);
        }
        final Long _tmp_1;
        _tmp_1 = __converters.dateToTimestamp(value.getMonth());
        if (_tmp_1 == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, _tmp_1);
        }
        final Long _tmp_2;
        _tmp_2 = __converters.dateToTimestamp(value.getYear());
        if (_tmp_2 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, _tmp_2);
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteBacklog = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM backlogTable";
        return _query;
      }
    };
  }

  @Override
  public Object insertGameBacklog(final GameBacklog gameBacklog,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGameBacklog.insert(gameBacklog);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteBacklog(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteBacklog.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteBacklog.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public LiveData<List<GameBacklog>> getAllGameBacklogs() {
    final String _sql = "SELECT * FROM backlogTable";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"backlogTable"}, false, new Callable<List<GameBacklog>>() {
      @Override
      public List<GameBacklog> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPlatform = CursorUtil.getColumnIndexOrThrow(_cursor, "platform");
          final int _cursorIndexOfDay = CursorUtil.getColumnIndexOrThrow(_cursor, "day");
          final int _cursorIndexOfMonth = CursorUtil.getColumnIndexOrThrow(_cursor, "month");
          final int _cursorIndexOfYear = CursorUtil.getColumnIndexOrThrow(_cursor, "year");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<GameBacklog> _result = new ArrayList<GameBacklog>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GameBacklog _item;
            final String _tmpTitle;
            _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            final String _tmpPlatform;
            _tmpPlatform = _cursor.getString(_cursorIndexOfPlatform);
            final Date _tmpDay;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfDay)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfDay);
            }
            _tmpDay = __converters.fromTimestamp(_tmp);
            final Date _tmpMonth;
            final Long _tmp_1;
            if (_cursor.isNull(_cursorIndexOfMonth)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getLong(_cursorIndexOfMonth);
            }
            _tmpMonth = __converters.fromTimestamp(_tmp_1);
            final Date _tmpYear;
            final Long _tmp_2;
            if (_cursor.isNull(_cursorIndexOfYear)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getLong(_cursorIndexOfYear);
            }
            _tmpYear = __converters.fromTimestamp(_tmp_2);
            final Long _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getLong(_cursorIndexOfId);
            }
            _item = new GameBacklog(_tmpTitle,_tmpPlatform,_tmpDay,_tmpMonth,_tmpYear,_tmpId);
            _result.add(_item);
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
