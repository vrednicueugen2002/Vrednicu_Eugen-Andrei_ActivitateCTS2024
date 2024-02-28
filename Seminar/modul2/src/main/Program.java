package main;

import clase.Angajat;
import clase.Aplicant;
import reader.AngajatReader;

import java.io.FileNotFoundException;
import java.util.List;



public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AngajatReader angajatReader = new AngajatReader();
			listaAngajati = angajatReader.read("angajati.txt");
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
