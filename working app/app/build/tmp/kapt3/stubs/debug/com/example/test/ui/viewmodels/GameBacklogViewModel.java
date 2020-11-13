package com.example.test.ui.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J.\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dJ\u0010\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u000fH\u0002R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\t\u00a8\u0006\""}, d2 = {"Lcom/example/test/ui/viewmodels/GameBacklogViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "error", "Landroidx/lifecycle/MutableLiveData;", "", "getError", "()Landroidx/lifecycle/MutableLiveData;", "gameBacklogRepository", "Lcom/example/test/repository/GameBacklogRepository;", "gameBacklogs", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/test/model/GameBacklog;", "getGameBacklogs", "()Landroidx/lifecycle/LiveData;", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "success", "", "getSuccess", "deleteGameBacklog", "", "insertGameBackLog", "title", "platform", "day", "Ljava/util/Date;", "month", "year", "isValidGameBacklog", "gameBacklog", "app_debug"})
public final class GameBacklogViewModel extends androidx.lifecycle.AndroidViewModel {
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private final com.example.test.repository.GameBacklogRepository gameBacklogRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.test.model.GameBacklog>> gameBacklogs = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> error = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> success = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.test.model.GameBacklog>> getGameBacklogs() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getSuccess() {
        return null;
    }
    
    public final void insertGameBackLog(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String platform, @org.jetbrains.annotations.NotNull()
    java.util.Date day, @org.jetbrains.annotations.NotNull()
    java.util.Date month, @org.jetbrains.annotations.NotNull()
    java.util.Date year) {
    }
    
    public final void deleteGameBacklog() {
    }
    
    private final boolean isValidGameBacklog(com.example.test.model.GameBacklog gameBacklog) {
        return false;
    }
    
    public GameBacklogViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}