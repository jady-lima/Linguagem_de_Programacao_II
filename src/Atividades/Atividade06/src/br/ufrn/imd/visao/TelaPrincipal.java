package br.ufrn.imd.visao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.ufrn.imd.dao.ElefanteDAO;
import br.ufrn.imd.dao.GirafaDAO;
import br.ufrn.imd.dao.TigreDAO;

public class TelaPrincipal extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private static TigreDAO tigreDAO;
	private static GirafaDAO girafaDAO;
	private static ElefanteDAO elefanteDAO;
	
	//Cria uma nova tela principal
	JDesktopPane dtp = new JDesktopPane();
	
	//Cria a barra de menu
	JMenuBar menuBarra = new JMenuBar();
	
	//Menu contidos na barra de menu
	JMenu menuCadastro = new JMenu("Cadastro");
	JMenu menuRelatorio = new JMenu("Relatorio");
	JMenu menuAjuda = new JMenu("Ajuda");
	
	//Cria cada subItem da barra de menu(Cadastro)
	//JMenuItem mIAnimal = new JMenuItem("Animal");
	JMenuItem mITigre = new JMenuItem("Tigre");
	JMenuItem mIGirafa = new JMenuItem("Girafa");
	JMenuItem mIElefante = new JMenuItem("Elefante");
	
	//Cria cada subItem da barra de menu(Relatorios)
	JMenuItem mIListarAnimais = new JMenuItem("Listar animais");
	JMenuItem mIMaisNovos = new JMenuItem("Mais novos");
	JMenuItem mIMaisVelhos = new JMenuItem("Mais velhos");
	
	//Cria cada subItem da barra de menu(Relatorios)
	JMenuItem mISair= new JMenuItem("Sair");
	
	
	//CONSTRUTOR DA CLASSE TELA PRINCIPAL
	public TelaPrincipal()
	{
		//Cria um container
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		
		//Adiciona a barra de menu
		setJMenuBar(menuBarra);
		menuBarra.add(menuCadastro);
		menuBarra.add(menuRelatorio);
		menuBarra.add(menuAjuda);
		
		//Adiciona os sub-i em cadastro
		//menuCadastro.add(mIAnimal);
		menuCadastro.add(mITigre);
		menuCadastro.add(mIGirafa);
		menuCadastro.add(mIElefante);
		
		//Adiciona os sub-it em Relatorios
		menuRelatorio.add(mIListarAnimais);
		menuRelatorio.add(mIMaisNovos);
		menuRelatorio.add(mIMaisVelhos);
		
		//Adiciona os sub-it em ajuda
		menuAjuda.add(mISair);
		
		ct.add(BorderLayout.CENTER, dtp);
		
		//Altera propriedade da tela
		setSize(900, 700);//altura e largura
		setResizable(true);//maximizar = true
		setTitle("Zoologico - Tela Principal");//Nome da tela
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Evento do click
		//mIAnimal.addActionListener(this);
		mIElefante.addActionListener(this);
		mIGirafa.addActionListener(this);
		mITigre.addActionListener(this);
		
		//cria o novo animal dao
		//tigreDAO = new TigreDAO();
		//girafaDAO = new GirafaDAO();
		//elefanteDAO = new ElefanteDAO();
	}
	
	//FUNÇÃO DE PERFORMACE DE CADA AÇÃO 
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//Se clicar no botão para Tigre, surge a tela de cadastro para um novo Tigre
		if(e.getSource() == mITigre)
		{
			
			System.out.println("Pronto .....");
			TelaTigre tlTigre = new TelaTigre("Tigre");
			dtp.add(tlTigre);
			tlTigre.setVisible(true);
		}
	
		//Se clicar no botão para Girafa, surge a tela de cadastro para um novo Girafa
		else if(e.getSource() == mIGirafa)
		{
			
			System.out.println("Pronto .....");
			TelaGirafa tlGirafa = new TelaGirafa("Girafa");
			dtp.add(tlGirafa);
			tlGirafa.setVisible(true);;
		}
		
		//Se clicar no botão para Elefante, surge a tela de cadastro para um novo Elefante
		else if(e.getSource() == mIElefante)
		{
			
			System.out.println("Pronto .....");
			TelaElefante tlElefante = new TelaElefante("Elefante");
			dtp.add(tlElefante);
			tlElefante.setVisible(true);
		}
		
		else if(e.getSource() == mIListarAnimais)
		{
			tigreDAO = TigreDAO.getInstance();
			System.out.println("Chegou no listar");
			tigreDAO.imprimeTigres();
			girafaDAO = GirafaDAO.getInstance();
			girafaDAO.imprimeGirafas();
			elefanteDAO = ElefanteDAO.getInstance();
			elefanteDAO.imprimeElefantes();
		}
		
		else if(e.getSource() == mIMaisNovos)
		{
			try {
				tigreDAO.maisNovoTigre();
				girafaDAO.maisNovoGirafas();
				elefanteDAO.maisNovoElefante();
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == mIMaisVelhos)
		{
			try {
				tigreDAO.maisVelhoTigres();
				girafaDAO.maisVelhoGirafas();
				elefanteDAO.maisVelhoElefante();
			} catch (ParseException e1) {
				e1.printStackTrace();
			}
		}
		
		else if(e.getSource() == mISair)
		{
			System.out.println("Fechando o sistema!!!");
			System.exit(0);
		}
	}
	
	//MÉTODO MAIN
	public static void main(String[] args) {
		TelaPrincipal telaPai = new TelaPrincipal();
		telaPai.setVisible(true);
	}
}
