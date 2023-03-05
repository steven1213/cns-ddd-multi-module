DROP TABLE IF EXISTS t_cns_user;

CREATE TABLE t_cns_user
(
    id       BIGINT AUTO_INCREMENT Primary Key,
    username varchar2(32)      NOT NULL COMMENT '用户名',
    avatar   varchar2(128)     NOT NULL COMMENT '头像',
    account_status   tinyint   DEFAULT 0 COMMENT '账号状态 0-未激活 1-已激活 2-锁定',
    crt_time datetime          NOT NULL COMMENT '创建时间',
    upt_time datetime          NOT NULL COMMENT '修改时间',
    del  tinyint DEFAULT 0 NOT NULL COMMENT '删除标识 0-未删除 1-已删除'
);