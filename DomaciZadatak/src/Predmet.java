import java.time.LocalDate;
import java.util.Date;

public class Predmet {
	
	private int sifraPredmeta;
	
	private String nazivPredmeta;
	
	private String datumPolaganja;
		

	public int getSifraPredmeta() {
		return sifraPredmeta;
	}

	public void setSifraPredmeta(int sifraPredmeta) {
		this.sifraPredmeta = sifraPredmeta;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	
	public String getdatumPolaganja() {
		return datumPolaganja;
	}
	
	public void setDatumPolaganja(String datumPolaganja) {
		this.datumPolaganja = datumPolaganja;
	}
	
	@Override
	public String toString() {
		return "Predmet: " + nazivPredmeta + " " + "Sifra predmeta: " + sifraPredmeta;
	}
	
	public boolean equals(Object o) {
		if(!(o instanceof Predmet))
			throw new RuntimeException("Morate uneti objekat klase Predmet!");
		Predmet p = (Predmet) (o);
		if (nazivPredmeta.equals(p.getNazivPredmeta()) && sifraPredmeta == p.getSifraPredmeta())
			return true;
		else return false;
	}

}