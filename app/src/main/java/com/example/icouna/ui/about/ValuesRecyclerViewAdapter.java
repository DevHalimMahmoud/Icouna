package com.example.icouna.ui.about;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;
import com.example.icouna.ui.products.Product;
import com.example.icouna.ui.products.ProductDetails;
import com.example.icouna.ui.products.ProductsArrayAdapter;

import java.util.ArrayList;

public class ValuesRecyclerViewAdapter extends RecyclerView.Adapter<ValuesRecyclerViewAdapter.ViewHolder> {

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private int listItemLayout;
    private ArrayList<Product> itemList;

    // Constructor of the class
    public ValuesRecyclerViewAdapter(int layoutId, ArrayList<Product> itemList) {
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
    public ValuesRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);

        return new ValuesRecyclerViewAdapter.ViewHolder(view);
    }

    // load data in each row element
    @Override
    public void onBindViewHolder(final ValuesRecyclerViewAdapter.ViewHolder holder, final int listPosition) {
        ImageView image = holder.image;
        TextView title = holder.title;
        TextView text = holder.text;
        image.setImageResource(itemList.get(listPosition).getImage());
        title.setText(itemList.get(listPosition).getTitle());
        text.setText(itemList.get(listPosition).getText());
    }

    // Static inner class to initialize the views of rows
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView text, title;
        public ImageView image;
        private final Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            text = (TextView) itemView.findViewById(R.id.services_text);
            title = (TextView) itemView.findViewById(R.id.award_title);
            image = (ImageView) itemView.findViewById(R.id.award_image);
        }

        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + title.getText());
           /* MainActivity mainActivity = new MainActivity();
            mainActivity.switchContent(R.id.nav_home, new HomeFragment(), view);*/

        }
    }
}
