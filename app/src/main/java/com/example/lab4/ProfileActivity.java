package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void SetTeamiIcon(View view){
        Intent returnIntent = new Intent();
        ImageView selectedImage = (ImageView) view;
        returnIntent.putExtra("imageID",selectedImage.getId());
        setResult(RESULT_OK,returnIntent);
        finish();
    }

    public void openFromCamera(View view){
        Intent intent = new Intent((MediaStore.ACTION_IMAGE_CAPTURE));
    }



}