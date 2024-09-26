class Savings extends ACCOUNT{
   double interestReturnRate;
   public Savings(double money, double interestReturnRate) {
      super(money);
      this.interestReturnRate = interestReturnRate;
   }
}