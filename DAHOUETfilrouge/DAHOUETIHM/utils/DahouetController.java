package utils;

import java.util.List;

import javax.swing.JComboBox;

import ui.UIdahouet;
import ui.UIsaisieProprio;
import dao.ClasseDAO;
import dao.ProprietaireDAO;
import dao.SerieDAO;

public class DahouetController {

	public static JComboBox<String> comboBoxProprio = new JComboBox<String>();
	public static JComboBox<String> comboBoxSerie = new JComboBox<String>();
	public static JComboBox<String> comboBoxClasse = new JComboBox<String>();

	public DahouetController(UIdahouet mainUI, UIsaisieProprio proprioUI) {
		// TODO Auto-generated constructor stub
	}

	// cbbox proprietaire (fenetre voilier
	public static void cbProprio() {

		List<String> listeProprio = ProprietaireDAO.ListeProprio();

		for (String proprio : listeProprio) {
			UIdahouet.comboBoxProprio.addItem(proprio);
		}
	}

	// cbbox serie (fenetre voilier
	public static void cbSerie() {

		List<String> listeSerie = SerieDAO.ListeSerie();

		for (String serie : listeSerie) {
			UIdahouet.comboBoxSerie.addItem(serie);
		}
	}

	// cbbox classe (fenetre voilier
	public static void cbClasse(String nomSerie) {

		List<String> listeClasse = ClasseDAO.ListeClasse(nomSerie);

		for (String classe : listeClasse) {
			UIdahouet.comboBoxClasse.addItem(classe);
		}

	}


}
