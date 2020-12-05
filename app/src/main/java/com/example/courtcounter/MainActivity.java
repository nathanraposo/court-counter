package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.courtcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Variavel binding do data binding nova forma para se usar o binding no android
    ActivityMainBinding binding;

    //Varial que controla quantidade de pontos do time A
    int qtdPontostimeA = 0;

    //Varial que controla quantidade de pontos do time B
    int qtdPontostimeB = 0;

    //Varial que controla quantidade de faltas do time A
    int qtdFaltastimeA = 0;

    //Varial que controla quantidade de faltas do time B
    int qtdFaltastimeB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    /**
     * Add 3 pontos no placar e exibe.
     */
    public void add3PontosTimeA(View view) {
        exibirPontosTimeA(qtdPontostimeA += 3);
    }

    /**
     * Add 2 pontos no placar e exibe.
     */
    public void add2PontosTimeA(View view) {
        exibirPontosTimeA(qtdPontostimeA += 2);
    }

    /**
     * Add 1 ponto no placar e exibe.
     */
    public void addLanceLivreTimeA(View view) {
        exibirPontosTimeA(qtdPontostimeA += 1);
    }

    /**
     * Add 1 falta no placar e exibe.
     */
    public void addFaltaTimeA(View view) {
        exibirFaltasTimeA(qtdFaltastimeA += 1);
    }

    /**
     * Exibe o placar de pontos do time A
     */
    public void exibirPontosTimeA(int pontos) {
        binding.timeAPontos.setText(String.valueOf(pontos));
    }

    /**
     * Exibe o placar de faltas do time A
     */
    public void exibirFaltasTimeA(int faltas) {
        binding.timeAFaltas.setText(String.valueOf(faltas));
    }

    //----------------------------------------//----------------------------------------------------

    /**
     * Add 3 pontos no placar e exibe.
     */
    public void add3PontosTimeB(View view) {
        exibirPontosTimeB(qtdPontostimeB += 3);
    }

    /**
     * Add 2 pontos no placar e exibe.
     */
    public void add2PontosTimeB(View view) {
        exibirPontosTimeB(qtdPontostimeB += 2);
    }

    /**
     * Add 1 pontos no placar e exibe.
     */
    public void addLanceLivreTimeB(View view) {
        exibirPontosTimeB(qtdPontostimeB += 1);
    }

    /**
     * Add 1 falta no placar e exibe.
     */
    public void addFaltaTimeB(View view) {
        exibirFaltasTimeB(qtdFaltastimeB += 1);
    }

    /**
     * Exibe o placar de pontos do time B
     */
    public void exibirPontosTimeB(int score) {
        binding.timeBPontos.setText(String.valueOf(score));
    }

    /**
     * Exibe o placar  de faltas do time B
     */
    public void exibirFaltasTimeB(int faltas) {
        binding.timeBFaltas.setText(String.valueOf(faltas));
    }

    /**
     * Redefine o placar de ambos os times
     */
    public void redefinirPontuacao(View view) {

        //Pontos
        binding.timeAPontos.setText(String.valueOf(qtdPontostimeA = 0));
        binding.timeBPontos.setText(String.valueOf(qtdPontostimeB = 0));

        //Faltas
        binding.timeAFaltas.setText(String.valueOf(qtdFaltastimeA = 0));
        binding.timeBFaltas.setText(String.valueOf(qtdFaltastimeB = 0));
    }
}