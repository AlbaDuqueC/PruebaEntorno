package examen;

import java.util.Random;

public class Oca {
	static final int TAMCIRCUITO = 11;
	static int fichaJ1 = 0;
	static int fichaJ2 = 0;
	static int minDado;
	static int maxDado;
	static Random rand = new Random ();

	static int tiraDados() {
		
		return ((int) (rand.nextInt() * (maxDado - minDado + 1) + minDado));
	}

	
	static StringBuilder pintaPista() {
        StringBuilder pista = new StringBuilder("");
        for (int i = 1; i <= TAMCIRCUITO; i++) {
            pista.append("\t" + i);
        }

        pista.append("\n");

        for (int i = 1; i <= fichaJ1; i++) {
            pista.append("\t");
        }
        pista.append("J1\n");

        for (int i = 1; i <= fichaJ2; i++) {
            pista.append("\t");
        }
        pista.append("J2\n");
        return pista;
    }

	static boolean sumaDeNumerosEsPrimo(int tirada1, int tirada2) {
		boolean esPrimo;
		int suma = tirada1 + tirada2;

		if (suma <= 1) {
			return false;
		} else {
			for (int i = 2; i <= suma / 2; i++) {
				if (suma % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	String imprimeComoVaLaCarrera(String nomJ1, String nomJ2) {
		String ganador = "";

		if (fichaJ1 > fichaJ2) {
			ganador += "Va ganando " + nomJ1 + "\n";
		} else if (fichaJ2 > fichaJ1) {
			ganador += "Va ganando " + nomJ2 + "\n";
		} else {
			ganador += "VAN EMPATADOS" + "\n";
		}
		return ganador;
	}

	String esGanador(String nomJ1, String nomJ2) {
		String ganador = "";

		if (fichaJ1 >= TAMCIRCUITO) {
			ganador = nomJ1;
		} else if (fichaJ2 >= TAMCIRCUITO) {
			ganador = nomJ2;
		}

		return ganador;
	}

}
