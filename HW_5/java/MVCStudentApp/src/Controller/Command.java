/*
 * Перечисление Command определяет доступные команды для управления приложением.
 */
package Controller;

public enum Command {
    NONE,   // Пустая команда
    READ,   // Чтение информации
    CREATE, // Создание новой записи
    UPDATE, // Обновление существующей записи
    LIST,   // Вывод списка записей
    DELETE, // Удаление записи
    EXIT    // Выход из приложения
}


// package Controller;

// public enum Command {
//     NONE,
//     READ,
//     CREATE,
//     UPDATE,
//     LIST,
//     DELETE,
//     EXIT
// }
