package com.example.icouna.ui.products;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.icouna.R;

public class ProductDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);
        Button button = findViewById(R.id.request_product);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ProductDetails.this, "Yaaaaaaaaaaaaaa Toast Baby!!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}