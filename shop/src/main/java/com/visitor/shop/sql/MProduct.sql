
-- auto Generated on 2019-09-13
-- DROP TABLE IF EXISTS m_product;
CREATE TABLE m_product(
	create_by VARCHAR (50) COMMENT '创建者',
	create_time DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '更新者',
	update_time TIMESTAMP COMMENT '更新时间',
	remark VARCHAR (50) COMMENT '备注',
	product_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '产品编号',
	product_name VARCHAR (50) COMMENT '产品名称',
	price VARCHAR (50) COMMENT '产品价格',
	product_describe VARCHAR (50) COMMENT '产品描述',
	image VARCHAR (50) COMMENT '产品图片',
	brand_name VARCHAR (50) COMMENT '产品品牌',
	team_name VARCHAR (50) COMMENT '所属队伍',
	use_name VARCHAR (50) COMMENT '产品用途',
	PRIMARY KEY (product_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'm_product';
