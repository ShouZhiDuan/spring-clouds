# 笔记草稿

## Ribbon的负载均衡算法
### 1、权重轮训
#### serverA      ping 10ms
#### serverB      ping 20ms
#### serverC      ping 50ms
#### serverD      ping 80ms
#### 总和=10+20+50+80=160
* serverA = 0,0+(160-10) = [0,150]
* serverB = 150,150+(160-20) = (150,290]
* serverC = 290,290+(160-50) = (290,400]
* serverD = 400,400+(160-80) = (400,480]

