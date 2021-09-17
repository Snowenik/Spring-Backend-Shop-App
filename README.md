# Backend aplikacji sklepu komputerowego Spring



## Potrzebne oprogramowanie

- Serwer MySQL (ja użyłem XAMPP)
- Maven
- Java 8+



## Konfiguracja i uruchomienie

- API działa na `localhost:8080/api`
- Konfiguracja MySQL znajduje się w /src/main/resources/application.properties
- Username dla bazy danych jest ustawiony jako `root`, bez hasla
- klasa `src/main/java/com/shop/LoadDatabase.java` sluzy do inicjalizacji bazy danych, po pierwszym uruchomieniu aplikacji nalezy ja usunac aby nie nadpisywala danych
- Po konfiguracji, aby uruchomic aplikację należy przejść do jej głównego katalogu i wpisać w terminalu `mvnw spring-boot:run`


## Prezentacja aplikacji

[Aplikacja sklepu komputerowego](https://www.youtube.com/watch?v=lWBbWJaH060)