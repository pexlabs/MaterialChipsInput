package com.pchmn.sample.materialchipsinput;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.toString();
    private Button mContactListButton;
    private Button mCustomChipsButton;
    private Button mDialogFragment;
    private int mStackLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContactListButton = (Button) findViewById(R.id.contacts_button);
        mCustomChipsButton = (Button) findViewById(R.id.custom_chips_button);
        mDialogFragment = (Button) findViewById(R.id.dialog_fragment);

        mContactListButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ContactListActivity.class));
        });

        mCustomChipsButton.setOnClickListener(view -> {
            startActivity(new Intent(MainActivity.this, ChipExamplesActivity.class));
        });

        mDialogFragment.setOnClickListener(view -> {
            showDialog();
        });

    }

    public void showDialog() {
        mStackLevel++;

        // DialogFragment.show() will take care of adding the fragment
        // in a transaction.  We also want to remove any currently showing
        // dialog, so make our own transaction and take care of that here.
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        Fragment prev = getSupportFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create and show the dialog.
        MyDialogFragment newFragment = MyDialogFragment.newInstance(mStackLevel);
        newFragment.show(ft, "ok");
    }
}
