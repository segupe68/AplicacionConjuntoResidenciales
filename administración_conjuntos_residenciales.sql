CREATE DATABASE administración_conjuntos_residenciales;

CREATE TABLE Registro_Usuario(
idUsuario int primary key not null,
IdInmueble int,
foreign key (IdInmueble) references Inmueble(IdInmueble),
Nombre varchar (50) not null,
Apellido varchar (50) not null,
Numero_Apartamento varchar (50),
Numero_Telefonico varchar (50)

);



CREATE TABLE Administrador (
IdAdministrador int primary key not null,
Nombre varchar (50) not null,
Apellido varchar (50) not null,
documento int not null,
email varchar (50) not  null,
telefono varchar (16) not null,
usuario varchar (25) not null,
clave varchar (25)  not null
);

CREATE TABLE Inmueble (
IdInmueble int primary key not null,
TipoInmueble varchar (20) not null,
piso varchar (20) not null,
numero int not null
);


CREATE TABLE Obligacion (
IdObligacion int primary key not null,
IdInmueble int,
foreign key (IdInmueble) references Inmueble(IdInmueble),
Estado int not null,
pago int primary key not null,
año varchar (20) not null,
mes varchar (20) not null,
Fvence varchar (20) not null
);

CREATE TABLE Factura (
IdFactura int primary key not null,
pago int primary key not null,
mora int primary key not null,
año varchar (20) not null,
mes varchar (20) not null,
Fvence varchar (20) not null,
total int not null
);