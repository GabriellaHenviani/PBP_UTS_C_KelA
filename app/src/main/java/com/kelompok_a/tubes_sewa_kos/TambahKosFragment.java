package com.kelompok_a.tubes_sewa_kos;

import android.os.Bundle;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kelompok_a.tubes_sewa_kos.databinding.FragmentTambahKosBinding;

public class TambahKosFragment extends Fragment {

    private FragmentTambahKosBinding binding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_tambah_kos, container, false);
        View view = binding.getRoot();

        return view;
    }
}