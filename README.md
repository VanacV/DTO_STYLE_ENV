# Practic_ENV

Java Spring Boot приложение с использованием PostgreSQL и переменных окружения из `.env` файла.

---

## Описание

Проект демонстрирует:

- Подключение к базе данных PostgreSQL через JDBC
- Использование Spring Data JPA и Hibernate для работы с БД
- Загрузку конфигурационных параметров из файла `.env` с помощью библиотеки [Dotenv](https://github.com/cdimascio/java-dotenv)
- Настройку приложения через `application.properties` с возможностью подстановки значений из переменных окружения
- Применение best practices для безопасности — `.env` файл игнорируется в Git
- Стандартную структуру Spring Boot проекта

---

## Требования

- Java 17 или выше
- Maven 3.6+
- PostgreSQL (локально или удалённо)

---

## Быстрый старт

### 1. Клонировать репозиторий

```bash
git clone git@github.com:VanacV/DTO_STYLE_ENV.git
cd DTO_STYLE_ENV
```
### 2. Создание базы данных

- Создай через pgAdmin4\
  ИЛИ
```bash
CREATE DATABASE your_name_db;
```

### 3. Создание файл .env

Создай файл на пути:
```bash
src/main/resources/.env
```
Пример содержимого:
```bash
DB_URL=jdbc:postgresql://localhost:5432/your_name_db
DB_USERNAME=your_name_user
DB_PASSWORD=your_password
```

### 4. Запуск проекта
Через приложение IntelliJ IDEA\
   ИЛИ
 ```bash
mvn spring-boot:run
 ```