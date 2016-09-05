#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterTwelveTest
rm *.class

