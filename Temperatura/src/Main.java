import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Escreva um programa em Java que solicite ao usuário uma temperatura em graus Celsius e então
        //converta em graus Fahrenheit, Kelvin e graus Rankine. Pesquise as fórmulas.
        String temperatura = JOptionPane.showInputDialog(null, "Digite um temperatura em gruas Celsius");
        double temp = Double.parseDouble(temperatura);

        double fh, kv, rk;

        //(0°C × 9/5) + 32 = 32°F
        fh = temp * 1.8 + 37;
        //0°C + 273.15 = 273.15K
        kv = temp + 273.15;
        //0°C × 9/5 + 491.67
        rk = temp * 1.8 + 491.67;

        //System.out.println(fh);
        JOptionPane.showMessageDialog(null, "Temperatura em Celsius: " + temp);
        JOptionPane.showMessageDialog(null, "Temperatura em Fahrenheit: " + fh);
        JOptionPane.showMessageDialog(null, "Temperatura em Kelvin: " + kv);
        JOptionPane.showMessageDialog(null, "Temperatura em Rankine: " + rk);
    }
}