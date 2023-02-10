# Проект по автоматизации тестирования главной страницы itavia.ru


## :man_student:: Содержание:

- [Стек технологий](#earth_africa-Стек-технологий)
- [Реализованные проверки](#earth_africa-Реализованные-проверки)
- [Сборка в Jenkins](#earth_africa-Jenkins-job)
- [Запуск из терминала](#earth_africa-Запуск-тестов-из-терминала)
- [Примеры использования](#earth_africa-Allure-отчет)
- [Allure отчет](#earth_africa-Allure-отчет)
- [Интеграция с Allure TestOps](#earth_africa-Интеграция-c-Allure-TestOps)
- [Интеграция с Jira](#earth_africa-Интеграция-c-Jira)
- [Уведомления в Telegram](#earth_africa-Уведомление-в-Telegram-при-помощи-бота)
- [Видео примеры прохождения тестов](#earth_africa-Примеры-видео-о-прохождении-тестов)

## 🧰: Стек технологий

<div align="center">
<a href="https://www.jetbrains.com/idea/"><img alt="InteliJ IDEA" height="50" src="external/technologies/Intelij_IDEA.svg" width="50"/></a>
<a href="https://www.java.com/"><img alt="Java" height="50" src="external/technologies/Java.svg" width="50"/></a>
<a href="https://junit.org/junit5/"><img alt="JUnit 5" height="50" src="external/technologies/JUnit5.svg" width="50"/></a>
<a href="https://selenide.org/"><img alt="Selenide" height="50" src="external/technologies/Selenide.svg" width="50"/></a>
<a href="https://aerokube.com/selenoid/"><img alt="Selenoid" height="50" src="external/technologies/Selenoid.svg" width="50"/></a>
<a href="https://gradle.org/"><img alt="Gradle" height="50" src="external/technologies/Gradle.svg" width="50"/></a>
<a href="https://www.jenkins.io/"><img alt="Jenkins" height="50" src="external/technologies/Jenkins.svg" width="50"/></a>
<a href="https://github.com/allure-framework/"><img alt="Allure" height="50" src="external/technologies/Allure.svg" width="50"/></a>
<a href="https://github.com/"><img alt="GitHub" height="50" src="external/technologies/GitHub.svg" width="50"/></a>
<a href="https://telegram.org/"><img alt="Telegram" height="50" src="external/technologies/Telegram.svg" width="50"/></a>
</div>

## :male_detective:: Реализованные проверки

Автаматизированные тесты
- ✓ Страница CARRIER содержит информацию об CARRIER.AERO 
- ✓ Страница PORT содержит информацию о PORT.AERO
- ✓ Страница AGENCY содержит информацию об AGENCY.AERO
- ✓ Страница Реквизиты содержит реквизиты компании OOO АйТи Авиа
- ✓ Переход на главную страницу при клике на лого сайта
- ✓ Cтраница EDIFLY содержит информацию о EDIFLY - Innovative Software SARL

Ручные тесты
- ✓ Работа слайдера на главной странице
- ✓ Отправка сообщения из формы обратной связи

