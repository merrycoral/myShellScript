#!/bin/bash

echo "파일을 스테이징합니다."

git status >  file.txt

#sed -n 's/modified//g' file.txt > file2.txt

#awk -F':' "{if($1/modified/) print $2}" file.txt > file2.txt

cat ./file.txt | while read line
do
	#$var=$line | awk -F':' "{if($1/modified/) print $2}"
	var=`echo $line | awk -F':' '/modified/ {print $2}'`
#	if [ -z "${var}" ] 
	
#	then

	echo $var

#	fi
done


#cat file.txt | awk '/modified/' ./file2.txt

echo "파일 저장"

echo "end"

exit 0

