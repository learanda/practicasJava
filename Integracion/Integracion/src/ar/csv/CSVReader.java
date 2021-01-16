package ar.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Archivo CSV descargado de: https://support.spatialkey.com/spatialkey-sample-csv-data/

public class CSVReader {

	public static void main(String[] args) {
		// Se lee informacion separada por comas
		// 45, Lan, dog, 9/12/18
		
		String path = "D:\\LAN\\Tecnicatura\\Practicas Java\\FL_insurance_sample.csv";
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			while((line = br.readLine()) != null) {
				//System.out.println(line);
				//break;
				
				String[] values = line.split(",");
				System.out.println("PolicyID: " + values[0] + ", State Code: " + values[1]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
