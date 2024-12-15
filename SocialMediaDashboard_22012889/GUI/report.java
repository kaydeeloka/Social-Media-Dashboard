package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


public class report extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	
	public report() {
		
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
		btnSchedule.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btnSchedule.setBackground(new Color(153,153,255));
				btnSchedule.setForeground(Color.white);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnSchedule.setBackground(Color.white);
				btnSchedule.setForeground(new Color(153,153,255));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// Simulate opening the schedule page
	            schedule openSchedule = new schedule();
	            openSchedule.setVisible(true);
	            openSchedule.setLocationRelativeTo(null); //set center

			}
		});
		btnSchedule.setForeground(new Color(153, 153, 255));
		btnSchedule.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		btnSchedule.setFocusPainted(false);
		btnSchedule.setBorderPainted(false);
		btnSchedule.setBackground(Color.WHITE);
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
		btnReport.setForeground(new Color(255, 255, 255));
		btnReport.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
		btnReport.setBackground(new Color(153, 153, 255));
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
		lblExit.setFont(new Font("STFangsong", Font.PLAIN, 30));
		lblExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblExit.setBounds(915, 10, 27, 29);
		panelTop.add(lblExit);	
}
	private void content() {
	    JDesktopPane infoPane = new JDesktopPane();
	    infoPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    infoPane.setBounds(223, 54, 957, 609);
	    contentPane.add(infoPane);
	    summary(infoPane);  // Summary panel
	    reportPage(infoPane);  // Summary panel
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(10, 473, 262, 125);
	    infoPane.add(panel);
	    panel.setLayout(null);
	    
	    JLabel lbltotal = new JLabel("<html>Total Viewers  <br>114k</html>");
	    lbltotal.setBounds(10, 11, 103, 38);
	    lbltotal.setFont(new Font("Tahoma", Font.BOLD, 15));
	    panel.add(lbltotal);
	    
	    JLabel lblnewViewers = new JLabel("<html>New Viewers <br>230k</html>");
	    lblnewViewers.setBounds(135, 11, 99, 38);
	    lblnewViewers.setFont(new Font("Tahoma", Font.BOLD, 15));
	    panel.add(lblnewViewers);
	    
	    JLabel lbltotalFollowers = new JLabel("<html>Total Followers <br>550k</html>");
	    lbltotalFollowers.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lbltotalFollowers.setBounds(10, 58, 124, 45);
	    panel.add(lbltotalFollowers);
	    
	    JLabel lblnetFollowers = new JLabel("<html>Net Followers <br>150k</html>");
	    lblnetFollowers.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblnetFollowers.setBounds(135, 58, 124, 45);
	    panel.add(lblnetFollowers);

	}

	private void reportPage(JDesktopPane infoPane) {
	    JPanel panelReport = new JPanel();
	    panelReport.setBounds(282, 11, 665, 587);
	    infoPane.add(panelReport);
	    panelReport.setLayout(null);
	    
	    JPanel panelTrafficSource = new JPanel();
	    panelTrafficSource.setBounds(290, 240, 365, 179);
	    panelReport.add(panelTrafficSource);
	    panelTrafficSource.add(new TrafficSourceChart(), BorderLayout.CENTER);
	            panelTrafficSource.setLayout(null);
	    
	            
	            JLabel lblTraffic = new JLabel("Traffic Source");
	            lblTraffic.setBounds(128, 5, 107, 19);
	            lblTraffic.setFont(new Font("Arial", Font.BOLD, 16));
	            panelTrafficSource.add(lblTraffic);
	            
	            JLabel lblNewLabel_1 = new JLabel("");
	            lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\trafficSource _Report1.png"));
	            lblNewLabel_1.setBounds(32, 24, 300, 155);
	            panelTrafficSource.add(lblNewLabel_1);
	    
	    JButton btnDownload = new JButton("Download");
	    btnDownload.setForeground(new Color(255, 255, 255));
	    btnDownload.setBackground(new Color(153, 153, 255));
	    btnDownload.addMouseListener(new MouseAdapter() {
	    	 @Override
	    	    public void mouseClicked(MouseEvent e) {
	    	        // Call the downloadReport() method
	    	        downloadReport(infoPane);
	    	    }

	    	    @Override
	    	    public void mouseEntered(MouseEvent e) {
	    	        // Optional: Change cursor or button appearance when hovered
	    	        btnDownload.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    	    }

	    	    @Override
	    	    public void mouseExited(MouseEvent e) {
	    	        // Optional: Reset button appearance when the mouse exits
	    	        btnDownload.setCursor(Cursor.getDefaultCursor());
	    	    }
	    });
	    btnDownload.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 14));
	    btnDownload.setBounds(538, 11, 117, 40);
	    panelReport.add(btnDownload);
        
        // Title
        JLabel lblReportTitle = new JLabel("Social Media Dashboard Report");
        lblReportTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblReportTitle.setBounds(10, 10, 400, 40);
        panelReport.add(lblReportTitle);

        // Task Panel (e.g., Add/View Tasks)
        JPanel taskPanel = new JPanel();
        taskPanel.setBounds(10, 55, 270, 365);
        taskPanel.setBorder(BorderFactory.createTitledBorder("Tasks"));
        taskPanel.setLayout(new BorderLayout());
        taskPanel.add(new JScrollPane(createTaskList()), BorderLayout.CENTER);
        panelReport.add(taskPanel);
        
        JPanel panelViewersGraph = new JPanel();
        panelViewersGraph.setBounds(290, 43, 365, 217);
        panelReport.add(panelViewersGraph);
        panelViewersGraph.setLayout(new BorderLayout());
        
        JLabel lblNewLabel = new JLabel("Viewers");
        lblNewLabel.setFont(new Font("STXinwei", Font.BOLD, 20));
        lblNewLabel.setBackground(new Color(153, 153, 255));
        panelViewersGraph.add(lblNewLabel, BorderLayout.NORTH);
        // Add the graph plotter to the panel
        panelViewersGraph.setLayout(new BorderLayout());
        panelViewersGraph.add(new ViewersGraphPlotter(), BorderLayout.CENTER);
        
        JPanel panelAnalysis = new JPanel();
        panelAnalysis.setBounds(10, 431, 645, 145); // Position and size of panelAnalysis
        panelReport.add(panelAnalysis);
        panelAnalysis.setLayout(new BorderLayout());
        
     // Define the data for the table
        String[] columnNames = {"Category", "Video Views", "Profile Views", "Likes", "Comments", "Shares"};
        Object[][] data = {
            {"7days", 169446, 4509, 4951, 456, 1103},
            {"28days", 578844, 14242, 15400, 1471, 4274},
            {"60days", 1251851, 28392, 33435, 3155, 9333},
            {"365days", 5788159, 107746, 200734, 8810, 22708}
        };

        // Create a DefaultTableModel with the data and column names
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

        // Create a JTable with the model
        JTable table = new JTable(model);

        // Calculate row height dynamically
        int panelHeight = 126; // Height of panelAnalysis
        int rowHeight = panelHeight / data.length; // Divide by the number of rows
        table.setRowHeight(rowHeight);

        // Add the table directly to panelAnalysis
        panelAnalysis.add(table.getTableHeader(), BorderLayout.NORTH); // Add table header at the top
        panelAnalysis.add(table, BorderLayout.CENTER); 

    }
	public class TrafficSourceChart extends JPanel{

	    // Method to draw the bar chart
	    public static void drawBarChart(Graphics g, int panelWidth, int panelHeight) {
	        // Define the data for the bar chart
	        String[] labels = {"For You", "Search", "Personal profile", "Following", "Sound"};
	        double[] percentages = {61.5, 28.1, 9.9, 0.5, 0};

	        Graphics2D g2 = (Graphics2D) g;

	        // Set rendering hints for smooth drawing
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        // Set padding and bar height
	        int padding = 10;
	        int barHeight = 25;
	        int maxBarWidth = panelWidth - 2 * padding;

	        // Set color for the bars
	        Color barColor = new Color(0, 150, 255); // Blue color for the bars

	        // Draw bars and labels
	        for (int i = 0; i < labels.length; i++) {
	            int barWidth = (int) (percentages[i] / 100 * maxBarWidth); // Calculate bar width based on percentage

	            // Draw the label above the bar
	            g2.setColor(Color.BLACK);
	            g2.drawString(labels[i] + " " + percentages[i] + "%", padding, padding + (i * (barHeight + 10)));

	            // Draw the progress bar
	            g2.setColor(barColor);
	            g2.fillRect(padding, padding + (i * (barHeight + 10)) + 10, barWidth, barHeight);
	        }
	    }
	}


	class ViewersGraphPlotter extends JPanel {
	    private String[] dates = {"Nov-26", "Nov-27", "Nov-28", "Nov-29", "Nov-30", "Dec-01"};
	    private int[] totalViewers = {7269, 6683, 9774, 18615, 18167, 9796};
	    private int[] newViewers = {1695, 1473, 1735, 3203, 5101, 2163};
	    private int[] returningViewers = {5574, 5210, 8039, 15412, 13066, 7633};

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2 = (Graphics2D) g;

	        // Set rendering hints for smooth lines
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	        int padding = 50;  // Padding for axes and labels
	        int labelPadding = 25; // Space between label and axis

	        // Get panel width and height dynamically
	        int width = getWidth();
	        int height = getHeight();

	        // Calculate graph width and height based on panel size
	        int graphWidth = width - 2 * padding;
	        int graphHeight = height - 2 * padding;

	        // Set max value for graph (adjust based on the highest viewer count)
	        int maxValue = 20000;

	        // Draw axes
	        g2.drawLine(padding, height - padding, padding, padding); // Y-axis
	        g2.drawLine(padding, height - padding, width - padding, height - padding); // X-axis

	        // Draw grid lines and labels
	        for (int i = 0; i <= 5; i++) {
	            int x = padding + i * graphWidth / 5;
	            int y = height - padding - i * graphHeight / 5;

	            // Vertical grid line
	            g2.setColor(Color.LIGHT_GRAY);
	            g2.drawLine(x, padding, x, height - padding);

	            // Horizontal grid line
	            g2.drawLine(padding, y, width - padding, y);

	            // Y-axis label
	            g2.setColor(Color.BLACK);
	            String label = String.valueOf(maxValue / 5 * i);
	            g2.drawString(label, padding - labelPadding, y + 5);

	            // X-axis label
	            if (i < dates.length) {
	                g2.drawString(dates[i], x - 5, height - padding + labelPadding);
	            }
	        }

	        // Draw data points and lines
	        int pointRadius = 5;
	        int[] dataSets[] = {totalViewers, newViewers, returningViewers};
	        Color[] colors = {Color.BLUE, Color.ORANGE, Color.RED};
	        String[] dataLabels = {"Blue: Total Viewers", "Orange: New Viewers", "Red: Returning Viewers"};

	        for (int j = 0; j < dataSets.length; j++) {
	            g2.setColor(colors[j]);
	            int[] data = dataSets[j];

	            for (int i = 0; i < data.length - 1; i++) {
	                int x1 = padding + i * graphWidth / (data.length - 1);
	                int y1 = height - padding - (int) ((double) data[i] / maxValue * graphHeight);
	                int x2 = padding + (i + 1) * graphWidth / (data.length - 1);
	                int y2 = height - padding - (int) ((double) data[i + 1] / maxValue * graphHeight);

	                // Draw line
	                g2.drawLine(x1, y1, x2, y2);

	                // Draw point
	                g2.fillOval(x1 - pointRadius, y1 - pointRadius, 2 * pointRadius, 2 * pointRadius);

	                // Add text label for viewers value
	                g2.setColor(colors[j]);
	                String valueText = String.valueOf(data[i]);
	                g2.drawString(valueText, x1 + 5, y1 - 5);  // Draw text slightly offset from the point
	            }

	            // Draw last point
	            int lastX = padding + (data.length - 1) * graphWidth / (data.length - 1);
	            int lastY = height - padding - (int) ((double) data[data.length - 1] / maxValue * graphHeight);
	            g2.fillOval(lastX - pointRadius, lastY - pointRadius, 2 * pointRadius, 2 * pointRadius);

	            // Add text label for the last point
	            String lastValueText = String.valueOf(data[data.length - 1]);
	            g2.setColor(colors[j]);
	            g2.drawString(lastValueText, lastX + 5, lastY - 5);
	        }

	        // Add title for each data set on 3 separate lines
	     // Add title for each data set on 3 separate lines above the graph
	        g2.setColor(Color.BLACK);
	        int labelXPosition = padding + graphWidth / 35;  // Move labels horizontally to the center above the graph
	        for (int i = 0; i < dataLabels.length; i++) {
	            int labelYPosition = padding - 10 - (i * 15);  // Move labels above the graph and spread them out
	            g2.drawString(dataLabels[i], labelXPosition, labelYPosition);  // Draw each title above the graph
	        
	        }
	    }
	}


	private JList<String> createTaskList() {
	    DefaultListModel<String> taskListModel = new DefaultListModel<>();
	    // Define the path to your CSV file
	    Path path = Paths.get("data", "tasks_with_dates.csv");
	    String line;

	    // Try-with-resources to automatically close the reader
	    try (BufferedReader br = new BufferedReader(new FileReader(path.toFile()))) {
	        // Read each line from the CSV file
	        while ((line = br.readLine()) != null) {
	            // Add each task from the file into the list model
	            taskListModel.addElement(line);
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	    // Return the JList with the populated task model
	    return new JList<>(taskListModel);
	}

	private void summary(JDesktopPane infoPane) {
	    JPanel panel = new JPanel();
	    panel.setBounds(10, 11, 262, 450);
	    panel.setLayout(null); // Ensures components inside the panel are placed properly
	    infoPane.add(panel);

	    JLabel lblNewLabel = new JLabel("Top Countries");
	    lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
	    lblNewLabel.setBounds(10, 10, 200, 30);
	    panel.add(lblNewLabel);

	    // Adding TopLocationsChart to the summary panel
	    TopLocationsChart topLocationsChart = new TopLocationsChart();
	    topLocationsChart.setBounds(20, 60, 220, 500);  // Adjust size and position
	    panel.add(topLocationsChart);
	}

		class TopLocationsChart extends JPanel {
		        @Override
		        protected void paintComponent(Graphics g) {
		            super.paintComponent(g);
		            Graphics2D g2d = (Graphics2D) g;

		            // Example data
		            String[] countries = {"Malaysia", "Others", "Singapore", "ROKorea", "Brunei", "Indonesia", "Nigeria", "Saudi Arabia", "United States", "Egypt", "Thailand"};
		            double[] percentages = {77.9, 8.0, 4.8, 4.0, 3.4, 1.1, 0.1, 0.1, 0.1, 0.1, 0.1};
		            double maxPercentage = 80.0; // Set based on the expected maximum percentage

		            // Panel dimensions
		            int panelWidth = getWidth();
		            int panelHeight = getHeight();

		            // Margins and chart area
		            int leftMargin = 100; // Space for country labels
		            int rightMargin = 40;
		            int topMargin = 0;
		            int bottomMargin = 150;

		            int chartWidth = panelWidth - leftMargin - rightMargin;
		            int chartHeight = panelHeight - topMargin - bottomMargin;

		            // Bar dimensions
		            int numBars = countries.length;
		            int barSpacing = 5;
		            int barHeight = (chartHeight / numBars) - barSpacing;

		            // Draw bars and labels
		            for (int i = 0; i < numBars; i++) {
		                // Calculate bar length
		                int barLength = (int) ((percentages[i] / maxPercentage) * chartWidth);

		                // Calculate bar position
		                int x = leftMargin;
		                int y = topMargin + i * (barHeight + barSpacing);

		                // Draw bar
		                g2d.setColor(new Color(100, 150, 255));
		                g2d.fillRect(x, y, barLength, barHeight);

		                // Draw percentage label at the end of the bar
		                g2d.setColor(Color.BLACK);
		                String percentageText = String.format("%.1f%%", percentages[i]);
		                g2d.drawString(percentageText, x + barLength + 5, y + barHeight / 2 + 2);

		                // Draw country label to the left of the bar
		                String countryLabel = countries[i];
		                g2d.drawString(countryLabel, x - 95, y + barHeight / 2 + 5);
		            }

		            // Draw X-axis
		            g2d.setColor(Color.BLACK);
		            g2d.drawLine(leftMargin, topMargin, leftMargin, topMargin + chartHeight); // Vertical reference line
		        }

		        @Override
		        public Dimension getPreferredSize() {
		            return new Dimension(220, 360); // Panel size
		        }
		    }
		
		private void downloadReport(JDesktopPane infoPane) {
		    try {
		        // Get the dimensions of the infoPane
		        Dimension size = infoPane.getSize();
		        
		        // Create a BufferedImage of the infoPane
		        BufferedImage image = new BufferedImage(size.width, size.height, BufferedImage.TYPE_INT_ARGB);
		        Graphics2D g2 = image.createGraphics();
		        infoPane.paint(g2); // Paint the infoPane onto the Graphics2D object
		        g2.dispose();
		        
		        // Save the BufferedImage to a file (e.g., PNG)
		        File outputfile = new File("report.png");
		        ImageIO.write(image, "png", outputfile);
		        
		        // Notify the user
		        JOptionPane.showMessageDialog(this, "Report has been downloaded to: " + outputfile.getAbsolutePath());
		    } catch (Exception e) {
		        JOptionPane.showMessageDialog(this, "Error downloading report: " + e.getMessage());
		        e.printStackTrace();
		    }
		}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					report frame = new report();
					frame.setLocationRelativeTo(null); //set center
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
