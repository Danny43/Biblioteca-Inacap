-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: biblioteca
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.31-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anio_publicacion`
--

DROP TABLE IF EXISTS `anio_publicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anio_publicacion` (
  `idanio_publicacion` int(11) NOT NULL AUTO_INCREMENT,
  `anio` int(11) NOT NULL,
  PRIMARY KEY (`idanio_publicacion`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anio_publicacion`
--

LOCK TABLES `anio_publicacion` WRITE;
/*!40000 ALTER TABLE `anio_publicacion` DISABLE KEYS */;
INSERT INTO `anio_publicacion` VALUES (1,1800);
/*!40000 ALTER TABLE `anio_publicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `arriendo`
--

DROP TABLE IF EXISTS `arriendo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `arriendo` (
  `idarriendo` int(11) NOT NULL AUTO_INCREMENT,
  `costo_total` float DEFAULT NULL,
  `fecha_arriendo` date NOT NULL,
  `fecha_devolucion` date NOT NULL,
  `fecha_entrega_real` date DEFAULT NULL,
  `dias_retraso` int(11) DEFAULT NULL,
  `multa` float DEFAULT NULL,
  `costo_arriendo` float NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `trabajador_idtrabajadores` int(11) NOT NULL,
  PRIMARY KEY (`idarriendo`),
  KEY `fk_arriendo_cliente1_idx` (`cliente_idcliente`),
  KEY `fk_arriendo_trabajador1_idx` (`trabajador_idtrabajadores`),
  CONSTRAINT `fk_arriendo_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_arriendo_trabajador1` FOREIGN KEY (`trabajador_idtrabajadores`) REFERENCES `trabajador` (`idtrabajadores`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `arriendo`
--

LOCK TABLES `arriendo` WRITE;
/*!40000 ALTER TABLE `arriendo` DISABLE KEYS */;
INSERT INTO `arriendo` VALUES (1,NULL,'2018-07-07','2018-07-12',NULL,NULL,NULL,5000,1,1),(2,NULL,'2018-07-07','2018-07-12',NULL,NULL,NULL,5000,1,1);
/*!40000 ALTER TABLE `arriendo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autor` (
  `idautor` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(45) NOT NULL,
  `ap_paterno` varchar(45) NOT NULL,
  `ap_materno` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idautor`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Herbert','Schildt',NULL),(2,'Natasha','Preston','');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `boleta`
--

DROP TABLE IF EXISTS `boleta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `boleta` (
  `folio` int(11) NOT NULL AUTO_INCREMENT,
  `precio_neto` float NOT NULL,
  `precio_total` float NOT NULL,
  `IVA` float NOT NULL,
  `fecha_venta` date NOT NULL,
  `hora_venta` datetime NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  `metodo_pago_idmetodo_pago` int(11) NOT NULL,
  `trabajador_idtrabajadores` int(11) NOT NULL,
  PRIMARY KEY (`folio`),
  KEY `fk_boleta_cliente1_idx` (`cliente_idcliente`),
  KEY `fk_boleta_metodo_pago1_idx` (`metodo_pago_idmetodo_pago`),
  KEY `fk_boleta_trabajador1_idx` (`trabajador_idtrabajadores`),
  CONSTRAINT `fk_boleta_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_boleta_metodo_pago1` FOREIGN KEY (`metodo_pago_idmetodo_pago`) REFERENCES `metodo_pago` (`idmetodo_pago`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_boleta_trabajador1` FOREIGN KEY (`trabajador_idtrabajadores`) REFERENCES `trabajador` (`idtrabajadores`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `boleta`
--

LOCK TABLES `boleta` WRITE;
/*!40000 ALTER TABLE `boleta` DISABLE KEYS */;
/*!40000 ALTER TABLE `boleta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categoria` (
  `idcategoria` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_categoria` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idcategoria`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Terror'),(2,'Fantasia'),(3,'Aventura');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idcliente` int(11) NOT NULL AUTO_INCREMENT,
  `rut` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `ap_paterno` varchar(45) NOT NULL,
  `ap_materno` varchar(45) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'20032262-2','Daniel','Gutierrez','Maldondado','1998-11-07'),(2,'13589464-2','Javier','Vasques','Delgado','1998-10-03');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compra`
--

DROP TABLE IF EXISTS `compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `compra` (
  `idcompra` int(11) NOT NULL AUTO_INCREMENT,
  `distribuidor_iddistribuidor` int(11) NOT NULL,
  `factura_folio` int(11) NOT NULL,
  PRIMARY KEY (`idcompra`),
  KEY `fk_compra_distribuidor1_idx` (`distribuidor_iddistribuidor`),
  KEY `fk_compra_factura1_idx` (`factura_folio`),
  CONSTRAINT `fk_compra_distribuidor1` FOREIGN KEY (`distribuidor_iddistribuidor`) REFERENCES `distribuidor` (`iddistribuidor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_compra_factura1` FOREIGN KEY (`factura_folio`) REFERENCES `factura` (`folio`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compra`
--

LOCK TABLES `compra` WRITE;
/*!40000 ALTER TABLE `compra` DISABLE KEYS */;
INSERT INTO `compra` VALUES (1,1,1);
/*!40000 ALTER TABLE `compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `correo_electronico_cliente`
--

DROP TABLE IF EXISTS `correo_electronico_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `correo_electronico_cliente` (
  `idcorreo_electronico` int(11) NOT NULL AUTO_INCREMENT,
  `direc_corr_elec` varchar(45) NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  PRIMARY KEY (`idcorreo_electronico`),
  KEY `fk_correo_electronico_cliente1_idx` (`cliente_idcliente`),
  CONSTRAINT `fk_correo_electronico_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correo_electronico_cliente`
--

LOCK TABLES `correo_electronico_cliente` WRITE;
/*!40000 ALTER TABLE `correo_electronico_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `correo_electronico_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `correo_electronico_trabajador`
--

DROP TABLE IF EXISTS `correo_electronico_trabajador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `correo_electronico_trabajador` (
  `idcorreo_electronico_trabajador` int(11) NOT NULL AUTO_INCREMENT,
  `direc_corr_elec` varchar(45) NOT NULL,
  `trabajador_idtrabajadores` int(11) NOT NULL,
  PRIMARY KEY (`idcorreo_electronico_trabajador`),
  KEY `fk_correo_electronico_trabajador_trabajador1_idx` (`trabajador_idtrabajadores`),
  CONSTRAINT `fk_correo_electronico_trabajador_trabajador1` FOREIGN KEY (`trabajador_idtrabajadores`) REFERENCES `trabajador` (`idtrabajadores`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `correo_electronico_trabajador`
--

LOCK TABLES `correo_electronico_trabajador` WRITE;
/*!40000 ALTER TABLE `correo_electronico_trabajador` DISABLE KEYS */;
/*!40000 ALTER TABLE `correo_electronico_trabajador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion`
--

DROP TABLE IF EXISTS `direccion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion` (
  `iddireccion` int(11) NOT NULL AUTO_INCREMENT,
  `ciudad` varchar(45) NOT NULL,
  `calle` varchar(45) NOT NULL,
  `nro` int(11) DEFAULT NULL,
  `departamento` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`iddireccion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion`
--

LOCK TABLES `direccion` WRITE;
/*!40000 ALTER TABLE `direccion` DISABLE KEYS */;
/*!40000 ALTER TABLE `direccion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion_has_cliente`
--

DROP TABLE IF EXISTS `direccion_has_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion_has_cliente` (
  `direccion_iddireccion` int(11) NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  PRIMARY KEY (`direccion_iddireccion`,`cliente_idcliente`),
  KEY `fk_direccion_has_cliente_cliente1_idx` (`cliente_idcliente`),
  KEY `fk_direccion_has_cliente_direccion1_idx` (`direccion_iddireccion`),
  CONSTRAINT `fk_direccion_has_cliente_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_direccion_has_cliente_direccion1` FOREIGN KEY (`direccion_iddireccion`) REFERENCES `direccion` (`iddireccion`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion_has_cliente`
--

LOCK TABLES `direccion_has_cliente` WRITE;
/*!40000 ALTER TABLE `direccion_has_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `direccion_has_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `direccion_has_trabajadores`
--

DROP TABLE IF EXISTS `direccion_has_trabajadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `direccion_has_trabajadores` (
  `direccion_iddireccion` int(11) NOT NULL,
  `trabajadores_idtrabajadores` int(11) NOT NULL,
  PRIMARY KEY (`direccion_iddireccion`,`trabajadores_idtrabajadores`),
  KEY `fk_direccion_has_trabajadores_trabajadores1_idx` (`trabajadores_idtrabajadores`),
  KEY `fk_direccion_has_trabajadores_direccion1_idx` (`direccion_iddireccion`),
  CONSTRAINT `fk_direccion_has_trabajadores_direccion1` FOREIGN KEY (`direccion_iddireccion`) REFERENCES `direccion` (`iddireccion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_direccion_has_trabajadores_trabajadores1` FOREIGN KEY (`trabajadores_idtrabajadores`) REFERENCES `trabajador` (`idtrabajadores`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `direccion_has_trabajadores`
--

LOCK TABLES `direccion_has_trabajadores` WRITE;
/*!40000 ALTER TABLE `direccion_has_trabajadores` DISABLE KEYS */;
/*!40000 ALTER TABLE `direccion_has_trabajadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `distribuidor`
--

DROP TABLE IF EXISTS `distribuidor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `distribuidor` (
  `iddistribuidor` int(11) NOT NULL AUTO_INCREMENT,
  `rut` varchar(13) NOT NULL,
  `nombre_empresa` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(12) NOT NULL,
  `anio_de_asociacion` date NOT NULL,
  PRIMARY KEY (`iddistribuidor`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `distribuidor`
--

LOCK TABLES `distribuidor` WRITE;
/*!40000 ALTER TABLE `distribuidor` DISABLE KEYS */;
INSERT INTO `distribuidor` VALUES (1,'20202020','DistEnterprise','Los Muertos 2407','96273666','0118-05-05');
/*!40000 ALTER TABLE `distribuidor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `editorial`
--

DROP TABLE IF EXISTS `editorial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `editorial` (
  `idEditorial` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_editorial` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idEditorial`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `editorial`
--

LOCK TABLES `editorial` WRITE;
/*!40000 ALTER TABLE `editorial` DISABLE KEYS */;
INSERT INTO `editorial` VALUES (1,'Schildt'),(2,'Alienta Editorial'),(3,'Austral'),(4,'Backlist'),(5,'Booket');
/*!40000 ALTER TABLE `editorial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estado_libro`
--

DROP TABLE IF EXISTS `estado_libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `estado_libro` (
  `idestado_libro` int(11) NOT NULL AUTO_INCREMENT,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idestado_libro`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estado_libro`
--

LOCK TABLES `estado_libro` WRITE;
/*!40000 ALTER TABLE `estado_libro` DISABLE KEYS */;
INSERT INTO `estado_libro` VALUES (1,'Disponible'),(2,'Vendido'),(3,'Arrendado');
/*!40000 ALTER TABLE `estado_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura`
--

DROP TABLE IF EXISTS `factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `factura` (
  `folio` int(11) NOT NULL AUTO_INCREMENT,
  `precio_neto` float NOT NULL,
  `IVA` float DEFAULT NULL,
  `precio_total` float NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `metodo_pago_idmetodo_pago` int(11) NOT NULL,
  PRIMARY KEY (`folio`),
  KEY `fk_factura_metodo_pago1_idx` (`metodo_pago_idmetodo_pago`),
  CONSTRAINT `fk_factura_metodo_pago1` FOREIGN KEY (`metodo_pago_idmetodo_pago`) REFERENCES `metodo_pago` (`idmetodo_pago`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura`
--

LOCK TABLES `factura` WRITE;
/*!40000 ALTER TABLE `factura` DISABLE KEYS */;
INSERT INTO `factura` VALUES (1,25000,4750,29750,'2018-06-17 01:53:43',1);
/*!40000 ALTER TABLE `factura` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma`
--

DROP TABLE IF EXISTS `idioma`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `idioma` (
  `ididioma` int(11) NOT NULL AUTO_INCREMENT,
  `idioma` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ididioma`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma`
--

LOCK TABLES `idioma` WRITE;
/*!40000 ALTER TABLE `idioma` DISABLE KEYS */;
INSERT INTO `idioma` VALUES (1,'Español'),(2,'Italiano'),(3,'Griego'),(4,'Ingles'),(5,'Ruso'),(6,'Japones');
/*!40000 ALTER TABLE `idioma` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `idioma_has_libro`
--

DROP TABLE IF EXISTS `idioma_has_libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `idioma_has_libro` (
  `idioma_ididioma` int(11) NOT NULL,
  `libro_nro_serie` varchar(45) NOT NULL,
  PRIMARY KEY (`idioma_ididioma`,`libro_nro_serie`),
  KEY `fk_idioma_has_libro_idioma1_idx` (`idioma_ididioma`),
  KEY `fk_idioma_has_libro_libro1_idx` (`libro_nro_serie`),
  CONSTRAINT `fk_idioma_has_libro_idioma1` FOREIGN KEY (`idioma_ididioma`) REFERENCES `idioma` (`ididioma`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_idioma_has_libro_libro1` FOREIGN KEY (`libro_nro_serie`) REFERENCES `libro` (`nro_serie`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `idioma_has_libro`
--

LOCK TABLES `idioma_has_libro` WRITE;
/*!40000 ALTER TABLE `idioma_has_libro` DISABLE KEYS */;
/*!40000 ALTER TABLE `idioma_has_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `isbn`
--

DROP TABLE IF EXISTS `isbn`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `isbn` (
  `idISBN` int(11) NOT NULL AUTO_INCREMENT,
  `ISBN` varchar(45) NOT NULL,
  PRIMARY KEY (`idISBN`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `isbn`
--

LOCK TABLES `isbn` WRITE;
/*!40000 ALTER TABLE `isbn` DISABLE KEYS */;
INSERT INTO `isbn` VALUES (1,'978-3-16-148410-0');
/*!40000 ALTER TABLE `isbn` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libro` (
  `nro_serie` varchar(45) NOT NULL,
  `nro_paginas` int(11) NOT NULL,
  `precio_referencia` int(11) NOT NULL,
  `Editorial_idEditorial` int(11) NOT NULL,
  `compra_idcompra` int(11) DEFAULT NULL,
  `venta_idventa` int(11) DEFAULT NULL,
  `estado_libro_idestado_libro` int(11) NOT NULL,
  `anio_publicacion_idanio_publicacion` int(11) NOT NULL,
  `titulo_libro_idtitulo_libro` int(11) NOT NULL,
  `ISBN_idISBN` int(11) NOT NULL,
  `arriendo_idarriendo` int(11) DEFAULT NULL,
  `utilidad_idutilidad` int(11) NOT NULL,
  PRIMARY KEY (`nro_serie`),
  KEY `fk_libro_Editorial1_idx` (`Editorial_idEditorial`),
  KEY `fk_libro_compra1_idx` (`compra_idcompra`),
  KEY `fk_libro_venta1_idx` (`venta_idventa`),
  KEY `fk_libro_estado_libro1_idx` (`estado_libro_idestado_libro`),
  KEY `fk_libro_anio_publicacion1_idx` (`anio_publicacion_idanio_publicacion`),
  KEY `fk_libro_titulo_libro1_idx` (`titulo_libro_idtitulo_libro`),
  KEY `fk_libro_ISBN1_idx` (`ISBN_idISBN`),
  KEY `fk_libro_arriendo1_idx` (`arriendo_idarriendo`),
  KEY `fk_libro_utilidad1_idx` (`utilidad_idutilidad`),
  CONSTRAINT `fk_libro_Editorial1` FOREIGN KEY (`Editorial_idEditorial`) REFERENCES `editorial` (`idEditorial`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_ISBN1` FOREIGN KEY (`ISBN_idISBN`) REFERENCES `isbn` (`idISBN`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_anio_publicacion1` FOREIGN KEY (`anio_publicacion_idanio_publicacion`) REFERENCES `anio_publicacion` (`idanio_publicacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_arriendo1` FOREIGN KEY (`arriendo_idarriendo`) REFERENCES `arriendo` (`idarriendo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_compra1` FOREIGN KEY (`compra_idcompra`) REFERENCES `compra` (`idcompra`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_estado_libro1` FOREIGN KEY (`estado_libro_idestado_libro`) REFERENCES `estado_libro` (`idestado_libro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_titulo_libro1` FOREIGN KEY (`titulo_libro_idtitulo_libro`) REFERENCES `titulo_libro` (`idtitulo_libro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_utilidad1` FOREIGN KEY (`utilidad_idutilidad`) REFERENCES `utilidad` (`idutilidad`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_libro_venta1` FOREIGN KEY (`venta_idventa`) REFERENCES `venta` (`idventa`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES ('20203030',570,25000,1,1,NULL,1,1,1,1,2,2),('30303030',520,25000,3,NULL,NULL,1,1,1,1,2,2);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `metodo_pago`
--

DROP TABLE IF EXISTS `metodo_pago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `metodo_pago` (
  `idmetodo_pago` int(11) NOT NULL AUTO_INCREMENT,
  `metodo` varchar(45) NOT NULL,
  PRIMARY KEY (`idmetodo_pago`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `metodo_pago`
--

LOCK TABLES `metodo_pago` WRITE;
/*!40000 ALTER TABLE `metodo_pago` DISABLE KEYS */;
INSERT INTO `metodo_pago` VALUES (1,'VISA'),(2,'MasterCard');
/*!40000 ALTER TABLE `metodo_pago` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefono_cliente`
--

DROP TABLE IF EXISTS `telefono_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telefono_cliente` (
  `idtelefono` int(11) NOT NULL AUTO_INCREMENT,
  `nro_telefono` varchar(12) NOT NULL,
  `cliente_idcliente` int(11) NOT NULL,
  PRIMARY KEY (`idtelefono`),
  KEY `fk_telefono_cliente_cliente1_idx` (`cliente_idcliente`),
  CONSTRAINT `fk_telefono_cliente_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono_cliente`
--

LOCK TABLES `telefono_cliente` WRITE;
/*!40000 ALTER TABLE `telefono_cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefono_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `telefono_trabajador`
--

DROP TABLE IF EXISTS `telefono_trabajador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `telefono_trabajador` (
  `idtelefono` int(11) NOT NULL AUTO_INCREMENT,
  `nro_telefono` varchar(12) NOT NULL,
  `trabajador_idtrabajadores` int(11) NOT NULL,
  PRIMARY KEY (`idtelefono`),
  KEY `fk_telefono_trabajador_trabajador1_idx` (`trabajador_idtrabajadores`),
  CONSTRAINT `fk_telefono_trabajador_trabajador1` FOREIGN KEY (`trabajador_idtrabajadores`) REFERENCES `trabajador` (`idtrabajadores`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `telefono_trabajador`
--

LOCK TABLES `telefono_trabajador` WRITE;
/*!40000 ALTER TABLE `telefono_trabajador` DISABLE KEYS */;
/*!40000 ALTER TABLE `telefono_trabajador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titulo_libro`
--

DROP TABLE IF EXISTS `titulo_libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titulo_libro` (
  `idtitulo_libro` int(11) NOT NULL AUTO_INCREMENT,
  `titulo` varchar(45) NOT NULL,
  PRIMARY KEY (`idtitulo_libro`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titulo_libro`
--

LOCK TABLES `titulo_libro` WRITE;
/*!40000 ALTER TABLE `titulo_libro` DISABLE KEYS */;
INSERT INTO `titulo_libro` VALUES (1,'Java A Beginners Guide Sixth Edition');
/*!40000 ALTER TABLE `titulo_libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titulo_libro_has_autor`
--

DROP TABLE IF EXISTS `titulo_libro_has_autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titulo_libro_has_autor` (
  `titulo_libro_idtitulo_libro` int(11) NOT NULL,
  `autor_idautor` int(11) NOT NULL,
  PRIMARY KEY (`titulo_libro_idtitulo_libro`,`autor_idautor`),
  KEY `fk_titulo_libro_has_autor_autor1_idx` (`autor_idautor`),
  KEY `fk_titulo_libro_has_autor_titulo_libro1_idx` (`titulo_libro_idtitulo_libro`),
  CONSTRAINT `fk_titulo_libro_has_autor_autor1` FOREIGN KEY (`autor_idautor`) REFERENCES `autor` (`idautor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_titulo_libro_has_autor_titulo_libro1` FOREIGN KEY (`titulo_libro_idtitulo_libro`) REFERENCES `titulo_libro` (`idtitulo_libro`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titulo_libro_has_autor`
--

LOCK TABLES `titulo_libro_has_autor` WRITE;
/*!40000 ALTER TABLE `titulo_libro_has_autor` DISABLE KEYS */;
INSERT INTO `titulo_libro_has_autor` VALUES (1,1);
/*!40000 ALTER TABLE `titulo_libro_has_autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `titulo_libro_has_categoria`
--

DROP TABLE IF EXISTS `titulo_libro_has_categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `titulo_libro_has_categoria` (
  `titulo_libro_idtitulo_libro` int(11) NOT NULL,
  `categoria_idcategoria` int(11) NOT NULL,
  PRIMARY KEY (`titulo_libro_idtitulo_libro`,`categoria_idcategoria`),
  KEY `fk_titulo_libro_has_categoria_categoria1_idx` (`categoria_idcategoria`),
  KEY `fk_titulo_libro_has_categoria_titulo_libro1_idx` (`titulo_libro_idtitulo_libro`),
  CONSTRAINT `fk_titulo_libro_has_categoria_categoria1` FOREIGN KEY (`categoria_idcategoria`) REFERENCES `categoria` (`idcategoria`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_titulo_libro_has_categoria_titulo_libro1` FOREIGN KEY (`titulo_libro_idtitulo_libro`) REFERENCES `titulo_libro` (`idtitulo_libro`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `titulo_libro_has_categoria`
--

LOCK TABLES `titulo_libro_has_categoria` WRITE;
/*!40000 ALTER TABLE `titulo_libro_has_categoria` DISABLE KEYS */;
/*!40000 ALTER TABLE `titulo_libro_has_categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajador`
--

DROP TABLE IF EXISTS `trabajador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `trabajador` (
  `idtrabajadores` int(11) NOT NULL AUTO_INCREMENT,
  `rut` varchar(12) NOT NULL,
  `nombres` varchar(45) NOT NULL,
  `ap_paterno` varchar(45) NOT NULL,
  `ap_materno` varchar(45) NOT NULL,
  `fecha_contrato_lab` date NOT NULL,
  PRIMARY KEY (`idtrabajadores`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajador`
--

LOCK TABLES `trabajador` WRITE;
/*!40000 ALTER TABLE `trabajador` DISABLE KEYS */;
INSERT INTO `trabajador` VALUES (1,'13589262-7','Jinx','La Bala','Perdida','2013-10-10'),(2,'19958464-7','Caitlyn','Sherief','Piltover','2006-07-03');
/*!40000 ALTER TABLE `trabajador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `rol` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'admin','21232f297a57a5a743894a0e4a801fc3','Administrador');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `utilidad`
--

DROP TABLE IF EXISTS `utilidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `utilidad` (
  `idutilidad` int(11) NOT NULL AUTO_INCREMENT,
  `utilidad` varchar(45) NOT NULL,
  PRIMARY KEY (`idutilidad`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `utilidad`
--

LOCK TABLES `utilidad` WRITE;
/*!40000 ALTER TABLE `utilidad` DISABLE KEYS */;
INSERT INTO `utilidad` VALUES (1,'Venta'),(2,'Arriendo');
/*!40000 ALTER TABLE `utilidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venta`
--

DROP TABLE IF EXISTS `venta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venta` (
  `idventa` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_idcliente` int(11) NOT NULL,
  `boleta_folio` int(11) NOT NULL,
  PRIMARY KEY (`idventa`),
  KEY `fk_venta_cliente1_idx` (`cliente_idcliente`),
  KEY `fk_venta_boleta1_idx` (`boleta_folio`),
  CONSTRAINT `fk_venta_boleta1` FOREIGN KEY (`boleta_folio`) REFERENCES `boleta` (`folio`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_venta_cliente1` FOREIGN KEY (`cliente_idcliente`) REFERENCES `cliente` (`idcliente`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venta`
--

LOCK TABLES `venta` WRITE;
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-08  0:16:29
