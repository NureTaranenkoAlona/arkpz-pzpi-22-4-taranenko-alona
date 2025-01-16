// Правильний код
class Person(id: Int, name: String)

// Неправильний код
class Person(
    id: Int, name: String)

// Правильний код
class Person(
    id: Int,
    name: String,
    surname: String
) : Human(id, name), KotlinMaker {
    // Тіло класу
}

// Неправильний код
class Person(id: Int,
             name: String,
             surname: String) : Human(id, name), KotlinMaker {
    // Тіло класу
}

// Правильне найменування
package org.example.project

// Неправильне найменування
package org.example.my_project

// Правильний код
open class DeclarationProcessor { /*...*/ }
object EmptyDeclarationProcessor : DeclarationProcessor() { /*...*/ }

// Неправильний код
open class declarationprocessor { /*...*/ }
object empty_declaration_processor : declarationprocessor() { /*...*/ }

// Правильний код
fun processDeclarations() { /*...*/ }
var declarationCount = 1

// Неправильний код
fun process_declarations() { /*...*/ }
var Declaration_Count = 1

// Правильний код
const val MAX_COUNT = 8
val USER_NAME_FIELD = "UserName"

// Неправильний код
const val MaxCount = 8
val userNameField = "UserName"

// Правильний код
if (elements != null) {
    for (element in elements) {
        // ...
    }
}

// Неправильний код
if (elements != null)
{
    for (element in elements)
    {
        // ...
    }
}

// Правильний код
if (elements != null) {
    // ...
}

// Неправильний код
if(elements!=null){
    // ...
}

// Правильна структура

src/
├── main/
│   └── kotlin/
│       ├── network/
│       │   └── socket/
│       └── utils/

// Неправильна структура

src/
├── main/
│   └── kotlin/
│       ├── org/
│       │   └── example/

