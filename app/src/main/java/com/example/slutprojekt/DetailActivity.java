package com.example.slutprojekt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private Item item;

    private TextView itemName;
    private TextView averagePrice;
    private TextView itemCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle extras = getIntent().getExtras();
        item = extras.getParcelable("input");

        itemName = findViewById(R.id.item_name);
        averagePrice = findViewById(R.id.average_price);
        itemCount = findViewById(R.id.item_count);

        itemName.setText(item.getName());
        averagePrice.setText(item.getAveragePrice());
        itemCount.setText(item.getItemCount());
    }
}