package com.droidrank.sample.controller;

import android.content.Context;

import com.droidrank.sample.data.Data;
import com.droidrank.sample.view.View;

/**
 * Created by dmitry on 15/11/2017.
 */

public class Controller {
    private Data data;
    private View view;

    public Controller(Data data, View view) {
        this.data = data;
        this.view = view;
    }

    public void construct(Context context) {
        int n = data.getOrder();

        int v = 1;
        int i = n - 1;
        int j = (n - 1) / 2;

        while (!data.isAllSquaresFilled()) {
            data.fillSquare(i++, j++, v++);

            if (i == n && j == n) {
                i -= 2;
                j--;
            } else {
                if (i == n) {
                    i = 0;
                }

                if (j == n) {
                    j = 0;
                }
            }

            if (data.isSquareFilled(i, j)) {
                i -= 2;

                if (i < 0) {
                    break;
                }

                j--;

                if (j < 0) {
                    break;
                }
            }

            data.fillSquare(i, j, v);
        }

        for (i = 0; i < n; i++) {
            view.addRow(context);

            for (j = 0; j < n; j++) {
                view.addCell(context, String.valueOf(data.getSquareValue(i, j)));
                view.addCell(context, "   ");
            }
        }
    }
}
