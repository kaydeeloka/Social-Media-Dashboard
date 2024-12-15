package GUI;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import java.awt.FlowLayout;

public class mainMenu extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel panelViews, panelProfile, panelLikes, panelComments, panelShares;
    
    public mainMenu() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1180, 664);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        // Add menu panel
        menu();
        content();
    }

	private void menu() {
        JPanel panelMenu = new JPanel();
        panelMenu.setBackground(new Color(255, 255, 204));
        panelMenu.setBounds(0, 0, 219, 663);
        contentPane.add(panelMenu);
        panelMenu.setLayout(null);
        
        JPanel panelTop = new JPanel();
        panelTop.setBackground(new Color(153, 153, 255));
        panelTop.setBounds(223, 0, 957, 54);
        contentPane.add(panelTop);
        panelTop.setLayout(null);

        JLabel lblExit = new JLabel("X");
        lblExit.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\exit.png"));
        lblExit.setForeground(Color.WHITE);
        lblExit.setFont(new Font("STFangsong", Font.PLAIN, 30));
        lblExit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        lblExit.setBounds(915, 10, 27, 29);
        lblExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        panelTop.add(lblExit);

        JButton btnDashboard = new JButton(" Dashboard");
        btnDashboard.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\dashboard.png"));
        btnDashboard.setHorizontalAlignment(SwingConstants.LEFT);
        btnDashboard.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnDashboard.setForeground(new Color(255, 255, 255));
        btnDashboard.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
        btnDashboard.setFocusPainted(false);
        btnDashboard.setBorderPainted(false);
        btnDashboard.setBackground(new Color(153, 153, 255));
        btnDashboard.setBounds(13, 270, 187, 43);
        panelMenu.add(btnDashboard);

        JButton btnSchedule = new JButton("   Schedule");
        btnSchedule.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\schedule.png"));
        btnSchedule.setHorizontalAlignment(SwingConstants.LEFT);
        btnSchedule.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSchedule.setForeground(new Color(153, 153, 255));
        btnSchedule.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
        btnSchedule.setFocusPainted(false);
        btnSchedule.setBorderPainted(false);
        btnSchedule.setBackground(Color.WHITE);
        btnSchedule.setBounds(13, 348, 187, 43);
        panelMenu.add(btnSchedule);

        btnSchedule.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSchedule.setBackground(new Color(153, 153, 255));
                btnSchedule.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSchedule.setBackground(Color.WHITE);
                btnSchedule.setForeground(new Color(153, 153, 255));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                schedule openSchedule = new schedule();
                openSchedule.setVisible(true);
                openSchedule.setLocationRelativeTo(null);
            }
        });

        JButton btnAnalytics = new JButton("  Analytics");
        btnAnalytics.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\analytics.png"));
        btnAnalytics.setHorizontalAlignment(SwingConstants.LEFT);
        btnAnalytics.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnAnalytics.setForeground(new Color(153, 153, 255));
        btnAnalytics.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
        btnAnalytics.setFocusPainted(false);
        btnAnalytics.setBorderPainted(false);
        btnAnalytics.setBackground(new Color(255, 255, 255));
        btnAnalytics.setBounds(13, 428, 187, 43);
        panelMenu.add(btnAnalytics);
        
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

        JButton btnReport = new JButton("    Report");
        btnReport.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\report.png"));
        btnReport.setHorizontalAlignment(SwingConstants.LEFT);
        btnReport.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnReport.setForeground(new Color(153, 153, 255));
        btnReport.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
        btnReport.setFocusPainted(false);
        btnReport.setBorderPainted(false);
        btnReport.setBackground(Color.WHITE);
        btnReport.setBounds(13, 506, 187, 43);
        panelMenu.add(btnReport);

        btnReport.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnReport.setBackground(new Color(153, 153, 255));
                btnReport.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnReport.setBackground(Color.WHITE);
                btnReport.setForeground(new Color(153, 153, 255));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                report openReport = new report();
                openReport.setVisible(true);
                openReport.setLocationRelativeTo(null);
            }
        });

        JLabel lblProfile = new JLabel("My Profile");
        lblProfile.setFont(new Font("STXinwei", Font.PLAIN, 25));
        lblProfile.setBounds(49, 50, 155, 24);
        panelMenu.add(lblProfile);

        JLabel lblUser = new JLabel("");
        lblUser.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\user.png"));
        lblUser.setBounds(59, 85, 99, 90);
        panelMenu.add(lblUser);
        
        JLabel lblUsername = new JLabel("@kaydeeloka");
        lblUsername.setFont(new Font("STXinwei", Font.PLAIN, 22));
        lblUsername.setBounds(38, 197, 144, 20);
        panelMenu.add(lblUsername);
    }

    private void content() {
        JDesktopPane infoPane = new JDesktopPane();
        infoPane.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        infoPane.setBounds(223, 54, 957, 609);
        contentPane.add(infoPane);
        
        analytics(infoPane);
        viewTask(infoPane);
        topLocation(infoPane);
        dataChart(infoPane);
    }
    
    private void dataChart(JDesktopPane infoPane) {
		 JPanel panelChart = new JPanel();
	     panelChart.setBounds(296, 270, 393, 314);
	     infoPane.add(panelChart);
  	    panelChart.setLayout(null);
	      
  	    JLabel lblTrafficSource = new JLabel("Traffic Source :\r\n");
  	    lblTrafficSource.setBounds(10, 23, 127, 21);
  	    lblTrafficSource.setFont(new Font("STXinwei", Font.PLAIN, 20));
  	    panelChart.add(lblTrafficSource);
  	    
  	    JLabel lblNewLabel = new JLabel("");
  	    lblNewLabel.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\trafficSource.png"));
  	    lblNewLabel.setBounds(10, 72, 373, 200);
  	    panelChart.add(lblNewLabel);
	}
  
    private void topLocation(JDesktopPane infoPane) {
        JPanel panelLocation = new JPanel();
        panelLocation.setBounds(699, 21, 243, 563);
        infoPane.add(panelLocation);
        panelLocation.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 15));

        JLabel lblLocation = new JLabel("Top Location :");
        lblLocation.setFont(new Font("STXinwei", Font.PLAIN, 16));
        panelLocation.add(lblLocation);
        
        panelLocation.add(new TopCountriesChart());

    }
    
    class TopCountriesChart extends JPanel {
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
            int rightMargin = 30;
            int topMargin = 10;
            int bottomMargin = 10;

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
            return new Dimension(220, 500); // Panel size
        }
    }



	private void viewTask(JDesktopPane infoPane) {
		JPanel panelTask = new JPanel();
        panelTask.setBounds(10, 270, 276, 314);
        infoPane.add(panelTask);
        panelTask.setLayout(null);
        
        JButton btnViewTask = new JButton("ViewTask");
        btnViewTask.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panelTask.removeAll(); // Clear the panel
                panelTask.setLayout(new BoxLayout(panelTask, BoxLayout.Y_AXIS)); // Set vertical layout

                // File path for the CSV
                Path filePath = Paths.get("data", "tasks_with_dates.csv");

                // Ensure the file exists and is readable
                if (!Files.exists(filePath)) {
                    JOptionPane.showMessageDialog(panelTask, "File does not exist: " + filePath.toString(), "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Create a scroll pane for the tasks
                JScrollPane scrollPane = new JScrollPane();
                scrollPane.setBounds(0, 50, panelTask.getWidth(), panelTask.getHeight() - 50); // Position the scroll pane
                panelTask.add(scrollPane);

                // Create a panel to hold the task details that will be added to the scroll pane
                JPanel taskPanel = new JPanel();
                taskPanel.setLayout(new BoxLayout(taskPanel, BoxLayout.Y_AXIS)); // Vertical layout for tasks

                // Add the task panel to the scroll pane
                scrollPane.setViewportView(taskPanel);

                try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
                    String line;
                    reader.readLine(); // Skip the header row

                    // Read each line of the CSV
                    while ((line = reader.readLine()) != null) {
                        String[] taskDetails = line.split(","); // Split each line by commas

                        if (taskDetails.length >= 4) { // Check if there are enough columns
                            String date = taskDetails[0];
                            String task = taskDetails[1];
                            String category = taskDetails[2];
                            String status = taskDetails[3];

                            // Create a label for the task information
                            String taskInfo = "<html><b>Date:</b> " + date +
                                    "<br><b>Category:</b> " + category +
                                    "<br><b>Task:</b> " + task +
                                    "<br><b>Status:</b> " + status + "</html>";

                            JLabel taskLabel = new JLabel(taskInfo);
                            taskLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                            taskLabel.setOpaque(true);
                            taskLabel.setBackground(new Color(240, 240, 240)); // Light background color
                            taskLabel.setAlignmentX(Component.LEFT_ALIGNMENT);

                            // Add the label to the task panel
                            taskPanel.add(taskLabel);
                        }
                    }

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(panelTask, "Error reading tasks: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }

                // Refresh the panel to show the added tasks
                panelTask.revalidate();
                panelTask.repaint();
            }
        });
        btnViewTask.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 11));
        btnViewTask.setBackground(new Color(153, 153, 255));
        btnViewTask.setForeground(new Color(255, 255, 255));
        btnViewTask.setBounds(166, 11, 100, 32);
        panelTask.add(btnViewTask);
		
	}

	private void analytics(JDesktopPane infoPane) {

	    // Create the panel for overview information
	    JPanel panelInfo = new JPanel();
	    panelInfo.setBounds(10, 21, 679, 238);
	    infoPane.add(panelInfo);
	    panelInfo.setLayout(null);

	    JLabel lblOverview = new JLabel("Overview :");
	    lblOverview.setFont(new Font("STXinwei", Font.PLAIN, 20));
	    lblOverview.setBounds(20, 11, 126, 28);
	    panelInfo.add(lblOverview);

	    // Create a label to show the selected category
	    JLabel lblCategory = new JLabel("Last 7 Days");  // Default text
	    lblCategory.setFont(new Font("STXinwei", Font.PLAIN, 20));
	    lblCategory.setBounds(126, 11, 150, 28);  // Place it next to "Overview"
	    panelInfo.add(lblCategory);

	    JComboBox<String> OverviewBox = new JComboBox<>();
	    OverviewBox.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 12));
	    OverviewBox.setBounds(528, 12, 141, 28);
	    panelInfo.add(OverviewBox);

	    // Add options to the JComboBox
	    OverviewBox.addItem("Last 7 days");
	    OverviewBox.addItem("Last 28 days");
	    OverviewBox.addItem("Last 60 days");
	    OverviewBox.addItem("Last 365 days");

	    // Initially, trigger the action to populate the data based on the default selection
	    OverviewBox.setSelectedIndex(0);

	    // Create the panels for each category inside the analytics method
	    panelViews = new JPanel();
	    panelViews.setBounds(20, 57, 116, 170);
	    panelInfo.add(panelViews);
	    panelViews.setBorder(new LineBorder(Color.BLACK, 1));
	    panelViews.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

	    panelProfile = new JPanel();
	    panelProfile.setBounds(150, 57, 116, 170);
	    panelInfo.add(panelProfile);
	    panelProfile.setBorder(new LineBorder(Color.BLACK, 1));
	    panelProfile.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

	    panelLikes = new JPanel();
	    panelLikes.setBounds(282, 57, 116, 170);
	    panelInfo.add(panelLikes);
	    panelLikes.setBorder(new LineBorder(Color.BLACK, 1));
	    panelLikes.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

	    panelComments = new JPanel();
	    panelComments.setBounds(416, 57, 116, 170);
	    panelInfo.add(panelComments);
	    panelComments.setBorder(new LineBorder(Color.BLACK, 1));
	    panelComments.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

	    panelShares = new JPanel();
	    panelShares.setBounds(550, 57, 116, 170);
	    panelInfo.add(panelShares);
	    panelShares.setBorder(new LineBorder(Color.BLACK, 1));
	    panelShares.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));

	    // ActionListener for JComboBox selection change
	    OverviewBox.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            // Get the selected time range
	            String selectedRange = (String) OverviewBox.getSelectedItem();

	            // Update the label to reflect the selected category
	            lblCategory.setText(selectedRange);

	            // Now, filter and update data based on the selected category
	            switch (selectedRange) {
	                case "Last 7 days":
	                    updateOverviewData("7days");
	                    break;
	                case "Last 28 days":
	                    updateOverviewData("28days");
	                    break;
	                case "Last 60 days":
	                    updateOverviewData("60days");
	                    break;
	                case "Last 365 days":
	                    updateOverviewData("365days");
	                    break;
	            }
	        }
	    });

	    // Call updateOverviewData("7days") to display data for the last 7 days by default
	    updateOverviewData("7days");
	}

	private void updateOverviewData(String selectedCategory) {
	    // Clear previous data in the panels
	    panelViews.removeAll();
	    panelProfile.removeAll();
	    panelLikes.removeAll();
	    panelComments.removeAll();
	    panelShares.removeAll();

	    // Path to the overview.txt file
	    Path filePath = Paths.get("data", "overview.txt");

	    try (BufferedReader reader = new BufferedReader(new FileReader(filePath.toFile()))) {
	        String line;
	        reader.readLine(); // Skip the header row

	        // Iterate through each line of the file
	        while ((line = reader.readLine()) != null) {
	            String[] data = line.split(","); // Split by commas

	            if (data.length == 6) {
	                String category = data[0]; // Category (e.g., "7days", "28days")
	                if (category.equals(selectedCategory)) {
	                    // Extract overview data
	                    String videoViews = formatNumber(data[1]);
	                    String profileViews = formatNumber(data[2]);
	                    String likes = formatNumber(data[3]);
	                    String comments = formatNumber(data[4]);
	                    String shares = formatNumber(data[5]);

	                 // Update the panels with the formatted data
	                    JLabel lblVideoViews = new JLabel("Video Views");
	                    lblVideoViews.setFont(new Font("STXinwei", Font.PLAIN, 18));
	                    panelViews.add(lblVideoViews);

	                    JLabel lblVideoViewsValue = new JLabel(videoViews);
	                    lblVideoViewsValue.setFont(new Font("STXinwei", Font.BOLD, 35)); // Larger and bold font for numbers
	                    panelViews.add(lblVideoViewsValue);

	                    JLabel lblProfileViews = new JLabel("Profile Views");
	                    lblProfileViews.setFont(new Font("STXinwei", Font.PLAIN, 18));
	                    panelProfile.add(lblProfileViews);

	                    JLabel lblProfileViewsValue = new JLabel(profileViews);
	                    lblProfileViewsValue.setFont(new Font("STXinwei", Font.BOLD, 35));
	                    panelProfile.add(lblProfileViewsValue);

	                    JLabel lblLikes = new JLabel("Likes\\r\\n ");
	                    lblLikes.setFont(new Font("STXinwei", Font.PLAIN, 18));
	                    panelLikes.add(lblLikes);

	                    JLabel lblLikesValue = new JLabel(likes);
	                    lblLikesValue.setFont(new Font("STXinwei", Font.BOLD, 35));
	                    panelLikes.add(lblLikesValue);

	                    JLabel lblComments = new JLabel("Comments");
	                    lblComments.setFont(new Font("STXinwei", Font.PLAIN, 18));
	                    panelComments.add(lblComments);

	                    JLabel lblCommentsValue = new JLabel(comments);
	                    lblCommentsValue.setFont(new Font("STXinwei", Font.BOLD, 35));
	                    panelComments.add(lblCommentsValue);

	                    JLabel lblShares = new JLabel("Shares\\r\\n ");
	                    lblShares.setFont(new Font("STXinwei", Font.PLAIN, 18));
	                    panelShares.add(lblShares);

	                    JLabel lblSharesValue = new JLabel(shares);
	                    lblSharesValue.setFont(new Font("STXinwei", Font.BOLD, 35));
	                    panelShares.add(lblSharesValue);

	                }
	            }
	        }
	    } catch (IOException ex) {
	        JOptionPane.showMessageDialog(panelViews, "Error reading overview data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }

	    // Refresh the panels to reflect the updated data
	    panelViews.revalidate();
	    panelViews.repaint();
	    panelProfile.revalidate();
	    panelProfile.repaint();
	    panelLikes.revalidate();
	    panelLikes.repaint();
	    panelComments.revalidate();
	    panelComments.repaint();
	    panelShares.revalidate();
	    panelShares.repaint();
	}

	// Helper method to format large numbers (e.g., 1000 becomes 1K)
	private String formatNumber(String numberStr) {
	    long number = Long.parseLong(numberStr);

	    if (number >= 1000) {
	        return (number / 1000) + "K";
	    } else {
	        return String.valueOf(number);
	    }
	}

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainMenu frame = new mainMenu();
                    frame.setLocationRelativeTo(null); // Center the window
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
