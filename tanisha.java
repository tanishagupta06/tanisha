//in this project we have creted a single frame having 7 buttons,4 labels and 4textboxs.Through which we can add,delete,search in the list and we can
//move back and forth or move at top of list or at extreme end.
package practical;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
class myframe extends JFrame implements ActionListener{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8;
	JTextField t2, t3, t4, t7,t1;
    JButton b1, b2,b3,b4,b5,b6,b7;
    String x;
    int count=1,nor=0;
    myframe()
     {
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Medicine shop in Java");
 
        l1 = new JLabel("MEDICINE SHOP:");
        l1.setForeground(Color.blue);
        l1.setFont(new Font("Serif", Font.BOLD, 20));
 
        l2 = new JLabel("medicine:");
        l3 = new JLabel("company:");
        l4 = new JLabel("price:");
        l5 = new JLabel("quantity:");
      
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4= new JTextField();
     
 
        b1 = new JButton("|<");
        b2 = new JButton("<");
        b3 = new JButton(">");
        b4 = new JButton(">|");
        b5 = new JButton("add");
        b6 = new JButton("search");
        b7 = new JButton("delete");
        
        
        
 
        b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				abc1 fr=new abc1();
				try{
					fr.read();}
				catch(IOException e1){}
					t1.setText(fr.medicine);
					t2.setText(fr.company);
					t3.setText(fr.price);
					
					t4.setText(fr.quantity);
				
			}
        	
        });
        b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				abc6 a=new abc6();
				try{
					if (count-1>=2)count++;
					a.read(count);}
				catch(IOException e1){}
					t1.setText(a.medicine);
					t2.setText(a.company);
					t3.setText(a.price);
					t4.setText(a.quantity);
				
			}
        	
        }); 
        b3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				abc7 a=new abc7();
				try{
					if (count+1<=nor)count++;
					a.read(count);}
				catch(IOException e1){}
					t1.setText(a.medicine);
					t2.setText(a.company);
					t3.setText(a.price);
					t4.setText(a.quantity);
				
			}
        	
        });
        b4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				abc2 a=new abc2();
				try{
					a.read();}
				catch(IOException e1){}
					t1.setText(a.medicine);
					t2.setText(a.company);
					t3.setText(a.price);
					
					t4.setText(a.quantity);
				
			}
        	
        });
        b5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {

				abc4 a=new abc4();
				try{
					nor++;
					a.addrec(t1.getText(), t2.getText(), t3.getText(), t4.getText());}
				catch(IOException e1){}
					t1.setText(a.medicine);
					t2.setText(a.company);
					t3.setText(a.price);
					
					t4.setText(a.quantity);
			}
        	
        });
        b6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				abc8 fr=new abc8();
				
				try{
					fr.read(t2.getText());
					System.out.println("==="+t2.getText());}
				catch(IOException e1){}
				System.out.println(fr.medicine);
					t1.setText(fr.medicine);
					t2.setText(fr.company);
					t3.setText(fr.quantity);
					t4.setText(fr.price);
			}
        });
        b7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// 
				abc5 a=new abc5();
				try{
					a.deleterec(t1.getText());}
				catch(IOException e1){}
					t1.setText(a.medicine);
					t2.setText(a.company);
					t3.setText(a.price);
					
					t4.setText(a.quantity);
				
			}
        	
        });
         
        l1.setBounds(100, 30, 400, 30);
        l2.setBounds(80, 70, 200, 30);
        l3.setBounds(80, 110, 200, 30);
        l4.setBounds(80, 150, 200, 30);
        l5.setBounds(80, 190, 200, 30);
        
        t1.setBounds(300, 70, 200, 30);
        t2.setBounds(300, 110, 200, 30);
        t3.setBounds(300, 150, 200, 30);
        t4.setBounds(300, 190, 200, 30);
        b1.setBounds(50, 350, 100, 30);
        b2.setBounds(170, 350, 100, 30);
        b3.setBounds(290, 350, 100, 30);
        b4.setBounds(410, 350, 100, 30);
        b5.setBounds(50, 390, 140, 30);
        b6.setBounds(210, 390, 140, 30);
        b7.setBounds(370, 390, 140, 30);
        
 
        add(l1);
        add(l2);
        add(t1);
        add(l3);
        add(t2);
        add(l4);
        add(t3);
        add(l5);
        add(t4);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        
    }



	@Override
	public void actionPerformed(ActionEvent e) 
	{		
	}
}
 class abc1 {
	 String medicine,company; 
	String quantity,price;
	 
	void read() throws IOException{
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\tanisha.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		if((line=br.readLine())!=null){
			medicine=line.substring(0, 6);
			company=line.substring(8,14);
			price=line.substring(16, 20);
			quantity=line.substring(22,line.length()-1);
			
			
			System.out.println(medicine);
			System.out.println(company);
			System.out.println(price);
			System.out.println(quantity);
			
			
		//	System.out.println(line);
			
		}
		br.close();
	}
 }
 class abc2 {
	 String medicine,company; 
	String quantity,price;
	 
	void read() throws IOException{
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\tanisha.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null){
			medicine=line.substring(0, 6);
			company=line.substring(8,14);
			quantity=line.substring(16, 20);
			price=line.substring(22,line.length()-1);
			
			
			System.out.println(medicine);
			System.out.println(company);
			System.out.println(price);
			System.out.println(quantity);
			
			
			System.out.println(line);
			
		}
		br.close();
	}
 }
	
 class abc5 {
	 String medicine,company; 
	String price,quantity;
	 
	void read() throws IOException{
		File fr=new File("C:\\Users\\Hp\\Desktop\\tanisha.txt");
		File tempfile =new File("C:\\Users\\Hp\\Desktop\\ABC.txt");
		BufferedReader br=new BufferedReader(new FileReader(fr));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

		String line;
		String current;
		while((current=br.readLine())!=null){
			String trimmedLine=current.trim();
			if(trimmedLine.equals(company))continue;
			writer.write(current+System.getProperty("|"));
		}
		writer.close();
		
		br.close();
		boolean succeful=tempfile.renameTo(fr);
	}
	void deleterec(String str) throws IOException{
		File fr=new File("C:\\Users\\TUSHAR\\Desktop\\tush.txt");
		File tempfile =new File("C:\\Users\\TUSHAR\\Desktop\\ABC.txt");
		BufferedReader br=new BufferedReader(new FileReader(fr));
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

		String line;
		String current;
		System.out.println("\n=>"+str);
		while((current=br.readLine())!=null){
			if (!current.substring(8, 14).equalsIgnoreCase(str)){
				writer.write(current);
				writer.newLine();
				//writer.write("\n");
			}
		}
		writer.close();
		
		br.close();
		fr.delete();
		tempfile.renameTo(fr);
		//System.out.println(succeful);
	}
 }

	class abc4{
		String medicine,company; 
		String quantity,price;
		 
		void read() throws IOException{
			FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\tanisha.txt");
			File tempfile =new File("C:\\Users\\Hp\\Desktop\\ABC.txt");
			BufferedReader br=new BufferedReader(fr);
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));
			String line;
			if((line=br.readLine())!=null){
				medicine=line.substring(0, 6);
				company=line.substring(8,14);
				quantity=line.substring(16, 20);
				price=line.substring(22,line.length()-1);
				if(null!=line && !line.equalsIgnoreCase(company) && !line.equalsIgnoreCase(medicine) &&!line.equalsIgnoreCase(quantity) && !line.equalsIgnoreCase(price))
				
				System.out.print(medicine);
				System.out.print(company);
				System.out.print(price);
				System.out.print(quantity);
				
				
				System.out.println(line);
				
			}
			
			PrintWriter out = new PrintWriter("C:\\Users\\Hp\\Desktop\\tanisha.txt"); // Step 2

	        // Write the name of four oceans to the file
	        out.println(medicine);   // Step 3
	        out.println(company);
	        out.println(price);
	        out.println(quantity);

	        // Close the file.
	        out.close();  // Step 4
			br.close();
		}	
		void addrec(String aa, String bb, String cc, String dd) throws IOException{
			File fr=new File("C:\\Users\\Hp\\Desktop\\tanisha.txt");
			File tempfile =new File("C:\\Users\\Hp\\Desktop\\ABC.txt");
			BufferedReader br=new BufferedReader(new FileReader(fr));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

			String line;
			String current;
			while((current=br.readLine())!=null){
					writer.write(current);
					writer.newLine();
				}
			String aaa=aa,bbb=bb,ccc=cc,ddd=dd;
			for(int i=aa.length();i<6;i++)
				aaa=aaa+" ";
			for(int i=bb.length();i<6;i++)
				bbb=bbb+" ";
			for(int i=cc.length();i<6;i++)
				ccc=ccc+" ";
			for(int i=dd.length();i<6;i++)
				ddd=ddd+" ";
			writer.write(aaa+"|"+bbb+"|"+ccc+"|"+ddd);
			
			writer.close();
			
			br.close();
			fr.delete();
			tempfile.renameTo(fr);
			//System.out.println(succeful);
		}
	}
	class abc3{
		String medicine,company; 
		String quantity,price;
		void read() throws IOException{
		FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\tanisha.txt");
		File tempfile =new File("C:\\Users\\Hp\\Desktop\\ABC.txt");
		BufferedReader br=new BufferedReader(fr);
		BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

		String line;
		if((line=br.readLine())!=null){
			medicine=line.substring(0, 13);
			company=line.substring(15,22);
			quantity=line.substring(24, 28);
			price=line.substring(30,line.length()-1);
			if(null!=line && !line.equalsIgnoreCase(company) && !line.equalsIgnoreCase(medicine) &&!line.equalsIgnoreCase(quantity) && !line.equalsIgnoreCase(price))
			
			System.out.println(medicine);
			System.out.println(company);
			System.out.println(price);
			System.out.println(quantity);
			
			
			System.out.println(line);
				}
		
		br.close();
	}
		
	}
	class abc6{
		 String medicine,company; 
			String quantity,price;
			 
			void read(int count) throws IOException{
				File fr=new File("C:\\Users\\Hp\\Desktop\\tanisha.txt");
				File tempfile =new File("C:\\Users\\Hp\\Desktop\\ABC.txt");
				BufferedReader br=new BufferedReader(new FileReader(fr));
				BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile));

				String line="";
				String current;
				int i=1;
				while(i<=count){
					line=br.readLine();
					String trimmedLine=line.trim();
					//if(trimmedLine.equals(company))continue;
					//writer.write(current+System.getProperty("|"));
					i++;
				}
				medicine=line.substring(0, 6);
				company=line.substring(8,14);
				quantity=line.substring(16, 20);
				price=line.substring(22,line.length()-1);
				//writer.close();
				
				br.close();
			}
		
	}
	class abc7{
		String medicine,company; 
		String quantity,price;
		 
		void read(int count) throws IOException{
			File fr=new File("C:\\Users\\Hp\\Desktop\\tanisha.txt");
			BufferedReader br=new BufferedReader(new FileReader(fr));

			String line="";
			String current;
			int i=0;
			while(i<=count){
				line=br.readLine();
				String trimmedLine=line.trim();
				i++;
			}
			medicine=line.substring(0, 6);
			company=line.substring(8,14);
			quantity=line.substring(16, 20);
			price=line.substring(22,line.length()-1);
			//writer.close();
			
			br.close();
		
	}
	}
	class abc8{
		 String company,medicine; 
			String quantity,price;
			 
			void read(String ss) throws IOException{
				FileReader fr=new FileReader("C:\\Users\\Hp\\Desktop\\tanisha.txt");
				BufferedReader br=new BufferedReader(fr);
				
				
				
				String line;
				
				while((line=br.readLine())!=null){
					
					medicine=line.substring(8, 14);
					company=line.substring(0,6);
					
					quantity=line.substring(16, 20);
					price=line.substring(22,line.length()-1);
					
					System.out.println(">>"+ss+">>"+company);
					if(ss.equals(company)){
						
						System.out.println(">"+medicine);
						System.out.println(">"+company);
						System.out.println(">"+price);
						System.out.println(">"+quantity);
						return;
					}
					
				}
				
			    
				
				br.close();
			}
	}

 class tani{

	public static void main(String[] args)throws IOException {
	abc1 f=new abc1();
		f.read();
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new myframe();
			}
		});
		
	}

 }
 
	
