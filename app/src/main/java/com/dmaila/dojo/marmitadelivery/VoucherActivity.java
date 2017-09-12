package com.dmaila.dojo.marmitadelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VoucherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voucher);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String voucherText = bundle.getString("ORDER_SENT");

        TextView textView = (TextView) findViewById(R.id.voucher_text);
        textView.setText(voucherText);
    }
}
