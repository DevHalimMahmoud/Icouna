package com.example.icouna.ui.home;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;

import java.util.ArrayList;

public class TestimonialsRecyclerViewAdapter extends RecyclerView.Adapter<TestimonialsRecyclerViewAdapter.ViewHolder> {

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private int listItemLayout;
    private ArrayList<Testimonials> itemList;

    // Constructor of the class
    public TestimonialsRecyclerViewAdapter(int layoutId, ArrayList<Testimonials> itemList) {
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
    public TestimonialsRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);

        return new TestimonialsRecyclerViewAdapter.ViewHolder(view);
    }

    // load data in each row element
    @Override
    public void onBindViewHolder(final TestimonialsRecyclerViewAdapter.ViewHolder holder, final int listPosition) {

        ImageView image = holder.team_image;
        TextView name = holder.name;
        TextView company_name = holder.company_name;
        TextView title = holder.title;
        TextView text = holder.text;

        company_name.setText(itemList.get(listPosition).getCompany_name());
        image.setImageResource(itemList.get(listPosition).getImage());
        title.setText(itemList.get(listPosition).getTitle());
        text.setText(itemList.get(listPosition).getText());
        name.setText(itemList.get(listPosition).getName());
    }

    // Static inner class to initialize the views of rows
    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView text, title, name, company_name;

        public ImageView team_image;
        private final Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            company_name = (TextView) itemView.findViewById(R.id.testimonials_company_name);
            name = (TextView) itemView.findViewById(R.id.testimonials_name);
            text = (TextView) itemView.findViewById(R.id.testimonials_text);
            title = (TextView) itemView.findViewById(R.id.testimonials_title);
            team_image = (ImageView) itemView.findViewById(R.id.testimonials_image);

        }

        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + title.getText());

        }
    }
}
