package projeto_a3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Jogador {

    public static final int NOTHING = 0;
    public static final int PAIR = 1;
    public static final int TWOPAIR = 2;
    public static final int THREEOFKIND = 3;
    public static final int FIVEHIGHSTRAIGHT = 4; // dice 1-5 inclusive
    public static final int SIXHIGHSTRAIGHT = 5; // dice 2-6 inclusive
    public static final int FULLHOUSE = 6; // Pair + 3of Kind
    public static final int FOUROFKIND = 7;
    public static final int FIVEOFKIND = 8;

    public String nome;
    public boolean humano;
    private Dado[] dado;

    public Jogador(boolean humanity, String name) {
        this.nome = name;
        this.humano = humanity;
        this.dado = new Dado[5];
        for (int i = 0; i < 5; i++) {
            this.dado[i] = new Dado();
        }
    }

    public int valorTotalDado() {
        int total = 0;
        for (Dado dado : this.dado) {
            total += dado.valor;
        }
        return total;
    }

    public void reporte() {
        System.out.print(this.nome + " dados sao:\n");
        int diceNum = 1;
        for (Dado dado : this.dado) {
            System.out.print("Dado " + diceNum + ": [" + dado.valor + "],\n");
            diceNum++;
        }
    }

    public void lancarDados(String rollsNeededStr) {
        ArrayList<Dado> rollsNeeded = new ArrayList<Dado>();
        for (char c : rollsNeededStr.toCharArray()) {
            if (Character.isDigit(c) && Integer.parseInt(String.valueOf(c)) >= 1 && Integer.parseInt(String.valueOf(c)) <= 6) {
                rollsNeeded.add(this.dado[Integer.parseInt(String.valueOf(c)) - 1]);
            }
        }
        for (Dado dado : rollsNeeded) {
            dado.precisaLancar = true;
        }
        for (Dado dado : this.dado) {
            dado.roll();
        }
    }

    public int pontuacao() {

        // funtion that takes a list of die and returns a score based off the dice
        int numPairs = 0;
        boolean trip = false;

        // Five of Kind Check
        boolean five = true;
        int checkVal = dado[0].valor;
        for (int i = 1; i < dado.length; i++) {
            if (dado[i].valor != checkVal) {
                five = false;
                break;
            }
        }
        if (five) {
            return FIVEOFKIND;
        }

        //Four of Kind/Full House/Trips/Pair Check
        int count = 0;
        for (Dado die1 : dado) {
            for (Dado die2 : dado) {
                if (die1.valor == die2.valor) {
                    count += 1;
                }
            }
            if (count == 4) {
                return FOUROFKIND;
            }
            if (count == 3) {
                trip = true;
            }
            if (count == 2) {
                numPairs += 1;
            }
            count = 0;
        }
        if (trip && numPairs == 2) {
            return FULLHOUSE;
        }
        if (trip) {
            return THREEOFKIND;
        }
        if (numPairs == 4) {
            return TWOPAIR;
        }
        if (numPairs == 2) {
            return PAIR;
        }

        //six or five high straight (2-6)/(1-5) check
        List<Integer> diceVals = new ArrayList<Integer>();
        for (Dado die : dado) {
            diceVals.add(die.valor);
        }
        Collections.sort(diceVals);
        if (diceVals.equals(Arrays.asList(2, 3, 4, 5, 6))) {
            return SIXHIGHSTRAIGHT;
        }
        if (diceVals.equals(Arrays.asList(1, 2, 3, 4, 5))) {
            return FIVEHIGHSTRAIGHT;
        }
        return NOTHING;
        
    }

    public void pontuacaoReporte(int score) {
        if (score == NOTHING) {
            System.out.println(this.nome + " Nao tem nada\n");
        } else if (score == PAIR) {
            System.out.println(this.nome + " Tem um par\n");
        } else if (score == TWOPAIR) {
            System.out.println(this.nome + " Tem dois pares\n");
        } else if (score == THREEOFKIND) {
            System.out.println(this.nome + " Tem um trio\n");
        } else if (score == FIVEHIGHSTRAIGHT) {
            System.out.println(this.nome + " Tem uma sequencia de 1 a 5\n");
        } else if (score == SIXHIGHSTRAIGHT) {
            System.out.println(this.nome + " Tem uma sequencia de 2 a 6\n");
        } else if (score == FULLHOUSE) {
            System.out.println(this.nome + " Tem um Full House\n");
        } else if (score == FOUROFKIND) {
            System.out.println(this.nome + " Tem um quarteto\n");
        } else if (score == FIVEOFKIND) {
            System.out.println(this.nome + " Tem um quinteto\n");
        }
    }

    public void reporteTotal() {
        this.reporte();
        this.pontuacaoReporte(this.pontuacao());
    }

    public String procurarMelhorSequencia() {
        int atualDado = 1;
        int dadoValSave = -1;
        int pontuacaoBase = this.pontuacao();
        String needRolls = "";
        for (Dado die : this.dado) {
            dadoValSave = die.valor;
            die.valor = -1;
            if (this.pontuacao() == pontuacaoBase) {
                needRolls = needRolls + Integer.toString(atualDado);
            }
            die.valor = dadoValSave;
            atualDado += 1;
        }
        return needRolls;
    }

}
