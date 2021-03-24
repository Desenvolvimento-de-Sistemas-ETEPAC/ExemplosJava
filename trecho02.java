public class Exemplos {
	
	public static void calculaMedia(float nota1, float nota2, String nome) {
		
		float media = (nota1+nota2)/2;
		
		if (media >=7) {
			System.out.println(nome+"foi aprovado !!!");
		}
		System.out.println(nome + "Obteve média: "+ media);
	}
	
}