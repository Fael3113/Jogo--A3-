
package projeto_a3;

import java.util.Random;

public class Dado{
    int valor;
    boolean precisaLancar;

    public Dado() {
        this.valor = -1;
        this.precisaLancar = true;
    }

    public void roll() {
        if (this.precisaLancar) {
            Random random = new Random();
            this.valor = random.nextInt(6) + 1;
            this.precisaLancar = false;
        }
    }
}
