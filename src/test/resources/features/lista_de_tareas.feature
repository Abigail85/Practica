# language:es

  Característica: Eliminar elementos
    Yo como usuario ingreso a un block de notas
    y creo una lista de elementos
    con la cual deseo realizar diferentes acciones


    Escenario: Crear un elemento
      Dado un usuario se encuentra en el block de notas e ingresa a "Lista de tareas"
      Y crea una lista de  5 tareas
      | Barrer  |
      | Trapear |
      | Cocinar |
      | Lavar   |
      | Lavar   |
      Cuando un usuario mueve el elemento 3 de la lista donde de encuentra el elemento 2
      Y elimina el elemento 2 de la lista
      Entonces debe ver como resultado 4 elementos





