package com.example.cardview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        ((LinearLayoutManager) layoutManager).setOrientation(LinearLayout.HORIZONTAL);
        recyclerPostagem.setLayoutManager(layoutManager);


        this.prepararPostagens();
        recyclerPostagem.setHasFixedSize(true);
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens() {
        Postagem p = new Postagem("Paulo Freire", "#tbt viagem legal", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("João Filho", "#tbt viagem legal", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Maria do Carmo", "#tbt viagem legal", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Chagas de lima", "#tbt viagem legal", R.drawable.imagem4);
        this.postagens.add(p);
    }
}
