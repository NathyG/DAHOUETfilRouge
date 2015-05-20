package ui;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Voilier;
import utils.DahouetController;

import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;

import dao.ProprietaireDAO;
import dao.VoilierDAO;

public class UIdahouet extends JFrame {

	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public static JTextField txtSaisienomvoilier;

	public static JComboBox<String> comboBoxProprio = new JComboBox<String>();
	public static JComboBox<String> comboBoxSerie = new JComboBox<String>();
	public static JComboBox<String> comboBoxClasse = new JComboBox<String>();

	/**
	 * Create the frame.
	 */
	public UIdahouet() {

		enableEvents(AWTEvent.WINDOW_EVENT_MASK);

		jbInit();

	}

	// Initialiser le composant
	private void jbInit() {

		this.setTitle("Saisie d'un voilier");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 332);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC, FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"), }, new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC, FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"), }));

		// nom du voilier
		JLabel lblNomDuVoilier = new JLabel("Nom du voilier :");
		contentPane.add(lblNomDuVoilier, "4, 4, right, default");

		txtSaisienomvoilier = new JTextField();
		txtSaisienomvoilier.setText("");
		contentPane.add(txtSaisienomvoilier, "8, 4, fill, default");
		txtSaisienomvoilier.setColumns(10);

		// cbox proprio

		cbProprio();

		// cbox serie
		cbSerie();

		// si serie modifiee => modifier combo classe
		comboBoxSerie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbClasse();
			}
		});

		// cbox classe
		cbClasse();

		JPanel panel = new JPanel();
		contentPane.add(panel, "8, 20, right, default");

		// bouton Enregistrer -

		JButton btnOk = new JButton("Enregistrer");
		panel.add(btnOk);
		btnOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					btnOk_click();
				} catch (Exception e1) {

					e1.printStackTrace();
				}

			}
		});

		// bouton quitter
		JButton btnQuitter = new JButton("Quitter");
		panel.add(btnQuitter);
		btnQuitter.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	// cbbox classe
	// -------------------------------------------------------------

	private void cbClasse() {

		comboBoxClasse.removeAllItems();
		comboBoxSerie.getSelectedItem().toString();
		String nomSerie = comboBoxSerie.getSelectedItem().toString();

		DahouetController.cbClasse(nomSerie);

		JLabel lblClasse = new JLabel("Classe :");
		contentPane.add(lblClasse, "4, 16, right, default");
		contentPane.add(comboBoxClasse, "8, 16, fill, default");
	}

	// cbbox serie
	// ---------------------------------------------------------------

	private void cbSerie() {

		comboBoxSerie = new JComboBox<String>();

		DahouetController.cbSerie();

		JLabel lblSerie = new JLabel("Serie :");
		contentPane.add(lblSerie, "4, 12, right, default");
		contentPane.add(comboBoxSerie, "8, 12, fill, default");
	}

	// cbbox proprietaire -----------------------------------------------------

	private void cbProprio() {

		comboBoxProprio = new JComboBox<String>();
		comboBoxProprio.addItem("Nouveau proprietaire");

		DahouetController.cbProprio();

		JLabel lblProprietaire = new JLabel("Proprietaire :");
		contentPane.add(lblProprietaire, "4, 8, right, default");
		contentPane.add(comboBoxProprio, "8, 8, fill, default");
	}

	// OK - Sauvegarder ------------------------------------------------------

	protected void btnOk_click() throws Exception {

		// DahouetController.tests();

		// test si voilier saisi //

		if (txtSaisienomvoilier.getText().equals("")) {
			JOptionPane.showMessageDialog(this,
					"Veuillez saisir un nom de voilier", "Erreur saisie",
					JOptionPane.WARNING_MESSAGE);

			return;
		}

		// enregistrements

		String nomProprio = comboBoxProprio.getSelectedItem().toString(); // nom
																			// du
																			// proprio
																			// cbbox

		// si nouveau proprio

		if (nomProprio == "Nouveau proprietaire")

		{
			JDialog SaisieProprio = new UIsaisieProprio();
			SaisieProprio.setVisible(true);
			dispose();

			nomProprio = UIsaisieProprio.getNomProprio(); // nom du proprio
															// nouveau

			if (nomProprio.equals("")) {
				setVisible(true);
				return; // si saisie proprio annulee
			}
		}

		// enregistrement voilier

		int numproprio = ProprietaireDAO.NumeroProprio(nomProprio); // recup num
																	// proprio

		String nomClasse = comboBoxClasse.getSelectedItem().toString();

		String nomVoil = txtSaisienomvoilier.getText();
		Voilier v = new Voilier(0, null, null);
		v.setNum_proprietaire(numproprio);
		v.setNom_classe(nomClasse);
		v.setNom_voilier(nomVoil);

		VoilierDAO.createVoilier(v);

		// nouvelle fenetre saisie voilier

		dispose();
		new UIdahouet().removeAll();
		new UIdahouet().setVisible(true);

		return;
	}

	// Supplanté, ainsi nous pouvons sortir quand la fenêtre est fermée
	@Override
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING) {
			System.exit(0);
		}
	}

}
