#!/bin/bash

echo "== Start to stage files=="

git status >  file.txt


cat ./file.txt | while read line
do
	var=`echo $line | awk -F':' '/modified/ {print $2}'`
	if [ "${var}" != '' ] 
	
	then
	echo $var
	
#	echo "$var 파일을 스테이지 하시겠솝니까?"


	read -n 2 -p "파일을 스테이지 하시겠습니까? " yn </dev/tty
        case $yn in
        [Yy]*) git add $var; echo "$var staged.";;
        [Nn]*) echo "Aborted" ;;
	* ) echo "y 또는 n을 입력하세요.";;
        esac


	fi
done

echo "End to stage"

exit 0

