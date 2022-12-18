package solid.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TerminalPaymentService implements WebMoneyPayable,PayCreditCardPayable {

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

    @Override
    public void payWebMoney(int amount) {
        double a=Math.random();
        if (a>0.5) {
            System.out.println("Не удалось оплатить");
            throw new NotImplementedException();}
        System.out.printf("Internet pay by web money %d\n", amount);
    }
}
