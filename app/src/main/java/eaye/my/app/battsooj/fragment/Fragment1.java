package eaye.my.app.battsooj.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import eaye.my.app.battsooj.fragment.databinding.Fragment1Binding;


public class Fragment1 extends Fragment {
    Fragment1Binding binding;

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = Fragment1Binding.inflate(inflater,container,false);
        binding.fragmentbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 = new Fragment2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.replace,fragment2);
                transaction.commit();

            }
        });


        return binding.getRoot();

    }
}