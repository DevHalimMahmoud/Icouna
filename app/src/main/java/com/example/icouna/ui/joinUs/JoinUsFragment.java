package com.example.icouna.ui.joinUs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.icouna.R;
import com.example.icouna.ui.products.ProductDetails;

public class JoinUsFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_join_us, container, false);
        final Context context=root.getContext();
        TextView intern = root.findViewById(R.id.intern);
        intern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent;
                intent = new Intent(context, Internships.class);
                context.startActivity(intent);
            }
        });

        TextView careers = root.findViewById(R.id.careers);
        careers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Intent intent;
                intent = new Intent(context, Careers.class);
                context.startActivity(intent);
            }
        });
        return root;
    }
}