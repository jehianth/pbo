-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2022 at 12:54 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbpegawai-pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('jehian', '123');

-- --------------------------------------------------------

--
-- Table structure for table `divisi`
--

CREATE TABLE `divisi` (
  `id_divisi` int(3) NOT NULL,
  `nama_divisi` varchar(22) NOT NULL,
  `honor_divisi` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `divisi`
--

INSERT INTO `divisi` (`id_divisi`, `nama_divisi`, `honor_divisi`) VALUES
(1, 'KEUANGAN', 1500000),
(2, 'KEPEGAWAIAN', 1600000),
(3, 'ADMINISTRASI', 1670000),
(4, 'LABORATORIUM', 1450000),
(5, 'INSPEKSI', 2000000),
(6, 'FUMIGASI', 1800000),
(7, 'PEMASARAN', 1550000);

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `id_jabatan` int(3) NOT NULL,
  `jabatan` varchar(50) NOT NULL,
  `gaji_pokok` int(20) NOT NULL,
  `tunj_jabatan` int(20) NOT NULL,
  `tunj_anak` int(20) NOT NULL,
  `tunj_kesehatan` int(20) NOT NULL,
  `perj_dinas` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`id_jabatan`, `jabatan`, `gaji_pokok`, `tunj_jabatan`, `tunj_anak`, `tunj_kesehatan`, `perj_dinas`) VALUES
(1, 'Kepala Bagian Keuangan', 5000000, 1000000, 500000, 500000, 1000000),
(2, 'Kepala Bagian Kepegawaian', 6000000, 1300000, 500000, 500000, 1200000),
(3, 'Kepala Bagian Operasional', 5500000, 1000000, 550000, 500000, 1000000),
(4, 'Kepala Bagian Fungsional', 5700000, 1100000, 500000, 500000, 1300000),
(5, 'Kepala Bagian HRD', 5000000, 1000000, 500000, 500000, 1100000),
(6, 'Kepala Laboratorium', 5500000, 1000000, 500000, 500000, 1100000);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_pegawai` int(8) NOT NULL,
  `id_divisi` varchar(50) NOT NULL,
  `id_jabatan` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `usia` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_pegawai`, `id_divisi`, `id_jabatan`, `nama`, `alamat`, `usia`) VALUES
(15464452, 'KEUANGAN', 'Kepala Bagian Keuangan', 'JEHIAN ATHAYA', 'Karanglewas', 20),
(15486654, 'INSPEKSI', 'Kepala Laboratorium', 'Willy', 'Purbalingga', 24);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai_lama`
--

CREATE TABLE `pegawai_lama` (
  `id_pegawai` int(8) NOT NULL,
  `id_divisi` int(3) NOT NULL,
  `id_jabatan` int(3) NOT NULL,
  `nama` varchar(22) NOT NULL,
  `alamat` varchar(22) NOT NULL,
  `usia` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pegawai_lama`
--

INSERT INTO `pegawai_lama` (`id_pegawai`, `id_divisi`, `id_jabatan`, `nama`, `alamat`, `usia`) VALUES
(13285547, 2, 2, 'Inka', 'Jakarta', 41),
(15464452, 3, 3, 'Nurhayati', 'Bandung', 29),
(16543325, 2, 1, 'Evi Nurbaeti', 'Karawang', 44),
(16546528, 2, 2, 'Budi Laksono', 'Cileungsi', 39),
(16584699, 1, 1, 'Eva Nurvaizah', 'Purwokerto', 45),
(18474648, 1, 3, 'Endar', 'Purwokerto', 47);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `divisi`
--
ALTER TABLE `divisi`
  ADD PRIMARY KEY (`id_divisi`);

--
-- Indexes for table `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`id_jabatan`);

--
-- Indexes for table `pegawai`
--
ALTER TABLE `pegawai`
  ADD PRIMARY KEY (`id_pegawai`);

--
-- Indexes for table `pegawai_lama`
--
ALTER TABLE `pegawai_lama`
  ADD PRIMARY KEY (`id_pegawai`),
  ADD KEY `id_divisi` (`id_divisi`),
  ADD KEY `id_jabatan` (`id_jabatan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pegawai_lama`
--
ALTER TABLE `pegawai_lama`
  ADD CONSTRAINT `pegawai_lama_ibfk_1` FOREIGN KEY (`id_divisi`) REFERENCES `divisi` (`id_divisi`),
  ADD CONSTRAINT `pegawai_lama_ibfk_2` FOREIGN KEY (`id_jabatan`) REFERENCES `jabatan` (`id_jabatan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
