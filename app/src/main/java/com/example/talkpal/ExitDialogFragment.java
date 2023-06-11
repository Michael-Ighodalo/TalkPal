package com.example.talkpal;

/**
 * Created by Michael on 15-12-2020.
 */

import android.app.Dialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.app.DialogFragment;
import android.app.AlertDialog;

public class ExitDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder theDialog= new AlertDialog.Builder(getActivity());
        theDialog.setTitle(R.string.exit_question);
        theDialog.setPositiveButton("Yeah", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getActivity().finish();
                    }
                });
        theDialog.setNegativeButton("Nope", new
                DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        getDialog().cancel();
                    }
                });
        return theDialog.create();
    }
}