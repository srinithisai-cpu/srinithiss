 class Request {
        String name, date, reason;

        Request(String name, String date, String reason) {
            this.name = name;
            this.date = date;
            this.reason = reason;
        }

        void approve() {
            System.out.println("Approved");
        }

        void reject() {
            System.out.println("Rejected");
        }
    }

    class LeaveRequest extends Request {
        LeaveRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
    }

    class OnDutyRequest extends Request {
        OnDutyRequest(String name, String date, String reason) {
            super(name, date, reason);
        }
    }

    class day7 {
        public static void main(String[] args) {

            LeaveRequest l = new LeaveRequest("SRINITHI", "20-06-2026", "Sick Leave");
            System.out.println(l.name + " " + l.date + " " + l.reason);
            l.approve();

            OnDutyRequest o = new OnDutyRequest("YASCIKA", "30-06-2026", "Intenship ");
            System.out.println(o.name + " " + o.date + " " + o.reason);
            o.reject();
        }
    }

