package PROG6112_UnseenExam_Question2;

/**
 *
 * @author ST10440964_ChristiaanViljoen
 */

// Interface defining required sales and calculation methods
public interface IProductSales {
    int[][] GetProductSales();
    int GetTotalSales();
    int GetSalesOverLimit();
    int GetSalesUnderLimit();
    int GetProductsProcessed();
    double GetAverageSales();
}

