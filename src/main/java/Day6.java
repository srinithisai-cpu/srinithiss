class Payment {
    void transfer(int amount) {
        System.out.println("Payment: " + amount);
    }
}

class UpiPayment extends Payment {
    void transfer(int amount) {
        System.out.println("UPI Payment: " + amount);
    }
}

class CardPayment extends Payment {
    void transfer(int amount) {
        System.out.println("Card Payment: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void transfer(int amount) {
        System.out.println("Net Banking Payment: " + amount);
    }
}

class Main {
    public static void main(String[] args) {
        Payment p;

        p = new UpiPayment();
        p.transfer(500);

        p = new CardPayment();
        p.transfer(1000);

        p = new NetBankingPayment();
        p.transfer(2000);
    }
}


