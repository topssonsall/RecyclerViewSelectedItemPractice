package dev.ssonsall.recyclerviewselecteditempractice.recyclerview;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import dev.ssonsall.recyclerviewselecteditempractice.R;

public class SampleAdapter extends RecyclerView.Adapter<SampleHolder> {

    private ArrayList<Sample> sampleList;

    @NonNull
    @Override
    public SampleHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row, parent, false);
        SampleHolder holder = new SampleHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull SampleHolder holder, int position) {
        Sample sample = sampleList.get(position);
        if (sample.isSelected()) {
            holder.getViewSelected().setBackgroundColor(Color.parseColor("#FF0000"));
        } else {
            holder.getViewSelected().setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        holder.getTextViewItemName().setText(sample.getItemName());
        holder.getTextViewItemTime().setText(sample.getItemTime());

        holder.getRowItem().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (Sample s : sampleList) {
                    if (sampleList.indexOf(s) == sampleList.indexOf(sample)) {
                        s.setSelected(true);
                    } else {
                        s.setSelected(false);
                    }
                }
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return sampleList.size();
    }

    public ArrayList<Sample> getSampleList() {
        return sampleList;
    }

    public void setSampleList(ArrayList<Sample> sampleList) {
        this.sampleList = sampleList;
    }
}
