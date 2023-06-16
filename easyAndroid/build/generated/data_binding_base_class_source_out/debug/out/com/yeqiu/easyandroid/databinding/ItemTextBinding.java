// Generated by view binder compiler. Do not edit!
package com.yeqiu.easyandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yeqiu.easyandroid.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTextBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvItem;

  private ItemTextBinding(@NonNull LinearLayout rootView, @NonNull TextView tvItem) {
    this.rootView = rootView;
    this.tvItem = tvItem;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_text, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTextBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tv_item;
      TextView tvItem = ViewBindings.findChildViewById(rootView, id);
      if (tvItem == null) {
        break missingId;
      }

      return new ItemTextBinding((LinearLayout) rootView, tvItem);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}