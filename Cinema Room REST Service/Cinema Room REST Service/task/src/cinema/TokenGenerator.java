package cinema;

import java.util.UUID;

public class TokenGenerator {

    public UUID TokenGenerator(){
        UUID uuid = UUID.fromString("46400000-8cc0-11bd-b43e-10d46e4ef14d");
        UUID randomUUID = UUID.randomUUID();

        return randomUUID;
    }
}
