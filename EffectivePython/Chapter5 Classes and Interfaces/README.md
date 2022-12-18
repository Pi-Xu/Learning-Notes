## Item37: Compose Classes Instead of Nesting Many Levels of Built-in Types

- 本部分的主要内容位于[该notebook中](item37.ipynb)
- Summary:
  - 主要是列举了一些如果使用`Nested`内置数据类型所存在的问题, 其最后的解决方案是使用多个类进行Interaction, 可以通过notebook查看, 这样做的motivation
  - 其他一些内容主要是介绍了`namedtuple`的用法, 相当于给传统的`tuple`加上了一个名字.
  - `defaultdict`的用法, 相当于在传统的字典的调用方法中直接给字典的`value`部分加上一个默认的初始化后的对象, 这对于类似`list`为value值的时候很有效果

## Item38: Accept Functions instead of classes for simple interfaces

- 本部分主要位于[该notebook中](item38.ipynb)
- Summary:
  - 该部分的主要内容还位于其他部分, 有Chapter2的部分notebook, 可以参考Chapter2关于字典的Summary部分
  - 此处主要和题目部分一样, 学习了一个`__call__`方法, 即将一个类实例化之后所调用的方法

## Item39: Use @classmethod Polymorphism to construct objects generically

- 本部分主要位于[该notebook中](item39.ipynb)
- Summary:
  - 该部分的主要内容还位于其他部分, 有Chapter2的部分notebook, 可以参考Chapter2关于字典的Summary部分
  - 此处主要和题目部分一样, 学习了一个`__call__`方法, 即将一个类实例化之后所调用的方法
