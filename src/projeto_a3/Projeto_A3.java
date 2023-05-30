package projeto_a3;

import java.util.Scanner;
import java.util.ArrayList;

public class Projeto_A3 {

    public static final boolean Pessoa = true;
    public static final boolean Computador = false;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bem vindo ao poker de dado.\n"
                            + "Quantos jogadores haveram?\n"
                            + "Pode-se ter ate 5.");
        int numJogadores = 0;
        int numAI = 0;
        int numHumanos = 0;

        while (true) {
            try {
                numJogadores = Integer.parseInt(input.nextLine());
                if (numJogadores >= 1 && numJogadores <= 5) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Preciso de um numero entre 1 e 5");
            }
        }
        System.out.println("Quantos jogadores serao AI?");
        while (true) {
            try {
                numAI = Integer.parseInt(input.nextLine());
                if (numAI >= 0 && numAI <= numJogadores) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Podemos ter apenas 5 jogadores.");
            }
        }
        ArrayList<Jogador> players = new ArrayList<Jogador>();
        numHumanos = numJogadores - numAI;
        for (int num = 0; num < numHumanos; num++) {
            System.out.println("Qual o nome do jogador " + (num + 1) + "?");
            String tempname = input.nextLine();
            players.add(new Jogador(Pessoa, tempname));
        }
        for (int num = 0; num < numAI; num++) {
            players.add(new Jogador(Computador, "AI" + (num + 1)));
        }

        for (Jogador play : players) {
            play.lancarDados("");
            play.reporteTotal();
        }

        for (Jogador play : players) {
            if (play.humano == Pessoa) {
                System.out.println(play.nome + ".\n"
                        + "Voce gostaria de re-lancar os dados?\n"
                        + "(Digite o numero dos dados, separado por ',')");
                play.lancarDados(new Scanner(System.in).nextLine());
            } else {
                play.lancarDados(play.procurarMelhorSequencia());
            }
        }

        for (Jogador play : players) {
            play.reporteTotal();
        }

        Jogador melhorJogador = players.get(0);
        int index = 0;
        boolean empate = false;
        ArrayList<Jogador> jogadoresEmpatados = new ArrayList<Jogador>();

        for (int i = 1; i < players.size(); i++) {
            Jogador jogador = players.get(i);
            if (jogador.pontuacao() > melhorJogador.pontuacao()) {
                melhorJogador = jogador;
                continue;
            }
            if (jogador.pontuacao() == melhorJogador.pontuacao()) {
                if (jogador.valorTotalDado() > melhorJogador.valorTotalDado()) {
                    melhorJogador = jogador;
                    continue;
                } else if (jogador.valorTotalDado() == melhorJogador.valorTotalDado()) {
                    empate = true;
                    jogadoresEmpatados.add(melhorJogador);
                    jogadoresEmpatados.add(jogador);
                    continue;
                }
            }
        }
        if (empate) {
            System.out.println("É um empate entre: ");
            for (Jogador play : jogadoresEmpatados) {
                System.out.println(play.nome);
            }
        } else {
            System.out.println(melhorJogador.nome + " é o vencedor!");
        }
    }
}
