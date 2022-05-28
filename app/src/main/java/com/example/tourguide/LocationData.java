package com.example.tourguide;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

public class LocationData {
    private static Context context = MainActivity.context;
    private static Resources resources = context.getResources();
    private static ArrayList<Item> Sightseeing = new ArrayList<Item>() {
        {
            add(new Item(R.drawable.suez, resources.getString(R.string.neighborhood)));
            add(new Item(R.drawable.nationalmuseum, resources.getString(R.string.nationalmuseum)));
        }
    };
    private static ArrayList<Item> Hotels = new ArrayList<Item>() {
        {
            add(new Item(R.drawable.lucinda, resources.getString(R.string.lucinda)));
            add(new Item(R.drawable.porto, resources.getString(R.string.porto)));
        }
    };
    private static ArrayList<Item> Food = new ArrayList<Item>() {
        {
            add(new Item(R.drawable.crab, resources.getString(R.string.crab)));
            add(new Item(R.drawable.seafoodsoap, resources.getString(R.string.seafoodsoap)));
        }
    };
    private static ArrayList<Item> Restaurants = new ArrayList<Item>() {
        {
            add(new Item(R.drawable.elsewasy, resources.getString(R.string.elsewasy)));
            add(new Item(R.drawable.fares, resources.getString(R.string.fares)));
        }
    };

    public static ArrayList<Item> getSightseeing() {
        return Sightseeing;
    }

    public static ArrayList<Item> getHotels() {
        return Hotels;
    }

    public static ArrayList<Item> getFood() {
        return Food;
    }

    public static ArrayList<Item> getRestaurants() {
        return Restaurants;
    }
}
