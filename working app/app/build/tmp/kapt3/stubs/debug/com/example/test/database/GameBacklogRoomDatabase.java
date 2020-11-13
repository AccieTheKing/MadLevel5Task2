package com.example.test.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.example.test.database.Converters.class})
@androidx.room.Database(entities = {com.example.test.model.GameBacklog.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/test/database/GameBacklogRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "gameBacklogDao", "Lcom/example/test/dao/GameBacklogDao;", "Companion", "app_debug"})
public abstract class GameBacklogRoomDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String DATABASE_NAME = "GAME_BACKLOG_DATABASE";
    private static volatile com.example.test.database.GameBacklogRoomDatabase DATABASE_INSTANCE;
    public static final com.example.test.database.GameBacklogRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.test.dao.GameBacklogDao gameBacklogDao();
    
    public GameBacklogRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/test/database/GameBacklogRoomDatabase$Companion;", "", "()V", "DATABASE_INSTANCE", "Lcom/example/test/database/GameBacklogRoomDatabase;", "DATABASE_NAME", "", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.example.test.database.GameBacklogRoomDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}