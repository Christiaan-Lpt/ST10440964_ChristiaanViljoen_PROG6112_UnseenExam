package PROG6112_UnseenExam_Question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    ProductSales ps = new ProductSales();

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        int expected = 2;
        int actual = ps.GetSalesOverLimit();
        assertEquals(expected, actual, "Sales over limit should equal 2");
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        int expected = 4;
        int actual = ps.GetSalesUnderLimit();
        assertEquals(expected, actual, "Sales under limit should equal 4");
    }
}
