package jogo;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Start {

	JFrame tela = new JFrame("Jogo da Velha");
	JToolBar tb = new JToolBar();
	JLabel bemVindo = new JLabel();
	JLabel jogador1 = new JLabel();
	JLabel jogador2 = new JLabel();
	JTextField campoJogador1 = new JTextField();
	JTextField campoJogador2 = new JTextField();
	JButton ajuda = new JButton("Ajuda");
	JButton confirmar = new JButton("iniciar Jogo");
	JButton cancelar = new JButton("Cancelar");

	public Start() {

		tb.setBounds(0, 0, 400, 30);

		bemVindo.setText("Bem Vindo ao Jogo da Velha!!");
		bemVindo.setBounds(100, 45, 200, 30);

		jogador1.setText("Nome do Jogador 1");
		jogador1.setBounds(35, 80, 140, 30);
		campoJogador1.setBounds(30, 115, 140, 25);

		jogador2.setText("Nome do Jogador 2");
		jogador2.setBounds(225, 80, 140, 30);
		campoJogador2.setBounds(220, 115, 140, 25);

		confirmar.setBounds(130, 180, 110, 30);
		confirmar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonConfirmarActionPerformed(evt);
			}
		});
		
		ajuda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAjudaActionPerformed(evt);
			}
		});

		cancelar.setBounds(260, 180, 110, 30);
		cancelar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.exit(0);
			}
		});

		tela.setSize(400, 260);
		tb.add(ajuda);
		tela.add(tb);
		tela.add(bemVindo);
		tela.add(campoJogador1);
		tela.add(campoJogador2);
		tela.add(jogador1);
		tela.add(jogador2);
		tela.add(cancelar);
		tela.add(confirmar);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setVisible(true);
	}

	protected void jButtonConfirmarActionPerformed(ActionEvent evt) {
		Jogador jogador1 = new Jogador('X', campoJogador1.getText());
		Jogador jogador2 = new Jogador('O', campoJogador2.getText());
		tela.dispose();
		Tela tela = new Tela(jogador1, jogador2);
	}
	
	protected void jButtonAjudaActionPerformed(ActionEvent evt) {
		String texto = "O tabuleiro  é uma matriz  de três linhas por três colunas.\n\n"
				+ "Dois jogadores escolhem uma marcação cada um, geralmente um círculo (O) e um xis (X).\n\n"
				+ "Os jogadores jogam alternadamente, uma marcação por vez, numa lacuna que esteja vazia.\n\n"
				+ "O objectivo é conseguir três círculos ou três xis em linha, quer horizontal,\n"
				+ "vertical ou diagonal , e ao mesmo tempo, quando possível, impedir o adversário\n"
				+ "de ganhar na próxima jogada.";
		JOptionPane.showMessageDialog(null, texto);
	}	

	public static void main(String[] args) {
		Start start = new Start();
	}

}
