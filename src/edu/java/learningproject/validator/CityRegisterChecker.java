package edu.java.learningproject.validator;

import edu.java.learningproject.domain.CityRegisterCheckerResponse;
import edu.java.learningproject.domain.Person;
import edu.java.learningproject.exception.CityRegisterException;

public interface CityRegisterChecker { // интерфейс для Fake/Real CityRegisterChecker
    CityRegisterCheckerResponse checkPerson(Person person) throws CityRegisterException;
}
