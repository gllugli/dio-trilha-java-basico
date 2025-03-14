package estudo_interface.equipamentos.multifuncional;

import estudo_interface.equipamentos.impressora.Impressora;
import estudo_interface.equipamentos.copiadora.Copiadora;
import estudo_interface.equipamentos.digitalizadora.Digitalizadora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional...");
    }

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional...");
    }

    public void digitalizar() {
        System.out.println("Digitalizando via equipamento multifuncional...");
    }
}
