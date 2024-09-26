class Checkings extends ACCOUNT{
      int maxMonthlyWithdrawals;
      public Checkings(double money, int maxMonthlyWithdrawals) {
          super(money);
          this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
      }
    public double getMoney(){
        return super.getMoney();
    }
}