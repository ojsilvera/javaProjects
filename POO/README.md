# Programación orientada a objetos

**¿Qué es?**

    La programación orientada a objetos es un paradigma de programación.

**Principal objetivo:**

    - Reutilización de código

**Características principales:**

    - Encapsulamiento
    - Abstracción
    - Herencia
    - Polimorfismos

**Objeto**

    Un objeto es la representación del conjunto de atributos que definen alguna entidad o algún tipo.

    La representación de objetos básicamente es agrupar el conjunto de características de una entidad o de un tipo para que
    represente sistemáticamente su significado tanto a nivel de atributos como a nivel de acciones.

**Dominion de los objetos**

cada entidad u objeto dentro de la organizacion, tiene un dominio o alcance que hace referencia a los campos que conceptualmente le pertenecen, por ejemplo:

    - Cuenta: numero, saldo, sucursal, titular, documento, telefono, genero

notece que en el ejemplo anterior el dominio de la entidad cuenta es todo lo que afecta a esa entidad directamente, campos como documento, telefono, genero, afectan al titular mas no a la cuenta, por lo tanto deberan ser incluidos en una nueva entidad que referencie el dominio del titular.

    - Cuenta: numero, saldo, sucursal, idtitular(FK)
    - Titular: idtitular, documento, telefono, genero

La relacion entre las dos entidades se representa como un campo tipo objeto en la entidad que asi lo requiere, en el caso de la relacion cuenta - cliente, el id del propietario de la cuenta se aloja en el modelo de la cuenta como un campo mas

    entidad1{
        String campo_1_1;
        int campo_1_2;
        double campo_1_3;
        Objeto(nombre de la clase que se referencia) idcampo_2_1;
    }

    ecntidad2{
        String idcampo_2_1;
        int campo_2_2;
        double campo_2_3;
    }

**Modificadores de acceso**

puden ser publicos o privados y nos permiten que el codigo contenido sea visible o accesible desde cualquier parte del codigo o por el contrario requiera codigo mas elavorado para llegar a ellos, esto hace uso de una cararcteristica de la POO que es el encapsulamiento.

por ejemplo la unica forma de realizar cambios a los campos de una entidad deberia ser a traves de los metodos que poseer la misma, teniendo en cuenta el caso de la entidad cuenta, esta solo deberia modificarse a traves de los metodos, depositar, retirar o transferir, esto seria para adicionar saldo a una cuenta ya creada deberioa hacerlo a traves del metodo depositar.

**Static**

Con la palabra reservada static garantizamos que la variable sea una variable de clase y no un campo asociado al modelo de la clase como entidad ej:

        private static int total = 0 ;

Sereferencia esta variable llamando a la clase y a la variable por ejemplo,

        Cuenta.total;

 Lo anterior no se recomienda, ya que todo debe estar privado y manipularse a traves de metodos que nos entregen o manipulen los datos requeridos, el metodo que manipule la informacion debe ser del tipo static ejemplo:

        private static int total = 0 ;

con el siguiente metodo obtenemos el total de las cuentas creadas.

        public static getTotalCuentas(){
            
            return Cuenta.total;

        }
# herencia, polimorfismo e interfaces

**Herencia**

Es la caracteristica que tienen las clases de compartir atributus y nos permiten reutilizar codigo, extendiendo una clase sobre otra.


**Ejemplo**

    Objeto: Auto

    - Entidad: Auto
    - Atributos: Marca, Color, Tipo, Tamaño, Año
