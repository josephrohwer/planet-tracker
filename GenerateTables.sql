CREATE TABLE IF NOT EXISTS `planets`(
    `planet_id` INT(11) NOT NULL AUTO_INCREMENT,
    `image_url` VARCHAR(256) NOT NULL,
    `name` VARCHAR(50) NOT NULL,
    `avg_temp` INT(5) NOT NULL,
    `rad_level` INT(5) NOT NULL,
    `planet_type` VARCHAR(50) NOT NULL,
    `life_type` VARCHAR(50) NOT NULL,
    PRIMARY KEY(`planet_id`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1 AUTO_INCREMENT = 23;

CREATE TABLE IF NOT EXISTS `users`(
    `user_id` INT(11) NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(30) NOT NULL,
    `password` VARCHAR(256) NOT NULL,
    `enabled` TINYINT(1) NOT NULL,
    PRIMARY KEY(`user_id`),
    KEY `username`(`username`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1 AUTO_INCREMENT = 3;

CREATE TABLE IF NOT EXISTS `authorities`(
    `username` VARCHAR(30) NOT NULL,
    `authority` VARCHAR(20) NOT NULL,
    KEY `username`(`username`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1;

ALTER TABLE
    `authorities` ADD CONSTRAINT `authorities_ibfk_1` FOREIGN KEY(`username`) REFERENCES `users`(`username`);