package com.example.sql;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Player> players;
    @Override
    public void onCreate() {
        super.onCreate();

        players=new ArrayList<>();

        players.add(new Player("Cormac Hannan","07720828353","cormacld@hotmail.com"));
    }
}
