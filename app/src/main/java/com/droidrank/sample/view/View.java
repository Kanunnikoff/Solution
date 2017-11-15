package com.droidrank.sample.view;

import android.content.Context;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

/**
 * Created by dmitry on 15/11/2017.
 */

public class View {
    private TableLayout layout;
    private TableRow currentRow;

    public View(TableLayout layout) {
        this.layout = layout;
    }

    public void addRow(Context context) {
        currentRow = new TableRow(context);
        TableLayout.LayoutParams params = new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT);
        currentRow.setLayoutParams(params);
        layout.addView(currentRow);
    }

    public void addCell(Context context, String text) {
        TextView textView = new TextView(context);
        textView.setText(text);
        currentRow.addView(textView);
    }
}
