-- auto Generated on 2019-09-15
-- DROP TABLE IF EXISTS m_shopping_car;
CREATE TABLE m_shopping_car(
	create_by VARCHAR (50) COMMENT '创建者',
	create_time DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '更新者',
	update_time TIMESTAMP COMMENT '更新时间',
	remark VARCHAR (50) COMMENT '备注',
	shopping_car_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '购物车编号',
	shopping_product_id VARCHAR (50) COMMENT '商品编号',
	user_id INT (11) COMMENT '所属用户',
	`count` INT (11) COMMENT '购物数量',
	PRIMARY KEY (shopping_car_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'm_shopping_car';
