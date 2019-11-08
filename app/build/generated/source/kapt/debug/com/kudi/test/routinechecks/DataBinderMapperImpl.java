package com.kudi.test.routinechecks;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kudi.test.routinechecks.databinding.AddRoutineBindingImpl;
import com.kudi.test.routinechecks.databinding.ListItemRoutinesBindingImpl;
import com.kudi.test.routinechecks.databinding.NextUpItemBindingImpl;
import com.kudi.test.routinechecks.databinding.RoutinesBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ADDROUTINE = 1;

  private static final int LAYOUT_LISTITEMROUTINES = 2;

  private static final int LAYOUT_NEXTUPITEM = 3;

  private static final int LAYOUT_ROUTINES = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kudi.test.routinechecks.R.layout.add_routine, LAYOUT_ADDROUTINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kudi.test.routinechecks.R.layout.list_item_routines, LAYOUT_LISTITEMROUTINES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kudi.test.routinechecks.R.layout.next_up_item, LAYOUT_NEXTUPITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kudi.test.routinechecks.R.layout.routines, LAYOUT_ROUTINES);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ADDROUTINE: {
          if ("layout/add_routine_0".equals(tag)) {
            return new AddRoutineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for add_routine is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMROUTINES: {
          if ("layout/list_item_routines_0".equals(tag)) {
            return new ListItemRoutinesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_routines is invalid. Received: " + tag);
        }
        case  LAYOUT_NEXTUPITEM: {
          if ("layout/next_up_item_0".equals(tag)) {
            return new NextUpItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for next_up_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ROUTINES: {
          if ("layout/routines_0".equals(tag)) {
            return new RoutinesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for routines is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "routine");
      sKeys.put(2, "clickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/add_routine_0", com.kudi.test.routinechecks.R.layout.add_routine);
      sKeys.put("layout/list_item_routines_0", com.kudi.test.routinechecks.R.layout.list_item_routines);
      sKeys.put("layout/next_up_item_0", com.kudi.test.routinechecks.R.layout.next_up_item);
      sKeys.put("layout/routines_0", com.kudi.test.routinechecks.R.layout.routines);
    }
  }
}
