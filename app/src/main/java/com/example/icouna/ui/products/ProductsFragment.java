package com.example.icouna.ui.products;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;

import java.util.ArrayList;


public class ProductsFragment extends Fragment {
    RecyclerView recyclerView;


    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ProductsFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static ProductsFragment newInstance(int columnCount) {
        ProductsFragment fragment = new ProductsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_products, container, false);


        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android android android android android android android android android android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android"));
        productList.add(new Product(R.mipmap.ic_space, "Icouna", "android"));


        Context context = root.getContext();
        recyclerView = (RecyclerView) root.findViewById(R.id.product_list);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        ProductsArrayAdapter productsArrayAdapter = new ProductsArrayAdapter(R.layout.services_item, productList);

        recyclerView.setAdapter(productsArrayAdapter);


        return root;

    }
}
