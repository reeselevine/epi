#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterEightTest
rm *.class

