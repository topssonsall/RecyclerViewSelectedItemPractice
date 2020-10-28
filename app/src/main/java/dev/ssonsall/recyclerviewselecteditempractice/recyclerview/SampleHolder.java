package dev.ssonsall.recyclerviewselecteditempractice.recyclerview;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import dev.ssonsall.recyclerviewselecteditempractice.R;

public class SampleHolder extends RecyclerView.ViewHolder {
    private LinearLayout rowItem;
    private View viewSelected;
    private TextView textViewItemName, textViewItemTime;

    public SampleHolder(@NonNull View itemView) {
        super(itemView);
        rowItem = itemView.findViewById(R.id.rowItem);
        viewSelected = itemView.findViewById(R.id.viewSelected);
        textViewItemName = itemView.findViewById(R.id.textViewItemName);
        textViewItemTime = itemView.findViewById(R.id.textViewItemTime);
    }

    public LinearLayout getRowItem() {
        return rowItem;
    }

    public void setRowItem(LinearLayout rowItem) {
        this.rowItem = rowItem;
    }

    public View getViewSelected() {
        return viewSelected;
    }

    public void setViewSelected(View viewSelected) {
        this.viewSelected = viewSelected;
    }

    public TextView getTextViewItemName() {
        return textViewItemName;
    }

    public void setTextViewItemName(TextView textViewItemName) {
        this.textViewItemName = textViewItemName;
    }

    public TextView getTextViewItemTime() {
        return textViewItemTime;
    }

    public void setTextViewItemTime(TextView textViewItemTime) {
        this.textViewItemTime = textViewItemTime;
    }
}
