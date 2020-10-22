package com.example.icouna.ui.contact;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.DocumentsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.icouna.R;
import com.google.android.material.textfield.TextInputEditText;

public class ContactFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_contact, container, false);
        Button send = root.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(root.getContext(), "Request Sent", Toast.LENGTH_SHORT).show();
                ClearFormData(root);
            }
        });
        ImageView mapImage = root.findViewById(R.id.mapImage);
        mapImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("https://www.google.com/maps/place/icouna+for+Technological+Investment/@30.06093,31.462156,18z/data=!4m5!3m4!1s0x0:0xa9cbf6a6f188c8e0!8m2!3d30.06093!4d31.4621564?hl=en-US"));
                startActivity(intent);
            }
        });
        TextView phone = root.findViewById(R.id.phone);
        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+20223076483"));
                startActivity(intent);
            }
        });

        TextView mail = root.findViewById(R.id.mail);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@icouna.com"});

                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(root.getContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return root;
    }

    private void ClearFormData(View root) {
        TextInputEditText name = root.findViewById(R.id.name);
        TextInputEditText subject = root.findViewById(R.id.subject);
        TextInputEditText email = root.findViewById(R.id.email);
        TextInputEditText phone = root.findViewById(R.id.phoneInput);
        TextInputEditText tell_us = root.findViewById(R.id.tell_us);
        name.setText(null);
        subject.setText(null);
        email.setText(null);
        phone.setText(null);
        tell_us.setText(null);
    }
}