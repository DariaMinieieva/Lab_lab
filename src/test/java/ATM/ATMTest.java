package ATM;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @org.junit.jupiter.api.Test
    void process() {
        ATM atm = new ATM();
        IllegalArgumentException exp = assertThrows(
                IllegalArgumentException.class,
                () -> atm.process(126),
                "sss"
        );
    }
}