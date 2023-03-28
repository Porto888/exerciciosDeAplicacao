package ExcercicioElseIf;



public class atividadeRodizio {

	

	public static void main(String[] args) { 
    	
			// Projeto ainda em evelução.
   
			double inicioRodizio = 07.00;
			double fimRodizio = 20.00;
			double horaAtual = 16.00;
			String diaDaSemana = "sexta";
			int placaDoCarro = 0;

			if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {
				if (diaDaSemana == "segunda") {

					int placa01 = 1;
					int placa02 = 2;
					if (placaDoCarro == placa01 || placaDoCarro == placa02) {
						System.out.println("Placas finais " + placa01 + " e " + placa02
								+ " não estão permitidas para rodar na " + diaDaSemana + "-feira.");
					} else {
						System.out.println("Placa final" + " " + placaDoCarro + ", liberado para rodar na "
								+ diaDaSemana + "-feira.");

					}
				}
			}

			if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {
				if (diaDaSemana == "terça") {

					int placa01 = 3;
					int placa02 = 4;
					if (placaDoCarro == placa01 || placaDoCarro == placa02) {
						System.out.println("Placas finais " + placa01 + " e " + placa02
								+ " Não estão permitidas para rodar na " + diaDaSemana + "-feira.");
					} else {
						System.out.println(
								"Placa final " + placaDoCarro + ", liberados para rodar na " + diaDaSemana + "-feira.");

					}
				}
			}
			if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {
				if (diaDaSemana == "quarta") {

					int placa01 = 5;
					int placa02 = 6;
					if (placaDoCarro == placa01 || placaDoCarro == placa02) {
						System.out.println("Placas finais " + placa01 + " e " + placa02
								+ " não estão permitidas para rodar na " + diaDaSemana + "-feira.");
					} else {
						System.out.println(
								"Placa final " + placaDoCarro + ", liberado para rodar na " + diaDaSemana + "-feira.");

					}

				}
			}
			if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {
				if (diaDaSemana == "quinta") {

					int placa01 = 7;
					int placa02 = 8;
					if (placaDoCarro == placa01 || placaDoCarro == placa02) {
						System.out.println("Placas finais " + placa01 + " e " + placa02
								+ " não estão permitidas para rodar na " + diaDaSemana + "-feira.");
					} else {
						System.out.println(
								"Placa final " + placaDoCarro + ", liberado para rodar na " + diaDaSemana + "-feira.");

					}
				}
			}
			if (inicioRodizio <= horaAtual && fimRodizio >= horaAtual) {
				if (diaDaSemana == "sexta") {

					int placa01 = 9;
					int placa02 = 0;
					if (placaDoCarro == placa01 || placaDoCarro == placa02) {
						System.out.println("Placas finais " + placa01 + " e " + placa02
								+ " não estão permitidas para rodar na " + diaDaSemana + "-feira.");
					} else {
						System.out.println(
								"Placa final " + placaDoCarro + ", liberado para rodar na " + diaDaSemana + "-feira.");

					}

				}

			} else {
				System.out.println("A partir das 10:00 horas, da manhã na " + diaDaSemana + " todos os carros estão, liberados.");
			}

		}
	}

