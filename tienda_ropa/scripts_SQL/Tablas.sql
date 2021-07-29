-- Clientes definition

CREATE TABLE Clientes (
    identificacion varchar(10) PRIMARY KEY,
    nombres varchar(20),
    apellidos varchar(30)
);

-- Marcas definition

CREATE TABLE Marcas (
	codigoMarca INTEGER,
	nombre TEXT(30),
	CONSTRAINT Marcas_PK PRIMARY KEY (codigoMarca)
);

-- Productos definition

CREATE TABLE Productos (
    codigoBarras varchar(20) PRIMARY KEY,
    nombre varchar(20),
    precio float,
    talla varchar(3),
    color varchar(15),
    genero varchar(10),
    cantidadDisponible int,
    idMarca int, Column9 INTEGER,
    CONSTRAINT FK_MarcaProducto FOREIGN KEY (idMarca) REFERENCES Marcas(codigoMarca)
);

-- Ventas definition

CREATE TABLE Ventas (
	codigoVenta INTEGER,
	total REAL,
	idCliente TEXT(10),
	CONSTRAINT Ventas_PK PRIMARY KEY (codigoVenta),
	CONSTRAINT Ventas_FK FOREIGN KEY (idCliente) REFERENCES Clientes(identificacion)
);

-- VentasProductos definition

CREATE TABLE VentasProductos (
	idVentasProductos INTEGER,
	cantidad INTEGER,
	idProducto TEXT(20),
	idVenta INTEGER,
	CONSTRAINT VentasProductos_PK PRIMARY KEY (idVentasProductos),
	CONSTRAINT VentasProductos_FK FOREIGN KEY (idProducto) REFERENCES Productos(codigoBarras),
	CONSTRAINT VentasProductos_FK_1 FOREIGN KEY (idVenta) REFERENCES Ventas(codigoVenta)
);