public class Uc1 { public class CabServiceTest {
    private CabService cabService;

    @BeforeEach
    public void setUp() {
        cabService = new CabService();
    }


    @Test
    public void testFareWithDistanceAndTime() {
        double distance = 10;  // 10 kilometers
        int time = 15;         // 15 minutes
        double expectedFare = 115;  // (10 * 10) + (15 * 1) = 100 + 15 = Rs 115

        double fare = cabService.calculateFare(distance, time);

        assertEquals(expectedFare, fare);
    }

    @Test
    public void testInvalidInput() {
        double distance = 0;   // Invalid: zero distance
        int time = 10;         // 10 minutes
        double expectedFare = 0;  // Invalid input, no fare

        double fare = cabService.calculateFare(distance, time);

        assertEquals(expectedFare, fare);
    }

    @Test
    public void testMinimumFareWithLongerDistance() {
        double distance = 3;   // 3 kilometers
        int time = 3;          // 3 minutes
        double expectedFare = 30 + 3;  // (3 * 10) + (3 * 1) = Rs 30 + Rs 3 = Rs 33

        double fare = cabService.calculateFare(distance, time);

        assertEquals(expectedFare, fare);
    }
}
}
