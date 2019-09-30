package jogo;

public class Condicao {
	
	public static String verificaCondicao(char[] espaco, char marcador){
		String[] condicao = new String[8];
		String[] posicao = new String[8];
		
		condicao[0] = "" + espaco[0] + espaco[1] + espaco[2];
		posicao[0] = "012";
		condicao[1] = "" + espaco[3] + espaco[4] + espaco[5];
		posicao[1] = "345";
		condicao[2] = "" + espaco[6] + espaco[7] + espaco[8];
		posicao[2] = "678";
		condicao[3] = "" + espaco[0] + espaco[3] + espaco[6];
		posicao[3] = "036";
		condicao[4] = "" + espaco[1] + espaco[4] + espaco[7];
		posicao[4] = "147";
		condicao[5] = "" + espaco[2] + espaco[5] + espaco[8];
		posicao[5] = "258";
		condicao[6] = "" + espaco[0] + espaco[4] + espaco[8];
		posicao[6] = "048";
		condicao[7] = "" + espaco[2] + espaco[4] + espaco[6];
		posicao[7] = "246";
		
		for ( int i = 0; i < 8; i++ ) {
			String marcadores = "" + marcador + marcador + marcador;
			if (condicao[i].equals(marcadores)) {
				return posicao[i];
			}
		}
		return null;
	}
	
	
}
