class Savings extends ACCOUNT{
   double interestReturnRate;
   public Savings(double money, double interestReturnRate) {
      super(money);
      this.interestReturnRate = interestReturnRate;
   }
   public Savings() {
   }
   public void setInterestReturnRate() {
      this.interestReturnRate = interestReturnRate;
   }
   public double getInterestReturnRate() {
      return interestReturnRate;
   }
}