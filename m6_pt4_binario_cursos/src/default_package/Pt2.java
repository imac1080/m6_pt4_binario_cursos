package default_package;

import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class Pt2 {
	public static void main(String[] args) {
		Map<String, Curs> cursos = new <String, Curs>TreeMap();
		menu();
	}

	public static void dadesIn(File f) {

	}

	public static void dadesOut(File f) {

	}

	public static void menu() {
		System.out.println("===============================================");
		System.out.println("	1. AFEGIR UN NOU CURS");
		System.out.println("	2. MODIFICAR UN CURS");
		System.out.println("	3. MOSTRAR DADES CURS");
		System.out.println("	4. ELIMINAR UN CURS");
		System.out.println("	5. SORTIR");
		System.out.println("Escull una opcio:");
	}
}
