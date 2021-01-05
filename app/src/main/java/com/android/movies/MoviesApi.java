package com.android.movies;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class MoviesApi {

    public ArrayList<Movie> getMovies(String input) {
        ArrayList<Movie> movies = new ArrayList<>();
        String apiKey = "";
        String apiUrl = "";

        // Create URL Connection In Order To Fetch Data From The Movies Web API
        HttpURLConnection connection = null;
        StringBuilder jsonResult = new StringBuilder();
        StringBuilder apiRequest = new StringBuilder();
        apiRequest.append(apiUrl).append("input=").append(input).append(apiKey);
        try {
            URL url = new URL(apiRequest.toString());
            connection = (HttpURLConnection) url.openConnection();
            InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());

            int read;
            char[] buffer = new char[1024];
            while((read = inputStreamReader.read(buffer)) != -1) {
                jsonResult.append(buffer, 0, read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }

//        try {
//            JSONObject jsonObject = new JSONObject(jsonResult.toString());
//            JSONArray
//        }


        return movies;
    }
}
