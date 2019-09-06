-- auto Generated on 2019-09-06
-- DROP TABLE IF EXISTS m_brand;
CREATE TABLE m_brand(
	create_by VARCHAR (50) COMMENT '创建者',
	create_time DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '更新者',
	update_time TIMESTAMP COMMENT '更新时间',
	remark VARCHAR (50) COMMENT '备注',
	id INT (11) NOT NULL AUTO_INCREMENT COMMENT '品牌编号',
	brand_name VARCHAR (50) COMMENT '品牌名称',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'm_brand';
