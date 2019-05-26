import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
	
	private String brojIndeksa;
	
	private int godinaUpisa;
	
	private String ime;
	
	private String prezime;
	
	private Date datumRodj;
	
	private int ocena;
	

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public int getGodinaUpisa() {
		return godinaUpisa;
	}

	public void setGodinaUpisa(int godinaUpisa) {
		this.godinaUpisa = godinaUpisa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	
	public int getOcena() {
		return ocena;
	}
	
	public void setOcena(int ocena) {
		if(ocena>=5 && ocena<=10) {
			this.ocena = ocena;
		}else {System.out.println("Greska! Ocena mora biti u rasponu od 5 do 10");
		}
	}

	public Date getDatumRodj() {
		return datumRodj;
	}

	public void setDatumRodj(Date datumRodj) {
		this.datumRodj = datumRodj;
	}

	public boolean equals(Object o) {
		if(!(o instanceof Student))
			throw new RuntimeException("Morate uneti objekat klase Student!");
		Student s = (Student)(o);
		if (ime.equals(s.getIme()) && prezime.equals(s.getPrezime()) && brojIndeksa == s.getBrojIndeksa()) 
			return true;
		else return false;		
	}

	@Override
	public String toString() {
		return "Student: " + ime + " " + prezime + " Broj Indeksa = " +  brojIndeksa +  " Godina upisa: " + godinaUpisa + " Datum rodjenja: "  + datumRodj;
	}	
		
}