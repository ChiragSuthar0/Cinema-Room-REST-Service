package cinema;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class calculateIncome {
    public int calculateIncome(ArrayList<Seat> available_seats){
        AtomicInteger income = new AtomicInteger();
        int Income;

        available_seats.forEach(seat -> {
            if(seat.status()){
                income.addAndGet(seat.getPrice());;
            }
        });
        return income.get();
    }
}
