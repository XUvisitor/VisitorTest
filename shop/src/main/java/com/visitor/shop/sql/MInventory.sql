DROP TABLE IF EXISTS m_inventory;
CREATE TABLE m_inventory(
	create_by VARCHAR (50) COMMENT '创建者',
	create_time DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '更新者',
	update_time TIMESTAMP COMMENT '更新时间',
	remark VARCHAR (50) COMMENT '备注',
	inventory_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '库存编号',
	product_size VARCHAR (50) COMMENT '码数',
	product_number INT (11) COMMENT '数量',
	inventory_product_id VARCHAR (50) COMMENT '商品编号',
	PRIMARY KEY (inventory_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'm_inventory';
