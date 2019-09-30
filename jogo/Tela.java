package jogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;

public class Tela {
	JFrame tela = new JFrame("Jogo da Velha");
	JToolBar tb = new JToolBar();
	JLabel label = new JLabel(" ");
	JLabel label2 = new JLabel("                      ");
	JLabel texto1 = new JLabel();
	JLabel texto2 = new JLabel();

	JButton[] botao = new JButton[9];

	JButton botaoNovo = new JButton("Novo Jogo");
	JButton botaoSair = new JButton("Sair");
	JButton botaoAjuda = new JButton("Ajuda");

	private Jogador jogador1, jogador2;
	private static char[] espaco = new char[9];
	public static boolean jogadaJogador1 = true;
	private int numeroJogadas = 0;

	public Tela(Jogador jogador1, Jogador jogador2) {

		botao[0] = new JButton();
		botao[1] = new JButton();
		botao[2] = new JButton();
		botao[3] = new JButton();
		botao[4] = new JButton();
		botao[5] = new JButton();
		botao[6] = new JButton();
		botao[7] = new JButton();
		botao[8] = new JButton();

		this.jogador1 = jogador1;
		this.jogador2 = jogador2;

		tb.setBounds(0, 0, 300, 30);

		tb.add(botaoNovo);
		tb.add(label);
		tb.add(botaoSair);
		tb.add(label2);
		tb.add(botaoAjuda);

		texto1.setBounds(30, 40, 200, 30);
		texto2.setBounds(30, 70, 200, 30);

		botao[0].setBounds(30, 120, 80, 80);
		botao[1].setBounds(110, 120, 80, 80);
		botao[2].setBounds(190, 120, 80, 80);
		botao[3].setBounds(30, 200, 80, 80);
		botao[4].setBounds(110, 200, 80, 80);
		botao[5].setBounds(190, 200, 80, 80);
		botao[6].setBounds(30, 280, 80, 80);
		botao[7].setBounds(110, 280, 80, 80);
		botao[8].setBounds(190, 280, 80, 80);

		tela.add(tb);
		tela.add(texto1);
		tela.add(texto2);
		tela.add(botao[0]);
		tela.add(botao[1]);
		tela.add(botao[2]);
		tela.add(botao[3]);
		tela.add(botao[4]);
		tela.add(botao[5]);
		tela.add(botao[6]);
		tela.add(botao[7]);
		tela.add(botao[8]);
		
		Font f = new Font("SansSerif", Font.BOLD, 50);
		botao[0].setBackground(Color.WHITE);
		botao[0].setFont(f);
		botao[1].setBackground(Color.WHITE);
		botao[1].setFont(f);
		botao[2].setBackground(Color.WHITE);
		botao[2].setFont(f);
		botao[3].setBackground(Color.WHITE);
		botao[3].setFont(f);
		botao[4].setBackground(Color.WHITE);
		botao[4].setFont(f);
		botao[5].setBackground(Color.WHITE);
		botao[5].setFont(f);
		botao[6].setBackground(Color.WHITE);
		botao[6].setFont(f);
		botao[7].setBackground(Color.WHITE);
		botao[7].setFont(f);
		botao[8].setBackground(Color.WHITE);
		botao[8].setFont(f);
		
		for (int i = 0; i > 9; i++) {
			espaco[i] = ' ';
		}

		tela.setSize(300, 420);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		tela.setVisible(true);

		botao[0].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(0);
			}
		});

		botao[1].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(1);
			}
		});

		botao[2].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(2);
			}
		});

		botao[3].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(3);
			}
		});

		botao[4].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(4);
			}
		});

		botao[5].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(5);
			}
		});

		botao[6].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(6);
			}
		});

		botao[7].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(7);
			}
		});

		botao[8].addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				principal(8);
			}
		});

		botaoNovo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonNovoActionPerformed(evt);
			}
		});

		botaoSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				JOptionPane.showMessageDialog(null, "Placar\n"
						+ jogador1.getNome() + ": " + jogador1.getNumeroVitoria() + "\n"
						+ jogador2.getNome() + ": " + jogador2.getNumeroVitoria() + "\n"
						+ "Empate: " + Jogador.getNumeroEmpates());
				System.exit(0);
			}
		});

		botaoAjuda.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonAjudaActionPerformed(evt);
			}
		});
		
		if (jogadaJogador1) {
			texto2.setText(jogador1.getNome() + ", sua vez");
		} else {
			texto2.setText(jogador2.getNome() + ", sua vez");
		}
	}

	public void principal(int i) {

		if (jogadaJogador1) {
			espaco[i] = jogador1.getMarcador();
			botao[i].setBackground(Color.YELLOW);
			botao[i].setText("" + jogador1.getMarcador());
			botao[i].setEnabled(false);
			jogadaJogador1 = false;

			if (Condicao.verificaCondicao(espaco, jogador1.getMarcador()) != null) {
				vitoria(jogador1, Condicao.verificaCondicao(espaco, jogador1.getMarcador()));
			} else {
				texto2.setText( jogador2.getNome() + ", sua vez");
			}

		} else {
			espaco[i] = jogador2.getMarcador();
			botao[i].setBackground(Color.CYAN);
			botao[i].setText("" + jogador2.getMarcador());
			botao[i].setEnabled(false);
			jogadaJogador1 = true;

			if (Condicao.verificaCondicao(espaco, jogador2.getMarcador()) != null) {
				vitoria(jogador2, Condicao.verificaCondicao(espaco, jogador2.getMarcador()));
			} else {
				texto2.setText(jogador1.getNome() + ", sua vez");
			}
		}
		++numeroJogadas;

		if (numeroJogadas >= 9) {
			texto1.setText("Velha!!");
			texto2.setText( jogador1.getNome() + ": " + jogador1.getNumeroVitoria() 
			+  "  |  " + jogador2.getNome() + ": " + jogador2.getNumeroVitoria());
			Jogador.setNumeroEmpates();
		}
	}

	protected void vitoria(Jogador jogador, String posicao) {

		jogador.setNumeroVitoria();
		texto1.setText(jogador.getNome() + " venceu o jogo!!");
		texto2.setText( jogador1.getNome() + ": " + jogador1.getNumeroVitoria() 
				+ "  |  " + jogador2.getNome() + ": " + jogador2.getNumeroVitoria());
		for (int i = 0; i < 9; i++) {
			botao[i].setBackground(Color.WHITE);
			botao[i].setEnabled(false);
		}
		
		botao[Integer.parseInt("" + posicao.charAt(0))].setBackground(Color.red);
		botao[Integer.parseInt("" + posicao.charAt(1))].setBackground(Color.red);
		botao[Integer.parseInt("" + posicao.charAt(2))].setBackground(Color.red);
	}

	protected void jButtonNovoActionPerformed(ActionEvent evt) {
		numeroJogadas = 0;
		texto1.setText("");
		
		if (jogadaJogador1) {
			texto2.setText(jogador1.getNome() + ", sua vez");
		} else {
			texto2.setText(jogador2.getNome() + ", sua vez");
		}
		
		for (int i = 0; i < 9; i++) {
			botao[i].setBackground(Color.WHITE);
			botao[i].setEnabled(true);
			botao[i].setText("");
			espaco[i] = ' ';
		}
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
}
