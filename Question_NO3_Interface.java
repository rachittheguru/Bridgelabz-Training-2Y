public class Question_NO3_Interface {
        public static void main(String[] args) {
            Payment p1 = new UPI();
            Payment p2 = new CreditCard();
            Payment p3 = new Wallet();

            p1.pay(500.0);
            p2.pay(1200.0);
            p3.pay(300.0);
        }
    }


