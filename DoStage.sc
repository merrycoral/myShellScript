#!/bin/bash

echo "== Start to stage files=="

git status >  file.txt

#sed -n 's/modified//g' file.txt > file2.txt

#awk -F':' "{if($1/modified/) print $2}" file.txt > file2.txt

cat ./file.txt | while read line
do
	#$var=$line | awk -F':' "{if($1/modified/) print $2}"
	var=`echo $line | awk -F':' '/modified/ {print $2}'`
	if [ "${var}" != '' ] 
	
	then
	echo $var
	
	read -p "$var 파일을 스테이지 하시겠솝니까?" yn
	    case $yn in
            [Yy]* ) git add $var; break;;
	    [Nn]* ) exit;;
	    * ) echo "y 또는 n을 입력하세요.";;
	esac

#	git add $var

	fi
done


#cat file.txt | awk '/modified/' ./file2.txt

echo "파일 저장"

echo "End to stage"

exit 0

