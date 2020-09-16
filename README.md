主观题：

@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？

答：
@Component使用类路径扫描自动检测和自动配置bean，@Bean用于显式声明单个bean，而不是让Spring自动执行。
通过使用@Bean注释，可以将第三方类（它可能没有@Component，也可能不使用Spring）包装为Spring bean，包
装后就可以在spring框架下进行使用了