# Refactorizacion

1. Quitamos el enum de la clase hechizo y creamos una clase que extiende de hechizo por cada uno de los enum.
2. Creamos otra clase llamada Hechicero
3. Debemos refactorizar todos los nombres para que esten en camelCase, asi como hacer que los nombres no sean muy largos, pero que expliquien lo que hacen
4. El metodo PuedeLanzarHechizo pertenece al hechicero, no al hechizo
5. Los atributos del Hechicero no hace falta que tengan "hechicero", ya que es redundante