package edu.java.learningproject.domain;

public class CityRegisterCheckerResponse {                // класс для проверки Гос.Реестра
    private boolean existing;                            // сушествует или не существует данный человек в системе
    private Boolean temporal;                     // данные о регистрации (класс обёртка: true or false or null)

    public boolean isExisting() {
        return existing;
    }

    public void setExisting(boolean existing) {
        this.existing = existing;
    }

    public Boolean getTemporal() {
        return temporal;
    }

    public void setTemporal(Boolean temporal) {
        this.temporal = temporal;
    }
}
