# Arrays, Lamnbdas y Wrapers

## Arrays

    un array es declarado de acuerdo al tipo de variables que va a soportar y el tamaño que va a
    tener, inicialmente es de tamaño fijo ejemplo:

    un array de enteros con 5 posiciones:

        int[] edades = new int[5];

    un array vacio y declarado omo el anterior, tiene 0 en todas sus posiciones y van llenandoce conforme vamos asinando nuevos valores a la misma, por ejemplo:

        edades[2] = 30; asigna el valor 30 al indice 2 del array edades.
    
    Teniendo presente que los inidices inician en 0, [0 1 2 3 4], posee 5 objetos, pero las posiciones van del 0 al 4.

    Accedemos al valor guardado llamando al nombre del array y la posicion que deseamos recuperar, por ejemplo:

        system.out.println(edades[2]);

    En los arrays tambien es posible guardar objeto por ejemplo

        Objeto obj = new objeto();

        Nombramos un arreglo de objetos:

        Objeto[] objetos = new Objeto[5];

        objs[1] = obj; almacenara el obj instanciado en el inidice 1 del arreglo de objetos

    es posible crear objetos directamente, lo que equivale a creacion por lotes:

        Objeto[] objetos = new objeto[5];

        Objeto[0] = new Objeto(arg);
        Objeto[1] = new Objeto(arg);

    Ahora existe una clase especial que es la ArrayList<>, la cual tiene metodos propios y esta orientada a trabajos mas complejos de arreglos del tipo object, se instancia de la siguiente manera:

        ArrayList lista = new ArrayList();
    
    con la isntancia anterior manejara todos los tipos de objetos que le ingresemos, pero perderiamos cohecion en el tipo de arreglo que estamos trabajando, por lo tanto lo mas usado es <tipo_objeto>, el diamante se utiliza para forszar un tipo de objeto en especifico y de esta manera conservar el universo de trabajo del array que estemos utilizando, quedando de la siguiente manera:

        ArrayList<Tipo_objeto> lista = new ArrayList<Tipos_objeto>();

## Almacenar referencia
