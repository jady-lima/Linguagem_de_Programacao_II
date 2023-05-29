package br.ufrn.imd.visao;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import br.ufrn.imd.dao.TigreDAO;
import br.ufrn.imd.modelo.Tigre;

public class TelaTigre extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	//Codigo de cada novo animal
	int cod = 0;
	
	private static TigreDAO tigreDao;
	
	//Para formatar as datas
	SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
	
	//Descriçoes
	JLabel lnome = new JLabel("Nome:");
	JLabel ldataNascimento = new JLabel("Data Nasc.:");
	JLabel lpeso = new JLabel("Peso:");
	JLabel ltipoAlimentacao = new JLabel("Alimentacao:");
	JLabel lAlimentar = new JLabel("Alimentar:");
	JLabel ltipoTigre = new JLabel("Tipo Tigre:");
	
	private Font f = new Font("Courier", Font.PLAIN, 12);
	
	//Recebe do user
	JTextField tnome = new JTextField();
	JFormattedTextField tdataNascimento = new JFormattedTextField("##/##/####");
	JTextField tpeso = new JTextField();
	JTextField ttipoAlimentacao = new JTextField();
	JTextField tAlimentar = new JTextField();
	JTextField ttipoTigre = new JTextField();
	
	//Botoes de submissao
	JButton btSubmeter = new JButton("Submeter");
	JButton btLimpar = new JButton("Limpar");
	
	//CONTRUTOR DA CLASSE
	public TelaTigre(String str)
	{
		super(str, false, true);
		
		Container ct = this.getContentPane();
		ct.setLayout(null);
		
		//Informações de fonte
		lnome.setFont(f);
		ldataNascimento.setFont(f);
		lpeso.setFont(f);
		ltipoAlimentacao.setFont(f);
		tAlimentar.setFont(f);
		ltipoTigre.setFont(f);
		
		//coordenadas de cada label
		lnome.setBounds(10,10,100,30);
		tnome.setBounds(92,10,280,25);
		ldataNascimento.setBounds(10,40,100,30);
		tdataNascimento.setBounds(92,40,65,25);
		lpeso.setBounds(10,70,100,30);
		tpeso.setBounds(92,70,100,25);
		ltipoAlimentacao.setBounds(10,100,100,30);
		ttipoAlimentacao.setBounds(92,100,70,25);
		lAlimentar.setBounds(10,130,100,30);
		tAlimentar.setBounds(92,130,70,25);
		ltipoTigre.setBounds(10,160,100,30);
		ttipoTigre.setBounds(92,160,70,25);
		
		
		//Coordenadas dos botoes
		btSubmeter.setBounds(50,190,100,30);
		btLimpar.setBounds(230,190,100,30);
		
		//Adiciona os botoes na tela
		ct.add(lnome);
		ct.add(tnome);
		ct.add(ldataNascimento);
		ct.add(tdataNascimento);
		ct.add(lpeso);
		ct.add(tpeso);
		ct.add(ltipoAlimentacao);
		ct.add(ttipoAlimentacao);
		ct.add(lAlimentar);
		ct.add(tAlimentar);
		ct.add(ltipoTigre);
		ct.add(ttipoTigre);
		ct.add(btSubmeter);
		ct.add(btLimpar);
		
		//Evento de botoes
		btSubmeter.addActionListener(this);		
		btLimpar.addActionListener(this);
		
		//detalhes do formulario
		setSize(450,270);
		setTitle(str);
		
		tigreDao = new TigreDAO();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == btSubmeter)
		{
			//coloca o cliente no cod referente a posição no array
			cod = tigreDao.sizeTigres();
			cod++;
			
			//Cria o animal e atribui a ele as informações
			Tigre tigre = new Tigre();
			tigre.setCodAnimal(cod);
			tigre.setNome(tnome.getText());
			tigre.setPeso(Double.parseDouble(tpeso.getText()));
			tigre.setAlimentado(Boolean.parseBoolean(tAlimentar.getText()));
			((Tigre)tigre).setTipoTigre(ttipoTigre.getText());
			try {
				tigre.setDataNascimento(formato.parse(tdataNascimento.getText()));
			} catch (ParseException ex) {
				ex.printStackTrace();
			}
			
			//Insere o animal no array
			tigreDao.addTigres(tigre);
			
			//Mensagem de sucesso na tela
			JOptionPane.showMessageDialog(null, "Tigre " + tigre.getNome() + " incluido!");
		
			//Limpa os campos apos inserir
			tnome.setText("");
			tdataNascimento.setText("");
			tpeso.setText("");
			ttipoAlimentacao.setText("");
			ttipoTigre.setText("");
			tAlimentar.setText("");
			
			//Deixa o label de texto em foco
			tnome.requestFocus();
		}
		else if(e.getSource() == btLimpar)
		{
			//Limpa os campos
			tnome.setText("");
			tdataNascimento.setText("");
			tpeso.setText("");
			ttipoAlimentacao.setText("");
			ttipoTigre.setText("");
			tAlimentar.setText("");
		}
	}
	
	public MaskFormatter Mascara(String Mascara){
        
        MaskFormatter formatoData = new MaskFormatter();
        try{
        	formatoData.setMask(Mascara); //Atribui a mascara
        	formatoData.setPlaceholderCharacter(' '); //Caracter para preencimento 
        }
        catch (Exception excecao) {
        excecao.printStackTrace();
        } 
        return formatoData;
	}
}
