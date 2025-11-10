package PROG6112_UnseenExam_Question2;

/**
 *
 * @author ST10440964_ChristiaanViljoen
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ProductSalesForm extends JFrame {

    private JTextArea txtAreaDisplay;
    private JLabel lblYearsProcessed;
    private JButton btnLoad, btnSave;
    private final ProductSales productSales = new ProductSales();

    public ProductSalesForm() {
        setTitle("Product Sales Application");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Text Area
        txtAreaDisplay = new JTextArea();
        txtAreaDisplay.setEditable(false);
        add(new JScrollPane(txtAreaDisplay), BorderLayout.CENTER);

        // Bottom Panel with Buttons
        JPanel panel = new JPanel();
        btnLoad = new JButton("Load Product Data");
        btnSave = new JButton("Save Product Data");
        panel.add(btnLoad);
        panel.add(btnSave);
        add(panel, BorderLayout.SOUTH);

        // Label for Years Processed
        lblYearsProcessed = new JLabel("Years Processed: ");
        add(lblYearsProcessed, BorderLayout.NORTH);

        // Menu Setup
        JMenuBar menuBar = new JMenuBar();

        JMenu menuFile = new JMenu("File");
        JMenuItem menuExit = new JMenuItem("Exit");
        menuExit.addActionListener(e -> System.exit(0));
        menuFile.add(menuExit);

        JMenu menuTools = new JMenu("Tools");
        JMenuItem menuLoad = new JMenuItem("Load Product Data");
        JMenuItem menuSave = new JMenuItem("Save Product Data");
        JMenuItem menuClear = new JMenuItem("Clear");

        menuTools.add(menuLoad);
        menuTools.add(menuSave);
        menuTools.add(menuClear);

        menuBar.add(menuFile);
        menuBar.add(menuTools);
        setJMenuBar(menuBar);

        // Event Listeners
        btnLoad.addActionListener(e -> loadData());
        menuLoad.addActionListener(e -> loadData());

        btnSave.addActionListener(e -> saveData());
        menuSave.addActionListener(e -> saveData());

        menuClear.addActionListener(e -> clearData());

        setVisible(true);
    }

    // Loads data and displays the report
    private void loadData() {
        int[][] data = productSales.GetProductSales();
        int total = productSales.GetTotalSales();
        double avg = productSales.GetAverageSales();
        int over = productSales.GetSalesOverLimit();
        int under = productSales.GetSalesUnderLimit();
        int years = productSales.GetProductsProcessed();

        StringBuilder sb = new StringBuilder();
        sb.append("PRODUCT SALES REPORT\n\n");
        sb.append("Total Sales: ").append(total).append("\n");
        sb.append("Average Sales: ").append(Math.round(avg)).append("\n");
        sb.append("Sales over limit: ").append(over).append("\n");
        sb.append("Sales under limit: ").append(under).append("\n");
        sb.append("Years Processed: ").append(years).append("\n");

        txtAreaDisplay.setText(sb.toString());
        lblYearsProcessed.setText("Years Processed: " + years);
    }

    // Saves report text to a file
    private void saveData() {
        try (PrintWriter writer = new PrintWriter("data.txt")) {
            writer.println("DATA LOG");
            writer.println(txtAreaDisplay.getText());
            JOptionPane.showMessageDialog(this, "Data saved to data.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
        }
    }

    // Clears text and label
    private void clearData() {
        txtAreaDisplay.setText("");
        lblYearsProcessed.setText("Years Processed: ");
    }

    public static void main(String[] args) {
        new ProductSalesForm();
    }
}
