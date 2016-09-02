#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterNineTest
rm *.class

