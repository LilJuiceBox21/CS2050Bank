class Checkings extends ACCOUNT{
    int maxMonthlyWithdrawls;
    int monthlyWithdrawls;
    public Checkings(double money, int maxMonthlyWithdrawls) {
        super(money);
        this.maxMonthlyWithdrawls = maxMonthlyWithdrawls;
    }

    public Checkings() {
    }

    public void setMaxMonthlyWithdrawls(int maxMonthlyWithdrawls) {
        this.maxMonthlyWithdrawls = maxMonthlyWithdrawls;
    }
    public double getMaxMonthlyWithdrawls() {
        return maxMonthlyWithdrawls;
    }
    public void setMonthlyWithdrawals(int monthlyWithdrawls) {
        this.monthlyWithdrawls = monthlyWithdrawls;
    }
    public double getMonthlyWithdrawls() {
        return monthlyWithdrawls;
    }
    public void  withdraw(double withdraw){
        if(getMonthlyWithdrawls()<=getMaxMonthlyWithdrawls()) {
            double money = getMoney() - withdraw;
            setMoney(money);
            monthlyWithdrawls = +1;
            if(getMonthlyWithdrawls() == getMaxMonthlyWithdrawls()) {
                System.out.println("You have reached the maximum monthly withdrawals");
            }
        else{
            System.out.println("You have reached the maximum monthly withdrawals");
        }
        }
    }
    public void deposit(double deposit){
        double money = getMoney() + deposit;
        setMoney(money);
    }
}