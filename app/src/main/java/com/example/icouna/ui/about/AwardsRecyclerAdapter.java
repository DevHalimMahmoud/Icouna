package com.example.icouna.ui.about;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;

import java.util.ArrayList;

public class AwardsRecyclerAdapter extends RecyclerView.Adapter<AwardsRecyclerAdapter.ViewHolder> {

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private int listItemLayout;
    private ArrayList<Awards> itemList;

    // Constructor of the class
    public AwardsRecyclerAdapter(int layoutId, ArrayList<Awards> itemList) {
        listItemLayout = layoutId;
        this.itemList = itemList;
    }

    // get the size of the list
    @Override
    public int getItemCount() {

        return itemList.size();
    }


    // specify the row layout file and click for each row
    @Override
    public AwardsRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);

        return new AwardsRecyclerAdapter.ViewHolder(view);
    }

    // load data in each row element
    @Override
    public void onBindViewHolder(final AwardsRecyclerAdapter.ViewHolder holder, final int listPosition) {
        ImageView image = holder.image;
        TextView title = holder.title;

        image.setImageResource(itemList.get(listPosition).getAward_image());
        title.setText(itemList.get(listPosition).getAward_title());

    }

    // Static inner class to initialize the views of rows
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView  title;
        public ImageView image;


        public ViewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            title = (TextView) itemView.findViewById(R.id.award_title);
            image = (ImageView) itemView.findViewById(R.id.award_image);
        }

        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + title.getText());

        }
    }
}
