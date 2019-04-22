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

public class PlansFragment extends Fragment {

    EditText etElement, etIndexElement;
    Button btnAdd,btnRemove;
    ListView lvPlans;

    ArrayList<String> alPlans = new ArrayList<>();

    ArrayAdapter<String> aaPlans;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_plans, container, false);

        etElement = v.findViewById(R.id.editTextPlans);
        etIndexElement = v.findViewById(R.id.editTextIndex);
        btnAdd = v.findViewById(R.id.buttonAddItem);
        btnRemove = v.findViewById(R.id.buttonRemoveItem);
        lvPlans = v.findViewById(R.id.listViewPlans);

        alPlans.add("Read finish book 1");
        alPlans.add("Do laundry");

        aaPlans = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,alPlans);

        lvPlans.setAdapter(aaPlans);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String plan = etElement.getText().toString();
                String Index = etIndexElement.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alPlans.add(pos,plan);
                aaPlans.notifyDataSetChanged();

            }
        });


        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String plan = etElement.getText().toString();
                String Index = etIndexElement.getText().toString();
                int pos = Integer.parseInt(etIndexElement.getText().toString());
                alPlans.remove(pos);
                aaPlans.notifyDataSetChanged();
            }
        });



        return v;
    }
}
