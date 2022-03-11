package com.example.tictactoe;

public class GameState {
    int arr[];

    public GameState() {
        arr = new int[9];
        for (int i = 0; i < 9; i++)
            arr[i] = 2;
    }

    public void set_value(int pos, int value) {
        arr[pos] = value;
    }

    public boolean check_if_all_filed() {
        for (int i = 0; i < 9; i++) {
            if (arr[i] == 2) {
                return false;
            }
        }
        return true;
    }

    public boolean check_if_cross_wins() {
        return check(1);
    }

    public boolean check_if_zero_wins() {
        return check(0);
    }

    public boolean check(int c) {
        if (arr[0] == c && arr[1] == c && arr[2] == c)
            return true;
        else if (arr[3] == c && arr[4] == c && arr[5] == c)
            return true;
        else if (arr[6] == c && arr[7] == c && arr[8] == c)
            return true;
        else if (arr[0] == c && arr[3] == c  && arr[6] == c)
            return true;
        else if (arr[1] == c && arr[4] == c && arr[7] == c)
            return true;
        else if (arr[2] == c && arr[5] == c && arr[8] == c)
            return true;
        else if (arr[0] == c && arr[4] == c && arr[8] == c)
            return true;
        else if (arr[6] == c && arr[4] == c && arr[2] == c)
            return true;
        else
            return false;
    }
}
