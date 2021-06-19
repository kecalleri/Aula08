
public class FuncoesComReturn {
	
	
	public static String dia(int numero) {
		switch(numero) {
		case 1:
		return "Domingo";
		case 2:
		return "Segunda-Feira";
		case 3:
		return "Terça-Feira";
		case 4:
		return "Quarta-Feira";
		case 5:
		return "Quinta-Feira";
		case 6:
		return "Sexta-Feira";
		case 7:
		return "Sábado";
		default:
		return "Dia inválido";
			}
		}

	public static void main(String[] args) {
		System.out.println(dia(2));
		
		if (dia(6).equals("Sexta-feira")) {
		System.out.println("Dia de maldade");
	
	}

	}
}
