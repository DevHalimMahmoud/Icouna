package com.example.icouna.ui.about;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.icouna.R;
import com.example.icouna.ui.products.Product;
import com.example.icouna.ui.products.ProductsArrayAdapter;

import java.util.ArrayList;

public class AboutFragment extends Fragment {
    RecyclerView recyclerView;


    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public AboutFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static AboutFragment newInstance(int columnCount) {
        AboutFragment fragment = new AboutFragment();
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

        final View root = inflater.inflate(R.layout.fragment_about, container, false);

        ValuesRecyclerView(root);
        OurTeamRecyclerView(root);
        AwardsRecyclerView(root);
        Button comapny_profile = root.findViewById(R.id.company_profile);
        comapny_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(root.getContext(), "Downloading....", Toast.LENGTH_SHORT).show();
            }
        });


        return root;

    }


    private void ValuesRecyclerView(View root) {
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
        recyclerView = (RecyclerView) root.findViewById(R.id.values_list);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        ValuesRecyclerViewAdapter valuesRecyclerViewAdapter = new ValuesRecyclerViewAdapter(R.layout.about_values_item, valuesList);

        recyclerView.setAdapter(valuesRecyclerViewAdapter);


    }

    private void AwardsRecyclerView(View root) {
        ArrayList<Awards> valuesList = new ArrayList<>();
        valuesList.add(new Awards(R.mipmap.ic_space,"Nanodegree"));
        valuesList.add(new Awards(R.mipmap.ic_space,"Nanodegree"));
        Context context = root.getContext();
        recyclerView = (RecyclerView) root.findViewById(R.id.awards_recycler_view);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        AwardsRecyclerAdapter awardsRecyclerAdapter = new AwardsRecyclerAdapter(R.layout.award_item, valuesList);

        recyclerView.setAdapter(awardsRecyclerAdapter);


    }

    private void OurTeamRecyclerView(View root) {
        final ArrayList<OurTeam> ourTeamArrayList = new ArrayList<>();
        ourTeamArrayList.add(new OurTeam(1, "AbdelHalim Mahmoud", "Android Devaloper", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
        ourTeamArrayList.add(new OurTeam(2, "AbdelHalim Mahmoud", "Team Leader", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
        ourTeamArrayList.add(new OurTeam(3, "AbdelHalim Mahmoud", "IOS Devaloper", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
        ourTeamArrayList.add(new OurTeam(4, "AbdelHalim Mahmoud", "Project Manager", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
        ourTeamArrayList.add(new OurTeam(5, "AbdelHalim Mahmoud", "Web Devaloper", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
        ourTeamArrayList.add(new OurTeam(1, "AbdelHalim Mahmoud", "Android Devaloper", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));


        Context context = root.getContext();
        recyclerView = (RecyclerView) root.findViewById(R.id.our_team_recycler_view);
        if (mColumnCount <= 1) {
            recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        } else {
            recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
        }

        final OurTeamRecyclerAdapter ourTeamRecyclerAdapter = new OurTeamRecyclerAdapter(R.layout.our_team_item, ourTeamArrayList);

        recyclerView.setAdapter(ourTeamRecyclerAdapter);
        Button android = root.findViewById(R.id.android);
        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ourTeamArrayList.clear();
                ourTeamArrayList.add(new OurTeam(1, "AbdelHalim Mahmoud", "Android Devaloper", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(1, "Sara", "Android Devaloper", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(1, "Mustafa", "Android Devaloper", "Junior Android Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));

                ourTeamRecyclerAdapter.notifyDataSetChanged();
            }
        });
        Button team_leader = root.findViewById(R.id.team_leaders);
        team_leader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ourTeamArrayList.clear();
                ourTeamArrayList.add(new OurTeam(2, "AbdelHalim Mahmoud", "Team Leader", "Team Leader", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(2, "Sara", "Team Leader", "Team Leader", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(2, "Mustafa", "Team Leader", "Team Leader", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(2, "Sara", "Team Leader", "Team Leader", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));

                ourTeamRecyclerAdapter.notifyDataSetChanged();
            }
        });
        Button ios_developer = root.findViewById(R.id.ios);
        ios_developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ourTeamArrayList.clear();
                ourTeamArrayList.add(new OurTeam(3, "AbdelHalim Mahmoud", "IOS Developer", "IOS Developer", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(3, "Sara", "IOS Developer", "IOS Developer", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(3, "Mustafa", "IOS Developer", "IOS Developer", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(3, "AbdelHalim Mahmoud", "IOS Developer", "IOS Developer", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(3, "AbdelHalim Mahmoud", "IOS Developer", "IOS Developer", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));

                ourTeamRecyclerAdapter.notifyDataSetChanged();
            }
        });
        Button project_manager = root.findViewById(R.id.project);
        project_manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ourTeamArrayList.clear();
                ourTeamArrayList.add(new OurTeam(4, "AbdelHalim Mahmoud", "Project Manager", "Project Manager", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));

                ourTeamRecyclerAdapter.notifyDataSetChanged();
            }
        });
        Button web_developer = root.findViewById(R.id.web);
        web_developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ourTeamArrayList.clear();
                ourTeamArrayList.add(new OurTeam(5, "AbdelHalim Mahmoud", "Web Devaloper", "Junior Web Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(5, "Sara", "Web Devaloper", "Junior Web Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));
                ourTeamArrayList.add(new OurTeam(5, "Mustafa", "Web Devaloper", "Junior Web Devaloper", "https://www.linkedin.com/in/abdelhalim-mahmoud/?lipi=urn%3Ali%3Apage%3Ad_flagship3_feed%3BU%2B%2B6svsCTEe1oxfOrIkeHw%3D%3D", R.mipmap.icouna_logo, R.mipmap.linked));

                ourTeamRecyclerAdapter.notifyDataSetChanged();
            }
        });
    }
}