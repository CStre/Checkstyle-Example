JFLAGS = -d bin -sourcepath src src/**/**/*.java
CHECKSTYLE = lib/checkstyle-10.5.0-all.jar
JUNIT = lib/junit-platform-console-standalone-1.8.2.jar
JUNIT_RUNNER = org.junit.platform.console.ConsoleLauncher


default: 
	@echo "usage: make target"
	@echo "4 available targets:"
	@echo "____________________ compile - builds codebase"
	@echo "____________________ check - evaluates formatting"
	@echo "____________________ test - runs and flags errors"
	@echo "____________________ clean - removes .class files from the bin directory"

compile:
	javac $(JFLAGS) -cp $(JUNIT)

check: styles.xml $(CHECKSTYLE)
	java11 -jar $(CHECKSTYLE) -c ./styles.xml src/**/**/*.java

test: $(JUNIT) 
	java -cp bin:$(JUNIT) $(JUNIT_RUNNER) --scan-class-path

clean:
	rm -f ./bin/**/*.class
