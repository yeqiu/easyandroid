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

public final class ItemNetLogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llLog;

  @NonNull
  public final TextView tvDataCode;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvHost;

  @NonNull
  public final TextView tvIndex;

  @NonNull
  public final TextView tvPath;

  @NonNull
  public final TextView tvReceivedIn;

  @NonNull
  public final TextView tvStatusCode;

  private ItemNetLogBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llLog,
      @NonNull TextView tvDataCode, @NonNull TextView tvDate, @NonNull TextView tvHost,
      @NonNull TextView tvIndex, @NonNull TextView tvPath, @NonNull TextView tvReceivedIn,
      @NonNull TextView tvStatusCode) {
    this.rootView = rootView;
    this.llLog = llLog;
    this.tvDataCode = tvDataCode;
    this.tvDate = tvDate;
    this.tvHost = tvHost;
    this.tvIndex = tvIndex;
    this.tvPath = tvPath;
    this.tvReceivedIn = tvReceivedIn;
    this.tvStatusCode = tvStatusCode;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemNetLogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemNetLogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_net_log, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemNetLogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll_log;
      LinearLayout llLog = ViewBindings.findChildViewById(rootView, id);
      if (llLog == null) {
        break missingId;
      }

      id = R.id.tv_data_code;
      TextView tvDataCode = ViewBindings.findChildViewById(rootView, id);
      if (tvDataCode == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tv_host;
      TextView tvHost = ViewBindings.findChildViewById(rootView, id);
      if (tvHost == null) {
        break missingId;
      }

      id = R.id.tv_index;
      TextView tvIndex = ViewBindings.findChildViewById(rootView, id);
      if (tvIndex == null) {
        break missingId;
      }

      id = R.id.tv_path;
      TextView tvPath = ViewBindings.findChildViewById(rootView, id);
      if (tvPath == null) {
        break missingId;
      }

      id = R.id.tv_received_in;
      TextView tvReceivedIn = ViewBindings.findChildViewById(rootView, id);
      if (tvReceivedIn == null) {
        break missingId;
      }

      id = R.id.tv_status_code;
      TextView tvStatusCode = ViewBindings.findChildViewById(rootView, id);
      if (tvStatusCode == null) {
        break missingId;
      }

      return new ItemNetLogBinding((LinearLayout) rootView, llLog, tvDataCode, tvDate, tvHost,
          tvIndex, tvPath, tvReceivedIn, tvStatusCode);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
