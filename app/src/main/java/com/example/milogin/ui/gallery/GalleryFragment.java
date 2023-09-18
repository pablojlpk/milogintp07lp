package com.example.milogin.ui.gallery;

import android.content.Intent;
import android.os.Bundle;
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
import com.example.milogin.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private FragmentGalleryBinding binding;
    private Button boton;
    private View v;
    private MiServicio miservicio;
private Intent intent;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        v=inflater.inflate(R.layout.fragment_gallery,container,false);

        binding.btReproducir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
iniciar(v);



            }

        });



        return root;

    }
public void iniciar(View view){

        Intent intent =new Intent(v.getContext(), MiServicio.class);
    //intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
    miservicio.startService(intent);
}

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}