

### Mybatis-plus学习记录



#### 特性

- 无侵入
- 损耗小
- 强大的CRUD操作
- 支持Lambda形式调用
- 支持多种数据库
- 支持主键自动生成
- 支持XML热加载

#### 逻辑删除

配置之后就是逻辑删除

#### 主键策略

- ASSING_ID 默认策略 生成19位的数字值
- ASSING_UUID 生成字母或数字
- AUTO 自动增长 条件：表主键字段需自增长，主键字段需要int类型
- INPUT 手动输入
- NONE 

#### 条件构造器

#### BaseMappper

#### 