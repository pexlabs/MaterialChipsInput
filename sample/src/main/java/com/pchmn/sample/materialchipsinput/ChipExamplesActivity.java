package com.pchmn.sample.materialchipsinput;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.pchmn.materialchips.ChipView;
import com.pchmn.materialchips.util.ViewUtil;

public class ChipExamplesActivity extends AppCompatActivity {

    private static final String TAG = ChipExamplesActivity.class.toString();
    private LinearLayout mLayout;
    private ChipView mChip1;
    private ChipView mChip2;
    private ChipView mChip3;
    private ChipView mChip4;
    private ChipView mChip5;
    private ChipView mChip6;
    private ChipView mChip7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chip_examples);

        mLayout = (LinearLayout) findViewById(R.id.layout);
        mChip1 = (ChipView) findViewById(R.id.chip1);
        mChip2 = (ChipView) findViewById(R.id.chip2);
        mChip3 = (ChipView) findViewById(R.id.chip3);
        mChip4 = (ChipView) findViewById(R.id.chip4);
        mChip5 = (ChipView) findViewById(R.id.chip5);
        mChip6 = (ChipView) findViewById(R.id.chip6);
        mChip7 = (ChipView) findViewById(R.id.chip7);

        // chip 1
        mChip1.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip1.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
            mChip5.tintAvatarIcon(Color.RED, PorterDuff.Mode.SRC_IN);
        });
        mChip1.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip1.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 2
        mChip2.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip2.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 3
        mChip3.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip3.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip3.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip3.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 4
        mChip4.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip4.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip4.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip4.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 5
        mChip5.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip5.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
            mChip5.tintAvatarIcon(Color.GREEN, PorterDuff.Mode.SRC_IN);
        });

        // chip 6
        mChip6.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip6.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip6.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip6.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });

        // chip 7
        mChip7.setOnChipClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip7.getLabel() + ": clicked", Toast.LENGTH_SHORT).show();
        });
        mChip7.setOnDeleteClicked(view -> {
            Toast.makeText(ChipExamplesActivity.this, mChip7.getLabel() + ": delete clicked", Toast.LENGTH_SHORT).show();
        });


        // programmatically
        Uri uri = null;
        ChipView chipView1 = new ChipView(this);
        chipView1.setLabel("Pritesh", 0, ViewUtil.dpToPx(5));
        chipView1.setPadding(2,2,2,2);
        chipView1.setHasAvatarIcon(true);
        chipView1.setChipBorderColor(7, Color.BLUE);

        ChipView chipView2 = new ChipView(this);
        chipView2.setLabel("Test 1", 20, ViewUtil.dpToPx(20));
        chipView2.setChipBackgroundColor(ContextCompat.getColor(this, R.color.colorAccent));
        chipView2.setLabelColor(ContextCompat.getColor(this, R.color.colorPrimary));
        chipView2.setAvatarIcon(uri);
        chipView2.setDeleteIconColor(ContextCompat.getColor(this, R.color.colorPrimary));

        mLayout.addView(chipView1);
        mLayout.addView(chipView2);
    }
}
