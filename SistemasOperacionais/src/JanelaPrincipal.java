import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class JanelaPrincipal extends JFrame {

	private JButton criarCarro;
	private JTextField TempoT;
	private JTextField TempoE;
	private JButton destruirCarro;
	private JLabel TempoEspera;
	private JLabel TempoTravessia;
	private FlowLayout layout;
	Ponte mostraponte;
	
	public JanelaPrincipal(){
		
		Container c = getContentPane();
		mostraponte = new Ponte();
		c.add("Center", mostraponte);		
				
		TempoTravessia = new JLabel();
		TempoTravessia.setText("Tempo de Travessia");	//Etiqueta 	
		
		TempoT = new JTextField(2); // Caixa para introdução do tempo de travessia
		
		TempoEspera = new JLabel();
		TempoEspera.setText("Tempo de Espera"); // Etiqueta
		
		TempoE = new JTextField(2); //Caixa para introdução do tempo de espera
		
		criarCarro = new JButton("Novo carro");	 //Botão para criar o objeto carro
		
		destruirCarro = new JButton("Destruir Carro"); // Botão para destruir carro	
				
		criarCarro.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent event){
						
						//Criar objeto carro....pegar as dois campos veloidade e espera					
						
					}					
				}
				);
				
		destruirCarro.addActionListener(
				new ActionListener(){
					
					public void actionPerformed(ActionEvent event){					
						//destruir objeto carro...						
					}					
				}
				);
		
		//Adiciona os botões a interface
		JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        p1.add(TempoTravessia);
        p1.add(TempoT);
        p1.add(TempoEspera);
        p1.add(TempoE);
        p1.add(criarCarro);
        p1.add(destruirCarro);       
        c.add("South",p1);			
		
	}
	
}

 

