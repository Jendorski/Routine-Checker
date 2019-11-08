package com.kudi.test.routinechecks.dagger.activities;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import dagger.android.AndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.DaggerAppCompatActivity;
import dagger.android.support.HasSupportFragmentInjector;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006H\u0016\u00a8\u0006\n"}, d2 = {"Lcom/kudi/test/routinechecks/dagger/activities/BaseActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "Ldagger/android/HasActivityInjector;", "()V", "activityInjector", "Ldagger/android/AndroidInjector;", "Landroid/app/Activity;", "supportFragmentInjector", "Landroidx/fragment/app/Fragment;", "app_debug"})
public class BaseActivity extends dagger.android.support.DaggerAppCompatActivity implements dagger.android.support.HasSupportFragmentInjector, dagger.android.HasActivityInjector {
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    public BaseActivity() {
        super();
    }
}