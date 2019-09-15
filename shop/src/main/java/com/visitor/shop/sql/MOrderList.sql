-- auto Generated on 2019-09-15
DROP TABLE IF EXISTS m_order_list;
CREATE TABLE m_order_list(
	create_by VARCHAR (50) COMMENT '创建者',
	create_time DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '更新者',
	update_time TIMESTAMP COMMENT '更新时间',
	remark VARCHAR (50) COMMENT '备注',
	order_list_id VARCHAR (50) NOT NULL COMMENT '订单编号',
	order_list_condition VARCHAR (50) COMMENT '订单状态',
	order_list_product_id VARCHAR (50) COMMENT '商品编号',
	order_list_buyer_id VARCHAR (50) COMMENT '购买用户',
	order_list_take VARCHAR (50) COMMENT '收获状态',
	order_list_amount INT (11) COMMENT '订单金额',
	PRIMARY KEY (order_list_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'm_order_list';
