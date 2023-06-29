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

El concepto de herencia se entiende desde la optica, que tendremos una super_clase y clases derivadas o hijas, las clases hijas tendran los atributos individuales y ademas tendran los atributos perteneciente a las super_clases

    **Estructura super_clase y clase hija, representando la herencia**
            //super_clase-----------------------------------
            class superClase{

            //campos
            campo1/atributo1
                    .
                    .
                    .
                    .
            campoN/atributoN

            //constructor(puede o no estar, ya que tenemos un constructor por default)

            public superClase(puede o no tener arg){

            }

            //getter -> obtener datos de la clase

            //setter -> almacenar datos de la clase

            //metodos personalizado

            }

            //clase heredada------------------------------------
            class clasehija extended SuperClase{

            //campos
            campo1/atributo1_Propios
                    .
                    .
                    .
                    .
            campoN/atributoN_Propios

            //constructor(puede o no estar, ya que tenemos un constructor por default)

            public clasehija(arg propios y de la super_clase){

            super(arg de la super_clase separados por , );
            this.campo1/atributo1_Propios
                    .
                    .
                    .
                    .
            this.campoN/atributoN_Propios
            }


            //Constructor
            public clasehija(sin arg){

            }

            //getter -> obtener datos de la clase

            //setter -> almacenar datos de la clase

            //metodos personalizado

            }

    # nota importante
    los parametros del super deben tener el mismo nombre de los campos de la clase padre y a la vez el mismo nombre en los parametros del constructor
**Ejemplo**

    Objeto: Auto

    - Entidad: Auto
    - Atributos: Marca, Color, Tipo, Tamaño, Año
