package com.example.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPostagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        PostagemAdapter adapter = new PostagemAdapter();
        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setAdapter(adapter);
    }
}
