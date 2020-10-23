package com.example.icouna.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;
import com.example.icouna.ui.about.Awards;
import com.example.icouna.ui.about.ValuesRecyclerViewAdapter;
import com.example.icouna.ui.products.Product;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    RecyclerView recyclerView;


    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public HomeFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static HomeFragment newInstance(int columnCount) {
        HomeFragment fragment = new HomeFragment();
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
    private WebView wv1;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Service(root);
        Product(root);
        TopOfTheMonth(root);
        Testimonials(root);
        wv1=(WebView)root.findViewById(R.id.webView);
        wv1.setWebViewClient(new MyBrowser());
        wv1.getSettings().setLoadsImagesAutomatically(true);
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        wv1.loadUrl("https://www.youtube.com/embed/8c399HPb01s");
        return root;

    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    private void Service(View root) {

        ArrayList<Awards> servicesList = new ArrayList<>();
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));


        Context context = root.getContext();
        recyclerView = (RecyclerView) root.findViewById(R.id.home_services);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        HomeServicesRecyclerViewAdapter servicesArrayAdapter = new HomeServicesRecyclerViewAdapter(R.layout.award_item, servicesList);

        recyclerView.setAdapter(servicesArrayAdapter);

    }

    private void Product(View root) {

        ArrayList<Awards> servicesList = new ArrayList<>();
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));
        servicesList.add(new Awards(R.mipmap.ic_space, "Icouna"));


        Context context = root.getContext();
        recyclerView = (RecyclerView) root.findViewById(R.id.home_product);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        HomeProductRecyclerViewAdapter homeProductRecyclerViewAdapter = new HomeProductRecyclerViewAdapter(R.layout.award_item, servicesList);

        recyclerView.setAdapter(homeProductRecyclerViewAdapter);

    }

    private void TopOfTheMonth(View root) {

        ArrayList<Product> valuesList = new ArrayList<>();
        valuesList.add(new Product(R.mipmap.ic_space, "AbdelHalim Mahmoud", "Android Developer"));
        valuesList.add(new Product(R.mipmap.ic_space, "AbdelHalim Mahmoud", "Android Developer"));
        valuesList.add(new Product(R.mipmap.ic_space, "AbdelHalim Mahmoud", "Android Developer"));
        valuesList.add(new Product(R.mipmap.ic_space, "AbdelHalim Mahmoud", "Android Developer"));
        valuesList.add(new Product(R.mipmap.ic_space, "AbdelHalim Mahmoud", "Android Developer"));


        Context context = root.getContext();
        recyclerView = (RecyclerView) root.findViewById(R.id.home_top_achievers);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        ValuesRecyclerViewAdapter valuesRecyclerViewAdapter = new ValuesRecyclerViewAdapter(R.layout.about_values_item, valuesList);

        recyclerView.setAdapter(valuesRecyclerViewAdapter);

    }

    private void Testimonials(View root) {

        ArrayList<Testimonials> valuesList = new ArrayList<>();
        valuesList.add(new Testimonials(R.mipmap.ic_space, "AbdelHalim Mahmoud Mohamed", "Android Developer", "Icouna", "Very good company lol, very professional staff, good product and services, very good quality"));
        valuesList.add(new Testimonials(R.mipmap.ic_space, "AbdelHalim Mahmoud Mohamed", "Android Developer", "Icouna", "Very good company lol"));
        valuesList.add(new Testimonials(R.mipmap.ic_space, "AbdelHalim Mahmoud Mohamed", "Android Developer", "Icouna", "Very good company lol"));
        valuesList.add(new Testimonials(R.mipmap.ic_space, "AbdelHalim Mahmoud Mohamed", "Android Developer", "Icouna", "Very good company lol"));
        valuesList.add(new Testimonials(R.mipmap.ic_space, "AbdelHalim Mahmoud Mohamed", "Android Developer", "Icouna", "Very good company lol"));


        Context context = root.getContext();
        recyclerView = (RecyclerView) root.findViewById(R.id.testimonials);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        TestimonialsRecyclerViewAdapter testimonialsRecyclerViewAdapter = new TestimonialsRecyclerViewAdapter(R.layout.testimonials_item, valuesList);

        recyclerView.setAdapter(testimonialsRecyclerViewAdapter);

    }
}