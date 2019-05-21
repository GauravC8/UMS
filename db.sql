-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.3.12-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for umsdb
CREATE DATABASE IF NOT EXISTS `umsdb` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `umsdb`;

-- Dumping structure for table umsdb.assignments
CREATE TABLE IF NOT EXISTS `assignments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentCourseEnroll` int(11) DEFAULT NULL,
  `assignment` mediumblob DEFAULT NULL,
  `studentId` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKkdpaaxndrtek3681nv9e44m63` (`studentId`),
  KEY `FKd47qfc8e1insml1vyun2pccet` (`student_id`),
  CONSTRAINT `FKd47qfc8e1insml1vyun2pccet` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  CONSTRAINT `FKkdpaaxndrtek3681nv9e44m63` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.assignments: ~14 rows (approximately)
/*!40000 ALTER TABLE `assignments` DISABLE KEYS */;
INSERT INTO `assignments` (`id`, `studentCourseEnroll`, `assignment`, `studentId`, `student_id`) VALUES
	(1, 10, _binary 0x47415A414C2E747874, NULL, NULL),
	(2, 10, _binary 0x47415A414C2E747874, NULL, NULL),
	(5, 10, _binary 0x47415A414C2E747874, NULL, 3),
	(6, 10, _binary 0x47415A414C2E747874, NULL, 3),
	(7, 10, _binary 0x47415A414C2E747874, 3, NULL),
	(8, 10, _binary 0x47415A414C2E747874, 3, NULL),
	(9, 10, _binary 0x47415A414C2E747874, 3, NULL),
	(10, 10, _binary 0x47415A414C2E747874, 13, NULL),
	(11, 10, _binary 0x47415A414C2E747874, 13, NULL),
	(12, 10, _binary 0x47415A414C2E747874, 13, NULL),
	(13, 10, _binary 0x47415A414C2E747874, 13, NULL),
	(14, 10, _binary 0x47415A414C2E747874, 13, NULL),
	(15, 10, _binary 0x47415A414C2E747874, 13, NULL),
	(16, 10, _binary 0x47415A414C2E747874, 13, NULL);
/*!40000 ALTER TABLE `assignments` ENABLE KEYS */;

-- Dumping structure for table umsdb.course
CREATE TABLE IF NOT EXISTS `course` (
  `courseId` int(11) NOT NULL AUTO_INCREMENT,
  `coursename` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`courseId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.course: ~0 rows (approximately)
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
/*!40000 ALTER TABLE `course` ENABLE KEYS */;

-- Dumping structure for table umsdb.faculty
CREATE TABLE IF NOT EXISTS `faculty` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `emailId` varchar(50) NOT NULL,
  `facultyFirstName` varchar(50) DEFAULT NULL,
  `facultyLastName` varchar(50) DEFAULT NULL,
  `facultyContact` varchar(50) DEFAULT NULL,
  `facultyGender` varchar(50) DEFAULT NULL,
  `facultyFatherName` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `department` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `pincode` varchar(50) DEFAULT NULL,
  `facultyMotherName` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `role` char(1) NOT NULL,
  `user` tinyblob DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `emailId` (`emailId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.faculty: ~1 rows (approximately)
/*!40000 ALTER TABLE `faculty` DISABLE KEYS */;
INSERT INTO `faculty` (`id`, `emailId`, `facultyFirstName`, `facultyLastName`, `facultyContact`, `facultyGender`, `facultyFatherName`, `dob`, `department`, `address`, `city`, `state`, `pincode`, `facultyMotherName`, `country`, `password`, `role`, `user`) VALUES
	(1, 'f@gmail.com', 'Suman', 'Singh', '2536142589', 'female', 'Sal', '2019-04-09', 'Department of Science', 'Gurgaon', 'Gurgaon', 'Haryana', '253614', 'Mahina', 'India', '111111', 'f', NULL),
	(2, 'mahima@gmail.com', 'Mahima', 'Gupta', '9811169101', 'female', 'Ram', '1997-09-12', 'Department of Science', 'Faridabad', 'ggg', 'vfvgf', '121122', 'Anita', 'India', '7654321', 'f', NULL);
/*!40000 ALTER TABLE `faculty` ENABLE KEYS */;

-- Dumping structure for table umsdb.hibernate_sequence
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.hibernate_sequence: ~2 rows (approximately)
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(22),
	(22),
	(22);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Dumping structure for table umsdb.result
CREATE TABLE IF NOT EXISTS `result` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentCourseEnroll` varchar(50) DEFAULT '0',
  `studentName` varchar(50) DEFAULT '0',
  `cgpa` double DEFAULT 0,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.result: ~3 rows (approximately)
/*!40000 ALTER TABLE `result` DISABLE KEYS */;
INSERT INTO `result` (`id`, `studentCourseEnroll`, `studentName`, `cgpa`, `role`) VALUES
	(2, 'B.C.A', 'Raja Bhai', 8, NULL),
	(3, 'M.C.A', 'Govinda Arla', 5, NULL),
	(4, 'M.C.A', 'Govinda Arla', 5, NULL),
	(5, 'B.Com', 'Rani Gara', 3, NULL);
/*!40000 ALTER TABLE `result` ENABLE KEYS */;

-- Dumping structure for table umsdb.student
CREATE TABLE IF NOT EXISTS `student` (
  `id` int(11) NOT NULL,
  `emailId` varchar(50) NOT NULL,
  `studentFirstName` varchar(50) DEFAULT NULL,
  `studentLastName` varchar(50) DEFAULT NULL,
  `studentContact` varchar(50) DEFAULT NULL,
  `studentGender` varchar(50) DEFAULT NULL,
  `studentMotherName` varchar(50) DEFAULT NULL,
  `studentFatherName` varchar(50) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `studentCourseEnroll` varchar(50) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `state` varchar(50) DEFAULT NULL,
  `pincode` varchar(50) DEFAULT NULL,
  `country` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `role` char(1) NOT NULL,
  `user` tinyblob DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `emailId` (`emailId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.student: ~7 rows (approximately)
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`, `emailId`, `studentFirstName`, `studentLastName`, `studentContact`, `studentGender`, `studentMotherName`, `studentFatherName`, `dob`, `studentCourseEnroll`, `address`, `city`, `state`, `pincode`, `country`, `password`, `role`, `user`) VALUES
	(3, 'Raja@gmail.com', 'Raja', 'Bhai', '9478121232', 'male', 'AnitaDevi', 'Vivek', '2019-04-10', 'B.B.A', 'Street 2', 'Greater Kailash', 'Noida', '114400', 'India', '111111', 's', NULL),
	(7, 'mahima@gmail.com', 'Mahima', 'Rajput', '2514362514', 'male', 'Frigga', 'Harish', '2019-04-03', 'B.B.A', NULL, 'Balabhgarh', 'Haryana', '251436', 'India', '444444', '\0', NULL),
	(8, 'govinda@gmail.com', 'Govinda', 'Arla', '1234561425', 'male', 'Ponaam ', 'Vivek', '2019-04-11', 'B.B.A', NULL, 'faridabad', 'Haryana', '121006', 'India', '666666', '\0', NULL),
	(9, 'TANYA.SHARMA@Gmail.com', 'tanya', 'sharm', '1111111111', 'male', 'AnitaDevi', 'Vivek', '2019-04-03', 'B.B.A', NULL, 'Noida', 'Noida', '111111', 'India', '333333', '\0', NULL),
	(11, 'g123@gmail.com', 'Gaurav', 'Rawat', '1234561425', 'male', 'Shakuntala', 'Ravi', '2019-04-26', 'B.B.A', NULL, 'faridabad', 'Haryana', '121006', 'India', '121212', '\0', NULL),
	(13, 'gunjan@gmail.com', 'gunjan', 'garg', '9478121232', 'male', 'nm', 'bn', '2019-04-11', 'B.B.A', NULL, 'Greater Kailash', 'Noida', '114400', 'India', '123456', '\0', NULL),
	(14, 'nitika@gmail.com', 'Nitika', 'Gandhi', '9910188767', 'female', 'Sunita', 'Dharam', '2019-04-09', 'B.B.A', NULL, 'faridabad', 'Haryana', '121006', 'India', '112233', '\0', NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;

-- Dumping structure for table umsdb.timetable
CREATE TABLE IF NOT EXISTS `timetable` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentCourseEnroll` varchar(50) DEFAULT NULL,
  `day` varchar(50) DEFAULT NULL,
  `slot` varchar(50) DEFAULT NULL,
  `subject` varchar(50) DEFAULT NULL,
  `roomno` varchar(50) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.timetable: ~5 rows (approximately)
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
INSERT INTO `timetable` (`id`, `studentCourseEnroll`, `day`, `slot`, `subject`, `roomno`, `role`) VALUES
	(6, 'B.tech', 'Monday', '10-11', 'jk', 'A20', NULL),
	(7, 'B.C.A', 'Tuesday', '11-12', 'ADA', 'B2', NULL),
	(8, 'M.C.A', 'Tuesday', '11-12', 'Java', 'B1', NULL),
	(9, 'B.com', 'Tuesday', '9-10', 'Introduction to Marketing', 'C23', NULL),
	(10, 'B.B.A', 'Wednesday', '10-11', 'Economics', 'A6', NULL);
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;

-- Dumping structure for table umsdb.user
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `studentId` int(11) DEFAULT 0,
  `facultyId` int(11) DEFAULT 0,
  `emailId` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `role` char(1) DEFAULT NULL,
  `faculty_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `faculty` tinyblob DEFAULT NULL,
  `student` tinyblob DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK25mtxsyu84lnn33ygespegy2l` (`faculty_id`),
  KEY `FKa7ea4qosadk5m664xhs8ydvtt` (`studentId`),
  KEY `FKswoamvxqwq4ijo1edta5xxw7p` (`facultyId`),
  CONSTRAINT `FK25mtxsyu84lnn33ygespegy2l` FOREIGN KEY (`faculty_id`) REFERENCES `faculty` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FKa7ea4qosadk5m664xhs8ydvtt` FOREIGN KEY (`studentId`) REFERENCES `student` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FKswoamvxqwq4ijo1edta5xxw7p` FOREIGN KEY (`facultyId`) REFERENCES `faculty` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=latin1;

-- Dumping data for table umsdb.user: ~4 rows (approximately)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`, `studentId`, `facultyId`, `emailId`, `password`, `role`, `faculty_id`, `student_id`, `faculty`, `student`) VALUES
	(5, 3, NULL, 'admin@gmail.com', '111111', 'a', NULL, NULL, NULL, NULL),
	(6, 9, 1, 'f@gmail.com', '111111', 'f', NULL, NULL, NULL, NULL),
	(7, 11, NULL, 'g123@gmail.com', '×mv×', NULL, NULL, NULL, NULL, NULL),
	(9, 13, NULL, 'gunjan@gmail.com', '123456', 's', NULL, NULL, NULL, NULL);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
