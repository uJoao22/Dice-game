package pacPrincipal;

import java.security.SecureRandom;
import javax.swing.JOptionPane;

public class Jogo_Dados {
	
	public static void main(String[] args) {
		SecureRandom rnd = new SecureRandom();
		int dnv = 0;
		
		do {
			Object[] option1 = {"Jogar"};
			JOptionPane.showOptionDialog(null, "1º dado", "Jogar Primeiro Dado",  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1);
			int dado1 = rnd.nextInt((6 - 1) + 1) + 1;
			JOptionPane.showMessageDialog(null, "O primeiro dado caiu em: " +dado1, "1º Dado", JOptionPane.INFORMATION_MESSAGE);
			
			
			Object[] option2 = {"Jogar"};
			JOptionPane.showOptionDialog(null, "2º dado", "Jogar Segundo Dado",  JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, option2, option2);
			int dado2 = rnd.nextInt((6 - 1) + 1) + 1;
			JOptionPane.showMessageDialog(null, "O segundo dado caiu em: " +dado2, "2º Dado", JOptionPane.INFORMATION_MESSAGE);
			
			int soma = dado1 + dado2;
			
			Estado win = Estado.GANHOU;
			Estado loss = Estado.PERDEU;
			
			switch(soma) {
				case 7:
				case 11:
					JOptionPane.showMessageDialog(null, "A soma dos seus dados foi de: " +soma+ "\n PARABÉNS VOCÊ " +win.name());
					dnv = JOptionPane.showConfirmDialog(null,"Deseja jogar novamente?", "Jogar novamente", JOptionPane.YES_NO_OPTION);
				break;
				
				case 2:
				case 3:
				case 12:
					JOptionPane.showMessageDialog(null, "A soma dos seus dados foi de: " +soma+ "\nA Casa ganhou! \nINFELIZMENTE VOCÊ " +loss.name());
					dnv = JOptionPane.showConfirmDialog(null,"Deseja jogar novamente?", "Jogar novamente", JOptionPane.YES_NO_OPTION);
				break;
					
				default:
					JOptionPane.showMessageDialog(null, "A soma dos seus dados foi de: " +soma+ "\n Você nem ganhou nem perdeu, porque nem quem ganhar e nem quem perder, vai ganhar ou perder, vai todo mundo perder!");
					dnv = JOptionPane.showConfirmDialog(null,"Deseja jogar novamente?", "Jogar novamente", JOptionPane.YES_NO_OPTION);
				break;
			}
			
		} while(dnv == JOptionPane.YES_OPTION);		
	}
}