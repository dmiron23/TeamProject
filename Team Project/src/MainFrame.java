/*
 * MainFrame.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 *
 * @author  __USER__
 */
public class MainFrame extends javax.swing.JFrame {

	/** Creates new form MainFrame */
	public MainFrame() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		History = new javax.swing.JPanel();
		jTextField3 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jList1 = new javax.swing.JList();
		Controls = new javax.swing.JPanel();
		Insert = new javax.swing.JButton();
		Remove = new javax.swing.JButton();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		Play = new javax.swing.JButton();
		Pause = new javax.swing.JButton();
		Previous = new javax.swing.JButton();
		Next = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMenu3 = new javax.swing.JMenu();
		jMenu4 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Animated Algorithms");
		setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		History.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		jTextField3.setText("Status");

		jList1.setModel(new javax.swing.AbstractListModel() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4",
					"Item 5" };

			public int getSize() {
				return strings.length;
			}

			public Object getElementAt(int i) {
				return strings[i];
			}
		});
		jList1.setToolTipText("");
		jScrollPane1.setViewportView(jList1);

		javax.swing.GroupLayout HistoryLayout = new javax.swing.GroupLayout(
				History);
		History.setLayout(HistoryLayout);
		HistoryLayout
				.setHorizontalGroup(HistoryLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								HistoryLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												HistoryLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																224,
																Short.MAX_VALUE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																224,
																Short.MAX_VALUE))
										.addContainerGap()));
		HistoryLayout
				.setVerticalGroup(HistoryLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								HistoryLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jTextField3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												213, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												374,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		Controls.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		Insert.setText("Insert");
		Insert.setMaximumSize(new java.awt.Dimension(75, 25));
		Insert.setMinimumSize(new java.awt.Dimension(75, 25));

		Remove.setText("Remove");
		Remove.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RemoveActionPerformed(evt);
			}
		});

		jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(
				0, 0, 0), 1, true));

		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Key:");

		jTextField1.setText("Enter Key Here...");
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextField2.setText("Enter Value Here...");
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel2.setText("Value:");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																107,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																107,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																107,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																16,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																25,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																25,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(6, Short.MAX_VALUE)));

		jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(
				0, 0, 0), 1, true));

		Play.setIcon(new javax.swing.ImageIcon(
				"D:\\Files\\Dropbox\\hwk\\PSD3\\GitHub\\TeamProject\\Team Project\\1382055664_Play40.png")); // NOI18N
		Play.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		Play.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PlayActionPerformed(evt);
			}
		});

		Pause.setIcon(new javax.swing.ImageIcon(
				"D:\\Files\\Dropbox\\hwk\\PSD3\\GitHub\\TeamProject\\Team Project\\1382055684_Pause40.png")); // NOI18N
		Pause.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

		Previous.setIcon(new javax.swing.ImageIcon(
				"D:\\Files\\Dropbox\\hwk\\PSD3\\GitHub\\TeamProject\\Team Project\\1382055735_Undo40.png")); // NOI18N
		Previous.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		Previous.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PreviousActionPerformed(evt);
			}
		});

		Next.setIcon(new javax.swing.ImageIcon(
				"D:\\Files\\Dropbox\\hwk\\PSD3\\GitHub\\TeamProject\\Team Project\\1382055723_Redo40.png")); // NOI18N
		Next.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
		Next.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NextActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												Play,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												74,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												Pause,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												74,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												Previous,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												74,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												Next,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												74,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(Previous,
								javax.swing.GroupLayout.PREFERRED_SIZE, 53,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Next,
								javax.swing.GroupLayout.PREFERRED_SIZE, 53,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Play,
								javax.swing.GroupLayout.PREFERRED_SIZE, 53,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(Pause,
								javax.swing.GroupLayout.PREFERRED_SIZE, 53,
								javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout ControlsLayout = new javax.swing.GroupLayout(
				Controls);
		Controls.setLayout(ControlsLayout);
		ControlsLayout
				.setHorizontalGroup(ControlsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								ControlsLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jPanel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												Insert,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												122, Short.MAX_VALUE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												Remove,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												122, Short.MAX_VALUE)
										.addGap(26, 26, 26)
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)));
		ControlsLayout
				.setVerticalGroup(ControlsLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jPanel1, 0, 56, Short.MAX_VALUE)
						.addGroup(
								ControlsLayout
										.createSequentialGroup()
										.addGap(1, 1, 1)
										.addGroup(
												ControlsLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																Insert,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																Remove,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel2,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))));

		jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 910,
				Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 539,
				Short.MAX_VALUE));

		jMenu1.setText("File");

		jMenuItem1.setText("Item");
		jMenu1.add(jMenuItem1);

		jMenuBar1.add(jMenu1);

		jMenu2.setText("Hash Functions");

		jMenuItem2.setText("Func 1");
		jMenu2.add(jMenuItem2);

		jMenuItem3.setText("Func 2");
		jMenu2.add(jMenuItem3);

		jMenuItem4.setText("Func 3");
		jMenu2.add(jMenuItem4);

		jMenuBar1.add(jMenu2);

		jMenu3.setText("About");
		jMenuBar1.add(jMenu3);

		jMenu4.setText("Help");

		jMenuItem5.setText("Item");
		jMenu4.add(jMenuItem5);

		jMenuBar1.add(jMenu4);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														Controls,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGroup(
														layout.createSequentialGroup()
																.addGap(12, 12,
																		12)
																.addComponent(
																		jPanel3,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		Short.MAX_VALUE)))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(History,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(Controls,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jPanel3,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE))
				.addComponent(History,
						javax.swing.GroupLayout.Alignment.TRAILING,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void PlayActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void RemoveActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void NextActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JPanel Controls;
	private javax.swing.JPanel History;
	private javax.swing.JButton Insert;
	private javax.swing.JButton Next;
	private javax.swing.JButton Pause;
	private javax.swing.JButton Play;
	private javax.swing.JButton Previous;
	private javax.swing.JButton Remove;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JList jList1;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}