import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {
    @Test
    public void shouldCalculateSumSales() {
        StatsService service = new StatsService();
        long expected = 180;
        long actual = service.calculateSumSales(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindAverage() {
        StatsService service = new StatsService();
        long expected = 15;
        long actual = service.findAverage(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();
        long expected = 8;
        long actual = service.findMaxSales(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();
        long expected = 9;
        long actual = service.findMinSales(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMinAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.findMinAverage(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        long actual = service.findMaxAverage(new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        Assertions.assertEquals(expected, actual);
    }
}