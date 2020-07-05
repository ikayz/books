package com.ikayz.books;// Created by ikayz on 05/07/2020

import java.net.MalformedURLException;
import java.net.URL;

public class ApiUtil {
    private ApiUtil() {}

    public static final String BASE_API_URL =
            "https://www.googleapis.com/books/v1/volumes";

    public static URL buildUrl(String title) {
        String fullUrl = BASE_API_URL + "?q=" + title;
        URL url = null;
        try {
            url = new URL(fullUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return url;
    }
}
