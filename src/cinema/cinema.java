package cinema;

import java.util.ArrayList;

public class cinema {
    private int total_rows;
    private int total_columns;
    private ArrayList<Seat> available_seats = new ArrayList<>();


    public cinema(){}

    public cinema(int r, int c){
        this.total_rows = r;
        this.total_columns = c;

        for (int i = 1; i <= total_rows; i++) {
            for (int j = 1; j <= total_columns; j++) {
                available_seats.add(
                        new Seat(i,j, i <= 4 ? 10 : 8,false, null)
                );
            }
        }
    }

    public int getTotal_rows() {
        return total_rows;
    }

    public int getTotal_columns() {
        return total_columns;
    }

    public ArrayList<Seat> getAvailable_seats() {
        return available_seats;
    }



}
