drop database if exists shoppingmall ;
create database if not exists shoppingmall ;
use shoppingmall ;




CREATE TABLE `annoucement` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `title` varchar(255) DEFAULT NULL COMMENT '标题',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `creatId` int(11) DEFAULT NULL COMMENT '创建人id',
  `creatTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyId` int(11) DEFAULT NULL COMMENT '修改人id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `not_user` (`creatId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告表';







CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `categoryName` varchar(255) DEFAULT NULL COMMENT '大分类名字',
  `creatId` int(11) DEFAULT NULL COMMENT '创建人id',
  `creatTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyId` int(11) DEFAULT NULL COMMENT '修改人id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `cat_user` (`creatId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='大分类表';







CREATE TABLE `categorysecond` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `categorysecondName` varchar(255) DEFAULT NULL COMMENT '小分类名字',
  `cat_id` int(11) DEFAULT NULL COMMENT '外键-大分类id',
  `creatId` int(11) DEFAULT NULL COMMENT '创建人id',
  `creatTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyId` int(11) DEFAULT NULL COMMENT '修改人id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `cat_catsec` (`cat_id`),
  KEY `catsec_user` (`creatId`),
  CONSTRAINT `cat_catsec` FOREIGN KEY (`cat_id`) REFERENCES `category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小分类表';









CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `goodsName` varchar(255) DEFAULT NULL COMMENT '商品名',
  `price` decimal(10,0) DEFAULT NULL COMMENT '价格',
  `categorysecondId` int(11) DEFAULT NULL COMMENT '小分类id-外键',
  `num` int(11) DEFAULT NULL COMMENT '商品数量',
  `spic` varchar(255) DEFAULT NULL COMMENT '图片',
  `Iftop` int(11) DEFAULT NULL COMMENT '是否顶置',
  `creatId` int(11) DEFAULT NULL COMMENT '创建人id',
  `creatTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyId` int(11) DEFAULT NULL COMMENT '修改人id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `goods_user` (`creatId`),
  KEY `goods_catsec` (`categorysecondId`),
  CONSTRAINT `goods_catsec` FOREIGN KEY (`categorysecondid`) REFERENCES `categorysecond` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表';







CREATE TABLE `manager` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `managerName` varchar(255) DEFAULT NULL COMMENT '管理员名',
  `managerPass` varchar(255) DEFAULT NULL COMMENT '管理员密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='管理员表';






CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `userName` varchar(255) DEFAULT NULL COMMENT '用户名',
  `realName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `sex` int(11) DEFAULT NULL COMMENT '性别',
  `birth` date DEFAULT NULL COMMENT '出生年月',
  `cardId` varchar(255) DEFAULT NULL COMMENT '身份证号',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `Ifnot` int(11) DEFAULT NULL COMMENT '是否冻结,0表示不冻结,1表示冻结',
  `creatId` int(11) DEFAULT NULL COMMENT '创建人id',
  `creatTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifyId` int(11) DEFAULT NULL COMMENT '修改人id',
  `modifyTime` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户表';



