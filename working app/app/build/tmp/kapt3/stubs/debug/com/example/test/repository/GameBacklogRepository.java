package com.example.test.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0019\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/test/repository/GameBacklogRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gameBacklogDao", "Lcom/example/test/dao/GameBacklogDao;", "deleteGameBacklog", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGameBacklogs", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/test/model/GameBacklog;", "insertGameBacklog", "gameBacklog", "(Lcom/example/test/model/GameBacklog;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GameBacklogRepository {
    private final com.example.test.dao.GameBacklogDao gameBacklogDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.test.model.GameBacklog>> getAllGameBacklogs() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertGameBacklog(@org.jetbrains.annotations.NotNull()
    com.example.test.model.GameBacklog gameBacklog, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteGameBacklog(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public GameBacklogRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}