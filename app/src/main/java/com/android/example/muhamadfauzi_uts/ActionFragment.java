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

public class ActionFragment extends Fragment {

    private ListView listView;
    private String[] actionTitles = {
            "Mr. Baek",
            "How to Fight",
            "Manajer Kim",
            "Tower of God",
            "Reality Quest",
            "Money and the Power",
            "Fight Hard",
            "Kill the Dragon",
            "Spirit Hunter",
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_action, container, false);

        listView = view.findViewById(R.id.actionListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(), android.R.layout.simple_list_item_1, actionTitles);
        listView.setAdapter(adapter);

        return view;
    }
}
