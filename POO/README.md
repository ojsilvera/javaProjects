# Programación orientada a objetos

**¿Qué es?**

La programación orientada a objetos es un paradigma de programación.

**Principal objetivo:**

- Reutilización de código

**Características principales:**

- Encapsulamiento
- Abstracción
- Contexto (scope)

**Objeto**

Un objeto es la representación del conjunto de atributos que definen alguna entidad o algún tipo.

La representación de objetos básicamente es agrupar el conjunto de características de una entidad o de un tipo para que
represente sistemáticamente su significado tanto a nivel de atributos como a nivel de acciones.

**Dominion de los objetos**

cada entidad u objeto dentro de la organizacion, tiene un dominio o alcance que hace referencia a los campos que conceptualmente le pertenecen, por ejemplo:

- Cuenta: numero, saldo, sucursal, titular, documento, telefono, genero

notece que en el ejemplo anterior el dominio de la entidad cuenta es todo lo que afecta a esa entidad directamente, campos como documento, telefono, genero, afectan al titular mas no a la cuenta, por lo tanto deberan ser incluidos en una nueva entidad que referencie el dominio del titular.

- Cuenta: numero, saldo, sucursal, titular
- Titular: titular, documento, telefono, genero

**Ejemplo:**

Objeto: Auto

- Entidad: Auto
- Atributos: Marca, Color, Tipo, Tamaño, Año

# Projecto entidad financiera Byte Bank

**Entidades**
	
    Entidad: cuenta
	Atributos: saldo, agencia, numero, titular

