import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Pegar um texto do usuário por GUI
        String Teste = JOptionPane.showInputDialog(null, "Digite um texto: ");
        //Exibir texto através de GUI
        JOptionPane.showMessageDialog(null, Teste);

        //Pegar opção do usuário por GUI
        int op = JOptionPane.showConfirmDialog(null, "Sim ou não?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION);

        if (op == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Apertou Sim");
        } else {
            if (op == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Apertou Não");
            } else {
                JOptionPane.showMessageDialog(null, "Apertou Cancela");
            }
        }
    }
}