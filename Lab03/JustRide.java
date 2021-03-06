/**
 * The JustRide class is a standalone service.
 * 
 * @author Dominic Lim
 * @version: CS2030S AY20/21 Semester 1, Lab 3
 */
public class JustRide extends Services {
    private final int surcharge = 500;
    private final int fareRate = 22;
    private final int startPeak = 360;
    private final int endPeak = 540;

    public int computeFare(Request request) {
        int baseFare = request.getDistance() * fareRate;

        return Services.isPeakHour(request.getTime(), startPeak, endPeak)
                ? surcharge + baseFare
                : baseFare;
    }

    @Override
    public String toString() {
        return "JustRide";
    }
}
