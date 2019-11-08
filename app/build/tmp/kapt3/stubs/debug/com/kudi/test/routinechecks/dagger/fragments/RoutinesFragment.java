package com.kudi.test.routinechecks.dagger.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.*;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kudi.test.routinechecks.R;
import com.kudi.test.routinechecks.dagger.ui.GridSpacingItemDecoration;
import com.kudi.test.routinechecks.dagger.ui.VerticalItemDecoration;
import com.kudi.test.routinechecks.data.adapter.RoutineAdapter;
import com.kudi.test.routinechecks.databinding.RoutinesBinding;
import com.kudi.test.routinechecks.viewModel.RoutineViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u00020\u0001:\u0001:B\u0005\u00a2\u0006\u0002\u0010\u0002J\n\u0010#\u001a\u0004\u0018\u00010\u0004H\u0014J\u0012\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J&\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010+\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020%2\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020%H\u0002J\u0010\u00109\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0016\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0017\u0010\u0010R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006;"}, d2 = {"Lcom/kudi/test/routinechecks/dagger/fragments/RoutinesFragment;", "Lcom/kudi/test/routinechecks/dagger/fragments/BaseFragment;", "()V", "TAG", "", "adapter", "Lcom/kudi/test/routinechecks/data/adapter/RoutineAdapter;", "getAdapter", "()Lcom/kudi/test/routinechecks/data/adapter/RoutineAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "binding", "Lcom/kudi/test/routinechecks/databinding/RoutinesBinding;", "gridDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "getGridDecoration", "()Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "gridDecoration$delegate", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "isLinearLayoutManager", "", "linearDecoration", "getLinearDecoration", "linearDecoration$delegate", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "viewModel", "Lcom/kudi/test/routinechecks/viewModel/RoutineViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getTitle", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "openFragment", "fragment", "Landroidx/fragment/app/Fragment;", "setLayoutManager", "subscribeUi", "Companion", "app_debug"})
public final class RoutinesFragment extends com.kudi.test.routinechecks.dagger.fragments.BaseFragment {
    private final java.lang.String TAG = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.kudi.test.routinechecks.viewModel.RoutineViewModel viewModel;
    private com.kudi.test.routinechecks.databinding.RoutinesBinding binding;
    private final kotlin.Lazy adapter$delegate = null;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private androidx.recyclerview.widget.GridLayoutManager gridLayoutManager;
    private final kotlin.Lazy linearDecoration$delegate = null;
    private final kotlin.Lazy gridDecoration$delegate = null;
    private boolean isLinearLayoutManager;
    public static final int SPAN_OBJECT = 3;
    public static final com.kudi.test.routinechecks.dagger.fragments.RoutinesFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.kudi.test.routinechecks.data.adapter.RoutineAdapter getAdapter() {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ItemDecoration getLinearDecoration() {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView.ItemDecoration getGridDecoration() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void openFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    private final void setLayoutManager() {
    }
    
    private final void subscribeUi(com.kudi.test.routinechecks.data.adapter.RoutineAdapter adapter) {
    }
    
    public RoutinesFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/kudi/test/routinechecks/dagger/fragments/RoutinesFragment$Companion;", "", "()V", "SPAN_OBJECT", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}