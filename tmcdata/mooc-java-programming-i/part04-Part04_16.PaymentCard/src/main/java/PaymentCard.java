public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public void eatAffordably() {
        if (balance - 2.60 >= 0) {
            this.balance = balance - 2.60;
        }
    }

    public void eatHeartily() {
        if (balance - 4.60 >= 0) {
            this.balance = balance - 4.60;
        }
    }

    public void addMoney(double money) {
        if (money < 0 ){
            this.balance = balance + 0 ;
        }
        else if (this.balance + money > 150) {
            this.balance = 150;
        } else {
            this.balance = balance + money;
        }
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

}
