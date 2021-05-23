# 在西邮后台开发规约

## git协作

> git地址：https://gitee.com/alkaidchen/zaixiyou

*由于github国内网络不稳定，选择`gitee`作为远程仓库。*

### 分支管理

- **master:** 项目生产环境代码，未来计划增加持续集成功能，所以 master 分支不要在 master 分支上进行开发性地提交，当确定 develop 分支稳定并且能够进入生产环境时，由我来 Merge 到 master 分支
- **develop:** 开发环境代码，所有开发代码从这个分支 Pull 到本地，然后新建一个自己的开发分支进行开发，开发完成之后 Pull Requests由我进行代码审查之后我来Merge到develop分支。（**每个人开发个人分支之前都需要先pull一下develop分支，并且merge到自己当前开发的跟人分支，以保证自己本地的代码版本不会低于服务器**）
- 其他个人分支：在Pull Requests时选择Pull Requests之后自动删除，避免冗余过多分支。

> 开发前期采用Pull Requests的方式协作是为了方便代码审查，你们每次提交的代码我都要进行审查，等你们熟悉项目之后，后期将放开develop的推送权限，采取隔一段时间代码审查的方式来规范协作
>
> commit建议增加修改时间，修改人，修改内容，例如：
>
> ```
> 2021/05/23 12:19
> contributor:AlkaidChen
> ----------------------------------------
> 修改.gitignore
> 修改README.md
> 增加点赞功能
> 修复验证码不能发送的BUG
> ```

## 开发环境

> 正在搭建一个新的开发环境。。。用于开发与测试

现在大家先不要对数据库（包括`Mysql`，`Redis`，`ES`，`RabbitMQ`）做任何修改



## 项目文档

> 建设中，希望大家一起参与进来，帮助项目文档的建设

由于项目采用了`Lombok`，需要IDEA安装`Lombok`插件，为了便于开发最好再安装`Free MyBatis plugin`插件



## 接口文档

目前采用集成`Swagger`的形式自动生成，但是需要人工地与前端沟通接口返回结构

二期开发过程中希望重新建设完善的接口文档



## 其他

这次项目也是我第一次进行团队协作开发，包括git我以前也只会commit和push，所以协作方式也需要我们一起改进和规范，有任何问题或者建议欢迎随时提出来，大家一起学习。





## 附：

> 大家可以在这里尝试用git对下面的内容进行随意修改然后`Pull Requests

永和十年，岁在癸丑，暮春之初，会于会稽山阴之兰亭，修禊事也。群贤毕至，少长咸集。此地有崇山峻岭，茂林修竹，又有清流激湍，映带左右，引以为流觞曲水，列坐其次。虽无丝竹管弦之盛，一觞一咏，亦足以畅叙幽情。

是日也，天朗气清，惠风和畅。仰观宇宙之大，俯察品类之盛，所以游目骋怀，足以极视听之娱，信可乐也。

夫人之相与，俯仰一世。或取诸怀抱，悟言一室之内；或因寄所托，放浪形骸之外。虽趣舍万殊，静躁不同，当其欣于所遇，暂得于己，快然自足，不知老之将至；及其所之既倦，情随事迁，感慨系之矣。向之所欣，俯仰之间，已为陈迹，犹不能不以之兴怀，况修短随化，终期于尽！古人云：“死生亦大矣。”岂不痛哉！

每览昔人兴感之由，若合一契，未尝不临文嗟悼，不能喻之于怀。固知一死生为虚诞，齐彭殇为妄作。后之视今，亦犹今之视昔，悲夫！故列叙时人，录其所述，虽世殊事异，所以兴怀，其致一也。后之览者，亦将有感于斯文。