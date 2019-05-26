import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class ListaStudenata {
	
	private LinkedList<Student> studenti = new LinkedList<Student>();
	
	private Predmet p;
	
	public void dodajStudenta(Student s) {
		if(s != null && !studenti.contains(s)) {
			studenti.add(s);
		}else {
			System.out.println("Greska");
		}
	}
	
	public void pregledSvihStudenata() {
		if(studenti.size() == 0)
			System.out.println("Lista studenata je prazna");
	    else {
		     for (int i = 0; i < studenti.size(); i++)
			 System.out.println(studenti.get(i));
		     }
		}
	
	public void prijaveStudenta(Student s, Predmet p) {
		System.out.println("Student: " + s.getIme() + " " + s.getPrezime() + " " + 
		" Broj indeksa: " + s.getBrojIndeksa() + " Godina upisa: " + s.getGodinaUpisa() + " " + " prijavio je ispit iz predmeta: " + p.getNazivPredmeta() + " " + " Sifra predmeta: " + p.getSifraPredmeta());
	}
	
	public void izmeniPodatke(Student s) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			if(studenti.contains(s))
				System.out.println("Promenite ime:");
				s.setIme(br.readLine());
				System.out.println("Promenite prezime:");
			    s.setPrezime(br.readLine());
			    System.out.println("Promenite broj indeksa");
			    s.setBrojIndeksa(br.readLine());    
			System.out.println("Ime i prezime studenta: " + s.getIme() + " " + s.getPrezime() + "Broj indeksa: " + s.getBrojIndeksa());
		
		}catch (Exception e) {
			System.out.println("Greska: " + e.getMessage()); 
		}
			
	}
	
}
