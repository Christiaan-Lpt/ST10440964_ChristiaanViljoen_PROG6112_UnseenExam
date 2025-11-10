package PROG6112_UnseenExam_Question1;


/**
 *
 * @author ST10440964_ChristiaanViljoen
 */

// Main program to produce the product sales report
public class ProductSalesReport {
    public static void main(String[] args) {
        
        // 2D array storing product sales data for 2 years and 3 quarters
        int[][] productSales = {
            {300, 150, 700}, // Year 1
            {250, 200, 600}  // Year 2
        };

        // Create instance of ProductSales to access methods
        ProductSales sales = new ProductSales();

        // Calculate required sales information
        int total = sales.TotalSales(productSales);
        double average = sales.AverageSales(productSales);
        int max = sales.MaxSale(productSales);
        int min = sales.MinSale(productSales);

        // Display report
        System.out.println("PRODUCT SALES REPORT 2025");
        System.out.println("==========================");
        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + Math.round(average));
        System.out.println("Maximum sale: " + max);
        System.out.println("Minimum sale: " + min);
    }
}

