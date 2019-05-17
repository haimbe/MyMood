package com.example.mymood;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ImageView mSmiley;
    private ImageButton mCommentaire;
    private ImageButton mHistorique;
    private FrameLayout mfond;
    int i=0;
    String mood;

    private int[] galimages = new int[] {
            R.drawable.tresmauvaisehumeur, R.drawable.mauvaisehumeur, R.drawable.normal, R.drawable.content,R.drawable.trescontent

    };

    private int[] galcolors = new int[] {
            R.color.red, R.color.pink, R.color.blue, R.color.green, R.color.yellow};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mSmiley = (ImageView) findViewById(R.id.Smiley);
        mCommentaire = (ImageButton) findViewById(R.id.Commentaire);
        mHistorique = (ImageButton) findViewById(R.id.Historique);

        mSmiley.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mood = mSmiley.getContentDescription();

                // The user just clicked
            }
        });








        mCommentaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //On instancie notre layout en tant que View
                LayoutInflater factory = LayoutInflater.from(getApplicationContext());
                final View alertDialogView = factory.inflate(R.layout.alertdialogperso, null);

                //Création de l'AlertDialog
                AlertDialog.Builder adb = new AlertDialog.Builder(getApplicationContext());

                //On affecte la vue personnalisé que l'on a crée à notre AlertDialog
                adb.setView(alertDialogView);

                //On donne un titre à l'AlertDialog
                adb.setTitle("Titre de notre boite de dialogue");

                //On modifie l'icône de l'AlertDialog pour le fun ;)
                adb.setIcon(android.R.drawable.ic_dialog_alert);

                //On affecte un bouton "OK" à notre AlertDialog et on lui affecte un évènement
                adb.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        //Lorsque l'on cliquera sur le bouton "OK", on récupère l'EditText correspondant à notre vue personnalisée (cad à alertDialogView)
                        EditText et = (EditText)alertDialogView.findViewById(R.id.EditText1);

                        //On affiche dans un Toast le texte contenu dans l'EditText de notre AlertDialog
                        Toast.makeText(getApplicationContext(), et.getText(), Toast.LENGTH_SHORT).show();
                    } });

                //On crée un bouton "Annuler" à notre AlertDialog et on lui affecte un évènement
                adb.setNegativeButton("Annuler", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //Lorsque l'on cliquera sur annuler on quittera l'application
                        finish();
                    } });
                adb.show();
            }

            };

        mHistorique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // The user just clicked
            }
        });

        Intent HistoriqueActivity = new Intent(MainActivity.this, HistoriqueActivity.class);
        startActivity(HistoriqueActivity);
        }

    public void OnSwipeBottom(){
        mSmiley.setImageResource(galimages[(i-1)]);
        mfond.setBackgroundColor(galcolors[(i-1)]);
    }

    public void OnSwipeTop(){
        mSmiley.setImageResource(galimages[(i+1)]);
        mfond.setBackgroundColor(galcolors[(i+1)]);
    }
        }




