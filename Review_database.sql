-- MySQL dump 10.13  Distrib 5.5.62, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: Review
-- ------------------------------------------------------
-- Server version	5.5.62-0ubuntu0.14.04.1-log

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
-- Table structure for table `Clothes`
--

DROP TABLE IF EXISTS `Clothes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Clothes` (
  `P_Id` int(10) NOT NULL DEFAULT '0',
  `Fabric` varchar(20) NOT NULL DEFAULT '',
  `Size` varchar(5) NOT NULL,
  `Gender` varchar(5) NOT NULL,
  PRIMARY KEY (`P_Id`,`Fabric`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Clothes`
--

LOCK TABLES `Clothes` WRITE;
/*!40000 ALTER TABLE `Clothes` DISABLE KEYS */;
/*!40000 ALTER TABLE `Clothes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Customer` (
  `C_Id` int(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Age` int(3) DEFAULT NULL,
  `Address` varchar(200) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `Password` varchar(30) NOT NULL,
  PRIMARY KEY (`C_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Gadgets`
--

DROP TABLE IF EXISTS `Gadgets`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Gadgets` (
  `P_Id` int(10) NOT NULL DEFAULT '0',
  `Specifications` varchar(200) DEFAULT NULL,
  `Weight` float(12,2) NOT NULL,
  `Power` float NOT NULL,
  PRIMARY KEY (`P_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Gadgets`
--

LOCK TABLES `Gadgets` WRITE;
/*!40000 ALTER TABLE `Gadgets` DISABLE KEYS */;
/*!40000 ALTER TABLE `Gadgets` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Product`
--

DROP TABLE IF EXISTS `Product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Product` (
  `P_Id` int(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Price` float(12,2) DEFAULT NULL,
  `Company` varchar(30) NOT NULL,
  `Type` varchar(30) NOT NULL,
  PRIMARY KEY (`P_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Product`
--

LOCK TABLES `Product` WRITE;
/*!40000 ALTER TABLE `Product` DISABLE KEYS */;
/*!40000 ALTER TABLE `Product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Reviews`
--

DROP TABLE IF EXISTS `Reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Reviews` (
  `R_Id` int(10) NOT NULL,
  `Rating` int(5) NOT NULL,
  `Comment` varchar(500) DEFAULT NULL,
  `Value_for_money` varchar(3) NOT NULL,
  `C_Id` int(10) DEFAULT NULL,
  `P_Id` int(10) DEFAULT NULL,
  PRIMARY KEY (`R_Id`),
  KEY `P_Id` (`P_Id`),
  KEY `C_Id` (`C_Id`),
  CONSTRAINT `Reviews_ibfk_1` FOREIGN KEY (`P_Id`) REFERENCES `Product` (`P_Id`),
  CONSTRAINT `Reviews_ibfk_2` FOREIGN KEY (`C_Id`) REFERENCES `Customer` (`C_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Reviews`
--

LOCK TABLES `Reviews` WRITE;
/*!40000 ALTER TABLE `Reviews` DISABLE KEYS */;
/*!40000 ALTER TABLE `Reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Software`
--

DROP TABLE IF EXISTS `Software`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Software` (
  `P_Id` int(10) NOT NULL DEFAULT '0',
  `OS` varchar(20) NOT NULL DEFAULT '',
  `Size` int(10) NOT NULL,
  `Edition` varchar(20) NOT NULL,
  PRIMARY KEY (`P_Id`,`OS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Software`
--

LOCK TABLES `Software` WRITE;
/*!40000 ALTER TABLE `Software` DISABLE KEYS */;
/*!40000 ALTER TABLE `Software` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-23 16:46:04
