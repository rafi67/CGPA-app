package com.softwaresolutions.cgpaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class ShowDialog extends AppCompatDialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle("Information")
                    .setMessage(Error_Data.r)
                    .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Error_Data e = new Error_Data(null);
                        }
                    });
        return builder.create();
    }
}
