DROP SCHEMA IF EXISTS vehicleDB;
CREATE DATABASE vehicleDB;

USE vehicleDB;

CREATE TABLE steering(
                       id INT AUTO_INCREMENT PRIMARY KEY ,
                       partName varchar(100)

);

CREATE TABLE wheels(
                       id INT AUTO_INCREMENT PRIMARY KEY ,
                       partName varchar(100)

);

CREATE TABLE engine(
    id INT AUTO_INCREMENT PRIMARY KEY ,
    partName varchar(100),
    horsepower INT
);
CREATE TABLE cars
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    vehicleName varchar(100),
    engine_id INT,
    steering_id   INT,
    wheels_id INT,

    FOREIGN KEY(engine_id) REFERENCES engine(id),
    FOREIGN KEY(wheels_id) REFERENCES wheels(id),
    FOREIGN KEY(steering_id) REFERENCES steering(id)

);

CREATE TABLE planes
(
    id INT AUTO_INCREMENT PRIMARY KEY ,
    engineMake varchar(100),
    steering   varchar(100),
    carName varchar(100)

);

