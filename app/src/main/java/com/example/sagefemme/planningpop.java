package com.example.sagefemme;

import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;
import java.util.Set;

public class planningpop extends DialogFragment {

    private static final String ARG_ITEMS = "checklist_items";
    private static final String PREFS_NAME = "PlanningChecklistPrefs";
    private static final String PREF_KEY = "checked_items_planning";

    public static planningpop newInstance(ArrayList<String> items) {
        planningpop fragment = new planningpop();
        Bundle args = new Bundle();
        args.putStringArrayList(ARG_ITEMS, items);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.suitepop, container, false);

        ListView checklistView = view.findViewById(R.id.checklist_view);

        ArrayList<String> items = getArguments() != null
                ? getArguments().getStringArrayList(ARG_ITEMS)
                : new ArrayList<>();

        // Utilisation du helper pour récupérer les éléments cochés
        Set<String> checkedItems = PreferencesHelper.loadCheckedItems(requireContext(), PREF_KEY);

        // Passe la clé PREF_KEY au ChecklistAdapter pour la sauvegarde
        ChecklistAdapter adapter = new ChecklistAdapter(requireContext(), items, checkedItems, PREF_KEY);

        checklistView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        if (getDialog() != null && getDialog().getWindow() != null) {
            Window window = getDialog().getWindow();
            DisplayMetrics metrics = new DisplayMetrics();
            requireActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
            int width = (int)(metrics.widthPixels * 0.8);
            window.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT);
            window.setBackgroundDrawableResource(android.R.color.transparent);
        }
    }
}
