package com.lesson;

public class Field {
    private static final int FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

    public void eraseField(){

        for(int i = 0; i < FIELD_SIZE; i++){

            eraseLines(i);
        }
    }


    public void showField() {

        for (int i = 0; i < FIELD_SIZE; i++) {
            showLines(i);

            System.out.println();
        }
    }

    public void showLines(int lineNumber){
        for (int i = 0; i < FIELD_SIZE; i++){
            System.out.print("[" +field[i][lineNumber] + "]");
        }
    }

    public void eraseLines(int lineNumber){

        for(int i = 0; i < FIELD_SIZE; i++){

            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

}
