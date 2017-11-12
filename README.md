# myDubbo
dubbo demo
rpc服务框架，分布式服务治理，dubbo的简单demo。</br>
生产者provider提供服务，消费者consumer使用。</br>
注册中心使用zookeeper，可配置单台或集群模式。</br>
搭配管控台dubbo-admin，可对dubbo服务进行治理：如权重设置，负载均衡策略的修改，管控台的搭建，参考我的印象笔记【dubbo管控台】篇。
</br>
</br>
对外提供dubbo服务时，调试服务比较麻烦，可以使用命令行，telnet ip dubboPort，进行调试，就不用自己模拟消费者调用了。
