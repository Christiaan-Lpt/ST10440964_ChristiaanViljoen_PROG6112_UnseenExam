import PROG6112_UnseenExam_Question1.ProductSales;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    ProductSales sales = new ProductSales();

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        int expectedTotal = 2200;
        int actualTotal = sales.TotalSales(productSales);
        assertEquals(expectedTotal, actualTotal, "Total sales should equal 2200");
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        double expectedAverage = 366.66;
        double actualAverage = sales.AverageSales(productSales);
        assertEquals(expectedAverage, actualAverage, 0.5, "Average should be approximately 367");
    }
}
