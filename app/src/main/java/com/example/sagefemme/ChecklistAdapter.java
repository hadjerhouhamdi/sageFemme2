package com.example.sagefemme;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ChecklistAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<String> items;
    private final Set<String> checkedItems;
    private final String preferencesKey;

    public ChecklistAdapter(Context context, ArrayList<String> items, Set<String> checkedItems, String preferencesKey) {
        this.context = context;
        this.items = items;
        this.checkedItems = new HashSet<>(checkedItems); // Copier pour modifier en local
        this.preferencesKey = preferencesKey;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public String getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            row = inflater.inflate(R.layout.list_item_checkbox_left, parent, false);
        }

        CheckBox checkBox = row.findViewById(R.id.check_box);
        TextView textView = row.findViewById(R.id.check_text);

        String item = getItem(position);
        textView.setText(item);

        // Détacher le listener pour éviter déclenchement lors du setChecked
        checkBox.setOnCheckedChangeListener(null);
        checkBox.setChecked(checkedItems.contains(item));

        // Réassigner le listener
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkedItems.add(item);
            } else {
                checkedItems.remove(item);
            }
            // Sauvegarder immédiatement les données
            PreferencesHelper.saveCheckedItems(context, preferencesKey, checkedItems);
        });

        return row;
    }
}
