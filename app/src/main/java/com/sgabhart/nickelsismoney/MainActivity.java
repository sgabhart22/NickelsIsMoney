package com.sgabhart.nickelsismoney;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static Mortgage mortgage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mortgage = new Mortgage();
        setContentView(R.layout.activity_main);
    }

    public void onStart(){
        super.onStart();
        updateView();
    }

    public void updateView(){
        TextView amountTV = (TextView)(findViewById(R.id.amount));
        amountTV.setText(mortgage.getFormattedAmount());
        TextView yearsTV = (TextView)(findViewById(R.id.years));
        yearsTV.setText(mortgage.getYears());
        TextView rateTV = (TextView)(findViewById(R.id.rate));
        rateTV.setText(100 * mortgage.getRate() + "%");
        TextView monthlyTV = (TextView)(findViewById(R.id.payment));
        monthlyTV.setText(mortgage.formattedMonthly());
        TextView totalTV = (TextView)(findViewById(R.id.total));
        totalTV.setText(mortgage.formattedTotal());
    }

    public void modifyData(View v){
        Intent myIntent = new Intent(this, DataActivity.class);
        this.startActivity(myIntent);
    }
}
