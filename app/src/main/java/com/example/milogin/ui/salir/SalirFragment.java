package com.example.milogin.ui.salir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.milogin.Dialogos;
import com.example.milogin.R;
import com.example.milogin.databinding.FragmentSalirBinding;

public class SalirFragment extends Fragment {


    private SalirViewModel mViewModel;
    private FragmentSalirBinding binding;

    View vista;




    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


////
        vista=inflater.inflate(R.layout.fragment_salir, container, false);
        Dialogos.mostrarDialogo(getActivity());


        return vista;



    }



}