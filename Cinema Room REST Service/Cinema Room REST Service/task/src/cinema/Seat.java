package cinema;

import io.micrometer.core.lang.Nullable;

import java.util.UUID;

class Seat {
    private int row;
    private int column;
    private boolean Occupied;
    private int price;

    @Nullable
    private UUID token;

    public Seat(int row, int column, int price, boolean occupied, UUID token){
        this.row = row;
        this.column = column;
        this.price = price;
        this.Occupied = occupied;
        this.token = token;
    }


    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public int getPrice() {
        return price;
    }

    public void setOccupied(boolean occupied) {
        Occupied = occupied;
    }

    public UUID TokenStatus() {
    return token;
}

    public void setToken(UUID token) {
        this.token = token;
    }

    public boolean status() {
        return Occupied;
    }

//    public boolean isOccupied() {
//        return Occupied;
//    }
}
