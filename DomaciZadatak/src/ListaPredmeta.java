import java.io.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

public class ListaPredmeta {
	
	private LinkedList <Predmet> predmeti = new LinkedList<Predmet>();
	
	private Student s;
	
	public void dodajPredmet(Predmet p) {
		if(p != null && !predmeti.contains(p)) {
			predmeti.add(p);
		}else {
			System.out.println("Greska!");
		}
	}
	
	public void pregledSvihPredmeta() {
		if(predmeti.size() == 0)
			System.out.println("Lista predmeta je prazna");
		else {
			for (int i = 0; i < predmeti.size(); i++)
				System.out.println(predmeti.get(i));
		}
	}
	
	public void studentiKojiSuPolozili(Predmet p, Student s) {
		if(!predmeti.contains(p))
			throw new RuntimeException("Taj predmet ne postoji u spisku predmeta");
		else
		System.out.println("Student: " + s.getIme() + " " + s.getPrezime() + " " + 
				" Broj indeksa: " + s.getBrojIndeksa() + " Godina upisa: " + s.getGodinaUpisa() + " " +
				" polozio je ispit iz predmeta: " + p.getNazivPredmeta() + " " + " Sifra predmeta: " 
				+ p.getSifraPredmeta() + " sa ocenom: " + s.getOcena() + " datum polaganja: " + p.getdatumPolaganja());
		
	}
	
	public void novaPrijava() throws IOException{
	try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Predmet p = new Predmet();
		
		Student s = new Student();
		
	
	    System.out.println("Unesite sifru predmeta: ");
		String u = br.readLine();
		int n = Integer.parseInt(u);
		p.setSifraPredmeta(n);

		try {
		System.out.println("Unesite broj indeksa studenta: ");
		s.setBrojIndeksa(br.readLine());
		}catch(NullPointerException npe) {
			System.out.println("Indeks ne moze biti null");
		}	


		System.out.println("Unesite datum polaganja:");
		p.setDatumPolaganja(br.readLine());		
		
		try {
		System.out.println("Unesite prethodnu ocenu sa ispita: ");
		String h = br.readLine();
		int r = Integer.parseInt(h);
		s.setOcena(r);
		}catch (NumberFormatException nfe) {
			System.out.println("Ocena mora biti u formatu broja");
		}
	
	    
		if(predmeti.containsAll(predmeti) && s.getOcena()>5)
		
		System.out.println("Evidentirana je nova prijava u sistemu za studenta sa brojem indeksa: " + 
		s.getBrojIndeksa() + " Prethodna ocena: " + s.getOcena() + " " + " Sifra predmeta: " + p.getSifraPredmeta());
		else System.out.println("Greska");
		
	
	}catch(Exception e) {
		System.out.println("Greska: " +e.getMessage());;
		}

	}
	
}