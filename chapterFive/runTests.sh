#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterFiveTest
rm *.class

