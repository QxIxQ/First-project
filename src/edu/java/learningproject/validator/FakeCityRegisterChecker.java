package edu.java.learningproject.validator;

import edu.java.learningproject.domain.CityRegisterCheckerResponse;
import edu.java.learningproject.domain.Person;
import edu.java.learningproject.exception.CityRegisterException;

public class FakeCityRegisterChecker implements CityRegisterChecker { // класс заглушка (Фейковый класс который делает проверку и возвращает какой-то нужный нам ответ)
    public CityRegisterCheckerResponse checkPerson(Person person)
            throws CityRegisterException {
        return null;
    }
}
