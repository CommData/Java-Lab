#!/bin/bash

echo "Content of file before running the java program is"
echo "---------------------------------------------------"
cat test.txt
java ExpFive
echo "Content of file after running the java program is"
echo "---------------------------------------------------"
cat test.txt
