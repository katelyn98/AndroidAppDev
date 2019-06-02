package com.katelyncmorrison.tracksinthewild.ui.gear;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.katelyncmorrison.tracksinthewild.R;

public class GearFragment extends Fragment {

    private GearViewModel gearViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        gearViewModel =
                ViewModelProviders.of(this).get(GearViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gear, container, false);
        final TextView textView = root.findViewById(R.id.text_share);
        gearViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}