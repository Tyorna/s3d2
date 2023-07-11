package esercizio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "events")
public class Evento {

	@Id
	@GeneratedValue
	private long id;

	private String titolo;
	private Date dataEvento;
	private String descrizione;
	private TipoEvento tipoEvento;
	private int numeroMassimoPartecipanti;

	public Evento() {
	}

	public Evento(String titolo, Date dataEvento, String descrizione, TipoEvento tipoEvento,
			int numeroMassimoPartecipanti) {
		this.titolo = titolo;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	public long getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Date getdataEvento() {
		return dataEvento;
	}

	public void setdataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getdDescrizione() {
		return titolo;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public TipoEvento getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(TipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}

	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ",\n titolo=" + titolo + ", \n data dell' evento=" + dataEvento
				+ ", \n descrizione=" + descrizione + ", \n numero Massimo Partecipanti =" + numeroMassimoPartecipanti
				+ ", \n tipo di evento=" + tipoEvento + "]";
	}
}
