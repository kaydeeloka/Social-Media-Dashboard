package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import com.toedter.calendar.JCalendar;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import java.awt.Panel;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;


public class schedule extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTask;
	private JTable table;
 // Map to store tasks for each date
    private static Map<String, List<Object[]>> tasksByDate = new HashMap<>();
    private JTable tableTask;

	/**
	 * Create the frame.
	 */
	
	public schedule() {
		
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1180, 664);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menu();
		content();
	}
	
		private void menu() {
			JPanel panelMenu = new JPanel();
			panelMenu.setBackground(new Color(255, 255, 204));
			panelMenu.setBounds(0, 0, 219, 663);
			contentPane.add(panelMenu);
			panelMenu.setLayout(null);
			
			JButton btnDashboard = new JButton(" Dashboard\r\n");
			btnDashboard.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnDashboard.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\dashboard.png"));
			btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
			btnDashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnDashboard.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnDashboard.setBackground(new Color(153,153,255));
					btnDashboard.setForeground(Color.white);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnDashboard.setBackground(Color.white);
					btnDashboard.setForeground(new Color(153,153,255));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					// Simulate opening the dashboard page
		            mainMenu openMenu = new mainMenu();
		            openMenu.setVisible(true);
		            openMenu.setLocationRelativeTo(null); //set center
				}
			});
			btnDashboard.setForeground(new Color(153, 153, 255));
			btnDashboard.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
			btnDashboard.setFocusPainted(false);
			btnDashboard.setBorderPainted(false);
			btnDashboard.setBackground(new Color(255, 255, 255));
			btnDashboard.setBounds(13, 270, 187, 43);
			panelMenu.add(btnDashboard);
			
			JButton btnSchedule = new JButton("   Schedule\r\n");
			btnSchedule.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnSchedule.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\schedule.png"));
			btnSchedule.setHorizontalAlignment(SwingConstants.LEFT);
			btnSchedule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnSchedule.setForeground(new Color(255, 255, 255));
			btnSchedule.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
			btnSchedule.setFocusPainted(false);
			btnSchedule.setBorderPainted(false);
			btnSchedule.setBackground(new Color(153, 153, 255));
			btnSchedule.setBounds(13, 348, 187, 43);
			panelMenu.add(btnSchedule);
			
			JButton btnAnalytics = new JButton("  Analytics\r\n");
			btnAnalytics.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\analytics.png"));
			btnAnalytics.setHorizontalAlignment(SwingConstants.LEFT);
			btnAnalytics.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAnalytics.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnAnalytics.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnAnalytics.setBackground(new Color(153,153,255));
					btnAnalytics.setForeground(Color.white);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnAnalytics.setBackground(Color.white);
					btnAnalytics.setForeground(new Color(153,153,255));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					// Simulate opening the analytics
		            analytics openAnalytics = new analytics();
		            openAnalytics.setVisible(true);
		            openAnalytics.setLocationRelativeTo(null); //set center

				}
			});
			btnAnalytics.setForeground(new Color(153, 153, 255));
			btnAnalytics.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
			btnAnalytics.setFocusPainted(false);
			btnAnalytics.setBorderPainted(false);
			btnAnalytics.setBackground(Color.WHITE);
			btnAnalytics.setBounds(13, 428, 187, 43);
			panelMenu.add(btnAnalytics);
			
			JButton btnReport = new JButton("    Report");
			btnReport.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\report.png"));
			btnReport.setHorizontalAlignment(SwingConstants.LEFT);
			btnReport.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					btnReport.setBackground(new Color(153,153,255));
					btnReport.setForeground(Color.white);
				}
				@Override
				public void mouseExited(MouseEvent e) {
					btnReport.setBackground(Color.white);
					btnReport.setForeground(new Color(153,153,255));
				}
				@Override
				public void mouseClicked(MouseEvent e) {
					// Simulate opening the main menu
		            report openReport = new report();
		            openReport.setVisible(true);
		            openReport.setLocationRelativeTo(null); //set center

				}
			});
			btnReport.setForeground(new Color(153, 153, 255));
			btnReport.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
			btnReport.setBackground(new Color(255, 255, 255));
			btnReport.setFocusPainted(false);
			btnReport.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnReport.setBorderPainted(false);
			btnReport.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnReport.setBounds(13, 506, 187, 43);
			panelMenu.add(btnReport);
			
			JLabel lblprofile = new JLabel("My Profile");
			lblprofile.setFont(new Font("STXinwei", Font.PLAIN, 25));
			lblprofile.setBounds(49, 50, 155, 24);
			panelMenu.add(lblprofile);
			
			JLabel lbluser = new JLabel("");
			lbluser.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\user.png"));
			lbluser.setBounds(59, 85, 99, 90);
			panelMenu.add(lbluser);
			
			JLabel lblusername = new JLabel("@kaydeeloka\r\n");
			lblusername.setFont(new Font("STXinwei", Font.PLAIN, 22));
			lblusername.setBounds(38, 197, 144, 20);
			panelMenu.add(lblusername);
			
			JPanel panelTop = new JPanel();
			panelTop.setBackground(new Color(153, 153, 255));
			panelTop.setBounds(223, 0, 957, 54);
			contentPane.add(panelTop);
			panelTop.setLayout(null);
			
			JLabel lblExit = new JLabel("X\r\n");
			lblExit.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\exit.png"));
			lblExit.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					System.exit(0);			}
			});
			lblExit.setForeground(new Color(255, 255, 255));
			lblExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			lblExit.setBounds(915, 10, 27, 29);
			panelTop.add(lblExit);		
	}
		
		private void content() {
			JDesktopPane infoPane = new JDesktopPane();
			infoPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			infoPane.setBounds(223, 54, 957, 609);
			contentPane.add(infoPane);
			
			JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setToolTipText("");
			tabbedPane.setBackground(new Color(255, 255, 204));
			tabbedPane.setFont(new Font("STXinwei", Font.PLAIN, 20));
			tabbedPane.setBounds(10, 0, 937, 598);
			infoPane.add(tabbedPane);
	        
	        calendar(tabbedPane);
	        contentDetails(tabbedPane);
	     // Load tasks from the CSV file
	        loadTasksFromCSV();
	    }
		
	private void calendar(JTabbedPane tabbedPane) {
		
			
			// Customize tab size
			tabbedPane.setUI(new javax.swing.plaf.basic.BasicTabbedPaneUI() {
			    @Override
			    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
			        return 150; // Custom tab width
			    }

			    @Override
			    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
			        return 40; // Custom tab height
			    }
			});
			//panel Overview
			JPanel panelOverview = new JPanel();
			panelOverview.setBackground(new Color(255, 255, 255));
			tabbedPane.addTab("Overview", null, panelOverview, null);
			panelOverview.setLayout(null);
			
			// Add a JCalendar component
			JCalendar calendar = new JCalendar();
			calendar.setBounds(20, 60, 400, 450); // Set size and position
			panelOverview.add(calendar);

			// Task Panel
			JPanel Taskpanel = new JPanel();
			Taskpanel.setBounds(468, 60, 421, 450);
			panelOverview.add(Taskpanel);
			Taskpanel.setLayout(null);

			// Label to Display Current Date
			JLabel lblCurrentDate = new JLabel("Date :");
			lblCurrentDate.setFont(new Font("STXinwei", Font.PLAIN, 20));
			lblCurrentDate.setBounds(28, 24, 300, 32); // Increased width to fit the date
			Taskpanel.add(lblCurrentDate);
			
			txtTask = new JTextField();
	        txtTask.setBounds(30, 67, 196, 38);
	        Taskpanel.add(txtTask);
	        txtTask.setColumns(10);

	        // Initialize JComboBox
	        JComboBox<String> comboCategory = new JComboBox<>();
	        comboCategory.setBounds(28, 116, 198, 38);
	        Taskpanel.add(comboCategory);

	        // Dynamically add categories
	        comboCategory.addItem("Work");
	        comboCategory.addItem("Personal");
	        comboCategory.addItem("Shopping");
	        comboCategory.addItem("Meeting");
	        comboCategory.addItem("Others");

	        JButton btnAddTask = new JButton("Add Task");
	        btnAddTask.setBackground(new Color(255, 255, 255));
	        btnAddTask.setForeground(new Color(153, 153, 255));
	        btnAddTask.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
	        btnAddTask.setBounds(271, 67, 116, 37);
	        Taskpanel.add(btnAddTask);
	        
	        
	        JButton btnSaveTask = new JButton("Save Task");
	        btnSaveTask.setForeground(new Color(153, 153, 255));
	        btnSaveTask.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
	        btnSaveTask.setBackground(Color.WHITE);
	        btnSaveTask.setBounds(271, 116, 116, 37);
	        Taskpanel.add(btnSaveTask);
	        
	        btnAddTask.addMouseListener(new MouseAdapter() {
	            @Override
	    		public void mouseEntered(MouseEvent e) {
	            	btnAddTask.setBackground(new Color(153,153,255));
	            	btnAddTask.setForeground(Color.white);
	    		}
	    		@Override
	    		public void mouseExited(MouseEvent e) {
	    			btnAddTask.setBackground(Color.white);
	    			btnAddTask.setForeground(new Color(153,153,255));
	    		}
	        });
	        
	        btnSaveTask.addMouseListener(new MouseAdapter() {
	            @Override
	    		public void mouseEntered(MouseEvent e) {
	            	btnSaveTask.setBackground(new Color(153,153,255));
	            	btnSaveTask.setForeground(Color.white);
	    		}
	    		@Override
	    		public void mouseExited(MouseEvent e) {
	    			btnSaveTask.setBackground(Color.white);
	    			btnSaveTask.setForeground(new Color(153,153,255));
	    		}
	        });
	        
	        
	     // Create a DefaultTableModel with an additional "Completed" column
	     // Define column names and table model
	        String[] columnNames = {"Task", "Category", "Status"};
	        
	        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0) {
	            @Override
	            public Class<?> getColumnClass(int columnIndex) {
	                if (columnIndex == 2) { // "Completed" column
	                    return Boolean.class; // Render as checkbox
	                }
	                return String.class;
	            }

	            @Override
	            public boolean isCellEditable(int row, int column) {
	                // Only allow editing the "Completed" column
	                return column == 0;
	            }
	        };
	        
	        // Create the JTable
	        table = new JTable(tableModel);
	        // Add table to a scroll pane
	        JScrollPane TaskPane = new JScrollPane(table);
	        TaskPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	        TaskPane.setBounds(28, 169, 372, 258);
	        Taskpanel.add(TaskPane);
	        
	     // Set row height for all rows
	        table.setRowHeight(30); // All rows will have a height of 30px
	        
	     // Customize the font for the table column headers
	        table.getTableHeader().setFont(new Font("STXinwei", Font.PLAIN, 15)); // Set font for column headers
	        table.getTableHeader().setBackground(new Color(153,153,255)); // Set background color for the header
	        table.getTableHeader().setForeground(Color.BLACK); // Set text color for the header

	        
	        // Create a custom TableCellRenderer for the Task column
	        table.getColumnModel().getColumn(0).setCellRenderer((TableCellRenderer) new TableCellRenderer() {
	            @Override
	            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	                JLabel label = new JLabel(value != null ? value.toString() : "");
	                boolean isCompleted = (Boolean) table.getValueAt(row, 2); // Check if the task is completed (checkbox checked)

	                if (isCompleted) {
	                    // Apply strikethrough style to completed tasks
	                    label.setFont(label.getFont().deriveFont(Font.ITALIC | Font.BOLD));
	                    label.setText("<html><strike>" + value + "</strike></html>");
	                } else {
	                    // Remove strikethrough for non-completed tasks
	                    label.setFont(label.getFont().deriveFont(Font.PLAIN));
	                }

	                return label;
	            }
	        });
	      
			// Add a property change listener to JCalendar
	        calendar.getDayChooser().addPropertyChangeListener("day", e -> {
	            // Format the selected date from the calendar
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	            String selectedDate = dateFormat.format(calendar.getDate());

	            
	        });

	        // Load tasks for the selected date within the existing listener
	        calendar.getDayChooser().addPropertyChangeListener("day", e -> {
	            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	            String selectedDate = dateFormat.format(calendar.getDate());
	         // Load tasks for the selected date
	            loadTasksForSelectedDate(selectedDate, tableModel);

	            // Update the label with the selected date
	            lblCurrentDate.setText("Date : " + selectedDate);
	            // Clear the table before loading new tasks
	            tableModel.setRowCount(0);

	            // Load tasks for the selected date if they exist
	            if (tasksByDate.containsKey(selectedDate)) {
	                for (Object[] task : tasksByDate.get(selectedDate)) {
	                    tableModel.addRow(task);
	                }
	            }
	        });

	        btnAddTask.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    String task = txtTask.getText().trim();
	                    if (task.isEmpty()) {
	                        JOptionPane.showMessageDialog(Taskpanel, "Task cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
	                        return;
	                    }
	                    String category = (String) comboCategory.getSelectedItem();
	                    boolean completed = false;

	                    // Format the selected date from the calendar
	                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	                    String selectedDate = dateFormat.format(calendar.getDate());

	                    // Save the task to the table
	                    Object[] taskData = new Object[]{task, category, completed};
	                    tableModel.addRow(taskData);

	                    // Save the task to the map
	                    tasksByDate.computeIfAbsent(selectedDate, k -> new ArrayList<>()).add(taskData);

	                    txtTask.setText(""); // Clear input field
	                    comboCategory.setSelectedIndex(0); // Reset category combobox
	                } catch (Exception ex) {
	                    ex.printStackTrace(); // Log the error
	                    JOptionPane.showMessageDialog(Taskpanel, "An error occurred: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	     // Modify the code to update task completion status in the map before saving
	        btnSaveTask.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    Path path = Paths.get("data", "tasks_with_dates.csv");
	                    FileWriter writer = new FileWriter(path.toFile());

	                    // Write the header
	                    writer.write("Date,Task,Category,Completed\n");

	                    // Save tasks from the map (make sure the map is updated with the latest task status)
	                    for (String date : tasksByDate.keySet()) {
	                        for (Object[] taskData : tasksByDate.get(date)) {
	                            String task = taskData[0].toString();
	                            String category = taskData[1].toString();
	                            String completedStatus = (boolean) taskData[2] ? "Completed" : "Not Completed";
	                            writer.write(date + "," + task + "," + category + "," + completedStatus + "\n");
	                        }
	                    }

	                    writer.close();
	                    JOptionPane.showMessageDialog(null, "Tasks saved successfully!");
	                } catch (IOException ex) {
	                    JOptionPane.showMessageDialog(null, "Error saving tasks: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	                }
	            }
	        });

	     // Add mouse listener to toggle the "Completed" checkbox and update tasksByDate
	        table.addMouseListener(new java.awt.event.MouseAdapter() {
	            @Override
	            public void mouseClicked(java.awt.event.MouseEvent evt) {
	                int row = table.rowAtPoint(evt.getPoint());
	                int column = table.columnAtPoint(evt.getPoint());

	                if (column == 2) { // Check if "Completed" column is clicked
	                    boolean currentStatus = (Boolean) tableModel.getValueAt(row, column);
	                    tableModel.setValueAt(!currentStatus, row, column); // Toggle the value

	                    // Update the corresponding entry in tasksByDate
	                    String selectedDate = new SimpleDateFormat("yyyy-MM-dd").format(calendar.getDate());
	                    if (tasksByDate.containsKey(selectedDate)) {
	                        // Ensure the task data is updated in the map
	                        Object[] taskData = tasksByDate.get(selectedDate).get(row);
	                        taskData[2] = !currentStatus; // Update the "Completed" status
	                    }

	                    table.repaint(); // Update UI
	                }
	            }
	        });

	        
	}
			
	private void contentDetails(JTabbedPane tabbedPane) {
	    JPanel panelContent = new JPanel();
	    tabbedPane.addTab("Content Details", null, panelContent, null);
	    panelContent.setLayout(null);
	    
	    Panel Categorypanel = new Panel();
	    Categorypanel.setBounds(23, 29, 885, 524);
	    panelContent.add(Categorypanel);
	    Categorypanel.setLayout(null);
	    
	    JLabel lblCategory = new JLabel("Category  :\r\n");
	    lblCategory.setFont(new Font("STXinwei", Font.PLAIN, 20));
	    lblCategory.setBounds(20, 11, 108, 32);
	    Categorypanel.add(lblCategory);
	    
	    // Set the default date to the current date
	    Calendar calendar = Calendar.getInstance();
	    
	    // Define column names and table model
	    String[] columnDetails = { "Date", "Category", "Task", "Status"};
	    DefaultTableModel tableModelTask = new DefaultTableModel(new Object[]{"Date", "Category", "Task" , "Status"}, 0) {
	        @Override
	        public boolean isCellEditable(int row, int column) {
	            return column == 0 || column == 3; // Editable Task and Status columns
	        }
	    };
	    
	    tableTask = new JTable(tableModelTask);
	    tableTask.setBounds(20, 60, 843, 397);
	    Categorypanel.add(tableTask);
	    
	    // Attach table to a JScrollPane to display column headers
	    JScrollPane scrollPane = new JScrollPane(tableTask);
	    scrollPane.setBounds(20, 60, 843, 397); // Set size and position
	    Categorypanel.add(scrollPane);
	    
	    // Save Button
	    JButton btnSave = new JButton("Save");
	    btnSave.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            // Save Logic (See the original code)
	        }
	    });
	    btnSave.setForeground(new Color(153, 153, 255));
	    btnSave.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
	    btnSave.setBackground(Color.WHITE);
	    btnSave.setBounds(747, 470, 116, 37);
	    Categorypanel.add(btnSave);

	    

	    JButton btnAllTask = new JButton("All Task");
	    btnAllTask.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    btnAllTask.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseClicked(MouseEvent e) {
	            // Load tasks from the CSV file and display them in the table
	            loadTasksFromFile(tableModelTask);
	        }
	    });


	    btnAllTask.setForeground(new Color(153, 153, 255));
	    btnAllTask.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
	    btnAllTask.setBackground(Color.WHITE);
	    btnAllTask.setBounds(621, 470, 116, 37);
	    Categorypanel.add(btnAllTask);
	    
	    JLabel lblCategories = new JLabel("All Categories");
	    lblCategories.setFont(new Font("STXinwei", Font.PLAIN, 20));
	    lblCategories.setBounds(131, 11, 171, 32);
	    Categorypanel.add(lblCategories);
	    
	    // Hover effects for Save Button
	    btnSave.addMouseListener(new MouseAdapter() {
	        @Override
	        public void mouseEntered(MouseEvent e) {
	            btnSave.setBackground(new Color(153, 153, 255));
	            btnSave.setForeground(Color.white);
	        }
	        @Override
	        public void mouseExited(MouseEvent e) {
	            btnSave.setBackground(Color.white);
	            btnSave.setForeground(new Color(153, 153, 255));
	        }
	        public void actionPerformed(ActionEvent e) {
	            // Save the updated tasks from the table
	            DefaultTableModel tableModel = (DefaultTableModel) tableTask.getModel();
	            for (int i = 0; i < tableModel.getRowCount(); i++) {
	                // Get the updated task data (assume: [Date, Category, Task, Status])
	                String date = tableModel.getValueAt(i, 0).toString();
	                String category = tableModel.getValueAt(i, 1).toString();
	                String task = tableModel.getValueAt(i, 2).toString();
	                String status = tableModel.getValueAt(i, 3).toString();
	                
	                // Find the corresponding task and update it
	             // Find the corresponding task and update it
	                for (List<Object[]> taskList : tasksByDate.values()) {
	                    for (Object[] taskData : taskList) {
	                        // Check if the task matches the given date, category, and task description
	                        if (taskData[0].equals(date) && taskData[1].equals(category) && taskData[2].equals(task)) {
	                            // Update the task status and task description
	                            taskData[2] = task; // Update the task description
	                            taskData[3] = status;  // Update the status
	                        }
	                    }
	                }

	            }

	            // Optionally, save to a CSV or database
	            saveTasksToFile();
	        }
	        private void saveTasksToFile() {
	            // Define the CSV file path
	            File file = new File("tasks_with_date.csv");

	            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
	                // Write the header row
	                writer.write("Date,Category,Task,Status");
	                writer.newLine();

	                // Loop through the tasksByDate map and write each task to the file
	                for (List<Object[]> taskList : tasksByDate.values()) {
	                    for (Object[] task : taskList) {
	                        // Format each task as a CSV row
	                        String row = String.join(",", task[0].toString(), task[1].toString(), task[2].toString(), task[3].toString());
	                        writer.write(row);
	                        writer.newLine();
	                    }
	                }
	                System.out.println("Tasks saved successfully.");
	            } catch (IOException e) {
	                e.printStackTrace();
	                System.err.println("Error saving tasks to file.");
	            }
	        }

	    });

	    // Map to store tasks by date for easy filtering
	    Map<String, List<Object[]>> tasksByDate = new HashMap<>();

	    // Load tasks from the CSV file
	    loadTasksFromCSV();

	}

		private void loadTasksFromFile(DefaultTableModel tableModelTask) {
		    Path path = Paths.get("data", "tasks_with_dates.csv");

		    try (BufferedReader reader = Files.newBufferedReader(path)) {
		        String line;
		        // Clear the current rows in the table
		        tableModelTask.setRowCount(0);

		        while ((line = reader.readLine()) != null) {
		            // Skip the header line
		            if (line.startsWith("Date")) continue;

		            // Split each line by comma
		            String[] taskData = line.split(",");

		            // Ensure the line has the expected number of columns
		            if (taskData.length == 4) {
		                String date = taskData[0];
		                String task = taskData[1];
		                String category = taskData[2];
		                String completedStatus = taskData[3];

		                // Convert completed status to a boolean
		                boolean completed = "Completed".equals(completedStatus);

		                // Add task data to the table model
		                Object[] rowData = {date, task, category, completed ? "Completed" : "Not Completed"};
		                tableModelTask.addRow(rowData);
		            }
		        }

		        JOptionPane.showMessageDialog(null, "All tasks loaded successfully!");

		    } catch (IOException ex) {
		        ex.printStackTrace();
		        JOptionPane.showMessageDialog(null, "Error reading tasks: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		    }
		}


		private static void loadTasksFromCSV() {
		    try {
		        Path path = Paths.get("data", "tasks_with_dates.csv");
		        if (!Files.exists(path)) {
		            return; // If the file doesn't exist, no need to load data
		        }

		        BufferedReader reader = Files.newBufferedReader(path);
		        String line;
		        reader.readLine(); // Skip the header line
		        while ((line = reader.readLine()) != null) {
		            String[] parts = line.split(",");
		            if (parts.length == 4) {
		                String date = parts[0].trim();
		                String task = parts[1].trim();
		                String category = parts[2].trim();
		                boolean completed = "Completed".equals(parts[3].trim());

		                // Add task to the tasks map, grouped by date
		                Object[] taskData = new Object[]{task, category, completed};
		                tasksByDate.computeIfAbsent(date, k -> new ArrayList<>()).add(taskData);
		            }
		        }
		        reader.close();
		    } catch (IOException ex) {
		        JOptionPane.showMessageDialog(null, "Error loading tasks: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		    }
		}

		private void loadTasksForSelectedDate(String selectedDate,DefaultTableModel tableModel ) {
		    // Clear the table before loading new tasks
		    tableModel.setRowCount(0);

		    // Load tasks for the selected date if they exist
		    if (tasksByDate.containsKey(selectedDate)) {
		        for (Object[] task : tasksByDate.get(selectedDate)) {
		            tableModel.addRow(task);
		        }
		    }
		}

		
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					schedule frame = new schedule();
					frame.setLocationRelativeTo(null); //set center
					frame.setVisible(true);
					loadTasksFromCSV();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
