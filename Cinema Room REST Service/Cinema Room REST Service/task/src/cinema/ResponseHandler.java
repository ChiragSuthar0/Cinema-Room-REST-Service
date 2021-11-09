package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ResponseHandler {
    public static ResponseEntity<Object> generateResponse(String message, HttpStatus status){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("error",message);

        return new ResponseEntity<Object>(map, status);
    }

    public static ResponseEntity<Object> generateSeatResponse(UUID token, Object obj, HttpStatus status){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("token", token);
        map.put("ticket",obj);

        return new ResponseEntity<Object>(map, status);
    }

    public static ResponseEntity<Object> generateReturnResponse(Object obj, HttpStatus status){
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("returned_ticket",obj);

        return new ResponseEntity<Object>(map, status);
    }

    public static ResponseEntity<Object> generateStatsResponse(ArrayList<Seat> available_seats, HttpStatus status){
        Map<String, Object> map = new HashMap<String, Object>();
        int count = (int) available_seats.stream().filter(seat -> seat.status()).count();
        map.put("current_income", new calculateIncome().calculateIncome(available_seats));
        map.put("number_of_available_seats", 81 - count);
        map.put("number_of_purchased_tickets", count);

        return new ResponseEntity<Object>(map, status);
    }

}
