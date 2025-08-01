package com.mycompany.mavenproject2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraSwing extends JFrame implements ActionListener {
    private final JTextField display;
    private double valor1 = 0;
    private String operacao = "";
    private boolean operacaoRealizada = false;

    public CalculadoraSwing() {
        setTitle("Calculadora Simples");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4, 5, 5));

        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.BOLD, 20));
            botao.addActionListener(this);
            painelBotoes.add(botao);
        }

        getContentPane().setLayout(new BorderLayout(5, 5));
        getContentPane().add(display, BorderLayout.NORTH);
        getContentPane().add(painelBotoes, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if ("0123456789".contains(comando)) {
            if (operacaoRealizada) {
                display.setText("");
                operacaoRealizada = false;
            }
            display.setText(display.getText() + comando);
        } else if (comando.equals("C")) {
            display.setText("");
            valor1 = 0;
            operacao = "";
        } else if (comando.equals("=")) {
            if (!operacao.isEmpty()) {
                try {
                    double valor2 = Double.parseDouble(display.getText());
                    double resultado = calcular(valor1, valor2, operacao);
                    display.setText(String.valueOf(resultado));
                    operacao = "";
                    operacaoRealizada = true;
                } catch (NumberFormatException ex) {
                    display.setText("Erro");
                }
            }
        } else { // Operações +, -, *, /
            if (!display.getText().isEmpty()) {
                try {
                    valor1 = Double.parseDouble(display.getText());
                    operacao = comando;
                    display.setText("");
                } catch (NumberFormatException ex) {
                    display.setText("Erro");
                }
            }
        }
    }

    private double calcular(double v1, double v2, String op) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v2 != 0 ? v1 / v2 : 0;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculadoraSwing calc = new CalculadoraSwing();
            calc.setVisible(true);
        });
    }
}
