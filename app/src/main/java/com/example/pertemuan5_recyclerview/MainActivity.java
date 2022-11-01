package com.example.pertemuan5_recyclerview;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView RecylerView;
    String s1[], s2[],s3[];
    int images[] =
            {R.drawable.canon,R.drawable.nikon,R.drawable.sony,R.drawable.lumix};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecylerView = findViewById(R.id.recyclerView);
        s1 = getResources().getStringArray(R.array.makanan);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.star);
        AppAdapter appAdapter = new AppAdapter(this,s1,s2,s3,images);
        RecylerView.setAdapter(appAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager((this),
                LinearLayoutManager.HORIZONTAL, false);
        RecylerView.setLayoutManager(new
                LinearLayoutManager(this));
    }
}