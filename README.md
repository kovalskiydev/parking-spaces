<h1>Простое веб приложение на Spring c использованием паттерна MVC</h1>

Использованые зависимости и утилиты в проекте:
<ul>
  <li>JpaRepository</li>
  <li>H2 Database</li>
  <li>Spring Boot</li>
  <li>Spring Web</li>
  <li>Lombok</li>
</ul>

Запросы:
<ul>
  <li>/api/streets/save - Сохраняет улицу (В тело принимает параметры сущности Street)</li>
  <li>/api/streets/list - Возвращает список улиц и их информацию</li>
  <li>/api/streets/update/{id} - Изменяет улицу (В тело принмает параметры сущности Street)</li>
  <li>/api/streets/delete/{id} - Удаляет улицу</li>
</ul>
