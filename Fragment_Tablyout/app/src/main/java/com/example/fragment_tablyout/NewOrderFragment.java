package com.example.fragment_tablyout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.fragment_tablyout.databinding.FragmentNeworderBinding;

public class NewOrderFragment extends Fragment {
    FragmentNeworderBinding binding;
    public NewOrderFragment(){

    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @NonNull
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container
            ,@NonNull Bundle savedInstanceState){
        binding = FragmentNeworderBinding.inflate(inflater, container, false);

        return  binding.getRoot();
    }
}
