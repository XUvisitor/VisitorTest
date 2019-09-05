-- auto Generated on 2019-09-05
-- DROP TABLE IF EXISTS m_team;
CREATE TABLE m_team(
	search_value VARCHAR (50) COMMENT '搜索值',
	create_by VARCHAR (50) COMMENT '创建者',
	create_time DATETIME COMMENT '创建时间',
	update_by VARCHAR (50) COMMENT '更新者',
	update_time TIMESTAMP COMMENT '更新时间',
	remark VARCHAR (50) COMMENT '备注',
	team_id INT (11) NOT NULL AUTO_INCREMENT COMMENT '队伍编号',
	team_name VARCHAR (50) COMMENT '队伍名称',
	PRIMARY KEY (team_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'm_team';
