package com.myapplicationdev.android.secondapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class OverdueFragment extends Fragment {

    EditText etElement, etIndexElement;

    ListView lvPlans;

    ArrayList<String> alPlans = new ArrayList<>();

    ArrayAdapter<String> aaPlans;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_overdue, container, false);

        etElement = v.findViewById(R.id.editTextPlans);
        etIndexElement = v.findViewById(R.id.editTextIndex);
        lvPlans = v.findViewById(R.id.listViewPlans);

        alPlans.add("OVERDUE: Practice DJ");
        alPlans.add("OVERDUE: Clean table");

        aaPlans = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,alPlans);

        lvPlans.setAdapter(aaPlans);






        return v;
    }
}
