package com.example.sagefemme;

import android.content.Context;
import android.content.SharedPreferences;
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

    public ChecklistAdapter(Context context, ArrayList<String> items, Set<String> checkedItems) {
        this.context = context;
        this.items = items;
        this.checkedItems = checkedItems;
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
        checkBox.setChecked(checkedItems.contains(item));

        // On met à jour checkedItems quand l'utilisateur clique sur la case
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                checkedItems.add(item);
            } else {
                checkedItems.remove(item);
            }
            saveCheckedItems(); // Sauvegarde à chaque clic
        });

        return row;
    }

    private void saveCheckedItems() {
        SharedPreferences prefs = context.getSharedPreferences("PlanningChecklistPrefs", Context.MODE_PRIVATE);
        prefs.edit().putStringSet("checked_items_planning", checkedItems).apply();
    }
}
