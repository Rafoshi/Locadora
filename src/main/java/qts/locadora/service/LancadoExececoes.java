package qts.locadora.service;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;

public class LancadoExececoes {
	public static void main(String[] args) throws FileNotFoundException{
		meuMetodo();
	}
	
	public static void meuMetodo() throws FileNotFoundException{
		InputStream is = new FileInputStream("meuArq.txt");
	}

}
