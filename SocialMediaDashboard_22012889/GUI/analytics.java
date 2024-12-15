package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import javax.swing.border.LineBorder;

public class analytics extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public analytics() {
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1180, 664);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Add menu panel
        menu();

        // Add analytics dashboard
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
        btnDashboard.setForeground(new Color(153, 153, 255));
        btnDashboard.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
        btnDashboard.setFocusPainted(false);
        btnDashboard.setBorderPainted(false);
        btnDashboard.setBackground(Color.WHITE);
        btnDashboard.setBounds(13, 270, 187, 43);
        panelMenu.add(btnDashboard);

        btnDashboard.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnDashboard.setBackground(new Color(153, 153, 255));
                btnDashboard.setForeground(Color.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnDashboard.setBackground(Color.WHITE);
                btnDashboard.setForeground(new Color(153, 153, 255));
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                mainMenu openMenu = new mainMenu();
                openMenu.setVisible(true);
                openMenu.setLocationRelativeTo(null);
            }
        });

        JButton btnSchedule = new JButton("   Schedule");
        btnSchedule.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
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
        btnAnalytics.setForeground(Color.WHITE);
        btnAnalytics.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 18));
        btnAnalytics.setFocusPainted(false);
        btnAnalytics.setBorderPainted(false);
        btnAnalytics.setBackground(new Color(153, 153, 255));
        btnAnalytics.setBounds(13, 428, 187, 43);
        panelMenu.add(btnAnalytics);

        JButton btnReport = new JButton("    Report");
        btnReport.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
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
        
        JPanel panelInsta = new JPanel();
        panelInsta.setBounds(10, 11, 226, 67);
        infoPane.add(panelInsta);
        panelInsta.setBackground(new Color(255, 255, 255));
        panelInsta.setLayout(null);
        
        JLabel lblInstagram = new JLabel("<html>Instagram<br>205.9k Followers</html>");
        lblInstagram.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\insta.png"));
        lblInstagram.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblInstagram.setBounds(20, 11, 184, 45);
        panelInsta.add(lblInstagram);
        
        JPanel panelFacebook = new JPanel();
        panelFacebook.setLayout(null);
        panelFacebook.setBackground(new Color(255, 255, 255));
        panelFacebook.setBounds(242, 11, 226, 67);
        infoPane.add(panelFacebook);
        
        JLabel lblFacebook = new JLabel("<html>Facebook <br>389.6k followers</html>");
        lblFacebook.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\facebook_2.png"));
        lblFacebook.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblFacebook.setBounds(20, 11, 184, 45);
        panelFacebook.add(lblFacebook);
        
        JPanel panelTiktok = new JPanel();
        panelTiktok.setLayout(null);
        panelTiktok.setBackground(new Color(255, 255, 255));
        panelTiktok.setBounds(486, 11, 226, 67);
        infoPane.add(panelTiktok);
        
        JLabel lblTiktok = new JLabel("<html>Tiktok<br>550k Followers</html>");
        lblTiktok.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\tiktok_1.png"));
        lblTiktok.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTiktok.setBounds(21, 11, 184, 45);
        panelTiktok.add(lblTiktok);
        
        JPanel panelTwitter = new JPanel();
        panelTwitter.setLayout(null);
        panelTwitter.setBackground(new Color(255, 255, 255));
        panelTwitter.setBounds(722, 11, 226, 67);
        infoPane.add(panelTwitter);
        
        JLabel lblTwitter = new JLabel("<html>Twitter<br>159.7k Followers</html>");
        lblTwitter.setIcon(new ImageIcon("C:\\Users\\nurul\\eclipse-workspace\\FinalProject1\\images\\twitter.png"));
        lblTwitter.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTwitter.setBounds(20, 11, 184, 45);
        panelTwitter.add(lblTwitter);
        
        viewers(infoPane);
        followers(infoPane);

    }
    
	private void viewers(JDesktopPane infoPane) {
        JPanel viewersPanel = new JPanel();
        viewersPanel.setBounds(10, 89, 461, 509);
        infoPane.add(viewersPanel);
        viewersPanel.setLayout(null);
        
        JPanel panelViews = new JPanel();
        panelViews.setBorder(new LineBorder(Color.BLACK, 1));
        panelViews.setBounds(130, 11, 321, 56);
        viewersPanel.add(panelViews);
        panelViews.setLayout(null);
        
        JLabel lbltotalk = new JLabel("<html>Total Viewers  <br>114k</html>");
        lbltotalk.setFont(new Font("Tahoma", Font.BOLD, 15));
        lbltotalk.setBounds(27, 5, 124, 45);
        panelViews.add(lbltotalk);
        
        JLabel lblnewViewersk = new JLabel("<html>New Viewers <br>230k</html>");
        lblnewViewersk.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblnewViewersk.setBounds(169, 5, 124, 45);
        panelViews.add(lblnewViewersk);
        
        JPanel panelViewersGraph = new JPanel();
        panelViewersGraph.setBounds(10, 59, 438, 233);
        viewersPanel.add(panelViewersGraph);
        
        JLabel lblNewLabel = new JLabel("Viewers");
        lblNewLabel.setFont(new Font("STXinwei", Font.BOLD, 20));
        lblNewLabel.setBackground(new Color(153, 153, 255));
        lblNewLabel.setBounds(27, 11, 93, 25);
        viewersPanel.add(lblNewLabel);
        
        JPanel panelViewersGender = new JPanel();
        panelViewersGender.setBounds(10, 303, 194, 195);
        viewersPanel.add(panelViewersGender);
        panelViewersGender.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        
        JLabel lblViewersGender = new JLabel("Gender\r\n");
        lblViewersGender.setFont(new Font("STXinwei", Font.BOLD, 16));
        lblViewersGender.setBackground(new Color(153, 153, 255));
        panelViewersGender.add(lblViewersGender);
        
        JPanel panelViewersAge = new JPanel();
        panelViewersAge.setBounds(215, 303, 233, 195);
        viewersPanel.add(panelViewersAge);
        
        JLabel lblAge = new JLabel("Age\r\n");
        lblAge.setFont(new Font("STXinwei", Font.BOLD, 16));
        lblAge.setBackground(new Color(153, 153, 255));
        panelViewersAge.add(lblAge);
        
        panelViewersGender.add(new ViewersGenderChart());
        panelViewersAge.add(new ViewersAgeChart());
     // Add the graph plotter to the panel
        panelViewersGraph.setLayout(new BorderLayout());
        panelViewersGraph.add(new ViewersGraphPlotter(), BorderLayout.CENTER);

		
	}

    private void followers(JDesktopPane infoPane) {
    	  
        JPanel followersPanel = new JPanel();
        followersPanel.setBounds(486, 89, 461, 509);
        infoPane.add(followersPanel);
        followersPanel.setLayout(null);
        
        JPanel panelViews = new JPanel();
        panelViews.setBorder(new LineBorder(Color.BLACK, 1));
        panelViews.setBounds(127, 11, 321, 56);
        followersPanel.add(panelViews);
        panelViews.setLayout(null);
        
        JLabel lbltotalFollowersk = new JLabel("<html>Total Followers <br>550k</html>");
        lbltotalFollowersk.setBounds(20, 5, 124, 45);
        lbltotalFollowersk.setFont(new Font("Tahoma", Font.BOLD, 15));
        panelViews.add(lbltotalFollowersk);
        
        JLabel lblnetFollowersk = new JLabel("<html>Net Followers <br>150k</html>");
        lblnetFollowersk.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblnetFollowersk.setBounds(162, 5, 124, 45);
        panelViews.add(lblnetFollowersk);
        
        JLabel lblFollowers = new JLabel("Followers");
        lblFollowers.setFont(new Font("STXinwei", Font.BOLD, 20));
        lblFollowers.setBackground(new Color(153, 153, 255));
        lblFollowers.setBounds(24, 11, 93, 25);
        followersPanel.add(lblFollowers);
        
        JPanel panelFollowersAge = new JPanel();
        panelFollowersAge.setBounds(235, 303, 213, 195);
        followersPanel.add(panelFollowersAge);
        
        JLabel lblAge = new JLabel("Age\r\n");
        lblAge.setFont(new Font("STXinwei", Font.BOLD, 16));
        lblAge.setBackground(new Color(153, 153, 255));
        panelFollowersAge.add(lblAge);
        
        JPanel panelFollowersGender = new JPanel();
        panelFollowersGender.setBounds(10, 303, 213, 195);
        followersPanel.add(panelFollowersGender);
        
        JLabel lblViewersGender = new JLabel("Gender\r\n");
        lblViewersGender.setFont(new Font("STXinwei", Font.BOLD, 16));
        lblViewersGender.setBackground(new Color(153, 153, 255));
        panelFollowersGender.add(lblViewersGender);
        
        JPanel panelFollowersActivity = new JPanel();
        panelFollowersActivity.setBounds(10, 69, 438, 223);
        followersPanel.add(panelFollowersActivity);
        
        panelFollowersGender.add(new FollowersGenderChart());
        panelFollowersAge.add(new FollowersAgeChart());
     // Add the FollowersActivityChart to the panel
        panelFollowersActivity.setLayout(new BorderLayout());
        panelFollowersActivity.add(new FollowersActivityChart(), BorderLayout.CENTER);		
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
                    g2.drawString(dates[i], x - 20, height - padding + labelPadding);
                }
            }

            // Draw data points and lines
            int pointRadius = 5;
            int[] dataSets[] = {totalViewers, newViewers, returningViewers};
            Color[] colors = {Color.BLUE, Color.ORANGE, Color.RED};
            String[] dataLabels = {"Blue:Total Viewers", "Orange:New Viewers", "  Red:Returning Viewers"};

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

            // Add title for each data set
            g2.setColor(Color.BLACK);
            for (int j = 0; j < dataLabels.length; j++) {
                int labelX = padding + j * (graphWidth / dataSets.length);
                g2.drawString(dataLabels[j], labelX, padding - 15);  // Draw title for each dataset
            }
        }
    }


class FollowersActivityChart extends JPanel {
    private Map<Integer, Integer> followersData = new HashMap<>() {{
        put(0, 4637);
        put(1, 3328);
        put(2, 2063);
        put(3, 1222);
        put(4, 770);
        put(5, 715);
        put(6, 1154);
        put(7, 2157);
        put(8, 3162);
        put(9, 3631);
        put(10, 3698);
        put(11, 3892);
        put(12, 4164);
        put(13, 4422);
        put(14, 4655);
        put(15, 4577);
        put(16, 4480);
        put(17, 4766);
        put(18, 5028);
        put(19, 5292);
        put(20, 5518);
        put(21, 5614);
        put(22, 5686);
        put(23, 5481);
    }};
    
    private int hoveredBarIndex = -1; // To store the index of the hovered bar

    public FollowersActivityChart() {
    	// Mouse motion listener to track hover
    	addMouseMotionListener(new MouseMotionAdapter() {
    	    public void mouseMoved(MouseEvent e) {
    	        int barWidth = (getWidth() - 100) / followersData.size(); // Calculate width of each bar
    	        int mouseX = e.getX();
    	        
    	        // Check if the mouse is hovering over any bar
    	        for (int i = 0; i < followersData.size(); i++) {
    	            int barX = 50 + i * barWidth;
    	            int barWidthAdjusted = barWidth - 2;  // Slight adjustment for visual clarity

    	            if (mouseX >= barX && mouseX <= barX + barWidthAdjusted) {
    	                hoveredBarIndex = i;
    	                repaint();
    	                return;
    	            }
    	        }

    	        // If no bar is hovered, reset the hoveredBarIndex
    	        hoveredBarIndex = -1;
    	        repaint();
    	    }
    	});
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        // Set rendering hints for smooth lines
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int padding = 50;  // Padding for axes and labels
        int labelPadding = 25; // Space between label and axis
        int width = getWidth();
        int height = getHeight();
        
        // Graph dimensions
        int graphWidth = width - 2 * padding;
        int graphHeight = height - 2 * padding;

        // Maximum follower count for scaling
        int maxFollowers = followersData.values().stream().max(Integer::compare).orElse(0);

        // Draw X and Y axes
        g2.drawLine(padding, height - padding, padding, padding); // Y-axis
        g2.drawLine(padding, height - padding, width - padding, height - padding); // X-axis
        
        // Draw grid and axis labels
        for (int i = 0; i <= 5; i++) {
            int y = height - padding - i * graphHeight / 5;
            g2.setColor(Color.LIGHT_GRAY);
            g2.drawLine(padding, y, width - padding, y); // horizontal grid line
            
            String label = String.valueOf(maxFollowers / 5 * i);
            g2.setColor(Color.BLACK);
            g2.drawString(label, padding - labelPadding, y + 5); // Y-axis label
        }

        // Draw bars for each hour (0-23)
        int barWidth = graphWidth / followersData.size(); // width for each bar
        g2.setColor(Color.BLUE);
        
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : followersData.entrySet()) {
            int hour = entry.getKey();
            int followers = entry.getValue();

            int x = padding + index * barWidth;
            int y = height - padding - (int) ((double) followers / maxFollowers * graphHeight);
            int barHeight = height - padding - y;
            
            // Draw bar
            g2.fillRect(x, y, barWidth - 2, barHeight);

            // Add text label for follower count (below the bars)
            g2.setColor(Color.BLACK);
            g2.drawString(String.valueOf(hour), x + barWidth / 4, height - padding + labelPadding); // Text below the bar

         // Highlight the hovered bar and show the follower count
            if (hoveredBarIndex == index) {
                g2.setColor(Color.RED); // Change color of the hovered bar
                // Adjust text position to print the number in front of the bar (not behind)
                g2.drawString("Followers: " + followers, x + barWidth / 2 - 35, y - 40); // Show the follower count in front of the hovered bar
            }
            
            index++;
        }
    }
}


    class ViewersAgeChart extends JPanel { 
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Example data
            double[] values = {17.9, 43.5, 25.6, 9.7, 3.3}; // Percentages as numeric values
            String[] labels = {"18-24", "25-34", "35-44", "45-54", "55+"}; 
            double maxValue = 100.0; // Max value for percentage chart

            // Use panel dimensions for dynamic resizing
            int width = getWidth();
            int height = getHeight();
            int xOffset = 10; // Left margin
            int yOffset = 10; // Top margin

            int chartWidth = width - 2 * xOffset;
            int chartHeight = height - 4 * yOffset;

            // Draw axes
            g2d.setColor(Color.BLACK);
            g2d.drawLine(xOffset, yOffset, xOffset, yOffset + chartHeight); // Y-axis
            g2d.drawLine(xOffset, yOffset + chartHeight, xOffset + chartWidth, yOffset + chartHeight); // X-axis

            // Draw Y-axis labels
            for (int i = 0; i <= 5; i++) {
                int labelValue = (int) (maxValue / 5 * i);
                int y = yOffset + chartHeight - (i * chartHeight / 5);
                g2d.drawLine(xOffset - 5, y, xOffset, y); // Tick marks
            }

            // Draw bars
            int barWidth = chartWidth / values.length - 10;
            for (int i = 0; i < values.length; i++) {
                int barHeight = (int) ((values[i] / maxValue) * chartHeight);
                int x = xOffset + (i * (barWidth + 10));
                int y = yOffset + chartHeight - barHeight;

                // Draw bar
                g2d.setColor(new Color(100, 150, 255));
                g2d.fillRect(x, y, barWidth, barHeight);

                // Draw labels below bars
                g2d.setColor(Color.BLACK);
                g2d.drawString(labels[i], x + (barWidth / 5), yOffset + chartHeight + 15);

                // Draw percentage on top of each bar
                String percentageText = String.format("%.1f%%", values[i]);
                g2d.drawString(percentageText, x + (barWidth / 4), y - 10);
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(215, 150); // Adjust size to fit in the panel
        }
    }

    
    class ViewersGenderChart extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            HashMap<String, Integer> data = new HashMap<>();
            data.put("Male", 18);
            data.put("Female", 82);
            //data.put("Other", 0);

            // Calculate total
            int total = data.values().stream().mapToInt(Integer::intValue).sum();

            // Use panel dimensions for dynamic resizing
            int width = getWidth();
            int height = getHeight();
            int diameter = Math.min(width, height - 10);

            int x = (width - diameter) / 2;
            int y = (height - diameter) / 2 + diameter / 4; // Adjust to center the semi-circle

            int startAngle = 0;

            for (String category : data.keySet()) {
                int value = data.get(category);
                int angle = (int) Math.round((value / (double) total) * 180); // Semi-circle uses 180 degrees

                // Set color based on category
                if (category.equals("Male")) g2d.setColor(Color.BLUE);
                if (category.equals("Female")) g2d.setColor(Color.PINK);
                if (category.equals("Other")) g2d.setColor(Color.GREEN);

                // Draw the arc
                g2d.fillArc(x, y, diameter, diameter, startAngle, angle);

                // Calculate the percentage
                double percentage = (value / (double) total) * 100;

                // Calculate the position for the percentage text
                double midAngle = Math.toRadians(startAngle + angle / 1); // Midpoint of the arc
                int textX = (int) (x + diameter / 2 + (diameter / 3) * Math.sin(midAngle)); // Adjust radius for text position
                int textY = (int) (y + diameter / 3 + (diameter / 6) * Math.cos(midAngle));

                // Set text color and draw percentage
                g2d.setColor(Color.white);
                g2d.drawString(String.format("%.1f%%", percentage), textX, textY);

                startAngle += angle;
            }

            // Draw legend
            g2d.setColor(Color.BLACK);
            g2d.drawString("Male: Blue, Female: Pink, Other: Green", 20, height - 130);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 160); // Adjust size to fit in the panel
        }
    }
    
    class FollowersAgeChart extends JPanel { 
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Example data
            double[] values = {15.5, 44.3, 27.8, 9.4, 3}; // Percentages as numeric values
            String[] labels = {"18-24", "25-34", "35-44", "45-54", "55+"}; 
            double maxValue = 100.0; // Max value for percentage chart

            // Use panel dimensions for dynamic resizing
            int width = getWidth();
            int height = getHeight();
            int xOffset = 10; // Left margin
            int yOffset = 10; // Top margin

            int chartWidth = width - 2 * xOffset;
            int chartHeight = height - 4 * yOffset;

            // Draw axes
            g2d.setColor(Color.BLACK);
            g2d.drawLine(xOffset, yOffset, xOffset, yOffset + chartHeight); // Y-axis
            g2d.drawLine(xOffset, yOffset + chartHeight, xOffset + chartWidth, yOffset + chartHeight); // X-axis

            // Draw Y-axis labels
            for (int i = 0; i <= 5; i++) {
                int labelValue = (int) (maxValue / 5 * i);
                int y = yOffset + chartHeight - (i * chartHeight / 5);
                g2d.drawLine(xOffset - 5, y, xOffset, y); // Tick marks
            }

            // Draw bars
            int barWidth = chartWidth / values.length - 10;
            for (int i = 0; i < values.length; i++) {
                int barHeight = (int) ((values[i] / maxValue) * chartHeight);
                int x = xOffset + (i * (barWidth + 12));
                int y = yOffset + chartHeight - barHeight;

                // Draw bar
                g2d.setColor(new Color(100, 150, 255));
                g2d.fillRect(x, y, barWidth, barHeight);

                // Draw labels below bars
                g2d.setColor(Color.BLACK);
                g2d.drawString(labels[i], x + (barWidth / 5), yOffset + chartHeight + 15);

                // Draw percentage on top of each bar
                String percentageText = String.format("%.1f%%", values[i]);
                g2d.drawString(percentageText, x + (barWidth / 4), y - 10);
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(215, 150); // Adjust size to fit in the panel
        }
    }

    
    class FollowersGenderChart extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            // Example data
            HashMap<String, Integer> data = new HashMap<>();
            data.put("Male", 23);
            data.put("Female", 77);
           // data.put("Other", 0);

            // Calculate total
            int total = data.values().stream().mapToInt(Integer::intValue).sum();

            // Use panel dimensions for dynamic resizing
            int width = getWidth();
            int height = getHeight();
            int diameter = Math.min(width, height - 10);

            int x = (width - diameter) / 2;
            int y = (height - diameter) / 2 + diameter / 4; // Adjust to center the semi-circle

            int startAngle = 0;

            for (String category : data.keySet()) {
                int value = data.get(category);
                int angle = (int) Math.round((value / (double) total) * 180); // Semi-circle uses 180 degrees

                // Set color based on category
                if (category.equals("Male")) g2d.setColor(Color.BLUE);
                if (category.equals("Female")) g2d.setColor(Color.PINK);
                if (category.equals("Other")) g2d.setColor(Color.GREEN);

                // Draw the arc
                g2d.fillArc(x, y, diameter, diameter, startAngle, angle);

                // Calculate the percentage
                double percentage = (value / (double) total) * 100;

                // Calculate the position for the percentage text
                double midAngle = Math.toRadians(startAngle + angle / 1); // Midpoint of the arc
                int textX = (int) (x + diameter / 2 + (diameter / 3) * Math.sin(midAngle)); // Adjust radius for text position
                int textY = (int) (y + diameter / 3 + (diameter / 6) * Math.cos(midAngle));

                // Set text color and draw percentage
                g2d.setColor(Color.white);
                g2d.drawString(String.format("%.1f%%", percentage), textX, textY);

                startAngle += angle;
            }

            // Draw legend
            g2d.setColor(Color.BLACK);
            g2d.drawString("Male: Blue, Female: Pink, Other: Green", 20, height - 130);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(200, 160); // Adjust size to fit in the panel
        }
    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
            	analytics frame = new analytics();
                frame.setLocationRelativeTo(null); // Set center
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
