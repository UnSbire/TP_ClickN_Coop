package com.example.tp_clickncoop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.ViewModelProvider;

public class SecondFragment extends Fragment {

    int comp = 0;
    private int compte = 0;

    public void setCompte(int compte){
        this.compte = compte;
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState



    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button2).setOnClickListener(view1 -> compteur());




    }

    private void compteur(){
        comp = comp + 1;
        model.setCompte(comp);
        modifyTextView(comp);
        modifyTextView2(comp);
    }

    private void modifyTextView(int count){
        TextView t = getView().findViewById(R.id.textViewResult);
        t.setText(String.valueOf(count));
    }

    private void modifyTextView2(int count){
        TextView t = getView().findViewById(R.id.textViewResult2);
        t.setText(String.valueOf(count));
    }

}