package com.example.icouna.ui.joinUs;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;
import com.example.icouna.ui.services.ServiceDetails;

import java.util.ArrayList;

public class CareersRecyclerViewAdapter extends RecyclerView.Adapter<CareersRecyclerViewAdapter.ViewHolder> {

    //All methods in this adapter are required for a bare minimum recyclerview adapter
    private int listItemLayout;
    private ArrayList<JoinUsItem> itemList;

    // Constructor of the class
    public CareersRecyclerViewAdapter(int layoutId, ArrayList<JoinUsItem> itemList) {
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
    public CareersRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(listItemLayout, parent, false);

        return new CareersRecyclerViewAdapter.ViewHolder(view);
    }

    // load data in each row element
    @Override
    public void onBindViewHolder(final CareersRecyclerViewAdapter.ViewHolder holder, final int listPosition) {

        TextView title = holder.title;
        TextView location = holder.location;

        title.setText(itemList.get(listPosition).getTitle());
        location.setText(itemList.get(listPosition).getLocation());
    }

    // Static inner class to initialize the views of rows
    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView location, title;
        public Button more;
        private final Context context;

        public ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();
            itemView.setOnClickListener(this);
            location = (TextView) itemView.findViewById(R.id.join_location);
            title = (TextView) itemView.findViewById(R.id.join_title);
            more = (Button) itemView.findViewById(R.id.more);
            more.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final Intent intent;
                    intent = new Intent(context, ServiceDetails.class);
                    context.startActivity(intent);
                }
            });
        }

        @Override
        public void onClick(View view) {
            Log.d("onclick", "onClick " + getLayoutPosition() + " " + title.getText());
           /* MainActivity mainActivity = new MainActivity();
            mainActivity.switchContent(R.id.nav_home, new HomeFragment(), view);*/

        }
    }
}
