Mockito/JUnit/Maven tutorial done in 23/02/2022 - 24/02/2022.

https://www.youtube.com/watch?v=d2KwvXQgQx4
https://github.com/in28minutes/MockitoTutorialForBeginners

I was getting a warning "An illegal reflective access operation has occurred", therefore I replaced this dependency: 

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-all</artifactId>
            <version>1.10.19</version>
            <scope>test</scope>
        </dependency>

with this one:

        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-all</artifactId>
            <version>1.10.19</version>
            <scope>test</scope>
        </dependency>