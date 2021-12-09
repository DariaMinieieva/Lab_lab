package Builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseerTest {

    @Test
    void builder() {
        Useer user = Useer.builder()
                .firstName("Dasha")
                .lastName("Minieieva")
                .occupation("UCU")
                .occupation("UCU again")
                .build();
        assertEquals(user.toString(), "Useer(firstName=Dasha, lastName=Minieieva, occupations=[UCU, UCU again], gender=null, age=0, weight=0)");
    }
}