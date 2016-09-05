#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterSixTest
rm *.class

