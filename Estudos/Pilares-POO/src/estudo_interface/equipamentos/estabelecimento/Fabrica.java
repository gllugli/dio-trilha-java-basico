package estudo_interface.equipamentos.estabelecimento;

import estudo_interface.equipamentos.impressora.Impressora;
// import estudo_interface.equipamentos.impressora.Laserjet;
// import estudo_interface.equipamentos.impressora.Deskjet;
import estudo_interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Impressora impressora = new EquipamentoMultifuncional();

        impressora.imprimir();
    }
}
