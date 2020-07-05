package com.ikayz.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.IOException;
import java.net.URL;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);

        try {
            URL bookUrl = ApiUtil.buildUrl("cooking");
            String jasonString = ApiUtil.getJson(bookUrl);
        } catch (Exception e) {
            Log.d("error", e.getMessage());
        }
    }
}