package fr.idmc.sid.coursesmanagement.utils.domain.cmd;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.ValidationException;
import java.util.Map;

@AllArgsConstructor
@Getter
public class InputValidationException extends ValidationException {
    private Map<String, String> problems;
}
