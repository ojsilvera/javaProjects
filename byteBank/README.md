# Projecto entidad financiera Byte Bank

**Modelado de Entidades**
	
    Entidad: cuenta
	Atributos: idCuenta, idSucursal, idTitular, saldo

    Entidad: Cliente
    Atributos: idTitular, nombre, documento, direccion, telefono

    Entidad: sucursal
    Atributos: idSucursal, direccion, telefono

    Entidad: empleado
    Atributos: idEmpleado, idSucursal, idCargo, nombre, edad, direccion,. telefono, salario

    Entidad: cargo
    Atributos: idcargo, nombre

**Aciones por entidad**

    Entidad: cuenta
    Acciones: Crear
              Depositar
              Transferir
              retirar
              Consultar atributos

    Entidad: Cliente
    Acciones: Crear
              Consultar atributos

    Entidad: sucursal
    Acciones: Crear
              Consultar atributos

    Entidad: empleado
    Acciones: Crear
              Consultar atributos

    Entidad: cargo
    Acciones: Crear
              Consultar atributos

**Reglas de negocio**

    Entidad: cargo
    Accion: Boniificar +10% funcionarios
            Boniificar +100% gerentes




