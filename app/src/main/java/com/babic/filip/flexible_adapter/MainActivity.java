package com.babic.filip.flexible_adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.babic.filip.flexible_adapter.utils.DataUtils;
import com.babic.filip.flexibleadapter.FlexibleAdapter;
import com.babic.filip.flexibleadapter.FlexibleHolder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.recycler_view)
    RecyclerView recyclerView;

    private final FlexibleAdapter<FlexibleHolder> adapter = new FlexibleAdapter<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initAdapter();
        addItems();
    }

    private void initAdapter() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
    }

    private void addItems() {
        List<FlexibleHolder> dataSource = DataUtils.getDataSource();

        adapter.addItems(dataSource);
    }
}
