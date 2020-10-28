package dev.ssonsall.recyclerviewselecteditempractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import dev.ssonsall.recyclerviewselecteditempractice.recyclerview.Sample;
import dev.ssonsall.recyclerviewselecteditempractice.recyclerview.SampleAdapter;

public class MainActivity extends AppCompatActivity {
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        SampleAdapter sampleAdapter = new SampleAdapter();

        ArrayList<Sample> sampleList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Sample sample = new Sample();
            if (i == 0) sample.setSelected(true);
            else sample.setSelected(false);
            sample.setItemName(i + " 번 Item Name");
            sample.setItemTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(System.currentTimeMillis()));
            sampleList.add(sample);
        }

        sampleAdapter.setSampleList(sampleList);
        recyclerView.setAdapter(sampleAdapter);
    }
}