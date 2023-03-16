package application;

public class Program {

	public static void main(String[] args) {
		
		String palavra = "leonardo";
        
        
        String palavraInvertida = reverteString(palavra);
		
		System.out.println(palavraInvertida);
        
        }
	
	//função
	public static String reverteString(String palavra) {
		int len = palavra.length();
        //criando arrays de caracter com o tamanho da palavra 
        char[] charTemporario = new char[len];
        char[] charFinal = new char[len];
        
        //passa string para array charTemporario
        for(int i=0; i< len; i++){
            //pasando palavra para o charTemporario por posicao das letras em sequencia
            charTemporario[i] = palavra.charAt(i);
        }
        
        //inverte os caracteres 
        for(int j=0; j< len; j++){
            //(tamanho - 1) para não dar erro IndexOutOfBoundsException
            // -j para ir diminuindo a posição conforme o laço executa
            charFinal[j] = charTemporario[(len -1) - j];
        }
        
        //cria uma nova string com o array invertido
        String palavraFinal = new String(charFinal);
        
        return palavraFinal;
	}
        
	}


