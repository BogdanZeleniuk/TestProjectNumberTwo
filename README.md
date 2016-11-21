

Написать REST сервис hello с ресурсом /hello/contacts?nameFilter=val
Запрос к contacts должен возвращать контакты из таблицы БД contacts. Параметр nameFilter обязателен. 
В него передаётся регулярное выражение. В возвращаемых данных не должно быть записей, в которых 
contacts.name совпадает с регулярным выражением.

Массив контактов возвращается в json формате
contacts: [ Contact, ... ]
Contact
{
	“id”: integer,
 	“name”: string
}
Пример запросов
/hello/contacts?nameFilter=^A.*$ - возвращает контакты, которые НЕ начинаются с A
/hello/contacts?nameFilter=^.*[aei].*$ - возвращает контакты, которые НЕ содержат букв a, e, i

Замечания и пожелания к реализации
1.Фильтр обязательно применять в java коде, не использовать возможности SQL.
2.В реализации обязательно учитывать огромное предполагаемое количество контактов и то, 
что легко написать фильтр, который возвращает их все.
3.Учитывать, что сервис должен быть готов одновременно обрабатывать множество запросов.
4.SQL БД можно использовать любую, предпочтительно PostgreSQL.
5.Сервис хотелось бы увидеть на Spring Boot, но не обязательно.
6.Коды ошибок HTTP использовать типичные для REST сервисов.
7.Сборка maven
8.Наличие тестов
9.К результату приложить объяснение, как развернуть БД, запустить приложение. Было бы здорово, 
если бы окружение поднималось с помощью Vagrant, виртуализация VirtualBox.

===============================================================================================

Для того, чтобы развернуть БД необходимо: 
---> создать БД "hello";
---> изменить логин и пароль к БД "hello" в com.test.util.JpaConfig(64,65) 
(если они отличаються от login: postgres, password: password);
---> запустить initDB.sql и populateDB.sql;
Для того, чтобы запустить приложение необходимо: 
---> запустить метод "main";
