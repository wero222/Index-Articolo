package it.corso.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import it.corso.model.Articolo;

@Service
public class ArticoloServiceImpl implements ArticoloService
{
	@Override
	public List<Articolo> getCatalogo()
	{
		List<Articolo> catalogo = new ArrayList<>();
		
		Articolo articoloUno = new Articolo();
		articoloUno.setId(1);
		articoloUno.setDescrizione("Maglione di lana");
		articoloUno.setPrezzo(109.9976);
		
		Articolo articoloDue = new Articolo();
		articoloDue.setId(2);
		articoloDue.setDescrizione("Televisore");
		articoloDue.setPrezzo(1300.6785);
		
		catalogo.add(articoloUno);
		catalogo.add(articoloDue);
		
		return catalogo;
	}
}