package PROG6112_UnseenExam_Question2;

/**
 *
 * @author ST10440964_ChristiaanViljoen
 */

public class ProductSales implements IProductSales {

    private final int[][] productSales = {
        {300, 150, 700}, // Year 1
        {250, 200, 600}  // Year 2
    };

    private final int SALES_LIMIT = 500;

    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    @Override
    public int GetTotalSales() {
        int total = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }
        return total;
    }

    @Override
    public double GetAverageSales() {
        int total = GetTotalSales();
        int count = 0;
        for (int[] year : productSales) {
            count += year.length;
        }
        return (double) total / count;
    }

    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > SALES_LIMIT) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < SALES_LIMIT) {
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetProductsProcessed() {
        return productSales.length; // Number of years
    }
}
