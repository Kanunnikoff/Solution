package com.droidrank.sample.data;


/**
 * Created by dmitry on 15/11/2017.
 */

public class Data {
    private int n;
    private int[][] magicSquare;
    private int filledSquaresCount;

    public Data(int n) {
        this.n = n;
        magicSquare = new int[n][n];
    }

    public int getOrder() {
        return n;
    }

    public void fillSquare(int i, int j, int v) {
        magicSquare[i][j] = v;
        filledSquaresCount++;
    }

    public int getSquareValue(int i, int j) {
        return magicSquare[i][j];
    }

    public boolean isSquareFilled(int i, int j) {
        return magicSquare[i][j] != 0;
    }

    public boolean isAllSquaresFilled() {
        return filledSquaresCount == n*n;
    }
}
