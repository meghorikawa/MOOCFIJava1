
public class PaymentTerminal {

    private double money; // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals; // number of sold hearty meals
    private static final double AFFORDABLE_PRICE = 2.50;
    private static final double HEARTY_PRICE = 4.30;

    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
        this.affordableMeals = 0;
        this.heartyMeals = 0;

    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment

        if (payment >= AFFORDABLE_PRICE) {
            this.affordableMeals++;
            this.money += AFFORDABLE_PRICE;
            payment -= AFFORDABLE_PRICE;
            return payment;
        } else {
            return payment;
        }

    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the
        // change
        // if the payment parameter is not large enough, no meal is sold and the method
        // should return the whole payment

        if (payment >= HEARTY_PRICE) {
            this.heartyMeals++;
            this.money += HEARTY_PRICE;
            payment -= HEARTY_PRICE;
            return payment;
        } else {
            return payment;
        }

    }

    public boolean eatAffordably(PaymentCard card) {
        // an affordable meal costs 2.50 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned

        if (card.balance() >= AFFORDABLE_PRICE) {
            this.affordableMeals++;
            card.takeMoney(AFFORDABLE_PRICE);
            return true;
        } else {
            return false;
        }

    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }

    }

    public boolean eatHeartily(PaymentCard card) {
        // a hearty meal costs 4.30 euros
        // if the payment card has enough money, the balance of the card is decreased by
        // the price, and the method returns true
        // otherwise false is returned

        if (card.balance() >= HEARTY_PRICE) {
            this.heartyMeals++;
            card.takeMoney(HEARTY_PRICE);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals
                + ", number of sold hearty meals: " + heartyMeals;
    }
}
