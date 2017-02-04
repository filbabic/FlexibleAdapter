package com.babic.filip.flexible_adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.babic.filip.flexibleadapter.FlexibleAdapter;
import com.babic.filip.flexibleadapter.FlexibleHolder;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.functions.Consumer;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        FlexibleAdapter<FlexibleHolder<String>> adapter = new FlexibleAdapter<>();

        List<FlexibleHolder<String>> items = new ArrayList<>();
        items.add(new TextViewHolder("Hello"));
        items.add(new TextViewHolder("World"));
        items.add(new TextViewHolder("!"));

        for (FlexibleHolder<String> holder : items) {
            holder.setSubscription(getListener());
        }

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter.setItems(items);
    }

    private Consumer<String> getListener() {
        return new Consumer<String>() {
            @Override
            public void accept(String string) throws Exception {
                showToast(string);
            }
        };
    }

    private void showToast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
