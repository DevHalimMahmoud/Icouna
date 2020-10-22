package com.example.icouna.ui.home;

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

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        Service(root);
        Product(root);
        TopOfTheMonth(root);
        return root;

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
        valuesList.add(new Product(R.mipmap.ic_space, "SCIENCE-DRIVEN", "icouna’s team does not waste time debating about subjective opinions, but only facts supported by science, articles, or research papers. Our language in icouna is science; we do not guess, do not assume, do not hesitate, instead we KNOW, because we study, read, and use validated references, and accept science even if it contradicts our own subjective opinions"));
        valuesList.add(new Product(R.mipmap.ic_space, "SOLUTION-FOCUSED", "Our team focuses on functionality and optimization before -literally- anything else. Customization and tailoring apps and business systems are lifestyle elements in icouna. We do not care if the solution is fancy at the first phase, but we make sure it is a working, result-focused, goal oriented, and providing measurable results. After taking care of the numbers, we dress our digital products to please the eye"));
        valuesList.add(new Product(R.mipmap.ic_space, "SECURITY-FORTRESS", "icouna’s oxygen is data; we breathe and feed on data, and to protect our existence we protect data with all advanced means of security. We never save cost when it comes to data protection and security, and we have team members with long international experience in data security. Our clients and partners’ data is secure and safe in the always upgrading the digital fortress of icouna"));
        valuesList.add(new Product(R.mipmap.ic_space, "SATISFACTION", "Convenience and customer satisfaction are essential keywords in icouna, and it is not just a word we say. We follow a methodology to ensure it, through transparency, customer feedback, decency, and listening; our team is trained on active listening concept to ensure positive communication. Yes, we breathe on data and talk the language of numbers, but we are not robots, we know how to build a professional and human-centered relationship with our partners"));
        valuesList.add(new Product(R.mipmap.ic_space, "SCIENCE-DRIVEN", "icouna’s team does not waste time debating about subjective opinions, but only facts supported by science, articles, or research papers. Our language in icouna is science; we do not guess, do not assume, do not hesitate, instead we KNOW, because we study, read, and use validated references, and accept science even if it contradicts our own subjective opinions"));
        valuesList.add(new Product(R.mipmap.ic_space, "SOLUTION-FOCUSED", "Our team focuses on functionality and optimization before -literally- anything else. Customization and tailoring apps and business systems are lifestyle elements in icouna. We do not care if the solution is fancy at the first phase, but we make sure it is a working, result-focused, goal oriented, and providing measurable results. After taking care of the numbers, we dress our digital products to please the eye"));
        valuesList.add(new Product(R.mipmap.ic_space, "SECURITY-FORTRESS", "icouna’s oxygen is data; we breathe and feed on data, and to protect our existence we protect data with all advanced means of security. We never save cost when it comes to data protection and security, and we have team members with long international experience in data security. Our clients and partners’ data is secure and safe in the always upgrading the digital fortress of icouna"));
        valuesList.add(new Product(R.mipmap.ic_space, "SATISFACTION", "Convenience and customer satisfaction are essential keywords in icouna, and it is not just a word we say. We follow a methodology to ensure it, through transparency, customer feedback, decency, and listening; our team is trained on active listening concept to ensure positive communication. Yes, we breathe on data and talk the language of numbers, but we are not robots, we know how to build a professional and human-centered relationship with our partners"));
        valuesList.add(new Product(R.mipmap.ic_space, "SCIENCE-DRIVEN", "icouna’s team does not waste time debating about subjective opinions, but only facts supported by science, articles, or research papers. Our language in icouna is science; we do not guess, do not assume, do not hesitate, instead we KNOW, because we study, read, and use validated references, and accept science even if it contradicts our own subjective opinions"));
        valuesList.add(new Product(R.mipmap.ic_space, "SOLUTION-FOCUSED", "Our team focuses on functionality and optimization before -literally- anything else. Customization and tailoring apps and business systems are lifestyle elements in icouna. We do not care if the solution is fancy at the first phase, but we make sure it is a working, result-focused, goal oriented, and providing measurable results. After taking care of the numbers, we dress our digital products to please the eye"));
        valuesList.add(new Product(R.mipmap.ic_space, "SECURITY-FORTRESS", "icouna’s oxygen is data; we breathe and feed on data, and to protect our existence we protect data with all advanced means of security. We never save cost when it comes to data protection and security, and we have team members with long international experience in data security. Our clients and partners’ data is secure and safe in the always upgrading the digital fortress of icouna"));
        valuesList.add(new Product(R.mipmap.ic_space, "SATISFACTION", "Convenience and customer satisfaction are essential keywords in icouna, and it is not just a word we say. We follow a methodology to ensure it, through transparency, customer feedback, decency, and listening; our team is trained on active listening concept to ensure positive communication. Yes, we breathe on data and talk the language of numbers, but we are not robots, we know how to build a professional and human-centered relationship with our partners"));


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
}