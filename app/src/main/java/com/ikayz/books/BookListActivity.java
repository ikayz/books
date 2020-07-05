package com.ikayz.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;
import java.net.URL;

public class BookListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_list);
        TextView tvResult = findViewById(R.id.tv_response);
        try {
            URL bookUrl = ApiUtil.buildUrl("cooking");
            String jsonResult = ApiUtil.getJson(bookUrl);
            tvResult.setText(jsonResult);
        } catch (Exception e) {
            Log.d("error", e.getMessage());
        }
    }
}