package com.example.milogin.ui.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.milogin.R;
import com.example.milogin.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    private FragmentHomeBinding binding;
    private Context context;
   // private Button btllamar;
    private HomeViewModel vm;
//    private View vista;




    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
          HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvcartel;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

   //     vista=inflater.inflate(R.layout.fragment_home,container,false);
    //    btllamar = (Button) vista.findViewById(R.id.btllamar);

binding.btllamar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        homeViewModel.llamar((binding.edNumero.getText().toString()),v.getContext());
    }
});

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}