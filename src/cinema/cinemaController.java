package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;


@RestController
public class cinemaController {

    cinema cinema = new cinema(9,9);

    @GetMapping("/seats")
    public cinema returnSeats() {
        return cinema;
    }


    @PostMapping("/purchase")
    public ResponseEntity<Object> purchaseSeats(@RequestBody SeatInfo seatInfo) {

        if(seatInfo.getRow() <= 9 && seatInfo.getColumn() <=9 && seatInfo.getColumn() > 0 && seatInfo.getRow() > 0)
        {
            Seat temp = returnSeats().getAvailable_seats().get((seatInfo.getRow() - 1) * 9 + seatInfo.getColumn() - 1);

            if (!temp.status()) {
                TokenGenerator token = new TokenGenerator();
                UUID Token = token.TokenGenerator();
                returnSeats().getAvailable_seats().set(((seatInfo.getRow() - 1) * 9) + seatInfo.getColumn() - 1, new Seat(seatInfo.getRow(), seatInfo.getColumn(), seatInfo.getRow() <= 4 ? 10 : 8, true, Token));
                return ResponseHandler.generateSeatResponse(Token, temp, HttpStatus.OK);
            }
            else if (temp.status()) {
                return ResponseHandler.generateResponse("The ticket has been already purchased!",HttpStatus.BAD_REQUEST);
            }
        }
        else {
            return ResponseHandler.generateResponse("The number of a row or a column is out of bounds!",HttpStatus.BAD_REQUEST);
        }
        return null;
    }

    @PostMapping("/return")
    public ResponseEntity<Object> returnTicket(@RequestBody Token token){

//        Seat temp = returnSeats().getAvailable_seats().get((seatInfo.getRow() - 1) * 9 + seatInfo.getColumn() - 1);

        int index = 0;

        for (int i = 0; i < 81; i++) {
            UUID tk = returnSeats().getAvailable_seats().get(i).TokenStatus();
            if(token.getToken().equals(tk)){
                index = i;
                break;
            }
        }

        if(token.getToken().equals(returnSeats().getAvailable_seats().get(index).TokenStatus())){
            returnSeats().getAvailable_seats().set(index, new Seat((int)index/9 + 1, index - (((int) index/9) *9) + 1, (int)index/9 + 1 <= 4 ? 10 : 8, false, null));
            return ResponseHandler.generateReturnResponse(returnSeats().getAvailable_seats().get(index), HttpStatus.OK);
        }
        else{
            return ResponseHandler.generateResponse("Wrong token!", HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/stats")
    public ResponseEntity<Object> statistics(@RequestParam(required = false) String password){

        if("super_secret".equals(password)){
            return ResponseHandler.generateStatsResponse(returnSeats().getAvailable_seats(), HttpStatus.OK);
        }
        else if ("".equals(password)){
            return ResponseHandler.generateResponse("The password is wrong!", HttpStatus.UNAUTHORIZED);
        }
        else{
            return ResponseHandler.generateResponse("The password is wrong!", HttpStatus.UNAUTHORIZED);
        }
    }

}

