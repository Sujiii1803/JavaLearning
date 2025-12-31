package oops.day10;

class EncapsulationDemo {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setBalance(5000);
        System.out.println(obj.getBalance());
    }
}
