-- auto Generated on 2019-09-05
-- DROP TABLE IF EXISTS m_use;
CREATE TABLE m_use(
	search_value VARCHAR (50) COMMENT '搜索值',
	create_by VARCHAR (50) COMMENT '创建者',
	create_time DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '更新者',
	update_time TIMESTAMP COMMENT '更新时间',
	remark VARCHAR (50) COMMENT '备注',
	use_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '用途编号',
	use_name VARCHAR (50) COMMENT '用途名称',
	PRIMARY KEY (use_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'm_use';
