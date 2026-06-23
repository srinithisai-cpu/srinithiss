public class Day14b {

    static void main() {
        // Initatiate Fees Calc

        FeeCalculator calc = new FeeCalculator(new NoDiscount());

        System.out.println("Final Fee with No Discount: "+calc.finalFee(1000));

        calc.setDiscountStrategy(new SummerSaleDiscount());
        System.out.println("Final Fee with SummerSale Discount: "+calc.finalFee(1000));

    }

}

interface DiscountStrategy{
    double apply(double fee);
}

class SummerSaleDiscount implements DiscountStrategy {
    // 30%
    @Override
    public double apply(double fee){
        // business logic to calculate discount
        return fee * 0.7; // x -> x - x*30/100
    }
}

class NoDiscount implements DiscountStrategy {
    // 0%
    @Override
    public double apply(double fee){
        // business logic to calculate discount
        return fee;
    }
}


class FeeCalculator {
    // Strategy
    private DiscountStrategy discountStrategy;

    public FeeCalculator(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    //Calculate finalFee
    double finalFee(double fee) {
        discountStrategy.apply(fee);
        return fee;
    }
}