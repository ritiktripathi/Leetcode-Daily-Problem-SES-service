**Before Runnung the application make sure to do the following prereq.**

1. Change `spring.mail.username=username` and `spring.mail.password=password` with your `username` and `password` in <a href=https://github.com/ritiktripathi/Leetcode-Daily-Problem-SES-service/blob/master/src/main/resources/application.properties>applications.properties</a> file.
2.  Update the same `useremail@id.com` and `userpassword` in <a href=https://github.com/ritiktripathi/Leetcode-Daily-Problem-SES-service/blob/master/src/main/java/com/dailyProblem/Daily/Problem/Dao/DaoClass.java>DaoClass.java</a> files `mailSender.setUsername("useremail@id.com");` and `mailSender.setPassword("userpassword");`
3. After successfully performing the `Step1` and `Step2` run  
    <ul>
    <li>mvn clean</li>
    <li>mvn package</li>
    <li>mvn spring-boot:run</li>
    </ul>