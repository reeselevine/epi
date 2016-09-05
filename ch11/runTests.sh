#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterElevenTest
rm *.class

