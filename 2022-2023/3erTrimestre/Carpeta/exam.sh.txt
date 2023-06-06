#!/bin/bash

# Función para crear la carpeta y el archivo
crear_carpeta_y_archivo() {
    mkdir datos
    echo $(bc -l <<< "scale=2; -$1 / 2") > datos/examen.txt
}

# Función para borrar la carpeta y mostrar mensaje
borrar_carpeta() {
    rm -rf datos
    echo "La carpeta examen ya existía y la he borrado"
}

# Función principal del programa
main() {
    while true; do
        echo "Ingrese un valor numérico (0 para terminar): "
        read valor

        if ((valor < 0)); then
            if [ -d datos ]; then
                borrar_carpeta
            fi
            crear_carpeta_y_archivo $valor
        elif ((valor == 0)); then
            echo "FIN"
            break
        else
            for ((i = valor; i >= 1; i--)); do
                echo $i
            done
        fi
    done
}

# Llamada a la función principal
main