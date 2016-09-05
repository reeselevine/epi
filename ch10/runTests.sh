#!/bin/bash
javac *.java
java -cp . org.junit.runner.JUnitCore ChapterTenTest
rm *.class

