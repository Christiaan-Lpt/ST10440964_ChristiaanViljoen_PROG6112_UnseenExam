package PROG6112_UnseenExam_Question1;

/**
 *
 * @author ST10440964_ChristiaanViljoen
 */

// Interface defining required sales calculation methods
public interface IProductSales {
    int TotalSales(int[][] productSales);
    double AverageSales(int[][] productSales);
    int MaxSale(int[][] productSales);
    int MinSale(int[][] productSales);
}

