import java.util.*;

public class Transports {

    enum RouteType {CITY, URBAN, EXPRESS}

    enum BookingStatus {PENDING, CONFIRMED, CANCELLED, REJECTED}

    record StudentCommuter(
            String studentId,
            String name,
            String department,
            String pickupStop) {
    }

    static class Route {
        String routeId;
        String routeName;
        RouteType routeType;
        int capacity;
        List<String> stops = new ArrayList<>();

        Route(String routeId, String routeName, RouteType routeType, int capacity) {
            this.routeId = routeId;
            this.routeName = routeName;
            this.routeType = routeType;
            this.capacity = capacity;
        }

        void addStop(String stop) {
            stops.add(stop);
        }
    }

    static class TransportBooking {
        String bookingId;
        String studentId;
        String routeId;
        BookingStatus status;

        TransportBooking(String bookingId, String studentId, String routeId) {
            this.bookingId = bookingId;
            this.studentId = studentId;
            this.routeId = routeId;
            this.status = BookingStatus.PENDING;
        }
    }

    static class TransportManager {
        Map<String, Route> routes = new HashMap<>();
        Map<String, StudentCommuter> students = new HashMap<>();
        Map<String, TransportBooking> bookings = new HashMap<>();

        void addRoute(Route r) {
            routes.put(r.routeId, r);
        }

        void addStudent(StudentCommuter s) {
            students.put(s.studentId(), s);
        }

        void createBooking(TransportBooking b) {
            if (!students.containsKey(b.studentId)) {
                System.out.println("Student not found");
                return;
            }

            if (!routes.containsKey(b.routeId)) {
                System.out.println("Route not found");
                return;
            }

            bookings.put(b.bookingId, b);
            System.out.println("Booking Created");
        }

        void confirmBooking(String id) {
            if (bookings.containsKey(id))
                bookings.get(id).status = BookingStatus.CONFIRMED;
        }

        void cancelBooking(String id) {
            if (bookings.containsKey(id))
                bookings.get(id).status = BookingStatus.CANCELLED;
        }
    }

    public static void main(String[] args) {

        TransportManager tm = new TransportManager();

        Route r1 = new Route("R102", "North street Chennai",
                RouteType.EXPRESS,25);

        r1.addStop("post office");
        r1.addStop(" Phone Booth ");
        r1.addStop("District office");
        r1.addStop("Medical Center");

        tm.addRoute(r1);

        StudentCommuter s1 =
                new StudentCommuter("S102", "Ram",
                        "CSC", "post Office");

        tm.addStudent(s1);

        TransportBooking b1 =
                new TransportBooking("B102", "S102", "R102");

        tm.createBooking(b1);
        tm.confirmBooking("B102");

        System.out.println("Status: " +
                tm.bookings.get("B102").status);
    }
}