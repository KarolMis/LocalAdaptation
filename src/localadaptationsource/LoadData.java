
package localadaptationsource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadData {
	List<Market> marketslist = new ArrayList<Market>();
	List<Library> librarylist = new ArrayList<Library>();

	public String [] LoadMarket() throws FileNotFoundException{

		String dane[] = new String[8];
		String buf = "";
		
		File plik = new File("marketlist1.txt");
                String[] comboList;
            try (Scanner odczyt = new Scanner(plik)) {
                while(odczyt.hasNextLine()){
                    buf = odczyt.nextLine();
                    dane = buf.split(" ");
                    
                    
                    Market mark = new Market(dane[0], dane[1], dane[2], dane[3], dane[4],dane[5], dane[6], dane[7]);
                    marketslist.add(mark);
                }
                comboList = new String[marketslist.size()];
                for(int i=0; i<comboList.length; i++) {
                    comboList[i] = marketslist.get(i).apk;
                    
                    //  System.out.print(comboList[i]+ " ");
                }
                for (Market marketslist1 : marketslist) {
                    //   System.out.print(marketslist.get(i).name + " " + marketslist.get(i).cc + " " + marketslist.get(i).profil + " " + marketslist.get(i).prod + " " + marketslist.get(i).test +" "+ marketslist.get(i).login + " " + marketslist.get(i).pass + "\n" );
                }
            }
	return comboList;
	}
	
//Load library	
	public String [] LoadLibrary() throws FileNotFoundException{

		String dane1[] = new String[5];
		String buf1 = "";
		
		File plik1 = new File("library1.txt");
                String[] comboLiblist;
            try (Scanner odczyt1 = new Scanner(plik1)) {
                while(odczyt1.hasNextLine()){
                    buf1 = odczyt1.nextLine();
                    dane1 = buf1.split(" ");
                    
                    Library lib = new Library(dane1[0], dane1[1], dane1[2], dane1[3], dane1[4]);
                    librarylist.add(lib);
                }
                comboLiblist = new String[librarylist.size()];
                for (int i = 0; i < comboLiblist.length; i++) {
                    comboLiblist[i] = librarylist.get(i).library;
                    
                    //  System.out.print(comboLiblist[i]+ " ");
                }
                /*for(int i=0; i<librarylist.size(); i++) {
                System.out.print(librarylist.get(i).pk + " " + librarylist.get(i).type + " " +  librarylist.get(i).library + " " + librarylist.get(i).file + "\n" );
                }*/
            }
	return comboLiblist;
	}
}
