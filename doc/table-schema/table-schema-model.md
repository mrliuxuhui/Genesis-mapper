# table schema entity

## 1. entity table

### 1.1 entity 定义 model_definition

| id  | name          | unicode | short_name | profile | level | parent_id | leaf         | deleted |
|-----|---------------|---------|------------|---------|-------|-----------|--------------|---------|
| 1   | 实体英文名      | 编码    |  中文简称   | 简介     |       |           | 是否为叶子结节  | 是否删除 |

unicode : 从父级到子级的全路，中间以"_" 分割

### 1.2 字段定义 model_field_definition

| id  | entity_id | entity_name   | field_id | field_name | data_type | item_type | item_entity_name | indexing |
|-----|-----------|---------------|----------|------------|-----------|-----------|-----------|----------|
| 1   | 实体id     | 实体英文名      | 字段id   |  中文简称   | [数据类型](#1.3_数据类型)|[元素类型](#1.4_元素类型)|           | 是否索引     |

### 1.3 数据类型

- STRING
- INTEGER
- FLOAT
- BOOLEAN
- ENUM
- LIST
- ENTITY

### 1.4 元素类型

- STRING
- INTEGER
- FLOAT
- BOOLEAN
- ENUM
- ENTITY

### 1.6 校验定义表 validation_definition


