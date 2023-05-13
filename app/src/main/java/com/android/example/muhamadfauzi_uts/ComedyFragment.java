package com.android.example.muhamadfauzi_uts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ComedyFragment extends Fragment {

    private ListView listView;
    private String[] actionTitles = {
            "Eh, Sorry Kesantet",
            "Si Ocong",
            "Bang Lambe",
            "Kang Paket Ganteng",
            "Psychic Studies",
            "Trio Koplak",
            "Potato Town",
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comedy, container, false);

        listView = view.findViewById(R.id.comedyListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, actionTitles);
        listView.setAdapter(adapter);

        return view;
    }
}
