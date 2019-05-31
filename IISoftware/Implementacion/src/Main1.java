import java.util.Scanner;

import pqIssProject.*;

public class Main1 {
	
	public static void main(String[] args) {
		//Usuario usuario = new Usuario();
		Usuario_prueba usuario;
		
		String email, contr, nombre,contr2;
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------Registro----------------");
		System.out.println("Introduzca su nombre: ");
		nombre=sc.nextLine();
		System.out.println("Introduzca su email: ");
		email=sc.nextLine();

		do {
			System.out.println("Introduzca su contraseña: ");
			contr=sc.nextLine();
			System.out.println("Repita su contraseña: ");
			contr2=sc.nextLine();
			
		}while(!contr.equals(contr2));
		usuario=new Usuario_prueba(nombre,email,contr);
		try {
			usuario.iniciarSesion();
		}catch(AppException e) {
			e.getMessage();
		}
		try {
			usuario.registrar();
		}catch(AppException e) {
			e.getMessage();
		}
		try {
			usuario.iniciarSesion();
		}catch(AppException e) {
			e.getMessage();
		}

		
		
		
	}
	
}
