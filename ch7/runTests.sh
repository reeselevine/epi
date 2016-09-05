#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterSevenTest
rm *.class

