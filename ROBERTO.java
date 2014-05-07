import java.util.Scanner;



public class ROBERTO {

	public static void main(String[] args) {
		{
			//Creo un scanner
			Scanner s = new Scanner(System.in);
			// Declaro un numero y lo leo en el teclado
			System.out.print("Ingrese un numero1:");
			int num1 = s.nextInt();
			/*Declaro un operador y un operador invalido que me va a servir para detectar si el usuario ingreso bien el operador*/
			boolean operador_valido=false;
			char operador = ' ';
			while(!operador_valido)
			System.out.print("Ingrese un operador (+,-,*,/): ");
		    operador = s.next().charAt(0);
		    if(operador=='+')
		    	operador_valido=true;
		    if(operador=='-')
		    	operador_valido=true;
		    if(operador=='*')
		    	operador_valido=true;
		    if(operador=='/')
		    	operador_valido=true;
		}
		    //Ingrese otro numero del teclado
			System.out.print("Ingrese un numero2:");
			int num2 = s.nextInt();
			switch (operador)
			{
			case '+':
				System.out.print("Resultado: "+(num1+num2));
				break;
			case '-':
			    System.out.print("Resultado: "+(num1-num2));
			    break;
			case '*':
			     System.out.print("Resultado: "+(num1*num2));
			    break;
			case '/':
			    System.out.print("Resultado: "+(num1/num2));
			break;
			default:
				System.out.print("Operador desconocido");
				break;
			    
			   
			}
		}
	
	}
	
}
		
	
	

