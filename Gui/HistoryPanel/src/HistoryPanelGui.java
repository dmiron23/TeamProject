import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * 
 * @author 1106139b
 *
 */
@SuppressWarnings("serial")
public class HistoryPanelGui extends JPanel{
	
	private static ImageIcon collision = new ImageIcon("\\home\\danny\\workspace\\HistoryPanel\\images\\block.png");
	private static ImageIcon success = new ImageIcon("\\home\\danny\\workspace\\HistoryPanel\\images\\note-2.png");
	private static ImageIcon warning = new ImageIcon("\\home\\danny\\workspace\\HistoryPanel\\images\\alert.png");
	private static Object[][] data=
		{
			{success, "Entry dog successfully added!"},
			{success, "Entry house successfully added!"},
			{warning, "Entry 13da32xf.0 is not a suitable data type!"},
			{success, "Entry pet successfully added!"},
			{collision, "Entry god caused collision with dog, searching another place!"},
			{success, "Entry god successfully added!"},
			{success, "Entry dog successfully added!"},
			{success, "Entry house successfully added!"},
			{warning, "Entry 13da32xf.0 is not a suitable data type!"},
			{success, "Entry pet successfully added!"},
			{collision, "Entry god caused collision with dog, searching another place!"},
			{success, "Entry god successfully added!"},
			{success, "Entry dog successfully added!"},
			{success, "Entry house successfully added!"},
			{warning, "Entry 13da32xf.0 is not a suitable data type!"},
			{success, "Entry pet successfully added!"},
			{collision, "Entry god caused collision with dog, searching another place!"},
			{success, "Entry god successfully added!"},
			{success, "Entry dog successfully added!"},
			{success, "Entry house successfully added!"},
			{warning, "Entry 13da32xf.0 is not a suitable data type!"},
			{success, "Entry pet successfully added!"},
			{collision, "Entry god caused collision with dog, searching another place!"},
			{success, "Entry god successfully added!"},
			{success, "Entry dog successfully added!"},
			{success, "Entry house successfully added!"},
			{warning, "Entry 13da32xf.0 is not a suitable data type!"},
			{success, "Entry pet successfully added!"},
			{collision, "Entry god caused collision with dog, searching another place!"},
			{success, "Entry god successfully added!"},
			{success, "Entry dog successfully added!"},
			{success, "Entry house successfully added!"},
			{warning, "Entry 13da32xf.0 is not a suitable data type!"},
			{success, "Entry pet successfully added!"},
			{collision, "Entry god caused collision with dog, searching another place!"},
			{success, "Entry god successfully added!"},
			{success, "Entry dog successfully added!"},
			{success, "Entry house successfully added!"},
			{warning, "Entry 13da32xf.0 is not a suitable data type!"},
			{success, "Entry pet successfully added!"},
			{collision, "Entry god caused collision with dog, searching another place!"},
			{success, "Entry god successfully added!"}
			
	};
	private static String[] columns = {"","Events History"};
	//creating a model for the JTable that we are using to store animation history
	private static DefaultTableModel model = new DefaultTableModel(data,columns) {
		        //preventing the user from modifying the content of the cells 
		        @Override
		        public boolean isCellEditable(int row, int col) {
		             return false;
		        }
		        
		        //setting up column names
		        @Override 
		        public String getColumnName(int index) { 
		            return columns[index];
		        } 
		        
			};
	private static int step = data.length-1;
	
	/**
	 * constructor method
	 */
	public HistoryPanelGui(){
		
		JPanel jp = new JPanel(new BorderLayout());
		//jp.setOpaque(true);
		jp.setPreferredSize(new Dimension(350,500));
		
	}
	
	/**
	 * method used for creating the history panel
	 */
	public static void createHP(){
		
		JFrame frame = new JFrame("History Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(350,600));
		frame.setResizable(false);
		
		//Setting up the layout for the controls of the history panel
		GridLayout g = new GridLayout(0,3);
		
		//Creating container for the controls
		JPanel controls = new JPanel(g);
		controls.setPreferredSize(new Dimension(350,35));
		
		//Creating the control buttons
		JButton clearHistory = new JButton("Reset");
		clearHistory.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				System.out.println("You cleared the animation history!");
				model.setRowCount(0);
				step = 0;
			}
		});
		
		JButton back = new JButton("Remove");
		clearHistory.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				model.removeRow(step);
				step--;
			}
		});
		
		JButton forward = new JButton("Add");
		clearHistory.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
				if(step<=data.length-1){
					model.addRow(data[step]);
					step++;
				}
				else{
					step= 0;
					model.addRow(data[step]);
				}
			}
		});
		
		//Adding the control buttons to their container
		controls.add(back);
		controls.add(forward);
		controls.add(clearHistory);
		
		//Creating the JTable itself
		JTable historyLog = new JTable(model);
		historyLog.getColumnModel().getColumn(0).setMaxWidth(25);
		historyLog.setRowHeight(25);
		
		//Adding the JTable to a ScrollPane
		JScrollPane tableScroll = new JScrollPane(historyLog);
		tableScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		tableScroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//Adding all the components to the main frame
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(controls, BorderLayout.NORTH);
		frame.getContentPane().add(tableScroll,BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	/**
	 * main method
	 * @param args
	 */
	public static void main(String[] args){
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createHP();
            }
        });
	}
}
