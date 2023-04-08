package com.example.pddapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

public class ContentFragment extends Fragment {
    private static final String TAG = "fragment";
    public ContentFragment(){
        super(R.layout.fragment_1_context);
    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"On create");



}
    public void onCreateView() {

        Log.i(TAG, "on create view: ");
    }
    public void onViewStateRestored() {

        Log.i(TAG, "on view state restored: ");
    }
    public void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }
    public void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }


    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }


    public void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
        Bundle result = new Bundle();
        result.putString("var_number", "v1q1");
        getParentFragmentManager().setFragmentResult(
                "requestKey", result);
    }




    public void onSaveInstanceState() {
        Log.i(TAG, "onSaveInstanceState: ");
    }


    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onDestroyView: ");
    }


    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");

    }
}
