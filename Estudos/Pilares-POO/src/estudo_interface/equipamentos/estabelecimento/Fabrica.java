package estudo_interface.equipamentos.estabelecimento;

import estudo_interface.equipamentos.impressora.Impressora;
import estudo_interface.equipamentos.impressora.Laserjet;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new Laserjet();

        impressora.imprimir();
    }
}
