package com.example.icouna.ui.products;

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

import java.util.ArrayList;

public class ProductsArrayAdapter extends RecyclerView.Adapter<ProductsArrayAdapter.ViewHolder> {

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private int listItemLayout;
    private ArrayList<Product> itemList;

    // Constructor of the class
    public ProductsArrayAdapter(int layoutId, ArrayList<Product> itemList) {
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
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);

        return new ViewHolder(view);
    }

    // load data in each row element
    @Override
    public void onBindViewHolder(final ViewHolder holder, final int listPosition) {
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
            final Intent intent;
            intent = new Intent(context, ProductDetails.class);
            context.startActivity(intent);
        }
    }
}