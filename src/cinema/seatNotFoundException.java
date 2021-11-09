package cinema;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class seatNotFoundException extends RuntimeException{

    public String seatNotFoundException(String cause){
        return cause;
    }
}
