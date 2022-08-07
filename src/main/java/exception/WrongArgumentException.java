package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "На ноль делить нельзя")
public class WrongArgumentException extends IllegalArgumentException  {
    public WrongArgumentException(String message) {
        super(message);
    }
}
