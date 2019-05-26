import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Meni {
	
	
	void pokreniMeni() {
		
		ListaPredmeta listaP = new ListaPredmeta();
		ListaStudenata listaS= new ListaStudenata();
		
		
		Predmet p1 = new Predmet();
		p1.setNazivPredmeta("Matematika 1");
		p1.setSifraPredmeta(24608);
		p1.setDatumPolaganja("24.05.2019");


		Predmet p2 = new Predmet();
		p2.setNazivPredmeta("Programiranje 1");
		p2.setSifraPredmeta(25804);
		p2.setDatumPolaganja("27.05.2019");

		
		Predmet p3 = new Predmet();
		p3.setNazivPredmeta("Algoritmi");
		p3.setSifraPredmeta(76301);
		p3.setDatumPolaganja("29.05.2019");
		
		listaP.dodajPredmet(p1);
		listaP.dodajPredmet(p2);
		listaP.dodajPredmet(p3);
		
		
		Student s1 = new Student();
		s1.setIme("Goran");
		s1.setPrezime("Ilic");
		s1.setBrojIndeksa("601/18");
		s1.setGodinaUpisa(2018);
		s1.setOcena(9);
		String dateString1 = "01/08/2000";
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		try {
			s1.setDatumRodj(formatter.parse(dateString1));
		} catch (ParseException e) {			
			e.printStackTrace();
		}
		
			
		Student s2 = new Student();
		s2.setIme("Milica");
		s2.setPrezime("Petrovic");
		s2.setBrojIndeksa("603/18");
		s2.setGodinaUpisa(2018);
		s2.setOcena(8);
		String dateString2 = "03/24/1999";
		SimpleDateFormat formatter1 = new SimpleDateFormat("MM/dd/yyyy");
		try {
			s2.setDatumRodj(formatter1.parse(dateString2));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
			
		Student s3 = new Student();
		s3.setIme("Zarko");
		s3.setPrezime("Milicic");
		s3.setBrojIndeksa("715/18");
		s3.setGodinaUpisa(2018);
		s3.setOcena(9);
		String dateString3 = "08/15/2000";
		SimpleDateFormat formatter2 = new SimpleDateFormat("MM/dd/yyyy");
		try {
			s3.setDatumRodj(formatter2.parse(dateString3));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	
		
		listaS.dodajStudenta(s1);
		listaS.dodajStudenta(s2);
		listaS.dodajStudenta(s3);
		
		int x;
		
		do {
			System.out.println("Izaberite jednu od opcija:");
			System.out.println("1.Pregled");
			System.out.println("2.Unos nove prijave");
			System.out.println("3.Izmena podataka o studentu");
			System.out.println("0.Kraj");


			Scanner scanner = new Scanner(System.in);
			x = scanner.nextInt();
			
			switch(x) {

			case 1:
				int y;
				do {
					System.out.println("1.Pregled svih predmeta");
					System.out.println("2.Pregled svih studenata");
					System.out.println("3.Pregled svih prijava za trazenog studenta");
					System.out.println("4.Prikaz svih studenata koji su polozili odredjen predmet");
					System.out.println("0.Povratak u glavni meni");
					
					Scanner scanner2 = new Scanner(System.in);
					y = scanner2.nextInt();
					
					switch(y) {
					
					case 1: 
						listaP.pregledSvihPredmeta();
						break;
						
					case 2: 
						listaS.pregledSvihStudenata();
						break;
						
					case 3:
						System.out.println("Unesite broj indeksa studenta");
						String s; 
						Scanner scanner3 = new Scanner(System.in);
						s = scanner3.nextLine();

						if(s.equals(s1.getBrojIndeksa()))
							listaS.prijaveStudenta(s1, p1);
						else if (s.equals(s2.getBrojIndeksa()))
							listaS.prijaveStudenta(s2, p2);
						else System.out.println("Unesite validan broj indeksa");
						break;
						
					case 4:
						System.out.println("Unesite sifru predmeta: ");
						int z;
						Scanner scanner4 = new Scanner(System.in);
						z = scanner4.nextInt();
						if(z == p1.getSifraPredmeta()) 
							listaP.studentiKojiSuPolozili(p1, s1);
						
						if(z == p2.getSifraPredmeta())
							listaP.studentiKojiSuPolozili(p2, s2);
						break;
						
					case 0:
						y=0;
						break;
					
					default:
						System.out.println("Unesite odgovarajuce podatke!");
						break;
					}

				} while (y!=0);
				  break;
				
				
			case 2:
			
				try {
					listaP.novaPrijava();
				} catch (IOException e) {
					System.out.println("Greska pri unosu podataka: " + e.getMessage());
				}
				break;

			case 3:
				int i;

				do {
					System.out.println("1.Izmena podataka o studentu ");
					System.out.println("2.Povratak u glavni meni");
					Scanner scanner5 = new Scanner(System.in);
				
					i = scanner5.nextInt();
					
					switch (i) {
					case 1:
						System.out.println("Unesite broj indeksa studenta cije podatke zelite da izmenite: ");
						String g;
						Scanner scanner6 = new Scanner(System.in);
						g = scanner6.nextLine();
						if(g.equals(s1.getBrojIndeksa()))
							listaS.izmeniPodatke(s1);
						if(g.equals(s2.getBrojIndeksa()))
							listaS.izmeniPodatke(s2);
						else System.out.println("Morate uneti validan broj indeksa!");
						break;
					case 2:
						i = 0;
						break;
					}
				} while (i!=0);		
				  break;
				
			case 0:
				x=0;
				System.out.println("KRAJ PROGRAMA");
				break;
				
			default:
				System.out.println("Unesite odgovarajucu opciju!");
				break;	
			}

	} while (x != 0);

		}

}