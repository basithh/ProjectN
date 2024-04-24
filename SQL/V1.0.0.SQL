CREATE DATABASE BasithNIQ;
USE BasithNIQ;

CREATE TABLE shoppers (
	shopper_id VARCHAR(50) PRIMARY KEY,
    shopper_name VARCHAR(255)
);

CREATE TABLE products (
    product_id VARCHAR(50) PRIMARY KEY,
    category VARCHAR(100),
    brand VARCHAR(100)
);

CREATE TABLE shopper_personalized_product_list (
    id INT AUTO_INCREMENT PRIMARY KEY,
    shopper_id VARCHAR(50),
    product_id VARCHAR(50),
    relevancy_score DECIMAL(10, 2),
    FOREIGN KEY (shopper_id) REFERENCES shoppers(shopper_id),
    FOREIGN KEY (product_id) REFERENCES products(product_id),
    CONSTRAINT unique_shopper_product UNIQUE (shopper_id, product_id)
);