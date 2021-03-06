package org.wecancodeit;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Bad Request! Review not found")
public class ReviewNotFoundException extends Exception {

}
