package operadors;
import java.util.Scanner;
public class Aleix_Repeticio4 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);

		int contUsuari=0;
		int contAle=0;
		int cont1=1;
		double aleatori = (int)(Math.random()*(4-1+1))+1;
		char letraAle = (char)('A'+ Math.random()*4);

		
		
		do {
			System.out.println("Para hundir el barco introduce un numero del 1-4 y una letra de la A-D.\n");

			for(int i=0;i<1;i++) {
				System.out.println(" ABCD");
				for(int j=0;j<1;j++) {
					System.out.println("1****\n"+"2****\n"+"3****\n"+"4****\n");
				}
				System.out.println();
			}
			System.out.println(aleatori+""+letraAle);
			System.out.println("Introduce un numero.");
			int num=in.nextInt();
			if(num<=0||num>=5) {
				System.out.println("Introduce un numero del 1 al 4.");
				continue;
			}
			System.out.println("Introduce una letra.");
			char letra = in.next().toUpperCase().charAt(0);
			
			
			 
			 if(num==aleatori && letra==letraAle ) {
				System.out.println("Barco hundido!!\nHas ganado!!");
				contUsuari++;
				System.out.println("Has hundido el barco en "+cont1+" intentos.");
				System.out.println("El barco estaba en la posicion(letra) "+letraAle+" y en el numero:"+aleatori);
				break;
			} else if(num!=aleatori || letra!=letraAle){

				System.out.println("Has perdido, sigue intentandolo.");
				cont1++;
			}
			
		}while(contUsuari==contAle);	

		   System.out.println(" ABCD");
	        for (int i = 1; i <= 4; i++) {
	            System.out.print(i); // Imprimir el número de la fila
	            
	            for (char j = 'A'; j <= 'D'; j++) {
	                // Marcar la ubicación del barco
	                if (i == aleatori && j == letraAle) {
	                    System.out.print("V"); // Marcar el barco
	                } else {
	                    System.out.print("*"); // Espacio vacío
	                }
	                
	            }
	System.out.println();
	}
}
}
