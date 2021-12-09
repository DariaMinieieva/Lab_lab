package ATM;

public interface Bill {
    void setNext(Bill next);
    void process(int amount);
}
