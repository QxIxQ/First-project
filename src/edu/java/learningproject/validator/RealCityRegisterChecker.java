package edu.java.learningproject.validator;

import edu.java.learningproject.domain.CityRegisterCheckerResponse;
import edu.java.learningproject.domain.Person;
import edu.java.learningproject.exception.CityRegisterException;

public class RealCityRegisterChecker implements CityRegisterChecker {     // класс для проверки данных о персоне(человеке)
    public CityRegisterCheckerResponse checkPerson(Person person)         // метод для проверки объекта (Person) т.к. Adult и Child унаследованны от Person
            throws CityRegisterException {
        return null;
    }
}
